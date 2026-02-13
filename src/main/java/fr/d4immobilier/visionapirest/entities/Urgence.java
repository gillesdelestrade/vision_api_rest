/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum Urgence {

    A_L_OCCASION,
    DANS_LES_10_JOURS,
    URGENT;
    @Override
    public String toString() {
        switch (this) {
            case A_L_OCCASION:
                return "A l'occasion";
            case DANS_LES_10_JOURS:
                return "Dans les 10 jours";
            case URGENT:
                return "Urgent";
        }
        throw new RuntimeException("Invalid value for this");
    }
}
