/*
 * To change this template, choose Tools | Templates
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
public class CompteEnBanqueSociete extends CompteEnBanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne(fetch = FetchType.LAZY)
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
