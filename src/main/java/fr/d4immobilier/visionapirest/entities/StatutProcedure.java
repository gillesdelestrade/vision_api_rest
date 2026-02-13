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
public enum StatutProcedure {
    EN_COURS,
    APPEL,
    GAGNE,
    PERDU;

    @Override
    public String toString() {
        switch(this) {
            case EN_COURS:
                return "En cours";
            case APPEL:
                return "Appel";
            case GAGNE:
                return "Gagné";
            case PERDU:
                return "Perdu";
        }
        return "Indéterminé";
    }
    
    
}
