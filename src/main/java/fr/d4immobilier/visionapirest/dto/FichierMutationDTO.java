package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierMutationDTO {
    
    private Long id;
    private String typeFichierMutation; // Enum converti en String
    private Long coproprieteId;

    // Constructeur
    public FichierMutationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeFichierMutation() {
        return typeFichierMutation;
    }
    
    public void setTypeFichierMutation(String typeFichierMutation) {
        this.typeFichierMutation = typeFichierMutation;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
