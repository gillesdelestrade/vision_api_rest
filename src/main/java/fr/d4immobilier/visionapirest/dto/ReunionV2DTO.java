package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ReunionV2DTO {
    
    private Long id;
    private String typeReunion; // Enum converti en String

    // Constructeur
    public ReunionV2DTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeReunion() {
        return typeReunion;
    }
    
    public void setTypeReunion(String typeReunion) {
        this.typeReunion = typeReunion;
    }
}
