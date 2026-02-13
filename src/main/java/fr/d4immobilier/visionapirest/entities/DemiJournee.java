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
public enum DemiJournee {
    MATIN,
    APRES_MIDI;

    @Override
    public String toString() {
        switch(this) {
            case MATIN:
                return "Matin";
            case APRES_MIDI:
                return "Après Midi";
        }
        return "Inconnu";
        
    }
    
    
}
