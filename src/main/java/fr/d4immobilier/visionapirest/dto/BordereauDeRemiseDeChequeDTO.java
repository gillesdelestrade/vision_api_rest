package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BordereauDeRemiseDeChequeDTO {
    
    private Long id;
    private String dateImpression; // Enum converti en String
    private String etatBordereauCheques; // Enum converti en String
    private String nom;
    private String numeroRemise;
    private Long coproprieteId;
    private Long compteEnBanqueCoproprieteId;

    // Constructeur
    public BordereauDeRemiseDeChequeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateImpression() {
        return dateImpression;
    }
    
    public void setDateImpression(String dateImpression) {
        this.dateImpression = dateImpression;
    }

    public String getEtatBordereauCheques() {
        return etatBordereauCheques;
    }
    
    public void setEtatBordereauCheques(String etatBordereauCheques) {
        this.etatBordereauCheques = etatBordereauCheques;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroRemise() {
        return numeroRemise;
    }
    
    public void setNumeroRemise(String numeroRemise) {
        this.numeroRemise = numeroRemise;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getCompteEnBanqueCoproprieteId() {
        return compteEnBanqueCoproprieteId;
    }
    
    public void setCompteEnBanqueCoproprieteId(Long compteEnBanqueCoproprieteId) {
        this.compteEnBanqueCoproprieteId = compteEnBanqueCoproprieteId;
    }
}
