package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;
import java.time.LocalDate;

public class DemandeDevisFournisseurResumeDTO {
    
    private Long id;
    private String objet;
    private LocalDate dateDemandeDevis;
    private Instant datePriseEnCompteFournisseur;
    private String periodeRemiseDevisPrevue;
    private LocalDate dateRappel;
    private String fournisseurRaisonSociale;
    
    public DemandeDevisFournisseurResumeDTO() {}
    
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
    
    public LocalDate getDateDemandeDevis() {
        return dateDemandeDevis;
    }
    
    public void setDateDemandeDevis(LocalDate dateDemandeDevis) {
        this.dateDemandeDevis = dateDemandeDevis;
    }
    
    public Instant getDatePriseEnCompteFournisseur() {
        return datePriseEnCompteFournisseur;
    }
    
    public void setDatePriseEnCompteFournisseur(Instant datePriseEnCompteFournisseur) {
        this.datePriseEnCompteFournisseur = datePriseEnCompteFournisseur;
    }
    
    public String getPeriodeRemiseDevisPrevue() {
        return periodeRemiseDevisPrevue;
    }
    
    public void setPeriodeRemiseDevisPrevue(String periodeRemiseDevisPrevue) {
        this.periodeRemiseDevisPrevue = periodeRemiseDevisPrevue;
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
}