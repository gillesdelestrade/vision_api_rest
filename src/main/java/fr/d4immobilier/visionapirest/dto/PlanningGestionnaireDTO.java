package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PlanningGestionnaireDTO {
    
    private Long id;
    private LocalDate datePlanning;
    private String demiJournee; // Enum converti en String
    private String motifAbsenceGestionnaire; // Enum converti en String
    private String log;
    private Long gestionnaireId;

    // Constructeur
    public PlanningGestionnaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePlanning() {
        return datePlanning;
    }
    
    public void setDatePlanning(LocalDate datePlanning) {
        this.datePlanning = datePlanning;
    }

    public String getDemiJournee() {
        return demiJournee;
    }
    
    public void setDemiJournee(String demiJournee) {
        this.demiJournee = demiJournee;
    }

    public String getMotifAbsenceGestionnaire() {
        return motifAbsenceGestionnaire;
    }
    
    public void setMotifAbsenceGestionnaire(String motifAbsenceGestionnaire) {
        this.motifAbsenceGestionnaire = motifAbsenceGestionnaire;
    }

    public String getLog() {
        return log;
    }
    
    public void setLog(String log) {
        this.log = log;
    }

    public Long getGestionnaireId() {
        return gestionnaireId;
    }
    
    public void setGestionnaireId(Long gestionnaireId) {
        this.gestionnaireId = gestionnaireId;
    }
}
