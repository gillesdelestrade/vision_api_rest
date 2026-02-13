package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CoproprietairePersonneDTO {
    
    private Long id;
    private Long personneId;

    // Constructeur
    public CoproprietairePersonneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonneId() {
        return personneId;
    }
    
    public void setPersonneId(Long personneId) {
        this.personneId = personneId;
    }
}
