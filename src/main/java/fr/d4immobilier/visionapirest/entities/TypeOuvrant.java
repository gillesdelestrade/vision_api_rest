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
public enum TypeOuvrant {

    PORTAIL,
    PORTE_DE_GARAGE,
    PORTILLON,
    PORTE_D_ENTREE,
    PORTE_D_ACCES,
    TRAPPE_D_ACCES;

    @Override
    public String toString() {
        switch (this) {
            case PORTAIL -> {
                return "Portail";
            }
            case PORTE_DE_GARAGE -> {
                return "Porte de Garage";
            }
            case PORTILLON -> {
                return "Portillon";
            }
            case PORTE_D_ENTREE -> {
                return "Porte d'Entrée";
            }
            case PORTE_D_ACCES -> {
                return "Porte d'Accès";
            }
            case TRAPPE_D_ACCES -> {
                return "Trappe d'Accès";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
