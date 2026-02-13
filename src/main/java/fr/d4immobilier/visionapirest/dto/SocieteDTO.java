package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SocieteDTO {
    
    private Long id;
    private String formeJuridique;
    private String raisonSociale;
    private String mail1;
    private String mail2;
    private String telPortable;
    private String telFixe;
    private String fax;
    private Long compteVisionId;
    private Long adresseId;
    private Long representantId;

    // Constructeur
    public SocieteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getFormeJuridique() {
        return formeJuridique;
    }
    
    public void setFormeJuridique(String formeJuridique) {
        this.formeJuridique = formeJuridique;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }
    
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getMail1() {
        return mail1;
    }
    
    public void setMail1(String mail1) {
        this.mail1 = mail1;
    }

    public String getMail2() {
        return mail2;
    }
    
    public void setMail2(String mail2) {
        this.mail2 = mail2;
    }

    public String getTelPortable() {
        return telPortable;
    }
    
    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    public String getTelFixe() {
        return telFixe;
    }
    
    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getFax() {
        return fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Long getCompteVisionId() {
        return compteVisionId;
    }
    
    public void setCompteVisionId(Long compteVisionId) {
        this.compteVisionId = compteVisionId;
    }

    public Long getAdresseId() {
        return adresseId;
    }
    
    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public Long getRepresentantId() {
        return representantId;
    }
    
    public void setRepresentantId(Long representantId) {
        this.representantId = representantId;
    }
}
