/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum AvisDevisCS {

    en_attente,
    accepte,
    refuse,
    pas_necessaire;

    @Override
    public String toString() {
        switch (this) {
            case en_attente:
                return "En attente";
            case accepte:
                return "Favorable";
            case refuse:
                return "Défavorable";
            case pas_necessaire:
                return "Favorable";

        }
        throw new RuntimeException("Invalid value for this");
    }
}
