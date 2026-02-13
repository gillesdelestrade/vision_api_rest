/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class BonDeCommande extends InterventionDemande implements Serializable {
    @OneToOne(mappedBy = "bonDeCommande",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private DocumentBonDeCommande documentBonDeCommande;
    private static final long serialVersionUID = 1L;
    public static final transient int DEMANDE_INTERVENTION = 1;
    public static final transient int BON_DE_COMMANDE = 2;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Personne> contactsSurPlace;


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the getId() fields are not set
        if (!(object instanceof BonDeCommande)) {
            return false;
        }
        BonDeCommande other = (BonDeCommande) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getReference() + " " + getObjet();
    }

    /**
     * @return the contactsSurPlace
     */
    public List<Personne> getContactsSurPlace() {
        return contactsSurPlace;
    }

    /**
     * @param contactsSurPlace the contactsSurPlace to set
     */
    public void setContactsSurPlace(List<Personne> contactsSurPlace) {
        this.contactsSurPlace = contactsSurPlace;
    }

    /**
     * @return the documentBonDeCommande
     */
    public DocumentBonDeCommande getDocumentBonDeCommande() {
        return documentBonDeCommande;
    }

    /**
     * @param documentBonDeCommande the documentBonDeCommande to set
     */
    public void setDocumentBonDeCommande(DocumentBonDeCommande documentBonDeCommande) {
        this.documentBonDeCommande = documentBonDeCommande;
    }

}
