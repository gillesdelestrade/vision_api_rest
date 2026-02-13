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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class HonorairesSurTravaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float valeurEuros;
    private Float valeurPoucents;
    @OneToOne(fetch = FetchType.LAZY)
    private ResolutionTravaux resolutionTravaux;
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
        if (!(object instanceof HonorairesSurTravaux)) {
            return false;
        }
        HonorairesSurTravaux other = (HonorairesSurTravaux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.HonorairesSurTravaux[ id=" + id + " ]";
    }

    /**
     * @return the valeurEuros
     */
    public Float getValeurEuros() {
        return valeurEuros;
    }

    /**
     * @param valeurEuros the valeurEuros to set
     */
    public void setValeurEuros(Float valeurEuros) {
        this.valeurEuros = valeurEuros;
    }

    /**
     * @return the valeurPoucents
     */
    public Float getValeurPoucents() {
        return valeurPoucents;
    }

    /**
     * @param valeurPoucents the valeurPoucents to set
     */
    public void setValeurPoucents(Float valeurPoucents) {
        this.valeurPoucents = valeurPoucents;
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
    
}
