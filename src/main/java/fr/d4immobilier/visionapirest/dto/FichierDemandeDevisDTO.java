package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierDemandeDevisDTO {
    
    private Long id;
    private Long demandeDevisId;

    // Constructeur
    public FichierDemandeDevisDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getDemandeDevisId() {
        return demandeDevisId;
    }
    
    public void setDemandeDevisId(Long demandeDevisId) {
        this.demandeDevisId = demandeDevisId;
    }
}
