#!/usr/bin/env python3
"""
Nettoie les DTOs en supprimant les collections d'entités
"""

import re
from pathlib import Path

DTOS_DIR = "src/main/java/fr/d4immobilier/visionapirest/dto"

def clean_dto_file(filepath: Path):
    """Supprime les collections d'entités d'un DTO"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original_content = content
    
    # Pattern pour détecter List<Entity> où Entity commence par une majuscule
    # et n'est pas un type standard (DTO)
    pattern = r'\s*private List<([A-Z]\w+)> \w+;\s*\n'
    
    matches = re.findall(pattern, content)
    
    for entity_type in matches:
        # Vérifier que ce n'est pas un DTO (ne se termine pas par DTO)
        if not entity_type.endswith('DTO'):
            # Supprimer la déclaration du champ
            field_pattern = rf'\s*private List<{entity_type}> (\w+);\s*\n'
            field_match = re.search(field_pattern, content)
            
            if field_match:
                field_name = field_match.group(1)
                
                # Supprimer la déclaration
                content = re.sub(field_pattern, '', content)
                
                # Supprimer le getter
                capitalized = field_name[0].upper() + field_name[1:]
                getter_pattern = rf'\s*public List<{entity_type}> get{capitalized}\(\) \{{\s*return {field_name};\s*\}}\s*\n'
                content = re.sub(getter_pattern, '', content, flags=re.MULTILINE | re.DOTALL)
                
                # Supprimer le setter
                setter_pattern = rf'\s*public void set{capitalized}\(List<{entity_type}> {field_name}\) \{{\s*this\.{field_name} = {field_name};\s*\}}\s*\n'
                content = re.sub(setter_pattern, '', content, flags=re.MULTILINE | re.DOTALL)
    
    # Sauvegarder si modifié
    if content != original_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

def main():
    print("🧹 Nettoyage des DTOs...")
    
    dtos_path = Path(DTOS_DIR)
    fixed_count = 0
    
    for dto_file in dtos_path.glob("*DTO.java"):
        if clean_dto_file(dto_file):
            print(f"   ✅ Nettoyé : {dto_file.name}")
            fixed_count += 1
    
    print(f"\n✨ {fixed_count} fichiers nettoyés !")

if __name__ == "__main__":
    main()