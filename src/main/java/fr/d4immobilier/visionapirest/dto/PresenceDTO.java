package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PresenceDTO {
    
    private Long id;
    private String statutPresence; // Enum converti en String
    private String datePresenceOuReceptionFormulaire; // Enum converti en String
    private Long assembleeId;
    private Long coproprietaireId;
    private Long affectationId;
    private Long resolutionDepartId;

    // Constructeur
    public PresenceDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatutPresence() {
        return statutPresence;
    }
    
    public void setStatutPresence(String statutPresence) {
        this.statutPresence = statutPresence;
    }

    public String getDatePresenceOuReceptionFormulaire() {
        return datePresenceOuReceptionFormulaire;
    }
    
    public void setDatePresenceOuReceptionFormulaire(String datePresenceOuReceptionFormulaire) {
        this.datePresenceOuReceptionFormulaire = datePresenceOuReceptionFormulaire;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getAffectationId() {
        return affectationId;
    }
    
    public void setAffectationId(Long affectationId) {
        this.affectationId = affectationId;
    }

    public Long getResolutionDepartId() {
        return resolutionDepartId;
    }
    
    public void setResolutionDepartId(Long resolutionDepartId) {
        this.resolutionDepartId = resolutionDepartId;
    }
}
