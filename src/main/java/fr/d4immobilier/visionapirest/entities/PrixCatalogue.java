/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PrixCatalogue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarif tarif;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProduitCatalogue produitCatalogue;
    private Double prix;

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
        if (!(object instanceof PrixCatalogue)) {
            return false;
        }
        PrixCatalogue other = (PrixCatalogue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new DecimalFormat("###,###,##0.00¤").format(getPrix());
    }

    /**
     * @return the tarif
     */
    public Tarif getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    /**
     * @return the produitCatalogue
     */
    public ProduitCatalogue getProduitCatalogue() {
        return produitCatalogue;
    }

    /**
     * @param produitCatalogue the produitCatalogue to set
     */
    public void setProduitCatalogue(ProduitCatalogue produitCatalogue) {
        this.produitCatalogue = produitCatalogue;
    }

    /**
     * @return the prix
     */
    public Double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    
}
