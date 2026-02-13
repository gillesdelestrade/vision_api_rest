package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PassageObligeDTO {
    
    private Long id;
    private Integer jourSemaine;
    private Integer heureDebut;
    private Integer minutesDebut;
    private Integer heureFin;
    private Integer minutesFin;
    private Long coproprieteId;

    // Constructeur
    public PassageObligeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getJourSemaine() {
        return jourSemaine;
    }
    
    public void setJourSemaine(Integer jourSemaine) {
        this.jourSemaine = jourSemaine;
    }

    public Integer getHeureDebut() {
        return heureDebut;
    }
    
    public void setHeureDebut(Integer heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Integer getMinutesDebut() {
        return minutesDebut;
    }
    
    public void setMinutesDebut(Integer minutesDebut) {
        this.minutesDebut = minutesDebut;
    }

    public Integer getHeureFin() {
        return heureFin;
    }
    
    public void setHeureFin(Integer heureFin) {
        this.heureFin = heureFin;
    }

    public Integer getMinutesFin() {
        return minutesFin;
    }
    
    public void setMinutesFin(Integer minutesFin) {
        this.minutesFin = minutesFin;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
