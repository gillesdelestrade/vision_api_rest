package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MatriculeICSDTO {
    
    private Long id;
    private String matricule;
    private String login;
    private String passwd;
    private Integer rgpd;
    private String permalink;
    private Long coproprietaireId;
    private Long coproprieteId;

    // Constructeur
    public MatriculeICSDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getRgpd() {
        return rgpd;
    }
    
    public void setRgpd(Integer rgpd) {
        this.rgpd = rgpd;
    }

    public String getPermalink() {
        return permalink;
    }
    
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
