/*
 * To change this template, choose Tools | Templates
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
public class DocumentBonDeCommande extends Document implements Serializable {
    private static final long serialVersionUID = 1L;

    @OneToOne(fetch = FetchType.LAZY)
    private BonDeCommande bonDeCommande;

    /**
     * @return the bonDeCommande
     */
    public BonDeCommande getBonDeCommande() {
        return bonDeCommande;
    }

    /**
     * @param bonDeCommande the bonDeCommande to set
     */
    public void setBonDeCommande(BonDeCommande bonDeCommande) {
        this.bonDeCommande = bonDeCommande;
    }
}
