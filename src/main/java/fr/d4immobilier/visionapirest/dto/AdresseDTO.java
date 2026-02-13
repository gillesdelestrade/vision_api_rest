package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AdresseDTO {
    
    private Long id;
    private String numeroDansLaVoie;
    private String typeDeVoie; // Enum converti en String
    private String voie;
    private String complementAdresse;
    private String batiment;
    private String etage;
    private String codePostal;
    private String ville;
    private Double latitude;
    private Double longitude;
    private Long coproprieteId;

    // Constructeur
    public AdresseDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDansLaVoie() {
        return numeroDansLaVoie;
    }
    
    public void setNumeroDansLaVoie(String numeroDansLaVoie) {
        this.numeroDansLaVoie = numeroDansLaVoie;
    }

    public String getTypeDeVoie() {
        return typeDeVoie;
    }
    
    public void setTypeDeVoie(String typeDeVoie) {
        this.typeDeVoie = typeDeVoie;
    }

    public String getVoie() {
        return voie;
    }
    
    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }
    
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getBatiment() {
        return batiment;
    }
    
    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getEtage() {
        return etage;
    }
    
    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String getCodePostal() {
        return codePostal;
    }
    
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }

    public Double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
