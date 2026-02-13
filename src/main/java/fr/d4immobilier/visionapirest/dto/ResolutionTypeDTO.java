package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ResolutionTypeDTO {
    
    private Long id;
    private String intitule;
    private String detail;
    private Integer numero;
    private String majorite; // Enum converti en String
    private Boolean parDefaut;

    // Constructeur
    public ResolutionTypeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }
    
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMajorite() {
        return majorite;
    }
    
    public void setMajorite(String majorite) {
        this.majorite = majorite;
    }

    public Boolean getParDefaut() {
        return parDefaut;
    }
    
    public void setParDefaut(Boolean parDefaut) {
        this.parDefaut = parDefaut;
    }
}
