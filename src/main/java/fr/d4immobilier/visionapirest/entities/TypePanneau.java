/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypePanneau {

    BOITE_AUX_LETTRES,
    INTERPHONE;

    @Override
    public String toString() {
        switch (this) {
            case BOITE_AUX_LETTRES -> {
                return "Boîte aux lettres";
            }
            case INTERPHONE -> {
                return "Interphone";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
