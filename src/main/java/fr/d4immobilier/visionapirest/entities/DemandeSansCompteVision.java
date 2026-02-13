/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DemandeSansCompteVision implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Instant dateCreation;
    private String nom;
    private String adresseMail;
    private String adresse;
    private String complementAdresse;
    private String codePostal;
    private String ville;
    private String lieuDemande;
    private String detailDemande;
    @OneToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @OneToMany(mappedBy = "demandeSansCompteVision",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FichierDemandeSansCompteVision> fichiers;
    private String reference;
    private String nomCopropriete;
    private Boolean corbeille;

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
        if (!(object instanceof DemandeSansCompteVision)) {
            return false;
        }
        DemandeSansCompteVision other = (DemandeSansCompteVision) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.DemandeSansCompteVision[ id=" + id + " ]";
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the adresseMail
     */
    public String getAdresseMail() {
        return adresseMail;
    }

    /**
     * @param adresseMail the adresseMail to set
     */
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the complementAdresse
     */
    public String getComplementAdresse() {
        return complementAdresse;
    }

    /**
     * @param complementAdresse the complementAdresse to set
     */
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the lieuDemande
     */
    public String getLieuDemande() {
        return lieuDemande;
    }

    /**
     * @param lieuDemande the lieuDemande to set
     */
    public void setLieuDemande(String lieuDemande) {
        this.lieuDemande = lieuDemande;
    }

    /**
     * @return the detailDemande
     */
    public String getDetailDemande() {
        return detailDemande;
    }

    /**
     * @param detailDemande the detailDemande to set
     */
    public void setDetailDemande(String detailDemande) {
        this.detailDemande = detailDemande;
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    /**
     * @return the fichiers
     */
    public List<FichierDemandeSansCompteVision> getFichiers() {
        return fichiers;
    }

    /**
     * @param fichiers the fichiers to set
     */
    public void setFichiers(List<FichierDemandeSansCompteVision> fichiers) {
        this.fichiers = fichiers;
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
     * @return the nomCopropriete
     */
    public String getNomCopropriete() {
        return nomCopropriete;
    }

    /**
     * @param nomCopropriete the nomCopropriete to set
     */
    public void setNomCopropriete(String nomCopropriete) {
        this.nomCopropriete = nomCopropriete;
    }

    /**
     * @return the corbeille
     */
    public Boolean getCorbeille() {
        return corbeille;
    }

    /**
     * @param corbeille the corbeille to set
     */
    public void setCorbeille(Boolean corbeille) {
        this.corbeille = corbeille;
    }

    
    
}
