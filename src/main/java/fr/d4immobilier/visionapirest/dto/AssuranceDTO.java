package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AssuranceDTO {
    
    private Long id;
    private String police;
    private String typeAssurance; // Enum converti en String
    private Long courtierId;
    private Long compagnieDAssuranceId;
    private Long coproprieteId;

    // Constructeur
    public AssuranceDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getPolice() {
        return police;
    }
    
    public void setPolice(String police) {
        this.police = police;
    }

    public String getTypeAssurance() {
        return typeAssurance;
    }
    
    public void setTypeAssurance(String typeAssurance) {
        this.typeAssurance = typeAssurance;
    }

    public Long getCourtierId() {
        return courtierId;
    }
    
    public void setCourtierId(Long courtierId) {
        this.courtierId = courtierId;
    }

    public Long getCompagnieDAssuranceId() {
        return compagnieDAssuranceId;
    }
    
    public void setCompagnieDAssuranceId(Long compagnieDAssuranceId) {
        this.compagnieDAssuranceId = compagnieDAssuranceId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
