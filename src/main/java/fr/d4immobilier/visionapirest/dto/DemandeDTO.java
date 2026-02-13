package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeDTO {
    
    private Long id;
    private String dateConstat; // Enum converti en String
    private LocalDate dateButoire;
    private LocalDate dateClotureParD4;
    private LocalDate dateClotureDefinitive;
    private String description;
    private String etatDemande; // Enum converti en String
    private Boolean visibleParCoproprietaires;
    private Boolean reponduAuxAttentes;
    private Boolean delaisSatisfaisants;
    private Boolean explicationsClairesCompletes;
    private String importance; // Enum converti en String
    private String urgence; // Enum converti en String
    private Boolean generiqueEquipement;
    private LocalDate notBefore;
    private Boolean epingle;
    private LocalDate dateDemandeClotureCoproprietaire;
    private String dateDernierImportMailAtraiter; // Enum converti en String
    private Long numero;
    private Boolean suiviCS;
    private Boolean dossierPermanent;
    private Boolean direct;
    private Boolean ag;
    private Boolean visibleParLeCS;
    private Long demandeSansCompteVisionId;
    private Long resolutionTravauxId;
    private Long emetteurId;
    private Long coproprieteId;
    private Long equipementId;
    private Long attributaireId;
    private Long boiteArchiveId;

    // Constructeur
    public DemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateConstat() {
        return dateConstat;
    }
    
    public void setDateConstat(String dateConstat) {
        this.dateConstat = dateConstat;
    }

    public LocalDate getDateButoire() {
        return dateButoire;
    }
    
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    public LocalDate getDateClotureParD4() {
        return dateClotureParD4;
    }
    
    public void setDateClotureParD4(LocalDate dateClotureParD4) {
        this.dateClotureParD4 = dateClotureParD4;
    }

    public LocalDate getDateClotureDefinitive() {
        return dateClotureDefinitive;
    }
    
    public void setDateClotureDefinitive(LocalDate dateClotureDefinitive) {
        this.dateClotureDefinitive = dateClotureDefinitive;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtatDemande() {
        return etatDemande;
    }
    
    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }

    public Boolean getVisibleParCoproprietaires() {
        return visibleParCoproprietaires;
    }
    
    public void setVisibleParCoproprietaires(Boolean visibleParCoproprietaires) {
        this.visibleParCoproprietaires = visibleParCoproprietaires;
    }

    public Boolean getReponduAuxAttentes() {
        return reponduAuxAttentes;
    }
    
    public void setReponduAuxAttentes(Boolean reponduAuxAttentes) {
        this.reponduAuxAttentes = reponduAuxAttentes;
    }

    public Boolean getDelaisSatisfaisants() {
        return delaisSatisfaisants;
    }
    
    public void setDelaisSatisfaisants(Boolean delaisSatisfaisants) {
        this.delaisSatisfaisants = delaisSatisfaisants;
    }

    public Boolean getExplicationsClairesCompletes() {
        return explicationsClairesCompletes;
    }
    
    public void setExplicationsClairesCompletes(Boolean explicationsClairesCompletes) {
        this.explicationsClairesCompletes = explicationsClairesCompletes;
    }

    public String getImportance() {
        return importance;
    }
    
    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getUrgence() {
        return urgence;
    }
    
    public void setUrgence(String urgence) {
        this.urgence = urgence;
    }

    public Boolean getGeneriqueEquipement() {
        return generiqueEquipement;
    }
    
    public void setGeneriqueEquipement(Boolean generiqueEquipement) {
        this.generiqueEquipement = generiqueEquipement;
    }

    public LocalDate getNotBefore() {
        return notBefore;
    }
    
    public void setNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
    }

    public Boolean getEpingle() {
        return epingle;
    }
    
    public void setEpingle(Boolean epingle) {
        this.epingle = epingle;
    }

    public LocalDate getDateDemandeClotureCoproprietaire() {
        return dateDemandeClotureCoproprietaire;
    }
    
    public void setDateDemandeClotureCoproprietaire(LocalDate dateDemandeClotureCoproprietaire) {
        this.dateDemandeClotureCoproprietaire = dateDemandeClotureCoproprietaire;
    }

    public String getDateDernierImportMailAtraiter() {
        return dateDernierImportMailAtraiter;
    }
    
    public void setDateDernierImportMailAtraiter(String dateDernierImportMailAtraiter) {
        this.dateDernierImportMailAtraiter = dateDernierImportMailAtraiter;
    }

    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Boolean getSuiviCS() {
        return suiviCS;
    }
    
    public void setSuiviCS(Boolean suiviCS) {
        this.suiviCS = suiviCS;
    }

    public Boolean getDossierPermanent() {
        return dossierPermanent;
    }
    
    public void setDossierPermanent(Boolean dossierPermanent) {
        this.dossierPermanent = dossierPermanent;
    }

    public Boolean getDirect() {
        return direct;
    }
    
    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public Boolean getAg() {
        return ag;
    }
    
    public void setAg(Boolean ag) {
        this.ag = ag;
    }

    public Boolean getVisibleParLeCS() {
        return visibleParLeCS;
    }
    
    public void setVisibleParLeCS(Boolean visibleParLeCS) {
        this.visibleParLeCS = visibleParLeCS;
    }

    public Long getDemandeSansCompteVisionId() {
        return demandeSansCompteVisionId;
    }
    
    public void setDemandeSansCompteVisionId(Long demandeSansCompteVisionId) {
        this.demandeSansCompteVisionId = demandeSansCompteVisionId;
    }

    public Long getResolutionTravauxId() {
        return resolutionTravauxId;
    }
    
    public void setResolutionTravauxId(Long resolutionTravauxId) {
        this.resolutionTravauxId = resolutionTravauxId;
    }

    public Long getEmetteurId() {
        return emetteurId;
    }
    
    public void setEmetteurId(Long emetteurId) {
        this.emetteurId = emetteurId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getEquipementId() {
        return equipementId;
    }
    
    public void setEquipementId(Long equipementId) {
        this.equipementId = equipementId;
    }

    public Long getAttributaireId() {
        return attributaireId;
    }
    
    public void setAttributaireId(Long attributaireId) {
        this.attributaireId = attributaireId;
    }

    public Long getBoiteArchiveId() {
        return boiteArchiveId;
    }
    
    public void setBoiteArchiveId(Long boiteArchiveId) {
        this.boiteArchiveId = boiteArchiveId;
    }
}
