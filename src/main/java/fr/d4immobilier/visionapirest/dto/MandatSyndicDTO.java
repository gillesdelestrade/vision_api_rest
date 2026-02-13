package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MandatSyndicDTO {
    
    private Long id;
    private Integer numero;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Long coproprieteId;
    private Long pvagId;
    private Long contratFournisseurId;

    // Constructeur
    public MandatSyndicDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }
    
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getPvagId() {
        return pvagId;
    }
    
    public void setPvagId(Long pvagId) {
        this.pvagId = pvagId;
    }

    public Long getContratFournisseurId() {
        return contratFournisseurId;
    }
    
    public void setContratFournisseurId(Long contratFournisseurId) {
        this.contratFournisseurId = contratFournisseurId;
    }
}
