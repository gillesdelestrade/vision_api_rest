package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeSansCompteVisionDTO {
    
    private Long id;
    private String dateCreation; // Enum converti en String
    private String nom;
    private String adresseMail;
    private String adresse;
    private String complementAdresse;
    private String codePostal;
    private String ville;
    private String lieuDemande;
    private String detailDemande;
    private String reference;
    private String nomCopropriete;
    private Boolean corbeille;
    private Long demandeId;

    // Constructeur
    public DemandeSansCompteVisionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }
    
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }
    
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }
    
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLieuDemande() {
        return lieuDemande;
    }
    
    public void setLieuDemande(String lieuDemande) {
        this.lieuDemande = lieuDemande;
    }

    public String getDetailDemande() {
        return detailDemande;
    }
    
    public void setDetailDemande(String detailDemande) {
        this.detailDemande = detailDemande;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNomCopropriete() {
        return nomCopropriete;
    }
    
    public void setNomCopropriete(String nomCopropriete) {
        this.nomCopropriete = nomCopropriete;
    }

    public Boolean getCorbeille() {
        return corbeille;
    }
    
    public void setCorbeille(Boolean corbeille) {
        this.corbeille = corbeille;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }
}
