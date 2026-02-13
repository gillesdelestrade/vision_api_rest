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
public class PrixCatalogueCopropriete implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarif tarif;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProduitCatalogue produitCatalogue;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Double prix;

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
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
    
    @Override
    public String toString() {
        return new DecimalFormat("###,###,##0.00¤").format(getPrix());
    }
}
