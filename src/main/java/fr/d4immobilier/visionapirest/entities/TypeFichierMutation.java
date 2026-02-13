/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeFichierMutation {
    REGLEMENT_COPROPRIETE,
    DOSSIER_AMIANTE,
    CERTIFICAT_IMMATRICULATION,
    PLAN_PLURIANNUEL_DE_TRAVAUX,
    LIVRET_ACCUEIL,
    PV_AG;

    @Override
    public String toString() {
        switch (this) {
            case REGLEMENT_COPROPRIETE -> {
                return "Réglement de Copropriété";
            }
            case DOSSIER_AMIANTE -> {
                return "Diagnostics Amiante - Termites - Plomb";
            }
            case CERTIFICAT_IMMATRICULATION -> {
                return "Certificat d'immatriculation";
            }
            case PV_AG -> {
                return "PV d'AG";
            }
            case PLAN_PLURIANNUEL_DE_TRAVAUX -> {
                return "Plan pluriannuel de Travaux";
            }
            case LIVRET_ACCUEIL -> {
                return "Livret d'Accueil";
            }
                
        }
        throw new RuntimeException("Invalid value for this");
    }
    
    
}
