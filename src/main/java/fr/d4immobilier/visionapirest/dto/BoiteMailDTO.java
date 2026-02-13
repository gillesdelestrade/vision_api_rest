package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BoiteMailDTO {
    
    private Long id;
    private String nomBoite;
    private String serveur;
    private String login;
    private String password;

    // Constructeur
    public BoiteMailDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomBoite() {
        return nomBoite;
    }
    
    public void setNomBoite(String nomBoite) {
        this.nomBoite = nomBoite;
    }

    public String getServeur() {
        return serveur;
    }
    
    public void setServeur(String serveur) {
        this.serveur = serveur;
    }

    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
