package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class NatureFichierSinistreDTO {
    
    private Long id;
    private String nature;
    private Integer rang;

    // Constructeur
    public NatureFichierSinistreDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNature() {
        return nature;
    }
    
    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getRang() {
        return rang;
    }
    
    public void setRang(Integer rang) {
        this.rang = rang;
    }
}
