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
public enum ResponsableEtapePlanifAGModele {

    GESTIONNIARE_NOMADE,
    GESTIONNAIRE_SEDENTAIRE,
    COMPTABLE,
    BOITIERS,
    COURRIER;

    @Override
    public String toString() {
        switch (this) {
            case GESTIONNIARE_NOMADE -> {
                return "Gestionnaire Nomade";
            }
            case GESTIONNAIRE_SEDENTAIRE -> {
                return "Gestionnaire Sédentaire";
            }
            case COMPTABLE -> {
                return "Comptable";
            }
            case BOITIERS -> {
                return "Boitiers";
            }
            case COURRIER -> {
                return "Service Courrier";
            }
        }
        return "Inconnu";
    }

}
