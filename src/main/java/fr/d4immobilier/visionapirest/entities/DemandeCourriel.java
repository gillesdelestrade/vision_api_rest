/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DemandeCourriel extends Demande {
    
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Courriel courriel;

    /**
     * @return the courriel
     */
    public Courriel getCourriel() {
        return courriel;
    }

    /**
     * @param courriel the courriel to set
     */
    public void setCourriel(Courriel courriel) {
        this.courriel = courriel;
    }
    
}
