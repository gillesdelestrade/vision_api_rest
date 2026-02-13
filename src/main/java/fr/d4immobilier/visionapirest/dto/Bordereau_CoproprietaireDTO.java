package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class Bordereau_CoproprietaireDTO {
    
    private Long id;
    private String numero;
    private String created_at; // Enum converti en String
    private String adresse;
    private String nom;
    private String nom_stockage_rar;
    private Long bordereauId;
    private Long coproprietaireId;

    // Constructeur
    public Bordereau_CoproprietaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCreated_at() {
        return created_at;
    }
    
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_stockage_rar() {
        return nom_stockage_rar;
    }
    
    public void setNom_stockage_rar(String nom_stockage_rar) {
        this.nom_stockage_rar = nom_stockage_rar;
    }

    public Long getBordereauId() {
        return bordereauId;
    }
    
    public void setBordereauId(Long bordereauId) {
        this.bordereauId = bordereauId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }
}
