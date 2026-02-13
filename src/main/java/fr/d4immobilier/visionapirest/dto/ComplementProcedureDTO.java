package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ComplementProcedureDTO {
    
    private Long id;
    private String tribunal;
    private String referenceAvocat;
    private String referenceHuissier;
    private String referenceTribunal;
    private String origine;
    private LocalDate dateReceptionAssignation;
    private LocalDate dateDeMiseEnDelibere;
    private String delibere;
    private Float article700;
    private String statutProcedure; // Enum converti en String
    private LocalDate dateReceptionCertificatDeNonAppel;
    private LocalDate dateAssignation;
    private String ceQuiEstDemande;
    private LocalDate datePremiereComparution;
    private String defendeur;
    private Long fichierCertificatDeNonAppelId;
    private Long fichierOrdonnanceId;
    private Long avocatId;
    private Long procedureId;
    private Long fichierAssignationId;

    // Constructeur
    public ComplementProcedureDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTribunal() {
        return tribunal;
    }
    
    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getReferenceAvocat() {
        return referenceAvocat;
    }
    
    public void setReferenceAvocat(String referenceAvocat) {
        this.referenceAvocat = referenceAvocat;
    }

    public String getReferenceHuissier() {
        return referenceHuissier;
    }
    
    public void setReferenceHuissier(String referenceHuissier) {
        this.referenceHuissier = referenceHuissier;
    }

    public String getReferenceTribunal() {
        return referenceTribunal;
    }
    
    public void setReferenceTribunal(String referenceTribunal) {
        this.referenceTribunal = referenceTribunal;
    }

    public String getOrigine() {
        return origine;
    }
    
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public LocalDate getDateReceptionAssignation() {
        return dateReceptionAssignation;
    }
    
    public void setDateReceptionAssignation(LocalDate dateReceptionAssignation) {
        this.dateReceptionAssignation = dateReceptionAssignation;
    }

    public LocalDate getDateDeMiseEnDelibere() {
        return dateDeMiseEnDelibere;
    }
    
    public void setDateDeMiseEnDelibere(LocalDate dateDeMiseEnDelibere) {
        this.dateDeMiseEnDelibere = dateDeMiseEnDelibere;
    }

    public String getDelibere() {
        return delibere;
    }
    
    public void setDelibere(String delibere) {
        this.delibere = delibere;
    }

    public Float getArticle700() {
        return article700;
    }
    
    public void setArticle700(Float article700) {
        this.article700 = article700;
    }

    public String getStatutProcedure() {
        return statutProcedure;
    }
    
    public void setStatutProcedure(String statutProcedure) {
        this.statutProcedure = statutProcedure;
    }

    public LocalDate getDateReceptionCertificatDeNonAppel() {
        return dateReceptionCertificatDeNonAppel;
    }
    
    public void setDateReceptionCertificatDeNonAppel(LocalDate dateReceptionCertificatDeNonAppel) {
        this.dateReceptionCertificatDeNonAppel = dateReceptionCertificatDeNonAppel;
    }

    public LocalDate getDateAssignation() {
        return dateAssignation;
    }
    
    public void setDateAssignation(LocalDate dateAssignation) {
        this.dateAssignation = dateAssignation;
    }

    public String getCeQuiEstDemande() {
        return ceQuiEstDemande;
    }
    
    public void setCeQuiEstDemande(String ceQuiEstDemande) {
        this.ceQuiEstDemande = ceQuiEstDemande;
    }

    public LocalDate getDatePremiereComparution() {
        return datePremiereComparution;
    }
    
    public void setDatePremiereComparution(LocalDate datePremiereComparution) {
        this.datePremiereComparution = datePremiereComparution;
    }

    public String getDefendeur() {
        return defendeur;
    }
    
    public void setDefendeur(String defendeur) {
        this.defendeur = defendeur;
    }

    public Long getFichierCertificatDeNonAppelId() {
        return fichierCertificatDeNonAppelId;
    }
    
    public void setFichierCertificatDeNonAppelId(Long fichierCertificatDeNonAppelId) {
        this.fichierCertificatDeNonAppelId = fichierCertificatDeNonAppelId;
    }

    public Long getFichierOrdonnanceId() {
        return fichierOrdonnanceId;
    }
    
    public void setFichierOrdonnanceId(Long fichierOrdonnanceId) {
        this.fichierOrdonnanceId = fichierOrdonnanceId;
    }

    public Long getAvocatId() {
        return avocatId;
    }
    
    public void setAvocatId(Long avocatId) {
        this.avocatId = avocatId;
    }

    public Long getProcedureId() {
        return procedureId;
    }
    
    public void setProcedureId(Long procedureId) {
        this.procedureId = procedureId;
    }

    public Long getFichierAssignationId() {
        return fichierAssignationId;
    }
    
    public void setFichierAssignationId(Long fichierAssignationId) {
        this.fichierAssignationId = fichierAssignationId;
    }
}
