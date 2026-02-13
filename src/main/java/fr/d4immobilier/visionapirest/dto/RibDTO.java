package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RibDTO {
    
    private Long id;
    private String codeEtablissement;
    private String codeGuichet;
    private String numeroCompte;
    private String cleRib;
    private String domiciliation;
    private Long compteEnBanqueId;

    // Constructeur
    public RibDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeEtablissement() {
        return codeEtablissement;
    }
    
    public void setCodeEtablissement(String codeEtablissement) {
        this.codeEtablissement = codeEtablissement;
    }

    public String getCodeGuichet() {
        return codeGuichet;
    }
    
    public void setCodeGuichet(String codeGuichet) {
        this.codeGuichet = codeGuichet;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
    
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getCleRib() {
        return cleRib;
    }
    
    public void setCleRib(String cleRib) {
        this.cleRib = cleRib;
    }

    public String getDomiciliation() {
        return domiciliation;
    }
    
    public void setDomiciliation(String domiciliation) {
        this.domiciliation = domiciliation;
    }

    public Long getCompteEnBanqueId() {
        return compteEnBanqueId;
    }
    
    public void setCompteEnBanqueId(Long compteEnBanqueId) {
        this.compteEnBanqueId = compteEnBanqueId;
    }
}
