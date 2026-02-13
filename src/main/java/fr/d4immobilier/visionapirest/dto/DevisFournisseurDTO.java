package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DevisFournisseurDTO {
    
    private Long id;
    private LocalDate dateReception;
    private LocalDate dateDevis;
    private String reference;
    private Float montant;
    private String avisD4; // Enum converti en String
    private String avisCS; // Enum converti en String
    private LocalDate dateDecisionCS;
    private Boolean priseEnCompteParLeBot;
    private String commentaire;
    private Boolean masquer;
    private LocalDate dateEnvoiAuConseilSyndical;
    private String detailEnvoiAuConseilSyndical;
    private String elementsANoter;
    private Boolean fichierKBISConforme;
    private Boolean fichierVigilanceURSSAFConforme;
    private Boolean fichierTravailleursEtrangersConforme;
    private Boolean fichierRCProConforme;
    private Boolean fichierAssuranceDecennaleConforme;
    private Boolean fichierAssuranceDecennaleNonConcerne;
    private Long fichierDevisFournisseurId;
    private Long demandeDevisFournisseurId;
    private Long fournisseurId;
    private Long coproprieteId;
    private Long demandeInterventionId;
    private Long approbateurId;
    private Long fichierKBISId;
    private Long fichierVigilanceURSSAFId;
    private Long fichierTravailleursEtrangersId;
    private Long fichierRCProId;
    private Long fichierAssuranceDecennaleId;

    // Constructeur
    public DevisFournisseurDTO() {
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

    public LocalDate getDateDevis() {
        return dateDevis;
    }
    
    public void setDateDevis(LocalDate dateDevis) {
        this.dateDevis = dateDevis;
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

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Boolean getMasquer() {
        return masquer;
    }
    
    public void setMasquer(Boolean masquer) {
        this.masquer = masquer;
    }

    public LocalDate getDateEnvoiAuConseilSyndical() {
        return dateEnvoiAuConseilSyndical;
    }
    
    public void setDateEnvoiAuConseilSyndical(LocalDate dateEnvoiAuConseilSyndical) {
        this.dateEnvoiAuConseilSyndical = dateEnvoiAuConseilSyndical;
    }

    public String getDetailEnvoiAuConseilSyndical() {
        return detailEnvoiAuConseilSyndical;
    }
    
    public void setDetailEnvoiAuConseilSyndical(String detailEnvoiAuConseilSyndical) {
        this.detailEnvoiAuConseilSyndical = detailEnvoiAuConseilSyndical;
    }

    public String getElementsANoter() {
        return elementsANoter;
    }
    
    public void setElementsANoter(String elementsANoter) {
        this.elementsANoter = elementsANoter;
    }

    public Boolean getFichierKBISConforme() {
        return fichierKBISConforme;
    }
    
    public void setFichierKBISConforme(Boolean fichierKBISConforme) {
        this.fichierKBISConforme = fichierKBISConforme;
    }

    public Boolean getFichierVigilanceURSSAFConforme() {
        return fichierVigilanceURSSAFConforme;
    }
    
    public void setFichierVigilanceURSSAFConforme(Boolean fichierVigilanceURSSAFConforme) {
        this.fichierVigilanceURSSAFConforme = fichierVigilanceURSSAFConforme;
    }

    public Boolean getFichierTravailleursEtrangersConforme() {
        return fichierTravailleursEtrangersConforme;
    }
    
    public void setFichierTravailleursEtrangersConforme(Boolean fichierTravailleursEtrangersConforme) {
        this.fichierTravailleursEtrangersConforme = fichierTravailleursEtrangersConforme;
    }

    public Boolean getFichierRCProConforme() {
        return fichierRCProConforme;
    }
    
    public void setFichierRCProConforme(Boolean fichierRCProConforme) {
        this.fichierRCProConforme = fichierRCProConforme;
    }

    public Boolean getFichierAssuranceDecennaleConforme() {
        return fichierAssuranceDecennaleConforme;
    }
    
    public void setFichierAssuranceDecennaleConforme(Boolean fichierAssuranceDecennaleConforme) {
        this.fichierAssuranceDecennaleConforme = fichierAssuranceDecennaleConforme;
    }

    public Boolean getFichierAssuranceDecennaleNonConcerne() {
        return fichierAssuranceDecennaleNonConcerne;
    }
    
    public void setFichierAssuranceDecennaleNonConcerne(Boolean fichierAssuranceDecennaleNonConcerne) {
        this.fichierAssuranceDecennaleNonConcerne = fichierAssuranceDecennaleNonConcerne;
    }

    public Long getFichierDevisFournisseurId() {
        return fichierDevisFournisseurId;
    }
    
    public void setFichierDevisFournisseurId(Long fichierDevisFournisseurId) {
        this.fichierDevisFournisseurId = fichierDevisFournisseurId;
    }

    public Long getDemandeDevisFournisseurId() {
        return demandeDevisFournisseurId;
    }
    
    public void setDemandeDevisFournisseurId(Long demandeDevisFournisseurId) {
        this.demandeDevisFournisseurId = demandeDevisFournisseurId;
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

    public Long getDemandeInterventionId() {
        return demandeInterventionId;
    }
    
    public void setDemandeInterventionId(Long demandeInterventionId) {
        this.demandeInterventionId = demandeInterventionId;
    }

    public Long getApprobateurId() {
        return approbateurId;
    }
    
    public void setApprobateurId(Long approbateurId) {
        this.approbateurId = approbateurId;
    }

    public Long getFichierKBISId() {
        return fichierKBISId;
    }
    
    public void setFichierKBISId(Long fichierKBISId) {
        this.fichierKBISId = fichierKBISId;
    }

    public Long getFichierVigilanceURSSAFId() {
        return fichierVigilanceURSSAFId;
    }
    
    public void setFichierVigilanceURSSAFId(Long fichierVigilanceURSSAFId) {
        this.fichierVigilanceURSSAFId = fichierVigilanceURSSAFId;
    }

    public Long getFichierTravailleursEtrangersId() {
        return fichierTravailleursEtrangersId;
    }
    
    public void setFichierTravailleursEtrangersId(Long fichierTravailleursEtrangersId) {
        this.fichierTravailleursEtrangersId = fichierTravailleursEtrangersId;
    }

    public Long getFichierRCProId() {
        return fichierRCProId;
    }
    
    public void setFichierRCProId(Long fichierRCProId) {
        this.fichierRCProId = fichierRCProId;
    }

    public Long getFichierAssuranceDecennaleId() {
        return fichierAssuranceDecennaleId;
    }
    
    public void setFichierAssuranceDecennaleId(Long fichierAssuranceDecennaleId) {
        this.fichierAssuranceDecennaleId = fichierAssuranceDecennaleId;
    }
}
