package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class LivraisonDTO {
    
    private Long id;
    private String dateExpedition; // Enum converti en String
    private String numeroSuivi;
    private String typeEnvoi; // Enum converti en String
    private String statut;
    private String dateLivraison; // Enum converti en String
    private String destinationLivraison; // Enum converti en String
    private String reference;
    private Long documentBonDeLivraisonId;
    private Long fichierBonDeLivraisonId;
    private Long panierCommandeMoyenAccesId;

    // Constructeur
    public LivraisonDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateExpedition() {
        return dateExpedition;
    }
    
    public void setDateExpedition(String dateExpedition) {
        this.dateExpedition = dateExpedition;
    }

    public String getNumeroSuivi() {
        return numeroSuivi;
    }
    
    public void setNumeroSuivi(String numeroSuivi) {
        this.numeroSuivi = numeroSuivi;
    }

    public String getTypeEnvoi() {
        return typeEnvoi;
    }
    
    public void setTypeEnvoi(String typeEnvoi) {
        this.typeEnvoi = typeEnvoi;
    }

    public String getStatut() {
        return statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }
    
    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getDestinationLivraison() {
        return destinationLivraison;
    }
    
    public void setDestinationLivraison(String destinationLivraison) {
        this.destinationLivraison = destinationLivraison;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getDocumentBonDeLivraisonId() {
        return documentBonDeLivraisonId;
    }
    
    public void setDocumentBonDeLivraisonId(Long documentBonDeLivraisonId) {
        this.documentBonDeLivraisonId = documentBonDeLivraisonId;
    }

    public Long getFichierBonDeLivraisonId() {
        return fichierBonDeLivraisonId;
    }
    
    public void setFichierBonDeLivraisonId(Long fichierBonDeLivraisonId) {
        this.fichierBonDeLivraisonId = fichierBonDeLivraisonId;
    }

    public Long getPanierCommandeMoyenAccesId() {
        return panierCommandeMoyenAccesId;
    }
    
    public void setPanierCommandeMoyenAccesId(Long panierCommandeMoyenAccesId) {
        this.panierCommandeMoyenAccesId = panierCommandeMoyenAccesId;
    }
}
