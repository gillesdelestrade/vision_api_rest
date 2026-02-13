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
public enum EtatRappelTelephonique {    
    OK,
    MESSAGE_LAISSE,
    INVESTIGATIONS_A_MENER,
    ATTENTE_INFO_APPELANT,
    AUTRE,
    MESSAGE_TRAITE_SANS_RAPPEL,
    REPONSE_FAITE_PAR_MAIL;

    @Override
    public String toString() {
        switch (this) {
            case OK -> {
                return "Ok. A clôturer.";
            }
            case MESSAGE_LAISSE -> {
                return "Message laissé sur le répondeur.";
            }
            case INVESTIGATIONS_A_MENER -> {
                return "Investigations à mener.";
            }
            case ATTENTE_INFO_APPELANT -> {
                return "Attente d'informations de la part de l'appelant.";
            }
            case AUTRE -> {
                return "Autre.";
            }
            case MESSAGE_TRAITE_SANS_RAPPEL -> {
                return "Message traité sans rappel";
            }
            case REPONSE_FAITE_PAR_MAIL -> {
                return "Réponse faite par mail";
            }
           
        }
        throw new RuntimeException("Invalid value for this");
    }
    
    
    
}
