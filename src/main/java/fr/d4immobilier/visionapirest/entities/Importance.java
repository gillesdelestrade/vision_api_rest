/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum Importance {
    AMELIORATION,
    SERIEUX,
    BLOQUANT;

    @Override
    public String toString() {
        switch (this) {
            case AMELIORATION:
                return "Amélioration";
            case SERIEUX:
                return "Sérieux";
            case BLOQUANT:
                return "Bloquant";
        }
        throw new RuntimeException("Invalid value for this");
    }

}
