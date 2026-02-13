/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FichierBonDeLivraison extends FichierDemande implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Livraison livraison;

    /**
     * @return the livraison
     */
    public Livraison getLivraison() {
        return livraison;
    }

    /**
     * @param livraison the livraison to set
     */
    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }
    
}
