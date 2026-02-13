/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FichierDemandeSansCompteVision extends Fichier implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private DemandeSansCompteVision demandeSansCompteVision;

    /**
     * @return the demandeSansCompteVision
     */
    public DemandeSansCompteVision getDemandeSansCompteVision() {
        return demandeSansCompteVision;
    }

    /**
     * @param demandeSansCompteVision the demandeSansCompteVision to set
     */
    public void setDemandeSansCompteVision(DemandeSansCompteVision demandeSansCompteVision) {
        this.demandeSansCompteVision = demandeSansCompteVision;
    }
    
}
