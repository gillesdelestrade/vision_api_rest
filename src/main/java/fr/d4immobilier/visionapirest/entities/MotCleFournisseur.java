/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MotCleFournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private MotPertinent motPertinent;
    private Long poids;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

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
        if (!(object instanceof MotCleFournisseur)) {
            return false;
        }
        MotCleFournisseur other = (MotCleFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.MotCleFournisseur[ id=" + id + " ]";
    }

    /**
     * @return the motPertinent
     */
    public MotPertinent getMotPertinent() {
        return motPertinent;
    }

    /**
     * @param motPertinent the motPertinent to set
     */
    public void setMotPertinent(MotPertinent motPertinent) {
        this.motPertinent = motPertinent;
    }

    /**
     * @return the poids
     */
    public Long getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(Long poids) {
        this.poids = poids;
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
