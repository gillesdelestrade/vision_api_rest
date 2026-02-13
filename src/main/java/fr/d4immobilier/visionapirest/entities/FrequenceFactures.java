/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum FrequenceFactures {

    INCONNU,
    MENSUEL,
    BI_MENSUEL,
    TRIMESTRIEL,
    SEMESTRIEL,
    ANNUEL;


@Override
    public String toString() {
        switch (this) {
            case INCONNU -> {
                return "Inconnu";
            }
            case MENSUEL -> {
                return "Mensuel";
            }
            case BI_MENSUEL -> {
                return "Bimestriel";
            }
                case TRIMESTRIEL -> {
                    return "Trimestriel";
            }
            case SEMESTRIEL -> {
                return "Semestriel";
            }
            case ANNUEL -> {
                return "Annuel";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
