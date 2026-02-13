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
public enum MotifAbsenceGestionnaire {
    PRESENT_AU_BUREAU,
    JOUR_OFFER_PAR_D4,
    FERIE,
    CONGES_PAYES,
    RTT,
    MALADIE_MATERNITE,
    CONVENTIONNEL,
    CONGES_SANS_SOLDE,
    ECOLE,
    TELETRAVAIL,
    ABSENCE_AUTORISEE,
    TEMPS_PARTIEL_JOUR_NON_TRAVAILLE;

    @Override
    public String toString() {
        switch(this) {
            case PRESENT_AU_BUREAU:
                return "Présent au Bureau";
            case JOUR_OFFER_PAR_D4:
                return "Jour Offert par d4";
            case FERIE:
                return "Férié";
            case CONGES_PAYES:
                return "Congés Payés";
            case RTT:
                return "RTT";
            case MALADIE_MATERNITE:
                return "Maladie - Maternité";
            case CONVENTIONNEL:
                return "conventionnel";
            case CONGES_SANS_SOLDE:
                return "congés Sans Solde";
            case ECOLE:
                return "Ecole";
            case TELETRAVAIL:
                return "Télétravail";
            case ABSENCE_AUTORISEE:
                return "Absence Autorisée";
            case TEMPS_PARTIEL_JOUR_NON_TRAVAILLE:
                return "Temps Partiel - Jour Non Travaillé";
        }
        return "Inconnu";
    }
    
    public String toHex() {
        switch(this) {
            case PRESENT_AU_BUREAU:
                return "#FFFFFF";
            case JOUR_OFFER_PAR_D4:
                return "#E46A05";
            case FERIE:
                return "#FEFC1A";
            case CONGES_PAYES:
                return "#FD0900";
            case RTT:
                return "#03B0F0";
            case MALADIE_MATERNITE:
                return "#00AF51";
            case CONVENTIONNEL:
                return "#6F2FA0";
            case CONGES_SANS_SOLDE:
                return "#F15CE0";
            case ECOLE:
                return "#20497E";
            case TELETRAVAIL:
                return "#FBD5B4";
            case ABSENCE_AUTORISEE:
                return "#92D151";
            case TEMPS_PARTIEL_JOUR_NON_TRAVAILLE:
                return "#B1A0C8";
        }
        return "Inconnu";
    }
    
    
}
