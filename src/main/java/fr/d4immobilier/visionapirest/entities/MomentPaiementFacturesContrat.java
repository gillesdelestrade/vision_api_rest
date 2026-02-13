/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum MomentPaiementFacturesContrat {
    INCONNU,
    A_ECHOIR,
    ECHU;

@Override
    public String toString() {
        switch (this) {
            case INCONNU -> {
                return "Inconnu";
            }
            case A_ECHOIR -> {
                return "A échoir";
            }
            case ECHU -> {
                return "Echu";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}