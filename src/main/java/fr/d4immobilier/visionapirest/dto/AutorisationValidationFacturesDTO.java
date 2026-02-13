package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AutorisationValidationFacturesDTO {
    
    private Long id;
    private Boolean autoriseAValiderLesFactures;
    private Long conseilSyndicalId;
    private Long personneId;
    private Long societeId;

    // Constructeur
    public AutorisationValidationFacturesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAutoriseAValiderLesFactures() {
        return autoriseAValiderLesFactures;
    }
    
    public void setAutoriseAValiderLesFactures(Boolean autoriseAValiderLesFactures) {
        this.autoriseAValiderLesFactures = autoriseAValiderLesFactures;
    }

    public Long getConseilSyndicalId() {
        return conseilSyndicalId;
    }
    
    public void setConseilSyndicalId(Long conseilSyndicalId) {
        this.conseilSyndicalId = conseilSyndicalId;
    }

    public Long getPersonneId() {
        return personneId;
    }
    
    public void setPersonneId(Long personneId) {
        this.personneId = personneId;
    }

    public Long getSocieteId() {
        return societeId;
    }
    
    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }
}
