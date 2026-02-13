package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PersonneDTO {
    
    private Long id;
    private String titre;
    private String nom;
    private String prenom;
    private String mail1;
    private String mail2;
    private String telPortable;
    private String telFixe;
    private Boolean invitee;
    private Long adresseId;
    private Long compteVisionId;

    // Constructeur
    public PersonneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public Boolean getInvitee() {
        return invitee;
    }
    
    public void setInvitee(Boolean invitee) {
        this.invitee = invitee;
    }

    public Long getAdresseId() {
        return adresseId;
    }
    
    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public Long getCompteVisionId() {
        return compteVisionId;
    }
    
    public void setCompteVisionId(Long compteVisionId) {
        this.compteVisionId = compteVisionId;
    }
}
