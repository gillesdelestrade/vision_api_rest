/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum AvisD4Devis {

    en_attente,
    valide,
    consulter_le_cs,
    bloque,
    supprime,
    sans_suite;

    @Override
    public String toString() {
        switch (this) {
            case en_attente:
                return "En attente";
            case valide:
                return "Favorable";
            case consulter_le_cs:
                return "Consulter le C.S.";
            case bloque:
                return "Défavorable";
            case supprime:
                return "Supprimé";
            case sans_suite:
                return "Classé sans suite";


        }
        throw new RuntimeException("Invalid value for this");
    }
}
