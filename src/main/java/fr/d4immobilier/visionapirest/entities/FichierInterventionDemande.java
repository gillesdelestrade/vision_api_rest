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
public class FichierInterventionDemande extends FichierDemande implements Serializable {
    private static final long serialVersionUID = 1L;
    @OneToOne(fetch = FetchType.LAZY)
    private InterventionDemande interventionDemande;

    /**
     * @return the interventionDemande
     */
    public InterventionDemande getInterventionDemande() {
        return interventionDemande;
    }

    /**
     * @param interventionDemande the interventionDemande to set
     */
    public void setInterventionDemande(InterventionDemande interventionDemande) {
        this.interventionDemande = interventionDemande;
    }

}
