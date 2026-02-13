#!/usr/bin/env python3
"""
Supprime toutes les lignes @Mapping problématiques
"""

import re
from pathlib import Path

MAPPERS_DIR = "src/main/java/fr/d4immobilier/visionapirest/mappers"

def clean_mapper(filepath: Path):
    """Nettoie un mapper en supprimant les @Mapping vers des propriétés inexistantes"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original = content
    
    # Liste des propriétés qui n'existent clairement pas
    fake_properties = [
        'boitesArchive', 'chequesEmis', 'paniersDemandesInterventions',
        'courriersEntrants', 'ouvrants', 'panneauxBALInterphone', 'courriels',
        'resultatSondages', 'partsChequeCoproprietaires', 'tireursCheques',
        'sinistresEnTantQuOrigine', 'sinistresEnTantQueLese', 'equipements',
        'commentaireFactureFournisseurs', 'demandeSansCompteVision', 
        'resolutionTravaux', 'sondages', 'prochainesEtapesDemandes',
        'dossierContentieuxFacture', 'pere', 'enfants', 'mandataire',
        'emplacementsPanneauBALInterphone', 'moyensAccess', 'compteEnBanque',
        'livraisons', 'bonsDeCommandePanierMoyenAcces', 'facturesFournisseur',
        'panneauxBALInterphone', 'conseilsSyndicaux', 'conseilsSyndicauxPresides',
        'documentsEnvoyes', 'complementsProcedures', 'resolutions',
        'motCleFournisseur', 'etapesPlanifAG', 'regroupementsResolutions',
        'aRappeler', 'copropriete', 'evenementDemande', 'lot'
    ]
    
    # Supprimer les @Mapping qui ciblent ces propriétés
    for prop in fake_properties:
        # Pattern pour target
        pattern = rf'@Mapping\(target = "{prop}"[^\)]*\)\s*\n'
        content = re.sub(pattern, '', content)
        
        # Pattern pour source
        pattern = rf'@Mapping\(source = "{prop}[^\)]*\)\s*\n'
        content = re.sub(pattern, '', content)
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

def main():
    print("🧹 Nettoyage des @Mapping problématiques...")
    
    mappers_path = Path(MAPPERS_DIR)
    fixed = 0
    
    for mapper_file in mappers_path.glob("*Mapper.java"):
        if mapper_file.name == "GenericMapper.java":
            continue
        if clean_mapper(mapper_file):
            print(f"   ✅ {mapper_file.name}")
            fixed += 1
    
    print(f"\n✨ {fixed} fichiers nettoyés")
    print("\n🔨 Lancez maintenant 'Clean and Build'")

if __name__ == "__main__":
    main()