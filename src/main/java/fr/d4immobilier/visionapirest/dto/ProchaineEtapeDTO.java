package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ProchaineEtapeDTO {
    
    private Long id;
    private String dateDebut; // Enum converti en String
    private String dateFin; // Enum converti en String
    private Long prochaineEtapeTypeId;

    // Constructeur
    public ProchaineEtapeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }
    
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public Long getProchaineEtapeTypeId() {
        return prochaineEtapeTypeId;
    }
    
    public void setProchaineEtapeTypeId(Long prochaineEtapeTypeId) {
        this.prochaineEtapeTypeId = prochaineEtapeTypeId;
    }
}
