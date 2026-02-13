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
public enum CouleurEtatKanban {
    BLEU,
    BLEU_RETARD,
    VERT,
    JAUNE,
    ROUGE,
    GRIS;
    
    @Override    
    public String toString() {
        switch (this) {
            case BLEU -> {
                return "Bleu";
            }
            case BLEU_RETARD -> {
                return "Bleu (Retard)";
            }
            case VERT -> {
                return "Vert";
            }
            case JAUNE -> {
                return "Jaune";
            }
            case ROUGE -> {
                return "Rouge";
            }
            case GRIS -> {
                return "Gris";
            }
            
        }
        throw new RuntimeException("Invalid value for this");
    }
    
    public String toHex() {
        switch (this) {
            case BLEU:
                return "#009DF8";
            case BLEU_RETARD:
                return "#004A7C";
            case VERT:
                return "#1EAB15";
            case JAUNE:
                return "#F0B506";
            case ROUGE:
                return "#E6210D";
                case GRIS:
                    return "#999999";
            
        }
        throw new RuntimeException("Invalid value for this");
    }
}
