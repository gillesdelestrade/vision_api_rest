/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum AvisFactureCS {

    en_attente,
    acceptee,
    refusee,
    pas_necessaire;

    @Override
    public String toString() {
        switch (this) {
            case en_attente:
                return "En attente";
            case acceptee:
                return "Acceptée";
            case refusee:
                return "Refusée";
            case pas_necessaire:
                return "Pas nécessaire";

        }
        throw new RuntimeException("Invalid value for this");
    }
}
