/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class OptionTravaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ResolutionTravaux resolutionTravaux;
    @OneToOne(fetch = FetchType.LAZY)
    private Resolution resolution;
    private String description;
    private Float montant;
    @ManyToOne(fetch = FetchType.LAZY)
    private DevisFournisseur devisFournisseur;
    

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
        if (!(object instanceof OptionTravaux)) {
            return false;
        }
        OptionTravaux other = (OptionTravaux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.OptionTravaux[ id=" + id + " ]";
    }

    /**
     * @return the resolutionTravaux
     */
    public ResolutionTravaux getResolutionTravaux() {
        return resolutionTravaux;
    }

    /**
     * @param resolutionTravaux the resolutionTravaux to set
     */
    public void setResolutionTravaux(ResolutionTravaux resolutionTravaux) {
        this.resolutionTravaux = resolutionTravaux;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the montant
     */
    public Float getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Float montant) {
        this.montant = montant;
    }

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
