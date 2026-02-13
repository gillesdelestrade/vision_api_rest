/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PostPersist;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FichierCourrierEntrant extends Fichier {

    @OneToOne(mappedBy = "fichierCourrierEntrant", fetch = FetchType.LAZY)
    private CourrierEntrant courrierEntrant;

    /**
     * @return the courrierEntrant
     */
    public CourrierEntrant getCourrierEntrant() {
        return courrierEntrant;
    }

    /**
     * @param courrierEntrant the courrierEntrant to set
     */
    public void setCourrierEntrant(CourrierEntrant courrierEntrant) {
        this.courrierEntrant = courrierEntrant;
    }

    @PostPersist
    private void setIdDansNomStockage() {
        setNomStockage(getId() + "_" + getNomFichier());
    }
}
