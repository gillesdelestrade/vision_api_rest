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
public class ARappelerEnvoiMail extends ARappeler {
    @OneToOne(fetch = FetchType.LAZY)
    private EnvoiMail envoiMail;

    /**
     * @return the envoiMail
     */
    public EnvoiMail getEnvoiMail() {
        return envoiMail;
    }

    /**
     * @param envoiMail the envoiMail to set
     */
    public void setEnvoiMail(EnvoiMail envoiMail) {
        this.envoiMail = envoiMail;
    }
    
}
