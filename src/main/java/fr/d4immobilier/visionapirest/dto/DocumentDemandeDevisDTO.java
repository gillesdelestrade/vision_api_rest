package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DocumentDemandeDevisDTO {
    
    private Long id;
    private Long demandeDevisFournisseurId;

    // Constructeur
    public DocumentDemandeDevisDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getDemandeDevisFournisseurId() {
        return demandeDevisFournisseurId;
    }
    
    public void setDemandeDevisFournisseurId(Long demandeDevisFournisseurId) {
        this.demandeDevisFournisseurId = demandeDevisFournisseurId;
    }
}
