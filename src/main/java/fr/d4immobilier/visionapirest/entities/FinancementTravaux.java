/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FinancementTravaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ResolutionTravaux resolutionTravaux;
    @OneToMany(mappedBy = "financementTravaux", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EcheanceFinancement> echeancesFinancement;
    @OneToOne(fetch = FetchType.LAZY)
    private Resolution resolution;
    
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
        if (!(object instanceof FinancementTravaux)) {
            return false;
        }
        FinancementTravaux other = (FinancementTravaux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.FinancementTravaux[ id=" + id + " ]";
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
     * @return the echeancesFinancement
     */
    public List<EcheanceFinancement> getEcheancesFinancement() {
        return echeancesFinancement;
    }

    /**
     * @param echeancesFinancement the echeancesFinancement to set
     */
    public void setEcheancesFinancement(List<EcheanceFinancement> echeancesFinancement) {
        this.echeancesFinancement = echeancesFinancement;
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
    
}
