package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PointODJReunionDTO {
    
    private Long id;
    private Integer numero;
    private String obtenu;
    private Long oDJReunionId;
    private Long demandeId;
    private Long attenduCSId;

    // Constructeur
    public PointODJReunionDTO() {
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

    public String getObtenu() {
        return obtenu;
    }
    
    public void setObtenu(String obtenu) {
        this.obtenu = obtenu;
    }

    public Long getODJReunionId() {
        return oDJReunionId;
    }
    
    public void setODJReunionId(Long oDJReunionId) {
        this.oDJReunionId = oDJReunionId;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getAttenduCSId() {
        return attenduCSId;
    }
    
    public void setAttenduCSId(Long attenduCSId) {
        this.attenduCSId = attenduCSId;
    }
}
