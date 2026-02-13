package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TagDTO {
    
    private Long id;
    private String numTag;

    // Constructeur
    public TagDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumTag() {
        return numTag;
    }
    
    public void setNumTag(String numTag) {
        this.numTag = numTag;
    }
}
