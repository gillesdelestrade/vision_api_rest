package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CompteVisionDTO {
    
    private Long id;    private String login;
    private String motDePasse;
    private String profil; // Enum converti en String
    private Boolean actif;
    private String codeActivation;

    // Constructeur
    public CompteVisionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getProfil() {
        return profil;
    }
    
    public void setProfil(String profil) {
        this.profil = profil;
    }

    public Boolean getActif() {
        return actif;
    }
    
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getCodeActivation() {
        return codeActivation;
    }
    
    public void setCodeActivation(String codeActivation) {
        this.codeActivation = codeActivation;
    }
}
