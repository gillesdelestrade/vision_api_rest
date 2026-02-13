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
public class FichierDevisFournisseur extends FichierDemande implements Serializable {
    @OneToOne(fetch = FetchType.LAZY)
    private DevisFournisseur devisFournisseur;

    
    /**
     * @return the devisFournisseur
     */
    public DevisFournisseur getDevisFournisseur() {
        return devisFournisseur;
    }

    /**
     * @param devisFournisseur the devisFournisseur to set
     */
    public void setDevisFournisseur(DevisFournisseur devisFournisseur) {
        this.devisFournisseur = devisFournisseur;
    }

}
