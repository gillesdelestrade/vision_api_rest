#!/usr/bin/env python3
"""
Corrige les DTOs qui ont String au lieu de Long xxxId
"""

from pathlib import Path
import re

DTOS_DIR = "src/main/java/fr/d4immobilier/visionapirest/dto"

FIXES = {
    'EvaluationFournisseurDTO.java': {
        'fournisseur': 'fournisseurId',
        'auteur': 'auteurId',
        'interventionDemande': 'interventionDemandeId',
        'factureFournisseur': 'factureFournisseurId',
        'demandeDevisFournisseur': 'demandeDevisFournisseurId',
    },
    'DossierDTO.java': {
        'copropriete': 'coproprieteId',
    },
    'SinistreDTO.java': {
        'copropriete': 'coproprieteId',
    },
    'SessionTraitementADFDTO.java': {
        'fichierZip': 'fichierZipId',
    }
}

def fix_dto_file(filepath: Path, replacements: dict):
    """Corrige un fichier DTO"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original = content
    
    for old_name, new_name in replacements.items():
        # Remplacer la déclaration du champ
        content = re.sub(
            rf'private String {old_name};',
            f'private Long {new_name};',
            content
        )
        
        # Remplacer le getter
        old_capitalized = old_name[0].upper() + old_name[1:]
        new_capitalized = new_name[0].upper() + new_name[1:]
        
        content = re.sub(
            rf'public String get{old_capitalized}\(\)',
            f'public Long get{new_capitalized}()',
            content
        )
        
        content = re.sub(
            rf'return {old_name};',
            f'return {new_name};',
            content
        )
        
        # Remplacer le setter
        content = re.sub(
            rf'public void set{old_capitalized}\(String {old_name}\)',
            f'public void set{new_capitalized}(Long {new_name})',
            content
        )
        
        content = re.sub(
            rf'this\.{old_name} = {old_name};',
            f'this.{new_name} = {new_name};',
            content
        )
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

def main():
    print("🔧 Correction des DTOs String → Long xxxId...")
    
    dtos_path = Path(DTOS_DIR)
    fixed = 0
    
    for dto_file, replacements in FIXES.items():
        filepath = dtos_path / dto_file
        if filepath.exists():
            if fix_dto_file(filepath, replacements):
                print(f"   ✅ {dto_file}: {len(replacements)} champs corrigés")
                fixed += 1
            else:
                print(f"   ⚠️  {dto_file}: déjà corrigé ou introuvable")
        else:
            print(f"   ❌ {dto_file}: fichier non trouvé")
    
    print(f"\n✨ {fixed} fichiers corrigés")
    print("\n🔨 Lancez 'Clean and Build'")

if __name__ == "__main__":
    main()