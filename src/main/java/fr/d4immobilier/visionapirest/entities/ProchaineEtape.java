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

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ProchaineEtape implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProchaineEtapeType prochaineEtapeType;
    private Instant dateDebut;
    private Instant dateFin;

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
        if (!(object instanceof ProchaineEtape)) {
            return false;
        }
        ProchaineEtape other = (ProchaineEtape) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ProchaineEtape[ id=" + id + " ]";
    }

    /**
     * @return the prochaineEtapeType
     */
    public ProchaineEtapeType getProchaineEtapeType() {
        return prochaineEtapeType;
    }

    /**
     * @param prochaineEtapeType the prochaineEtapeType to set
     */
    public void setProchaineEtapeType(ProchaineEtapeType prochaineEtapeType) {
        this.prochaineEtapeType = prochaineEtapeType;
    }

    /**
     * @return the dateDebut
     */
    public Instant getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Instant dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public Instant getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(Instant dateFin) {
        this.dateFin = dateFin;
    }
    
}
