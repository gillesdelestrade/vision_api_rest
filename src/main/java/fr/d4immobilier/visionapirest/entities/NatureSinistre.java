/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum NatureSinistre {

    INCENDIE,
    DEGAT_DES_EAUX,
    BRIS_DE_GLACE,
    VANDALISME,
    DOMMAGE_OUVRAGE,
    AUTRE,
    RESPONSABILITE_CIVILE,
    DOMMAGE_ELECTRIQUE,
    CATASTROPHE_NATURELLE,
    TEMPETE_OURAGAN_GRELE,
    CHOC_DE_VEHICULE,
    VOL;

    @Override
    public String toString() {
        switch (this) {
            case INCENDIE -> {
                return "Incendie";
            }
            case DEGAT_DES_EAUX -> {
                return "Dégâts des eaux";
            }
            case BRIS_DE_GLACE -> {
                return "Bris de glace";
            }
            case VANDALISME -> {
                return "Vandalisme";
            }
            case DOMMAGE_OUVRAGE -> {
                return "Dommage ouvrage";
            }
            case AUTRE -> {
                return "Autre";
            }
            case RESPONSABILITE_CIVILE -> {
                return "Responsabilité Civile";
            }
            case DOMMAGE_ELECTRIQUE -> {
                return "Dommage électrique";
            }
            case CATASTROPHE_NATURELLE -> {
                return "Catastrophe Naturelle";
            }
            case TEMPETE_OURAGAN_GRELE -> {
                return "Tempête Ourangan Grêle";
            }
            case CHOC_DE_VEHICULE -> {
                return "Choc de Véhicule";
            }
            case VOL -> {
                return "Vol";
            }

        }
        throw new RuntimeException("Invalid value for this");
    }

    public String toStringAbrege() {
        switch (this) {
            case INCENDIE:
                return "INC";
            case DEGAT_DES_EAUX:
                return "DDE";
            case BRIS_DE_GLACE:
                return "BDG";
            case VANDALISME:
                return "VAND";
            case DOMMAGE_OUVRAGE:
                return "DO";
            case AUTRE:
                return "AUT";
            case RESPONSABILITE_CIVILE:
                return "RC";
            case DOMMAGE_ELECTRIQUE:
                return "ELEC";
            case CATASTROPHE_NATURELLE:
                return "CAT";
            case TEMPETE_OURAGAN_GRELE:
                return "TOG";
            case CHOC_DE_VEHICULE:
                return "CDV";
            case VOL:
                return "VOL";
        }
        throw new RuntimeException("Invalid value for this");
    }
}
