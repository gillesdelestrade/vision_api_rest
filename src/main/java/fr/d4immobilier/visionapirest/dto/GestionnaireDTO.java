package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class GestionnaireDTO {
    
    private Long id;    private String numeroDePoste;
    private String initialesICS;
    private String fonctiond4;
    private Long agenceId;

    // Constructeur
    public GestionnaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }    public String getNumeroDePoste() {
        return numeroDePoste;
    }
    
    public void setNumeroDePoste(String numeroDePoste) {
        this.numeroDePoste = numeroDePoste;
    }

    public String getInitialesICS() {
        return initialesICS;
    }
    
    public void setInitialesICS(String initialesICS) {
        this.initialesICS = initialesICS;
    }

    public String getFonctiond4() {
        return fonctiond4;
    }
    
    public void setFonctiond4(String fonctiond4) {
        this.fonctiond4 = fonctiond4;
    }

    public Long getAgenceId() {
        return agenceId;
    }
    
    public void setAgenceId(Long agenceId) {
        this.agenceId = agenceId;
    }
}
