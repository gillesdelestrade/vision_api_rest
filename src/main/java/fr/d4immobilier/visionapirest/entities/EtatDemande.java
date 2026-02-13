/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum EtatDemande {

    OUVERT,
    PRIS_EN_COMPTE,
    EN_COURS,
    CLOTURE_PAR_D4,
    CLOTURE_DEFINITIVEMENT,
    BLOQUE,
    FILE_D_ATTENTE,
    MAIL_IMPORTE;

    @Override
    public String toString() {
        switch (this) {
            case OUVERT:
                return "Ouvert";
            case PRIS_EN_COMPTE:
                return "Pris en compte";
            case EN_COURS:
                return "En cours";
            case CLOTURE_PAR_D4:
                return "Clôturé par d4";
            case CLOTURE_DEFINITIVEMENT:
                return "Clôturé définitivement";
            case BLOQUE:
                return "Bloqué";
            case FILE_D_ATTENTE:
                return "En attente";
            case MAIL_IMPORTE:
                return "Mail importé";

        }
        throw new RuntimeException("Invalid value for this");
    }
}
