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
public enum EtatTraitementAuto {

    NORMAL,
    ATTENTE_CONTRE_ORDRE_CS,
    ATTENTE_INFO_FOURNISSEUR,
    DERNIER_COMMENTAIRE_CS,
    DERNIER_COMMENTAIRE_FOURNISSEUR,
    TERMINE,
    ATTENTE_CONTRE_ORDRE_CS_RELANCE;

    @Override
    public String toString() {
        switch (this) {
            case NORMAL -> {
                return "Normal";
            }
            case ATTENTE_CONTRE_ORDRE_CS -> {
                return "Attente d'un contre ordre du Conseil Syndical";
            }
            case ATTENTE_INFO_FOURNISSEUR -> {
                return "Attente d'information de la part du Fournisseur";
            }
            case DERNIER_COMMENTAIRE_CS -> {
                return "Dernier Commentaire par le Conseil Syndical";
            }
            case DERNIER_COMMENTAIRE_FOURNISSEUR -> {
                return "Dernier Commentaire par le Fournisseur";
            }
            case TERMINE -> {
                return "Terminé";
            }
            case ATTENTE_CONTRE_ORDRE_CS_RELANCE -> {
                return "Attente d'un contre ordre du Conseil Syndical - Relance";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }

}
