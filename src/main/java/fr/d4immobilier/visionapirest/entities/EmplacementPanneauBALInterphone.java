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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EmplacementPanneauBALInterphone implements Serializable {
    @OneToMany(mappedBy = "emplacementPanneauBALInterphone", fetch = FetchType.LAZY)
    private List<FichierEmplacement> fichiers;
    @OneToMany(mappedBy = "emplacementPanneauBALInterphone", fetch = FetchType.LAZY)
    private List<DemandeEmplacementPanneauBALInterphone> demandes;
    @OneToMany(mappedBy = "emplacementPanneauBALInterphone", fetch = FetchType.LAZY)
    private List<BonDeCommandeEmplacementBALInterphone> bonsDeCommande;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean actif;
    @ManyToOne(fetch = FetchType.LAZY)
    private Lot lot;
    private String ligne1;
    private String ligne2;
    private String ligne3;
    @ManyToOne(fetch = FetchType.LAZY)
    private PanneauBALInterphone panneauBALInterphone;
    private Integer ligne;
    private Integer colonne;
    private StatutEmplacementPlaqueBAL statutEmplacementPlaqueBAL;
    private LocalDate dateCommandePrevisionnelle;

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
        if (!(object instanceof EmplacementPanneauBALInterphone)) {
            return false;
        }
        EmplacementPanneauBALInterphone other = (EmplacementPanneauBALInterphone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EmplacementPanneauBALInterphone[ id=" + id + " ]";
    }

    /**
     * @return the actif
     */
    public Boolean getActif() {
        return actif;
    }

    /**
     * @param actif the actif to set
     */
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    /**
     * @return the lot
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * @param lot the lot to set
     */
    public void setLot(Lot lot) {
        this.lot = lot;
    }

    /**
     * @return the ligne1
     */
    public String getLigne1() {
        return ligne1;
    }

    /**
     * @param ligne1 the ligne1 to set
     */
    public void setLigne1(String ligne1) {
        this.ligne1 = ligne1;
    }

    /**
     * @return the ligne2
     */
    public String getLigne2() {
        return ligne2;
    }

    /**
     * @param ligne2 the ligne2 to set
     */
    public void setLigne2(String ligne2) {
        this.ligne2 = ligne2;
    }
    
    /**
     * @return the ligne3
     */
    public String getLigne3() {
        return ligne3;
    }

    /**
     * @param ligne3 the ligne3 to set
     */
    public void setLigne3(String ligne3) {
        this.ligne3 = ligne3;
    }

    /**
     * @return the panneauBALInterphone
     */
    public PanneauBALInterphone getPanneauBALInterphone() {
        return panneauBALInterphone;
    }

    /**
     * @param panneauBALInterphone the panneauBALInterphone to set
     */
    public void setPanneauBALInterphone(PanneauBALInterphone panneauBALInterphone) {
        this.panneauBALInterphone = panneauBALInterphone;
    }

    /**
     * @return the ligne
     */
    public Integer getLigne() {
        return ligne;
    }

    /**
     * @param ligne the ligne to set
     */
    public void setLigne(Integer ligne) {
        this.ligne = ligne;
    }

    /**
     * @return the colonne
     */
    public Integer getColonne() {
        return colonne;
    }

    /**
     * @param colonne the colonne to set
     */
    public void setColonne(Integer colonne) {
        this.colonne = colonne;
    }

    /**
     * @return the statutEmplacementPlaqueBAL
     */
    public StatutEmplacementPlaqueBAL getStatutEmplacementPlaqueBAL() {
        return statutEmplacementPlaqueBAL;
    }

    /**
     * @param statutEmplacementPlaqueBAL the statutEmplacementPlaqueBAL to set
     */
    public void setStatutEmplacementPlaqueBAL(StatutEmplacementPlaqueBAL statutEmplacementPlaqueBAL) {
        this.statutEmplacementPlaqueBAL = statutEmplacementPlaqueBAL;
    }

    /**
     * @return the dateCommandePrevisionnelle
     */
    public LocalDate getDateCommandePrevisionnelle() {
        return dateCommandePrevisionnelle;
    }

    /**
     * @param dateCommandePrevisionnelle the dateCommandePrevisionnelle to set
     */
    public void setDateCommandePrevisionnelle(LocalDate dateCommandePrevisionnelle) {
        this.dateCommandePrevisionnelle = dateCommandePrevisionnelle;
    }

    /**
     * @return the fichiers
     */
    public List<FichierEmplacement> getFichiers() {
        return fichiers;
    }

    /**
     * @param fichiers the fichiers to set
     */
    public void setFichiers(List<FichierEmplacement> fichiers) {
        this.fichiers = fichiers;
    }

    /**
     * @return the demandes
     */
    public List<DemandeEmplacementPanneauBALInterphone> getDemandes() {
        return demandes;
    }

    /**
     * @param demandes the demandes to set
     */
    public void setDemandes(List<DemandeEmplacementPanneauBALInterphone> demandes) {
        this.demandes = demandes;
    }

    /**
     * @return the bonsDeCommande
     */
    public List<BonDeCommandeEmplacementBALInterphone> getBonsDeCommande() {
        return bonsDeCommande;
    }

    /**
     * @param bonsDeCommande the bonsDeCommande to set
     */
    public void setBonsDeCommande(List<BonDeCommandeEmplacementBALInterphone> bonsDeCommande) {
        this.bonsDeCommande = bonsDeCommande;
    }
    
}
