package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AffectationDTO {
    
    private Long id;
    private Long presenceId;
    private Long tagId;

    // Constructeur
    public AffectationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPresenceId() {
        return presenceId;
    }
    
    public void setPresenceId(Long presenceId) {
        this.presenceId = presenceId;
    }

    public Long getTagId() {
        return tagId;
    }
    
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
