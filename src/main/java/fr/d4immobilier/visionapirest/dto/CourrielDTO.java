package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CourrielDTO {
    
    private Long id;
    private String messageId;
    private String emetteur;
    private String sujet;
    private String dateReception; // Enum converti en String
    private Boolean dejaClasse;
    private Boolean fromD4;
    private Boolean destinataireTO;
    private Boolean destinataireCC;
    private String corps;
    private Long boiteMailId;
    private Long evenementDemandeId;

    // Constructeur
    public CourrielDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getEmetteur() {
        return emetteur;
    }
    
    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getSujet() {
        return sujet;
    }
    
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getDateReception() {
        return dateReception;
    }
    
    public void setDateReception(String dateReception) {
        this.dateReception = dateReception;
    }

    public Boolean getDejaClasse() {
        return dejaClasse;
    }
    
    public void setDejaClasse(Boolean dejaClasse) {
        this.dejaClasse = dejaClasse;
    }

    public Boolean getFromD4() {
        return fromD4;
    }
    
    public void setFromD4(Boolean fromD4) {
        this.fromD4 = fromD4;
    }

    public Boolean getDestinataireTO() {
        return destinataireTO;
    }
    
    public void setDestinataireTO(Boolean destinataireTO) {
        this.destinataireTO = destinataireTO;
    }

    public Boolean getDestinataireCC() {
        return destinataireCC;
    }
    
    public void setDestinataireCC(Boolean destinataireCC) {
        this.destinataireCC = destinataireCC;
    }

    public String getCorps() {
        return corps;
    }
    
    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Long getBoiteMailId() {
        return boiteMailId;
    }
    
    public void setBoiteMailId(Long boiteMailId) {
        this.boiteMailId = boiteMailId;
    }

    public Long getEvenementDemandeId() {
        return evenementDemandeId;
    }
    
    public void setEvenementDemandeId(Long evenementDemandeId) {
        this.evenementDemandeId = evenementDemandeId;
    }
}
