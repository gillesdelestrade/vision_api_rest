/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum AvisD4Facture {

    en_attente,
    validee,
    consulter_le_cs,
    bloquee,
    fichier_illisible;

    @Override
    public String toString() {
        switch (this) {
            case en_attente:
                return "En attente";
            case validee:
                return "Validée";
            case consulter_le_cs:
                return "Consulter le C.S.";
            case bloquee:
                return "Bloquée";
            case fichier_illisible:
                return "Fichier illisible";
           

        }
        throw new RuntimeException("Invalid value for this");
    }
}
