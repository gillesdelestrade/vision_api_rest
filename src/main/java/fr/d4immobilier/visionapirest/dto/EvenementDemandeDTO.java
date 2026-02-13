package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EvenementDemandeDTO {
    
    private Long id;
    private String dateEvenement; // Enum converti en String
    private String texte;
    private Boolean aLaCorbeille;
    private Boolean clotureEtapeDemande;
    private Boolean copieParMail;
    private Long idDI;
    private Long idDDF;
    private Long courrielId;
    private Long reunionV2Id;
    private Long demandeId;
    private Long auteurId;
    private Long etapeDemandeId;

    // Constructeur
    public EvenementDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateEvenement() {
        return dateEvenement;
    }
    
    public void setDateEvenement(String dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Boolean getALaCorbeille() {
        return aLaCorbeille;
    }
    
    public void setALaCorbeille(Boolean aLaCorbeille) {
        this.aLaCorbeille = aLaCorbeille;
    }

    public Boolean getClotureEtapeDemande() {
        return clotureEtapeDemande;
    }
    
    public void setClotureEtapeDemande(Boolean clotureEtapeDemande) {
        this.clotureEtapeDemande = clotureEtapeDemande;
    }

    public Boolean getCopieParMail() {
        return copieParMail;
    }
    
    public void setCopieParMail(Boolean copieParMail) {
        this.copieParMail = copieParMail;
    }

    public Long getIdDI() {
        return idDI;
    }
    
    public void setIdDI(Long idDI) {
        this.idDI = idDI;
    }

    public Long getIdDDF() {
        return idDDF;
    }
    
    public void setIdDDF(Long idDDF) {
        this.idDDF = idDDF;
    }

    public Long getCourrielId() {
        return courrielId;
    }
    
    public void setCourrielId(Long courrielId) {
        this.courrielId = courrielId;
    }

    public Long getReunionV2Id() {
        return reunionV2Id;
    }
    
    public void setReunionV2Id(Long reunionV2Id) {
        this.reunionV2Id = reunionV2Id;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getEtapeDemandeId() {
        return etapeDemandeId;
    }
    
    public void setEtapeDemandeId(Long etapeDemandeId) {
        this.etapeDemandeId = etapeDemandeId;
    }
}
