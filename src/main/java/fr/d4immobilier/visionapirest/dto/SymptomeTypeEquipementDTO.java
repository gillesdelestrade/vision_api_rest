package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SymptomeTypeEquipementDTO {
    
    private Long id;
    private String symptome;
    private Boolean direct;
    private Long typeEquipementId;

    // Constructeur
    public SymptomeTypeEquipementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getSymptome() {
        return symptome;
    }
    
    public void setSymptome(String symptome) {
        this.symptome = symptome;
    }

    public Boolean getDirect() {
        return direct;
    }
    
    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public Long getTypeEquipementId() {
        return typeEquipementId;
    }
    
    public void setTypeEquipementId(Long typeEquipementId) {
        this.typeEquipementId = typeEquipementId;
    }
}
