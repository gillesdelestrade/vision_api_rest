package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AppelEntrantDTO {
    
    private Long id;
    private String dateDebutAppel; // Enum converti en String
    private String dateFinAppel; // Enum converti en String
    private String contenuAppel;
    private Long appelantPersonneId;
    private Long appelantSocieteId;
    private Long interlocuteurD4Id;
    private Long demandeId;

    // Constructeur
    public AppelEntrantDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateDebutAppel() {
        return dateDebutAppel;
    }
    
    public void setDateDebutAppel(String dateDebutAppel) {
        this.dateDebutAppel = dateDebutAppel;
    }

    public String getDateFinAppel() {
        return dateFinAppel;
    }
    
    public void setDateFinAppel(String dateFinAppel) {
        this.dateFinAppel = dateFinAppel;
    }

    public String getContenuAppel() {
        return contenuAppel;
    }
    
    public void setContenuAppel(String contenuAppel) {
        this.contenuAppel = contenuAppel;
    }

    public Long getAppelantPersonneId() {
        return appelantPersonneId;
    }
    
    public void setAppelantPersonneId(Long appelantPersonneId) {
        this.appelantPersonneId = appelantPersonneId;
    }

    public Long getAppelantSocieteId() {
        return appelantSocieteId;
    }
    
    public void setAppelantSocieteId(Long appelantSocieteId) {
        this.appelantSocieteId = appelantSocieteId;
    }

    public Long getInterlocuteurD4Id() {
        return interlocuteurD4Id;
    }
    
    public void setInterlocuteurD4Id(Long interlocuteurD4Id) {
        this.interlocuteurD4Id = interlocuteurD4Id;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }
}
