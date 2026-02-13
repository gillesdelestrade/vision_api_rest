package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ContratFournisseurDTO {
    
    private Long id;
    private String reference;
    private String description;
    private String commentaire;
    private LocalDate dateContrat;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String momentPaiementFacturesContrat; // Enum converti en String
    private String frequenceFactures; // Enum converti en String
    private Float montantForfait;
    private String referenceClient;
    private Boolean validationFacturesPasNecessaire;
    private Boolean facturationForfaitaire;
    private Integer jourAnniversaire;
    private Integer moisAnniversaire;
    private Integer dureePreavisResiliation;
    private Long fournisseurId;
    private Long coproprieteId;
    private Long prestationContratId;

    // Constructeur
    public ContratFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getDateContrat() {
        return dateContrat;
    }
    
    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }
    
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getMomentPaiementFacturesContrat() {
        return momentPaiementFacturesContrat;
    }
    
    public void setMomentPaiementFacturesContrat(String momentPaiementFacturesContrat) {
        this.momentPaiementFacturesContrat = momentPaiementFacturesContrat;
    }

    public String getFrequenceFactures() {
        return frequenceFactures;
    }
    
    public void setFrequenceFactures(String frequenceFactures) {
        this.frequenceFactures = frequenceFactures;
    }

    public Float getMontantForfait() {
        return montantForfait;
    }
    
    public void setMontantForfait(Float montantForfait) {
        this.montantForfait = montantForfait;
    }

    public String getReferenceClient() {
        return referenceClient;
    }
    
    public void setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
    }

    public Boolean getValidationFacturesPasNecessaire() {
        return validationFacturesPasNecessaire;
    }
    
    public void setValidationFacturesPasNecessaire(Boolean validationFacturesPasNecessaire) {
        this.validationFacturesPasNecessaire = validationFacturesPasNecessaire;
    }

    public Boolean getFacturationForfaitaire() {
        return facturationForfaitaire;
    }
    
    public void setFacturationForfaitaire(Boolean facturationForfaitaire) {
        this.facturationForfaitaire = facturationForfaitaire;
    }

    public Integer getJourAnniversaire() {
        return jourAnniversaire;
    }
    
    public void setJourAnniversaire(Integer jourAnniversaire) {
        this.jourAnniversaire = jourAnniversaire;
    }

    public Integer getMoisAnniversaire() {
        return moisAnniversaire;
    }
    
    public void setMoisAnniversaire(Integer moisAnniversaire) {
        this.moisAnniversaire = moisAnniversaire;
    }

    public Integer getDureePreavisResiliation() {
        return dureePreavisResiliation;
    }
    
    public void setDureePreavisResiliation(Integer dureePreavisResiliation) {
        this.dureePreavisResiliation = dureePreavisResiliation;
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

    public Long getPrestationContratId() {
        return prestationContratId;
    }
    
    public void setPrestationContratId(Long prestationContratId) {
        this.prestationContratId = prestationContratId;
    }
}
