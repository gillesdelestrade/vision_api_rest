package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EnvoiMailDTO {
    
    private Long id;
    private LocalDate dateMail;
    private String texteMail;
    private Long aRappelerEnvoiMailId;
    private Long demandeId;
    private Long dossierId;
    private Long sinistreId;
    private Long coproprieteId;
    private Long reunionId;
    private Long fichierId;

    // Constructeur
    public EnvoiMailDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateMail() {
        return dateMail;
    }
    
    public void setDateMail(LocalDate dateMail) {
        this.dateMail = dateMail;
    }

    public String getTexteMail() {
        return texteMail;
    }
    
    public void setTexteMail(String texteMail) {
        this.texteMail = texteMail;
    }

    public Long getARappelerEnvoiMailId() {
        return aRappelerEnvoiMailId;
    }
    
    public void setARappelerEnvoiMailId(Long aRappelerEnvoiMailId) {
        this.aRappelerEnvoiMailId = aRappelerEnvoiMailId;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getDossierId() {
        return dossierId;
    }
    
    public void setDossierId(Long dossierId) {
        this.dossierId = dossierId;
    }

    public Long getSinistreId() {
        return sinistreId;
    }
    
    public void setSinistreId(Long sinistreId) {
        this.sinistreId = sinistreId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getReunionId() {
        return reunionId;
    }
    
    public void setReunionId(Long reunionId) {
        this.reunionId = reunionId;
    }

    public Long getFichierId() {
        return fichierId;
    }
    
    public void setFichierId(Long fichierId) {
        this.fichierId = fichierId;
    }
}
