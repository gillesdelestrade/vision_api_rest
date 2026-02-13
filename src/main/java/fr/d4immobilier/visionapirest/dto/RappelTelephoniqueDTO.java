package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RappelTelephoniqueDTO {
    
    private Long id;
    private String dateRappel; // Enum converti en String
    private String texte;
    private String etatRappelTelephonique; // Enum converti en String
    private Long auteurId;
    private Long demandeDeRappelId;

    // Constructeur
    public RappelTelephoniqueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateRappel() {
        return dateRappel;
    }
    
    public void setDateRappel(String dateRappel) {
        this.dateRappel = dateRappel;
    }

    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getEtatRappelTelephonique() {
        return etatRappelTelephonique;
    }
    
    public void setEtatRappelTelephonique(String etatRappelTelephonique) {
        this.etatRappelTelephonique = etatRappelTelephonique;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getDemandeDeRappelId() {
        return demandeDeRappelId;
    }
    
    public void setDemandeDeRappelId(Long demandeDeRappelId) {
        this.demandeDeRappelId = demandeDeRappelId;
    }
}
