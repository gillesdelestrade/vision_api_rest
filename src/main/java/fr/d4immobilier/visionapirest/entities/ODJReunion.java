/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ODJReunion implements Serializable {
    @OneToMany(mappedBy = "oDJReunion", fetch = FetchType.LAZY)
    private List<PointODJReunion> pointsODJReunion;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@OneToOne(mappedBy = "oDJReunion", fetch = FetchType.LAZY)
    @OneToOne(fetch = FetchType.LAZY)
    private Reunion reunion;
    private Instant dateCreation;
    private Instant dateModification;
    private Instant dateReunionPrevue;
    private Boolean dateProvisoire;
    private String lieuReunion;
    

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
        if (!(object instanceof ODJReunion)) {
            return false;
        }
        ODJReunion other = (ODJReunion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ODJReunion[ id=" + id + " ]";
    }

    /**
     * @return the reunion
     */
    public Reunion getReunion() {
        return reunion;
    }

    /**
     * @param reunion the reunion to set
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the dateModification
     */
    public Instant getDateModification() {
        return dateModification;
    }

    /**
     * @param dateModification the dateModification to set
     */
    public void setDateModification(Instant dateModification) {
        this.dateModification = dateModification;
    }

    /**
     * @return the dateReunionPrevue
     */
    public Instant getDateReunionPrevue() {
        return dateReunionPrevue;
    }

    /**
     * @param dateReunionPrevue the dateReunionPrevue to set
     */
    public void setDateReunionPrevue(Instant dateReunionPrevue) {
        this.dateReunionPrevue = dateReunionPrevue;
    }

    /**
     * @return the dateProvisoire
     */
    public Boolean getDateProvisoire() {
        return dateProvisoire;
    }

    /**
     * @param dateProvisoire the dateProvisoire to set
     */
    public void setDateProvisoire(Boolean dateProvisoire) {
        this.dateProvisoire = dateProvisoire;
    }

    /**
     * @return the lieuReunion
     */
    public String getLieuReunion() {
        return lieuReunion;
    }

    /**
     * @param lieuReunion the lieuReunion to set
     */
    public void setLieuReunion(String lieuReunion) {
        this.lieuReunion = lieuReunion;
    }

    /**
     * @return the pointsODJReunion
     */
    public List<PointODJReunion> getPointsODJReunion() {
        return pointsODJReunion;
    }

    /**
     * @param pointsODJReunion the pointsODJReunion to set
     */
    public void setPointsODJReunion(List<PointODJReunion> pointsODJReunion) {
        this.pointsODJReunion = pointsODJReunion;
    }
    
}
