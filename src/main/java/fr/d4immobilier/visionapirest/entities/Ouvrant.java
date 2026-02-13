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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Ouvrant implements Serializable {
    @ManyToMany(mappedBy = "ouvrants", fetch = FetchType.LAZY)
    private List<MoyenAccesCatalogue> moyensAccesCatalogues;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private TypeOuvrant typeOuvrant;
    private String libelle;
    private String description;
    private String code;
    private Boolean moyenAccesUniqueParEmplacement;
    

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
        if (!(object instanceof Ouvrant)) {
            return false;
        }
        Ouvrant other = (Ouvrant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getLibelle() != null && getLibelle().isEmpty() == false) {
            return getTypeOuvrant() + " " + getLibelle();
        } else {
            return getTypeOuvrant() + "";
        }
        
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
     * @return the typeOuvrant
     */
    public TypeOuvrant getTypeOuvrant() {
        return typeOuvrant;
    }

    /**
     * @param typeOuvrant the typeOuvrant to set
     */
    public void setTypeOuvrant(TypeOuvrant typeOuvrant) {
        this.typeOuvrant = typeOuvrant;
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the moyensAccesCatalogues
     */
    public List<MoyenAccesCatalogue> getMoyensAccesCatalogues() {
        return moyensAccesCatalogues;
    }

    /**
     * @param moyensAccesCatalogues the moyensAccesCatalogues to set
     */
    public void setMoyensAccesCatalogues(List<MoyenAccesCatalogue> moyensAccesCatalogues) {
        this.moyensAccesCatalogues = moyensAccesCatalogues;
    }

    /**
     * @return the moyenAccesUniqueParEmplacement
     */
    public Boolean getMoyenAccesUniqueParEmplacement() {
        return moyenAccesUniqueParEmplacement;
    }

    /**
     * @param moyenAccesUniqueParEmplacement the moyenAccesUniqueParEmplacement to set
     */
    public void setMoyenAccesUniqueParEmplacement(Boolean moyenAccesUniqueParEmplacement) {
        this.moyenAccesUniqueParEmplacement = moyenAccesUniqueParEmplacement;
    }
    
}
