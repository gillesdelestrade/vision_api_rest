package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AutorisationDematerialisationDTO {
    
    private Long id;
    private String contenuDematerialisation; // Enum converti en String
    private String supportDematerialisation; // Enum converti en String
    private String statutAutorisationDematerialisation; // Enum converti en String
    private Long matriculeICSId;

    // Constructeur
    public AutorisationDematerialisationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getContenuDematerialisation() {
        return contenuDematerialisation;
    }
    
    public void setContenuDematerialisation(String contenuDematerialisation) {
        this.contenuDematerialisation = contenuDematerialisation;
    }

    public String getSupportDematerialisation() {
        return supportDematerialisation;
    }
    
    public void setSupportDematerialisation(String supportDematerialisation) {
        this.supportDematerialisation = supportDematerialisation;
    }

    public String getStatutAutorisationDematerialisation() {
        return statutAutorisationDematerialisation;
    }
    
    public void setStatutAutorisationDematerialisation(String statutAutorisationDematerialisation) {
        this.statutAutorisationDematerialisation = statutAutorisationDematerialisation;
    }

    public Long getMatriculeICSId() {
        return matriculeICSId;
    }
    
    public void setMatriculeICSId(Long matriculeICSId) {
        this.matriculeICSId = matriculeICSId;
    }
}
