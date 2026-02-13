package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RegroupementResolutionsDTO {
    
    private Long id;
    private Integer numero;
    private String intitule;
    private String detail;
    private String majorite; // Enum converti en String
    private Long resolutionTravauxId;
    private Long assembleeId;
    private Long typeTantiemeId;

    // Constructeur
    public RegroupementResolutionsDTO() {
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

    public String getMajorite() {
        return majorite;
    }
    
    public void setMajorite(String majorite) {
        this.majorite = majorite;
    }

    public Long getResolutionTravauxId() {
        return resolutionTravauxId;
    }
    
    public void setResolutionTravauxId(Long resolutionTravauxId) {
        this.resolutionTravauxId = resolutionTravauxId;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }

    public Long getTypeTantiemeId() {
        return typeTantiemeId;
    }
    
    public void setTypeTantiemeId(Long typeTantiemeId) {
        this.typeTantiemeId = typeTantiemeId;
    }
}
