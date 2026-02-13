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
public class LogActivite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateActivite;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne user;
    private String description;
    private Integer nbPages;
    private Integer nbDocuments;
    private Integer dureeAppelEnSecondes;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

    public LogActivite() {
        this.dateActivite = Instant.now();
    }
    
    

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
        if (!(object instanceof LogActivite)) {
            return false;
        }
        LogActivite other = (LogActivite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.LogActivite[ id=" + id + " ]";
    }

    /**
     * @return the dateActivite
     */
    public Instant getDateActivite() {
        return dateActivite;
    }

    /**
     * @param dateActivite the dateActivite to set
     */
    public void setDateActivite(Instant dateActivite) {
        this.dateActivite = dateActivite;
    }

    /**
     * @return the user
     */
    public Personne getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Personne user) {
        this.user = user;
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
     * @return the nbPages
     */
    public Integer getNbPages() {
        return nbPages;
    }

    /**
     * @param nbPages the nbPages to set
     */
    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    /**
     * @return the nbDocuments
     */
    public Integer getNbDocuments() {
        return nbDocuments;
    }

    /**
     * @param nbDocuments the nbDocuments to set
     */
    public void setNbDocuments(Integer nbDocuments) {
        this.nbDocuments = nbDocuments;
    }

    /**
     * @return the dureeAppelEnSecondes
     */
    public Integer getDureeAppelEnSecondes() {
        return dureeAppelEnSecondes;
    }

    /**
     * @param dureeAppelEnSecondes the dureeAppelEnSecondes to set
     */
    public void setDureeAppelEnSecondes(Integer dureeAppelEnSecondes) {
        this.dureeAppelEnSecondes = dureeAppelEnSecondes;
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
    
}
