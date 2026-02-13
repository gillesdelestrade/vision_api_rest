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
public class MoyenAccesCatalogue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ouvrant> ouvrants;
    private Float prixUnitaire;
    private Float fraisEnvoi;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeleMoyenAcces modeleMoyenAcces;
    private String libelle;
    private String description;

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
        if (!(object instanceof MoyenAccesCatalogue)) {
            return false;
        }
        MoyenAccesCatalogue other = (MoyenAccesCatalogue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getLibelle() == null) {
            if (getOuvrants() == null || getOuvrants().isEmpty()) {
                if (getModeleMoyenAcces() == null || getModeleMoyenAcces().getTypeMoyenAcces() == null) {
                    return "nouveau";
                } else {
                    return getModeleMoyenAcces().getTypeMoyenAcces().toString();
                }
            } else {
                if (getModeleMoyenAcces() == null || getModeleMoyenAcces().getTypeMoyenAcces() == null) {
                    return "nouveau";
                } else {
                    String s = getModeleMoyenAcces().getTypeMoyenAcces().toString();
                    for (Ouvrant ouvrant : getOuvrants()) {
                        s = s + " " + ouvrant;
                    }
                    return s;
                }
            }
        } else {
            if (getModeleMoyenAcces() == null || getModeleMoyenAcces().getTypeMoyenAcces() == null) {
                    return "nouveau";
                } else {
                    return getModeleMoyenAcces().getTypeMoyenAcces().toString() + " " + getLibelle();
                }
            
        }

    }

    /**
     * @return the ouvrants
     */
    public List<Ouvrant> getOuvrants() {
        return ouvrants;
    }

    /**
     * @param ouvrants the ouvrants to set
     */
    public void setOuvrants(List<Ouvrant> ouvrants) {
        this.ouvrants = ouvrants;
    }

    /**
     * @return the prixUnitaire
     */
    public Float getPrixUnitaire() {
        return prixUnitaire;
    }

    /**
     * @param prixUnitaire the prixUnitaire to set
     */
    public void setPrixUnitaire(Float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
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
     * @return the fraisEnvoi
     */
    public Float getFraisEnvoi() {
        return fraisEnvoi;
    }

    /**
     * @param fraisEnvoi the fraisEnvoi to set
     */
    public void setFraisEnvoi(Float fraisEnvoi) {
        this.fraisEnvoi = fraisEnvoi;
    }

    /**
     * @return the modeleMoyenAcces
     */
    public ModeleMoyenAcces getModeleMoyenAcces() {
        return modeleMoyenAcces;
    }

    /**
     * @param modeleMoyenAcces the modeleMoyenAcces to set
     */
    public void setModeleMoyenAcces(ModeleMoyenAcces modeleMoyenAcces) {
        this.modeleMoyenAcces = modeleMoyenAcces;
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

}
