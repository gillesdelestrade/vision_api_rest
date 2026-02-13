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
public enum TypeProcedure {

    RECOUVREMENT,
    ANNULATION_AG,
    PROMOTEURS,
    SYNDIC_PRECEDENT,
    AUTRE;

    @Override
    public String toString() {
        switch (this) {
            case RECOUVREMENT -> {
                return "Recouvrement";
            }
            case ANNULATION_AG -> {
                return "Annulation d'AG";
            }
            case PROMOTEURS -> {
                return "Promoteurs";
            }
            case SYNDIC_PRECEDENT -> {
                return "Syndic précédent";
            }
            case AUTRE -> {
                return "Autre";
            }
        }
        return "Procédure";
    }

}
