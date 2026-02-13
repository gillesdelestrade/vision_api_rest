package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ActionDemandeDTO {
    
    private Long id;
    private Long reunionV2Id;
    private Long demandeId;

    // Constructeur
    public ActionDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getReunionV2Id() {
        return reunionV2Id;
    }
    
    public void setReunionV2Id(Long reunionV2Id) {
        this.reunionV2Id = reunionV2Id;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }
}
