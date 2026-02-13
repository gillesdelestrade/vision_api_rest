package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeDeRappelDTO {
    
    private Long id;
    private String dateAppel; // Enum converti en String
    private Long gestionnaireQuiDoitRappelerId;

    // Constructeur
    public DemandeDeRappelDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateAppel() {
        return dateAppel;
    }
    
    public void setDateAppel(String dateAppel) {
        this.dateAppel = dateAppel;
    }

    public Long getGestionnaireQuiDoitRappelerId() {
        return gestionnaireQuiDoitRappelerId;
    }
    
    public void setGestionnaireQuiDoitRappelerId(Long gestionnaireQuiDoitRappelerId) {
        this.gestionnaireQuiDoitRappelerId = gestionnaireQuiDoitRappelerId;
    }
}
