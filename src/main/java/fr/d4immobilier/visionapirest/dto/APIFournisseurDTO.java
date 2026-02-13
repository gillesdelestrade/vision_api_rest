package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class APIFournisseurDTO {
    
    private Long id;
    private String APIKeyD4;
    private String APIKeyExt;
    private Long fournisseurId;

    // Constructeur
    public APIFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAPIKeyD4() {
        return APIKeyD4;
    }
    
    public void setAPIKeyD4(String APIKeyD4) {
        this.APIKeyD4 = APIKeyD4;
    }

    public String getAPIKeyExt() {
        return APIKeyExt;
    }
    
    public void setAPIKeyExt(String APIKeyExt) {
        this.APIKeyExt = APIKeyExt;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }
}
