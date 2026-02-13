/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum StatutCopropriete {

    client,
    prospect,
    non_gere;

    @Override
    public String toString() {
        switch (this) {
            case client -> {
                return "Client";
            }
            case prospect -> {
                return "Prospect";
            }
            case non_gere -> {
                return "Non géré";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
