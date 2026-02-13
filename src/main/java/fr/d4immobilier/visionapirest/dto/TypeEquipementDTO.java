package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TypeEquipementDTO {
    
    private Long id;
    private String typeEquipement;

    // Constructeur
    public TypeEquipementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeEquipement() {
        return typeEquipement;
    }
    
    public void setTypeEquipement(String typeEquipement) {
        this.typeEquipement = typeEquipement;
    }
}
