/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum MotifClotureDemandeDevis {

    BON_POUR_ACCORD,
    ANNULATION;

    @Override
    public String toString() {
        switch (this) {
            case BON_POUR_ACCORD -> {
                return "Bon pour accord";
            }
            case ANNULATION -> {
                return "Annulation";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
