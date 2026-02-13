/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum ImportanceMotCle {
    
    INUTILE,
    PEU_IMPORTANT,
    NEUTRE,
    IMPORTANT,
    PRIMORDIAL;
    
    @Override
    public String toString() {
        switch (this) {
            case PRIMORDIAL -> {
                return "Primordial";
            }
            case IMPORTANT -> {
                return "Important";
            }
            case NEUTRE -> {
                return "Neutre";
            }
            case PEU_IMPORTANT -> {
                return "Peu Important";
            }
            case INUTILE -> {
                return "Inutile";
            }

        }
        throw new RuntimeException("Invalid value for this");
    }
}
