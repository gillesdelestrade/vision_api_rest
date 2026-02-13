package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class InterventionDemandeDTO {
    
    private Long id;
    private String dateCreationDemande; // Enum converti en String
    private String reference;
    private String objet;
    private String lieuIntervention;
    private String datePriseEnCompteFournisseur; // Enum converti en String
    private String plageInterventionPrevue;
    private LocalDate dateRappel;
    private LocalDate dateInterventionRealisee;
    private LocalDate dateAnnulation;
    private String historique;
    private Boolean analyzed;
    private Boolean prioritaire;
    private Integer nombreRelances;
    private String dateAccordCS; // Enum converti en String
    private Integer idViaAPIFournisseur;
    private Long demandeDevisId;
    private Long devisFournisseurId;
    private Long panierDemandesInterventionId;
    private Long fichierDemandeInterventionId;
    private Long factureFournisseurId;
    private Long fournisseurId;
    private Long demandeId;
    private Long metierId;

    // Constructeur
    public InterventionDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreationDemande() {
        return dateCreationDemande;
    }
    
    public void setDateCreationDemande(String dateCreationDemande) {
        this.dateCreationDemande = dateCreationDemande;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getObjet() {
        return objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getLieuIntervention() {
        return lieuIntervention;
    }
    
    public void setLieuIntervention(String lieuIntervention) {
        this.lieuIntervention = lieuIntervention;
    }

    public String getDatePriseEnCompteFournisseur() {
        return datePriseEnCompteFournisseur;
    }
    
    public void setDatePriseEnCompteFournisseur(String datePriseEnCompteFournisseur) {
        this.datePriseEnCompteFournisseur = datePriseEnCompteFournisseur;
    }

    public String getPlageInterventionPrevue() {
        return plageInterventionPrevue;
    }
    
    public void setPlageInterventionPrevue(String plageInterventionPrevue) {
        this.plageInterventionPrevue = plageInterventionPrevue;
    }

    public LocalDate getDateRappel() {
        return dateRappel;
    }
    
    public void setDateRappel(LocalDate dateRappel) {
        this.dateRappel = dateRappel;
    }

    public LocalDate getDateInterventionRealisee() {
        return dateInterventionRealisee;
    }
    
    public void setDateInterventionRealisee(LocalDate dateInterventionRealisee) {
        this.dateInterventionRealisee = dateInterventionRealisee;
    }

    public LocalDate getDateAnnulation() {
        return dateAnnulation;
    }
    
    public void setDateAnnulation(LocalDate dateAnnulation) {
        this.dateAnnulation = dateAnnulation;
    }

    public String getHistorique() {
        return historique;
    }
    
    public void setHistorique(String historique) {
        this.historique = historique;
    }

    public Boolean getAnalyzed() {
        return analyzed;
    }
    
    public void setAnalyzed(Boolean analyzed) {
        this.analyzed = analyzed;
    }

    public Boolean getPrioritaire() {
        return prioritaire;
    }
    
    public void setPrioritaire(Boolean prioritaire) {
        this.prioritaire = prioritaire;
    }

    public Integer getNombreRelances() {
        return nombreRelances;
    }
    
    public void setNombreRelances(Integer nombreRelances) {
        this.nombreRelances = nombreRelances;
    }

    public String getDateAccordCS() {
        return dateAccordCS;
    }
    
    public void setDateAccordCS(String dateAccordCS) {
        this.dateAccordCS = dateAccordCS;
    }

    public Integer getIdViaAPIFournisseur() {
        return idViaAPIFournisseur;
    }
    
    public void setIdViaAPIFournisseur(Integer idViaAPIFournisseur) {
        this.idViaAPIFournisseur = idViaAPIFournisseur;
    }

    public Long getDemandeDevisId() {
        return demandeDevisId;
    }
    
    public void setDemandeDevisId(Long demandeDevisId) {
        this.demandeDevisId = demandeDevisId;
    }

    public Long getDevisFournisseurId() {
        return devisFournisseurId;
    }
    
    public void setDevisFournisseurId(Long devisFournisseurId) {
        this.devisFournisseurId = devisFournisseurId;
    }

    public Long getPanierDemandesInterventionId() {
        return panierDemandesInterventionId;
    }
    
    public void setPanierDemandesInterventionId(Long panierDemandesInterventionId) {
        this.panierDemandesInterventionId = panierDemandesInterventionId;
    }

    public Long getFichierDemandeInterventionId() {
        return fichierDemandeInterventionId;
    }
    
    public void setFichierDemandeInterventionId(Long fichierDemandeInterventionId) {
        this.fichierDemandeInterventionId = fichierDemandeInterventionId;
    }

    public Long getFactureFournisseurId() {
        return factureFournisseurId;
    }
    
    public void setFactureFournisseurId(Long factureFournisseurId) {
        this.factureFournisseurId = factureFournisseurId;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getMetierId() {
        return metierId;
    }
    
    public void setMetierId(Long metierId) {
        this.metierId = metierId;
    }
}
