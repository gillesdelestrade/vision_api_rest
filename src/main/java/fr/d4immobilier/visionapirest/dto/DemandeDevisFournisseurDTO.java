package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeDevisFournisseurDTO {
    
    private Long id;
    private String datePriseEnCompteFournisseur; // Enum converti en String
    private String periodeRemiseDevisPrevue;
    private LocalDate dateReceptionDevis;
    private LocalDate dateRappel;
    private LocalDate dateAnnulation;
    private String historique;
    private Boolean prioritaire;
    private Integer nombreRelances;
    private Long documentDemandeDevisId;
    private Long fichierDemandeDevisFournisseurId;
    private Long fournisseurId;
    private Long demandeDevisId;

    // Constructeur
    public DemandeDevisFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDatePriseEnCompteFournisseur() {
        return datePriseEnCompteFournisseur;
    }
    
    public void setDatePriseEnCompteFournisseur(String datePriseEnCompteFournisseur) {
        this.datePriseEnCompteFournisseur = datePriseEnCompteFournisseur;
    }

    public String getPeriodeRemiseDevisPrevue() {
        return periodeRemiseDevisPrevue;
    }
    
    public void setPeriodeRemiseDevisPrevue(String periodeRemiseDevisPrevue) {
        this.periodeRemiseDevisPrevue = periodeRemiseDevisPrevue;
    }

    public LocalDate getDateReceptionDevis() {
        return dateReceptionDevis;
    }
    
    public void setDateReceptionDevis(LocalDate dateReceptionDevis) {
        this.dateReceptionDevis = dateReceptionDevis;
    }

    public LocalDate getDateRappel() {
        return dateRappel;
    }
    
    public void setDateRappel(LocalDate dateRappel) {
        this.dateRappel = dateRappel;
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

    public Long getDocumentDemandeDevisId() {
        return documentDemandeDevisId;
    }
    
    public void setDocumentDemandeDevisId(Long documentDemandeDevisId) {
        this.documentDemandeDevisId = documentDemandeDevisId;
    }

    public Long getFichierDemandeDevisFournisseurId() {
        return fichierDemandeDevisFournisseurId;
    }
    
    public void setFichierDemandeDevisFournisseurId(Long fichierDemandeDevisFournisseurId) {
        this.fichierDemandeDevisFournisseurId = fichierDemandeDevisFournisseurId;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getDemandeDevisId() {
        return demandeDevisId;
    }
    
    public void setDemandeDevisId(Long demandeDevisId) {
        this.demandeDevisId = demandeDevisId;
    }
}
