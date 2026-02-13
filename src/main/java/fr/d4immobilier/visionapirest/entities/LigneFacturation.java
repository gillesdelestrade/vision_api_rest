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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class LigneFacturation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProduitCatalogue produitCatalogue;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarif tarif;
    private Double quantite;
    private String quantiteAffichee;
    @ManyToOne(fetch = FetchType.LAZY)
    private RegroupementLignesFacturation regroupementLignesFacturation;
    private Double remise;
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
        if (!(object instanceof LigneFacturation)) {
            return false;
        }
        LigneFacturation other = (LigneFacturation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getId() == null) {
            return "-";
        } else {
            return getId().toString();
        }
        
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
     * @return the quantite
     */
    public Double getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the regroupementLignesFacturation
     */
    public RegroupementLignesFacturation getRegroupementLignesFacturation() {
        return regroupementLignesFacturation;
    }

    /**
     * @param regroupementLignesFacturation the regroupementLignesFacturation to set
     */
    public void setRegroupementLignesFacturation(RegroupementLignesFacturation regroupementLignesFacturation) {
        this.regroupementLignesFacturation = regroupementLignesFacturation;
    }

    /**
     * @return the remise
     */
    public Double getRemise() {
        return remise;
    }

    /**
     * @param remise the remise to set
     */
    public void setRemise(Double remise) {
        this.remise = remise;
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

    /**
     * @return the quantiteAffichee
     */
    public String getQuantiteAffichee() {
        return quantiteAffichee;
    }

    /**
     * @param quantiteAffichee the quantiteAffichee to set
     */
    public void setQuantiteAffichee(String quantiteAffichee) {
        this.quantiteAffichee = quantiteAffichee;
    }
    
}
