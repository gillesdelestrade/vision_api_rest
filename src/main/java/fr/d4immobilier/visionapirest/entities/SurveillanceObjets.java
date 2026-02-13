/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gilles
 */
@Entity
public class SurveillanceObjets implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ObjetASurveiller objetASurveiller;
    private Long idPersonne;
    private Instant dateDePriseEnCompte;

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
        if (!(object instanceof SurveillanceObjets)) {
            return false;
        }
        SurveillanceObjets other = (SurveillanceObjets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.SurveillanceObjets[id=" + id + "]";
    }

    /**
     * @return the objetASurveiller
     */
    public ObjetASurveiller getObjetASurveiller() {
        return objetASurveiller;
    }

    /**
     * @param objetASurveiller the objetASurveiller to set
     */
    public void setObjetASurveiller(ObjetASurveiller objetASurveiller) {
        this.objetASurveiller = objetASurveiller;
    }

    /**
     * @return the idPersonne
     */
    public Long getIdPersonne() {
        return idPersonne;
    }

    /**
     * @param idPersonne the idPersonne to set
     */
    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    /**
     * @return the dateDePriseEnCompte
     */
    public Instant getDateDePriseEnCompte() {
        return dateDePriseEnCompte;
    }

    /**
     * @param dateDePriseEnCompte the dateDePriseEnCompte to set
     */
    public void setDateDePriseEnCompte(Instant dateDePriseEnCompte) {
        this.dateDePriseEnCompte = dateDePriseEnCompte;
    }

}
