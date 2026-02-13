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
public class BonDeCommandePanierMoyenAcces extends BonDeCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private PanierCommandeMoyenAcces panierCommandeMoyenAcces;

    /**
     * @return the panierCommandeMoyenAcces
     */
    public PanierCommandeMoyenAcces getPanierCommandeMoyenAcces() {
        return panierCommandeMoyenAcces;
    }

    /**
     * @param panierCommandeMoyenAcces the panierCommandeMoyenAcces to set
     */
    public void setPanierCommandeMoyenAcces(PanierCommandeMoyenAcces panierCommandeMoyenAcces) {
        this.panierCommandeMoyenAcces = panierCommandeMoyenAcces;
    }
    
}
