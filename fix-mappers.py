#!/usr/bin/env python3
"""
Nettoie les mappers générés en supprimant les conversions inutiles pour LocalDate, LocalDateTime, etc.
"""

import re
from pathlib import Path

MAPPERS_DIR = "src/main/java/fr/d4immobilier/visionapirest/mappers"

JAVA_TYPES = [
    'LocalDate', 'LocalDateTime', 'LocalTime', 
    'BigDecimal', 'BigInteger', 'Date', 'Timestamp'
]

def clean_mapper_file(filepath: Path):
    """Nettoie un fichier mapper"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original_content = content
    
    # Supprimer les méthodes de conversion pour les types Java
    for java_type in JAVA_TYPES:
        # Pattern pour la méthode complète
        pattern = rf'@Named\("[^"]*"\)\s+default String \w+\({java_type}[^}}]*\}}\s*'
        content = re.sub(pattern, '', content, flags=re.MULTILINE)
        
        # Pattern pour le mapping dans @Mapping
        pattern = rf'@Mapping\(source = "[^"]*", target = "[^"]*", qualifiedByName = "[^"]*{java_type}[^"]*"\)\s*\n'
        content = re.sub(pattern, '', content)
    
    # Sauvegarder si modifié
    if content != original_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

def main():
    print("🧹 Nettoyage des mappers...")
    
    mappers_path = Path(MAPPERS_DIR)
    fixed_count = 0
    
    for mapper_file in mappers_path.glob("*Mapper.java"):
        if clean_mapper_file(mapper_file):
            print(f"   ✅ Nettoyé : {mapper_file.name}")
            fixed_count += 1
    
    print(f"\n✨ {fixed_count} fichiers nettoyés !")

if __name__ == "__main__":
    main()