/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Batiment implements Serializable,Comparable<Batiment> {
    @ManyToMany(mappedBy = "batimentsConcernes", fetch = FetchType.LAZY)
    private List<FactureFournisseur> facturesFournisseur;
    @OneToMany(mappedBy = "batiment", fetch = FetchType.LAZY)
    private List<PanneauBALInterphone> panneauxBALInterphone;
    @OneToMany(mappedBy = "batiment", fetch = FetchType.LAZY)
    private List<Equipement> equipements;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @OneToMany(mappedBy = "batiment", fetch = FetchType.LAZY)
    private List<Lot> lots;
    private String libelleCourt;

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
        if (!(object instanceof Batiment)) {
            return false;
        }
        Batiment other = (Batiment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getLibelle();
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
     * @return the lots
     */
    public List<Lot> getLots() {
        return lots;
    }

    /**
     * @param lots the lots to set
     */
    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }

    /**
     * @return the equipements
     */
    public List<Equipement> getEquipements() {
        return equipements;
    }

    /**
     * @param equipements the equipements to set
     */
    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    /**
     * @return the libelleCourt
     */
    public String getLibelleCourt() {
        return libelleCourt;
    }

    /**
     * @param libelleCourt the libelleCourt to set
     */
    public void setLibelleCourt(String libelleCourt) {
        this.libelleCourt = libelleCourt;
    }

    @Override
    public int compareTo(Batiment o) {
        return this.getLibelle().compareTo(o.getLibelle());
    }
    
}
