package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierInterventionDemandeDTO {
    
    private Long id;
    private Long interventionDemandeId;

    // Constructeur
    public FichierInterventionDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getInterventionDemandeId() {
        return interventionDemandeId;
    }
    
    public void setInterventionDemandeId(Long interventionDemandeId) {
        this.interventionDemandeId = interventionDemandeId;
    }
}
