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
public enum TypeAudience {
    CONFERENCE_PRESIDENTIELLE,
    MISE_EN_ETAT,
    PLAIDOIRIE;

    @Override
    public String toString() {
        switch(this) {
            case CONFERENCE_PRESIDENTIELLE -> {
                return "Conférence Présidentielle";
            }
            case MISE_EN_ETAT -> {
                return "Mise en état";
            }
            case PLAIDOIRIE -> {
                return "Plaidoirie";
            }
        }
        return "Indéterminée";
    }
    
    
}
