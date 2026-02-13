package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FactureFournisseurDTO {
    
    private Long id;
    private LocalDate dateReception;
    private LocalDate dateFacture;
    private String reference;
    private Float montant;
    private String avisD4; // Enum converti en String
    private String avisCS; // Enum converti en String
    private String moyenDePaiement; // Enum converti en String
    private LocalDate dateDeMiseAuPaiement;
    private String referencePaiement;
    private String commentaireCS;
    private LocalDate dateDecisionCS;
    private Boolean priseEnCompteParLeBot;
    private LocalDate dateDebutPeriode;
    private LocalDate dateFinPeriode;
    private Boolean lettreAccompagnementImprimee;
    private Boolean privative;
    private Boolean cloturee;
    private String etatTraitementAuto; // Enum converti en String
    private LocalDate dateDebutAttenteContreOrdre;
    private LocalDate dateValidationAutomatique;
    private LocalDate dateDebutAttenteInfoFournisseur;
    private LocalDate dateRefusAutomatique;
    private LocalDate dateDerniereRelanceAttenteContreOrdre;
    private LocalDate dateDerniereRelanceAttenteInfo;
    private LocalDate dateExportComfact;
    private Long dossierContentieuxFactureId;
    private Long fichierFactureId;
    private Long fournisseurId;
    private Long coproprieteId;
    private Long approbateurId;
    private Long motifDecisionFactureId;
    private Long contratFournisseurId;

    // Constructeur
    public FactureFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateReception() {
        return dateReception;
    }
    
    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    public LocalDate getDateFacture() {
        return dateFacture;
    }
    
    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Float getMontant() {
        return montant;
    }
    
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public String getAvisD4() {
        return avisD4;
    }
    
    public void setAvisD4(String avisD4) {
        this.avisD4 = avisD4;
    }

    public String getAvisCS() {
        return avisCS;
    }
    
    public void setAvisCS(String avisCS) {
        this.avisCS = avisCS;
    }

    public String getMoyenDePaiement() {
        return moyenDePaiement;
    }
    
    public void setMoyenDePaiement(String moyenDePaiement) {
        this.moyenDePaiement = moyenDePaiement;
    }

    public LocalDate getDateDeMiseAuPaiement() {
        return dateDeMiseAuPaiement;
    }
    
    public void setDateDeMiseAuPaiement(LocalDate dateDeMiseAuPaiement) {
        this.dateDeMiseAuPaiement = dateDeMiseAuPaiement;
    }

    public String getReferencePaiement() {
        return referencePaiement;
    }
    
    public void setReferencePaiement(String referencePaiement) {
        this.referencePaiement = referencePaiement;
    }

    public String getCommentaireCS() {
        return commentaireCS;
    }
    
    public void setCommentaireCS(String commentaireCS) {
        this.commentaireCS = commentaireCS;
    }

    public LocalDate getDateDecisionCS() {
        return dateDecisionCS;
    }
    
    public void setDateDecisionCS(LocalDate dateDecisionCS) {
        this.dateDecisionCS = dateDecisionCS;
    }

    public Boolean getPriseEnCompteParLeBot() {
        return priseEnCompteParLeBot;
    }
    
    public void setPriseEnCompteParLeBot(Boolean priseEnCompteParLeBot) {
        this.priseEnCompteParLeBot = priseEnCompteParLeBot;
    }

    public LocalDate getDateDebutPeriode() {
        return dateDebutPeriode;
    }
    
    public void setDateDebutPeriode(LocalDate dateDebutPeriode) {
        this.dateDebutPeriode = dateDebutPeriode;
    }

    public LocalDate getDateFinPeriode() {
        return dateFinPeriode;
    }
    
    public void setDateFinPeriode(LocalDate dateFinPeriode) {
        this.dateFinPeriode = dateFinPeriode;
    }

    public Boolean getLettreAccompagnementImprimee() {
        return lettreAccompagnementImprimee;
    }
    
    public void setLettreAccompagnementImprimee(Boolean lettreAccompagnementImprimee) {
        this.lettreAccompagnementImprimee = lettreAccompagnementImprimee;
    }

    public Boolean getPrivative() {
        return privative;
    }
    
    public void setPrivative(Boolean privative) {
        this.privative = privative;
    }

    public Boolean getCloturee() {
        return cloturee;
    }
    
    public void setCloturee(Boolean cloturee) {
        this.cloturee = cloturee;
    }

    public String getEtatTraitementAuto() {
        return etatTraitementAuto;
    }
    
    public void setEtatTraitementAuto(String etatTraitementAuto) {
        this.etatTraitementAuto = etatTraitementAuto;
    }

    public LocalDate getDateDebutAttenteContreOrdre() {
        return dateDebutAttenteContreOrdre;
    }
    
    public void setDateDebutAttenteContreOrdre(LocalDate dateDebutAttenteContreOrdre) {
        this.dateDebutAttenteContreOrdre = dateDebutAttenteContreOrdre;
    }

    public LocalDate getDateValidationAutomatique() {
        return dateValidationAutomatique;
    }
    
    public void setDateValidationAutomatique(LocalDate dateValidationAutomatique) {
        this.dateValidationAutomatique = dateValidationAutomatique;
    }

    public LocalDate getDateDebutAttenteInfoFournisseur() {
        return dateDebutAttenteInfoFournisseur;
    }
    
    public void setDateDebutAttenteInfoFournisseur(LocalDate dateDebutAttenteInfoFournisseur) {
        this.dateDebutAttenteInfoFournisseur = dateDebutAttenteInfoFournisseur;
    }

    public LocalDate getDateRefusAutomatique() {
        return dateRefusAutomatique;
    }
    
    public void setDateRefusAutomatique(LocalDate dateRefusAutomatique) {
        this.dateRefusAutomatique = dateRefusAutomatique;
    }

    public LocalDate getDateDerniereRelanceAttenteContreOrdre() {
        return dateDerniereRelanceAttenteContreOrdre;
    }
    
    public void setDateDerniereRelanceAttenteContreOrdre(LocalDate dateDerniereRelanceAttenteContreOrdre) {
        this.dateDerniereRelanceAttenteContreOrdre = dateDerniereRelanceAttenteContreOrdre;
    }

    public LocalDate getDateDerniereRelanceAttenteInfo() {
        return dateDerniereRelanceAttenteInfo;
    }
    
    public void setDateDerniereRelanceAttenteInfo(LocalDate dateDerniereRelanceAttenteInfo) {
        this.dateDerniereRelanceAttenteInfo = dateDerniereRelanceAttenteInfo;
    }

    public LocalDate getDateExportComfact() {
        return dateExportComfact;
    }
    
    public void setDateExportComfact(LocalDate dateExportComfact) {
        this.dateExportComfact = dateExportComfact;
    }

    public Long getDossierContentieuxFactureId() {
        return dossierContentieuxFactureId;
    }
    
    public void setDossierContentieuxFactureId(Long dossierContentieuxFactureId) {
        this.dossierContentieuxFactureId = dossierContentieuxFactureId;
    }

    public Long getFichierFactureId() {
        return fichierFactureId;
    }
    
    public void setFichierFactureId(Long fichierFactureId) {
        this.fichierFactureId = fichierFactureId;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getApprobateurId() {
        return approbateurId;
    }
    
    public void setApprobateurId(Long approbateurId) {
        this.approbateurId = approbateurId;
    }

    public Long getMotifDecisionFactureId() {
        return motifDecisionFactureId;
    }
    
    public void setMotifDecisionFactureId(Long motifDecisionFactureId) {
        this.motifDecisionFactureId = motifDecisionFactureId;
    }

    public Long getContratFournisseurId() {
        return contratFournisseurId;
    }
    
    public void setContratFournisseurId(Long contratFournisseurId) {
        this.contratFournisseurId = contratFournisseurId;
    }
}
