/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeFactureD4 {

    HONORAIRES,
    FRAIS_DE_GESTION,
    VACATION,
    HONORAIRES_DE_MUTATION,
    DIVERS;

    @Override
    public String toString() {
        switch (this) {
            case HONORAIRES -> {
                return "Honoraires";
            }
            case FRAIS_DE_GESTION -> {
                return "Frais de Gestion";
            }
            case VACATION -> {
                return "Vacation";
            }
            case HONORAIRES_DE_MUTATION -> {
                return "Honoraires de mutation";
            }
            case DIVERS -> {
                return "Divers";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

    public String toStringAbrege() {
        switch (this) {
            case HONORAIRES -> {
                return "HON";
            }
            case FRAIS_DE_GESTION -> {
                return "FDG";
            }
            case VACATION -> {
                return "VAC";
            }
            case HONORAIRES_DE_MUTATION -> {
                return "MUT";
            }
            case DIVERS -> {
                return "DIV";
            }
                
        }
        throw new RuntimeException("Invalid value for this");
    }
}
