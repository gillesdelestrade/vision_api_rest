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
public class DocumentDemandeDevis extends Document implements Serializable {
    @OneToOne(fetch = FetchType.LAZY)
    private DemandeDevisFournisseur demandeDevisFournisseur;

    /**
     * @return the demandeDevisFournisseur
     */
    public DemandeDevisFournisseur getDemandeDevisFournisseur() {
        return demandeDevisFournisseur;
    }

    /**
     * @param demandeDevisFournisseur the demandeDevisFournisseur to set
     */
    public void setDemandeDevisFournisseur(DemandeDevisFournisseur demandeDevisFournisseur) {
        this.demandeDevisFournisseur = demandeDevisFournisseur;
    }

    

}
