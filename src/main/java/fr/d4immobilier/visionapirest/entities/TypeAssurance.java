/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeAssurance {
    classique,
    d_o,
    rc,
    protection_jurodique;

    @Override
    public String toString() {
        switch (this) {
            case classique -> {
                return "Multi-Risques Immeuble";
            }
            case d_o -> {
                return "Dommage Ouvrage";
            }
            case rc -> {
                return "Responsabilité Civile";
            }
            case protection_jurodique -> {
                return "Protection Juridique";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
