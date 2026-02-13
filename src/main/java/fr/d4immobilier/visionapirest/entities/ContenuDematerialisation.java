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
public enum ContenuDematerialisation {

    APPEL_DE_FONDS,
    CONVOCATION_AG,
    PV_AG,
    RAPPEL_DE_CHARGES;

    @Override
    public String toString() {
        switch (this) {
            case APPEL_DE_FONDS -> {
                return "Appel de fonds";
            }
            case CONVOCATION_AG -> {
                return "Convocation AG";
            }
            case PV_AG -> {
                return "PV d'AG";
            }
            case RAPPEL_DE_CHARGES -> {
                return "Rappel de Charges";
            }
        }
        return "Indéterminé";
    }

}
