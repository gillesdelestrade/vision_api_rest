/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum ProvenanceCourrierEntrant {
    COPROPRIETAIRE,
    FOURNISSEUR,
    AUTRE;

    @Override
    public String toString() {
        switch (this) {
            case COPROPRIETAIRE -> {
                return "Copropriétaire";
            }
            case FOURNISSEUR -> {
                return "Fournisseur";
            }
            case AUTRE -> {
                return "Autre";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
