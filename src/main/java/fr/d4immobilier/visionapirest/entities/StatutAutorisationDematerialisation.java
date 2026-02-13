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
public enum StatutAutorisationDematerialisation {

    NON_POSITIONNEE,
    EXPLICITEMENT_REFUSEE,
    EXPLICITEMENT_ACCEPTEE_EN_ATTENTE_VALIDATION,
    EXPLICITEMENT_ACCEPTEE_VALIDEE;

    @Override
    public String toString() {
        switch (this) {
            case NON_POSITIONNEE -> {
                return "Non positionnée";
            }
            case EXPLICITEMENT_REFUSEE -> {
                return "Dématérialisation explicitement refusée";
            }
            case EXPLICITEMENT_ACCEPTEE_EN_ATTENTE_VALIDATION -> {
                return "Votre demande de dématérialisation est enregistrée. Veuillez cliquer sur le lien de validation envoyé par e-mail pour activer le service.";
            }
            case EXPLICITEMENT_ACCEPTEE_VALIDEE -> {
                return "Explicitement acceptée - validée";
            }

        }
        return "indéterminée";
    }

}
