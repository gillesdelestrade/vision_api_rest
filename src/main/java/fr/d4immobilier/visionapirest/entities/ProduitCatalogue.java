/*
 * To change this template, choose Tools | Templates
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

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ProduitCatalogue implements Serializable {
    @OneToMany(mappedBy = "produitCatalogue",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PrixCatalogueCopropriete> prixCatalogueCoproprietes;
    @OneToMany(mappedBy = "produitCatalogue",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PrixCatalogue> prixCatalogues;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private String designation;
    @ManyToOne(fetch = FetchType.LAZY)
    private TVA tva;

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
        if (!(object instanceof ProduitCatalogue)) {
            return false;
        }
        ProduitCatalogue other = (ProduitCatalogue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDesignation();
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the tva
     */
    public TVA getTva() {
        return tva;
    }

    /**
     * @param tva the tva to set
     */
    public void setTva(TVA tva) {
        this.tva = tva;
    }

    /**
     * @return the prixCatalogueCoproprietes
     */
    public List<PrixCatalogueCopropriete> getPrixCatalogueCoproprietes() {
        return prixCatalogueCoproprietes;
    }

    /**
     * @param prixCatalogueCoproprietes the prixCatalogueCoproprietes to set
     */
    public void setPrixCatalogueCoproprietes(List<PrixCatalogueCopropriete> prixCatalogueCoproprietes) {
        this.prixCatalogueCoproprietes = prixCatalogueCoproprietes;
    }

    /**
     * @return the prixCatalogues
     */
    public List<PrixCatalogue> getPrixCatalogues() {
        return prixCatalogues;
    }

    /**
     * @param prixCatalogues the prixCatalogues to set
     */
    public void setPrixCatalogues(List<PrixCatalogue> prixCatalogues) {
        this.prixCatalogues = prixCatalogues;
    }
    
}
