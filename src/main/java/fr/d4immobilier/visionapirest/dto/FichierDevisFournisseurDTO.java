package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierDevisFournisseurDTO {
    
    private Long id;
    private Long devisFournisseurId;

    // Constructeur
    public FichierDevisFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getDevisFournisseurId() {
        return devisFournisseurId;
    }
    
    public void setDevisFournisseurId(Long devisFournisseurId) {
        this.devisFournisseurId = devisFournisseurId;
    }
}
