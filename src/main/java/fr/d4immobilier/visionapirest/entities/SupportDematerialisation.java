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
public enum SupportDematerialisation {
    PAPIER,
    MAIL,
    MAIL_ET_PAPIER;

    @Override
    public String toString() {
        switch(this) {
            case PAPIER -> {
                return "Papier";
            }
            case MAIL -> {
                return "Mail";
            }
            case MAIL_ET_PAPIER -> {
                return "Mail + Papier";
            }
        }
        return "Indéterminé";
    }
    
    
}
