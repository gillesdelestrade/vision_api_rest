#!/usr/bin/env python3
"""
Corrige automatiquement les erreurs de mapping MapStruct
"""

import re
from pathlib import Path

MAPPERS_DIR = "src/main/java/fr/d4immobilier/visionapirest/mappers"
ENTITIES_DIR = "src/main/java/fr/d4immobilier/visionapirest/entities"

def get_entity_fields(entity_name: str) -> set:
    """Récupère tous les champs d'une entité"""
    entity_path = Path(ENTITIES_DIR) / f"{entity_name}.java"
    
    if not entity_path.exists():
        return set()
    
    with open(entity_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Extraire tous les champs private
    field_pattern = r'private\s+\w+(?:<[\w\s,]+>)?\s+(\w+);'
    fields = set(re.findall(field_pattern, content))
    
    return fields

def fix_mapper_file(filepath: Path):
    """Corrige un fichier mapper"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original_content = content
    
    # Extraire le nom de l'entité
    entity_match = re.search(r'import .+\.entities\.(\w+);', content)
    if not entity_match:
        return False
    
    entity_name = entity_match.group(1)
    entity_fields = get_entity_fields(entity_name)
    
    if not entity_fields:
        return False
    
    # Supprimer les @Mapping pour des champs qui n'existent pas
    mapping_pattern = r'@Mapping\(target = "(\w+)", ignore = true\)\s*\n'
    
    for match in re.finditer(mapping_pattern, content):
        field_name = match.group(1)
        if field_name not in entity_fields:
            # Supprimer cette ligne
            content = content.replace(match.group(0), '')
    
    # Supprimer les @Mapping source qui pointent vers des champs inexistants
    source_mapping_pattern = r'@Mapping\(source = "([^"]+)", target = "[^"]+"\)\s*\n'
    
    for match in re.finditer(source_mapping_pattern, content):
        source_path = match.group(1)
        # Vérifier le premier champ du path
        first_field = source_path.split('.')[0]
        if first_field not in entity_fields:
            # Supprimer cette ligne
            content = content.replace(match.group(0), '')
    
    # Corriger les problèmes de casse pour les acronymes
    # oDJReunionId -> ODJReunionId
    # aRappelerCourrierId -> ARappelerCourrierId
    # aPIFournisseurId -> APIFournisseurId
    
    casing_fixes = {
        'oDJReunion': 'ODJReunion',
        'aRappelerCourrier': 'ARappelerCourrier',
        'aRappelerEnvoiMail': 'ARappelerEnvoiMail',
        'aPIFournisseur': 'APIFournisseur',
        'aRappeler': 'ARappeler',
    }
    
    for wrong, correct in casing_fixes.items():
        content = content.replace(f'"{wrong}Id"', f'"{correct}Id"')
        content = content.replace(f'get{wrong[0].upper()}{wrong[1:]}Id', 
                                 f'get{correct}Id')
        content = content.replace(f'set{wrong[0].upper()}{wrong[1:]}Id', 
                                 f'set{correct}Id')
    
    # Sauvegarder si modifié
    if content != original_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

def main():
    print("🔧 Correction automatique des erreurs de mapping...")
    
    mappers_path = Path(MAPPERS_DIR)
    fixed_count = 0
    
    for mapper_file in mappers_path.glob("*Mapper.java"):
        # Ne pas toucher GenericMapper
        if mapper_file.name == "GenericMapper.java":
            continue
            
        if fix_mapper_file(mapper_file):
            print(f"   ✅ Corrigé : {mapper_file.name}")
            fixed_count += 1
    
    print(f"\n✨ {fixed_count} fichiers corrigés !")
    print("\n⚠️  Certaines erreurs nécessitent une correction manuelle.")
    print("    Lancez 'Clean and Build' pour voir les erreurs restantes.")

if __name__ == "__main__":
    main()