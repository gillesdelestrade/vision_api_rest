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
public enum StatutEmplacementPlaqueBAL {

    CORRECT,
    INFO_A_ENVOYER,
    ATTENDRE_DELAI,
    A_COMMANDER,
    ATTENDRE_INSTALLATION,
    INTERVENTION_REQUISE;

    @Override
    public String toString() {
        switch (this) {
            case CORRECT -> {
                return "Correct";
            }
            case INFO_A_ENVOYER -> {
                return "Info à envoyer";
            }
            case ATTENDRE_DELAI -> {
                return "Attendre délai";
            }
            case A_COMMANDER -> {
                return "À commander";
            }
            case ATTENDRE_INSTALLATION -> {
                return "Attendre installation";
            }
            case INTERVENTION_REQUISE -> {
                return "Intervention requise";
            }

        }
        throw new RuntimeException("Invalid value for this");
    }
}
