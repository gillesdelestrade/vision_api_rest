/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gilles
 */
@Entity
public class PanierDemandesIntervention implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    private LocalDate dateButoire;
    private Boolean declenche;
    @OneToMany(mappedBy = "panierDemandesIntervention",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterventionDemande> interventionsDemande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PanierDemandesIntervention)) {
            return false;
        }
        PanierDemandesIntervention other = (PanierDemandesIntervention) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PanierDemandesIntervention[id=" + id + "]";
    }

    /**
     * @return the copropriete
     */
    public Copropriete getCopropriete() {
        return copropriete;
    }

    /**
     * @param copropriete the copropriete to set
     */
    public void setCopropriete(Copropriete copropriete) {
        this.copropriete = copropriete;
    }

    /**
     * @return the fournisseur
     */
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    /**
     * @param fournisseur the fournisseur to set
     */
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    /**
     * @return the dateButoire
     */
    public LocalDate getDateButoire() {
        return dateButoire;
    }

    /**
     * @param dateButoire the dateButoire to set
     */
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    /**
     * @return the declenche
     */
    public Boolean getDeclenche() {
        return declenche;
    }

    /**
     * @param declenche the declenche to set
     */
    public void setDeclenche(Boolean declenche) {
        this.declenche = declenche;
    }

    /**
     * @return the interventionsDemande
     */
    public List<InterventionDemande> getInterventionsDemande() {
        return interventionsDemande;
    }

    /**
     * @param interventionsDemande the interventionsDemande to set
     */
    public void setInterventionsDemande(List<InterventionDemande> interventionsDemande) {
        this.interventionsDemande = interventionsDemande;
    }

}
