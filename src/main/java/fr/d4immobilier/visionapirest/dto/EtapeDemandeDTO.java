package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EtapeDemandeDTO {
    
    private Long id;
    private String libelleEnCours;
    private String libelleTermine;
    private String classeConcernee;
    private String libelleEtape;
    private Float ordre;
    private String actionEtapeDemande; // Enum converti en String
    private Boolean clotureManuelleNecessaire;

    // Constructeur
    public EtapeDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelleEnCours() {
        return libelleEnCours;
    }
    
    public void setLibelleEnCours(String libelleEnCours) {
        this.libelleEnCours = libelleEnCours;
    }

    public String getLibelleTermine() {
        return libelleTermine;
    }
    
    public void setLibelleTermine(String libelleTermine) {
        this.libelleTermine = libelleTermine;
    }

    public String getClasseConcernee() {
        return classeConcernee;
    }
    
    public void setClasseConcernee(String classeConcernee) {
        this.classeConcernee = classeConcernee;
    }

    public String getLibelleEtape() {
        return libelleEtape;
    }
    
    public void setLibelleEtape(String libelleEtape) {
        this.libelleEtape = libelleEtape;
    }

    public Float getOrdre() {
        return ordre;
    }
    
    public void setOrdre(Float ordre) {
        this.ordre = ordre;
    }

    public String getActionEtapeDemande() {
        return actionEtapeDemande;
    }
    
    public void setActionEtapeDemande(String actionEtapeDemande) {
        this.actionEtapeDemande = actionEtapeDemande;
    }

    public Boolean getClotureManuelleNecessaire() {
        return clotureManuelleNecessaire;
    }
    
    public void setClotureManuelleNecessaire(Boolean clotureManuelleNecessaire) {
        this.clotureManuelleNecessaire = clotureManuelleNecessaire;
    }
}
