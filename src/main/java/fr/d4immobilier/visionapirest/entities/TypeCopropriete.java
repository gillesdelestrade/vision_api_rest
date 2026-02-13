/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeCopropriete {
    COPROPRIETE,
    ASL,
    USL;

    @Override
    public String toString() {
        switch(this) {
            case ASL -> {
                return "A.S.L.";
            }
            case COPROPRIETE -> {
                return "Copropriété";
            }
            case USL -> {
                return "U.S.L.";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }



}
