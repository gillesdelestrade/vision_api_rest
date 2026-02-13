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
public enum TypeEcheance {

    APPEL_DE_FONDS,
    FONDS_ALUR,
    PROVISION_SPECIALE,
    BUDGET_COURANT;

    @Override
    public String toString() {
        switch (this) {
            case APPEL_DE_FONDS -> {
                return "Appel de fonds";
            }
            case FONDS_ALUR -> {
                return "Fonds ALUR";
            }
            case PROVISION_SPECIALE -> {
                return "Provision spéciale";
            }
            case BUDGET_COURANT -> {
                return "Budget courant";
            }
            
        }
        return "Inconnu";
    }

}
