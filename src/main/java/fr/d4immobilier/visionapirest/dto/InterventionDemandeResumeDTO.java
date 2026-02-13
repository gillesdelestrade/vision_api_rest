package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InterventionDemandeResumeDTO {
    
    private Long id;
    private String objet;
    private Instant datePriseEnCompteFournisseur;
    private String plageInterventionPrevue;
    private LocalDate dateRappel;
    private String fournisseurRaisonSociale;
    private Instant dateCreationDemande;
    
    public InterventionDemandeResumeDTO() {}
    
    public InterventionDemandeResumeDTO(Long id, String objet, 
            Instant datePriseEnCompteFournisseur,
            String plageInterventionPrevue, 
            LocalDate dateRappel,
            String fournisseurRaisonSociale) {
        this.id = id;
        this.objet = objet;
        this.datePriseEnCompteFournisseur = datePriseEnCompteFournisseur;
        this.plageInterventionPrevue = plageInterventionPrevue;
        this.dateRappel = dateRappel;
        this.fournisseurRaisonSociale = fournisseurRaisonSociale;
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getObjet() {
        return objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }
    
    public Instant getDatePriseEnCompteFournisseur() {
        return datePriseEnCompteFournisseur;
    }
    
    public void setDatePriseEnCompteFournisseur(Instant datePriseEnCompteFournisseur) {
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
    
    public String getFournisseurRaisonSociale() {
        return fournisseurRaisonSociale;
    }
    
    public void setFournisseurRaisonSociale(String fournisseurRaisonSociale) {
        this.fournisseurRaisonSociale = fournisseurRaisonSociale;
    }

    /**
     * @return the dateCreationDemande
     */
    public Instant getDateCreationDemande() {
        return dateCreationDemande;
    }

    /**
     * @param dateCreationDemande the dateCreationDemande to set
     */
    public void setDateCreationDemande(Instant dateCreationDemande) {
        this.dateCreationDemande = dateCreationDemande;
    }
}