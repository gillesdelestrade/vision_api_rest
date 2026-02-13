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
public enum ModeModificationEtapePlanifAG {

    MODIFICATION_DIRECTE,
    CASCADE;

    @Override
    public String toString() {
        switch (this) {
            case MODIFICATION_DIRECTE -> {
                return "Modification Directe";
            }
            case CASCADE -> {
                return "Modification en cascade";
            }
        }
        return "modification inconnue";
    }

}
