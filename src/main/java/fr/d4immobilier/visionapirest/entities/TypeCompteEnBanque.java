/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeCompteEnBanque {
        COMPTE_COURANT,
        LIVRET_A,
        LIVRET_B;

    @Override
    public String toString() {
        switch (this) {
            case COMPTE_COURANT -> {
                return "Compte courant";
                }
            case LIVRET_A -> {
                return "Livret A";
                }
            case LIVRET_B -> {
                return "Livret B";
                }
        }
        throw new RuntimeException("Invalid value for this");
    }


}
