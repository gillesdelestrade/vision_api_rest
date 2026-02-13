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
public class FichierDemandeDevis extends FichierDemande implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    private DemandeDevis demandeDevis;

    /**
     * @return the demandeDevis
     */
    public DemandeDevis getDemandeDevis() {
        return demandeDevis;
    }

    /**
     * @param demandeDevis the demandeDevis to set
     */
    public void setDemandeDevis(DemandeDevis demandeDevis) {
        this.demandeDevis = demandeDevis;
    }
}
