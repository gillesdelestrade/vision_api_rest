/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MandataireSociete extends Mandataire {
    @OneToOne(fetch = FetchType.LAZY)
    private Societe societe;

    /**
     * @return the societe
     */
    public Societe getSociete() {
        return societe;
    }

    /**
     * @param societe the societe to set
     */
    public void setSociete(Societe societe) {
        this.societe = societe;
    }
    
    
}
