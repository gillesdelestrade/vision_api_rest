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
public enum DestinationLivraison {
    COPROPRIETAIRE,
    D4_IMMOBILIER,
    FOURNISSEUR;
    
    @Override
    public String toString() {
        switch (this) {
            case COPROPRIETAIRE -> {
                return "Copropriétaire";
            }
            case D4_IMMOBILIER -> {
                return "D4 Immobilier";
            }
            case FOURNISSEUR -> {
                return "Fournisseur";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
