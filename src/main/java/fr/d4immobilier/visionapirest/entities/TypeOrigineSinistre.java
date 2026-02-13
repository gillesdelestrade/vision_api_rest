/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeOrigineSinistre {

    INCONNU,
    COPROPRIETE,
    COPROPRIETAIRE,
    LOCATAIRE,
    AUTRE;

    @Override
    public String toString() {
        switch (this) {
            case COPROPRIETE -> {
                return "Copropriété";
            }
            case COPROPRIETAIRE -> {
                return "Copropriétaire";
            }
            case LOCATAIRE -> {
                return "Locataire";
            }
            case AUTRE -> {
                return "Autre";
            }
                case INCONNU -> {
                    return "Inconnu";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
