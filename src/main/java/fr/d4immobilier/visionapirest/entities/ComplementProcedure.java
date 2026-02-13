/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ComplementProcedure implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tribunal;
    private String referenceAvocat;
    private String referenceHuissier;
    private String referenceTribunal;
    private String origine;
    private LocalDate dateReceptionAssignation;
    @OneToMany(mappedBy = "complementProcedure", fetch = FetchType.LAZY)
    private List<Audience> audiences;
    private LocalDate dateDeMiseEnDelibere;
    private String delibere;
    private Float article700;
    private StatutProcedure statutProcedure;
    private LocalDate dateReceptionCertificatDeNonAppel;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierCertificatDeNonAppel;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierOrdonnance;
    @OneToMany(fetch = FetchType.LAZY)
    private List<FactureFournisseur> facturesFournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur avocat;
    @OneToOne(fetch = FetchType.LAZY)
    private Procedure procedure;
    private LocalDate dateAssignation;
    private String ceQuiEstDemande;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierAssignation;
    private LocalDate datePremiereComparution;
    private String defendeur;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementProcedure)) {
            return false;
        }
        ComplementProcedure other = (ComplementProcedure) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ComplementProcedure[ id=" + id + " ]";
    }

    /**
     * @return the tribunal
     */
    public String getTribunal() {
        return tribunal;
    }

    /**
     * @param tribunal the tribunal to set
     */
    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    /**
     * @return the referenceAvocat
     */
    public String getReferenceAvocat() {
        return referenceAvocat;
    }

    /**
     * @param referenceAvocat the referenceAvocat to set
     */
    public void setReferenceAvocat(String referenceAvocat) {
        this.referenceAvocat = referenceAvocat;
    }

    /**
     * @return the referenceHuissier
     */
    public String getReferenceHuissier() {
        return referenceHuissier;
    }

    /**
     * @param referenceHuissier the referenceHuissier to set
     */
    public void setReferenceHuissier(String referenceHuissier) {
        this.referenceHuissier = referenceHuissier;
    }

    /**
     * @return the referenceTribunal
     */
    public String getReferenceTribunal() {
        return referenceTribunal;
    }

    /**
     * @param referenceTribunal the referenceTribunal to set
     */
    public void setReferenceTribunal(String referenceTribunal) {
        this.referenceTribunal = referenceTribunal;
    }

    /**
     * @return the origine
     */
    public String getOrigine() {
        return origine;
    }

    /**
     * @param origine the origine to set
     */
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    /**
     * @return the dateReceptionAssignation
     */
    public LocalDate getDateReceptionAssignation() {
        return dateReceptionAssignation;
    }

    /**
     * @param dateReceptionAssignation the dateReceptionAssignation to set
     */
    public void setDateReceptionAssignation(LocalDate dateReceptionAssignation) {
        this.dateReceptionAssignation = dateReceptionAssignation;
    }

    /**
     * @return the audiences
     */
    public List<Audience> getAudiences() {
        return audiences;
    }

    /**
     * @param audiences the audiences to set
     */
    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    /**
     * @return the dateDeMiseEnDelibere
     */
    public LocalDate getDateDeMiseEnDelibere() {
        return dateDeMiseEnDelibere;
    }

    /**
     * @param dateDeMiseEnDelibere the dateDeMiseEnDelibere to set
     */
    public void setDateDeMiseEnDelibere(LocalDate dateDeMiseEnDelibere) {
        this.dateDeMiseEnDelibere = dateDeMiseEnDelibere;
    }

    /**
     * @return the delibere
     */
    public String getDelibere() {
        return delibere;
    }

    /**
     * @param delibere the delibere to set
     */
    public void setDelibere(String delibere) {
        this.delibere = delibere;
    }

    /**
     * @return the article700
     */
    public Float getArticle700() {
        return article700;
    }

    /**
     * @param article700 the article700 to set
     */
    public void setArticle700(Float article700) {
        this.article700 = article700;
    }

    /**
     * @return the statutProcedure
     */
    public StatutProcedure getStatutProcedure() {
        return statutProcedure;
    }

    /**
     * @param statutProcedure the statutProcedure to set
     */
    public void setStatutProcedure(StatutProcedure statutProcedure) {
        this.statutProcedure = statutProcedure;
    }

    /**
     * @return the dateReceptionCertificatDeNonAppel
     */
    public LocalDate getDateReceptionCertificatDeNonAppel() {
        return dateReceptionCertificatDeNonAppel;
    }

    /**
     * @param dateReceptionCertificatDeNonAppel the dateReceptionCertificatDeNonAppel to set
     */
    public void setDateReceptionCertificatDeNonAppel(LocalDate dateReceptionCertificatDeNonAppel) {
        this.dateReceptionCertificatDeNonAppel = dateReceptionCertificatDeNonAppel;
    }

    /**
     * @return the fichierCertificatDeNonAppel
     */
    public Fichier getFichierCertificatDeNonAppel() {
        return fichierCertificatDeNonAppel;
    }

    /**
     * @param fichierCertificatDeNonAppel the fichierCertificatDeNonAppel to set
     */
    public void setFichierCertificatDeNonAppel(Fichier fichierCertificatDeNonAppel) {
        this.fichierCertificatDeNonAppel = fichierCertificatDeNonAppel;
    }

    /**
     * @return the fichierOrdonnance
     */
    public Fichier getFichierOrdonnance() {
        return fichierOrdonnance;
    }

    /**
     * @param fichierOrdonnance the fichierOrdonnance to set
     */
    public void setFichierOrdonnance(Fichier fichierOrdonnance) {
        this.fichierOrdonnance = fichierOrdonnance;
    }

    /**
     * @return the facturesFournisseur
     */
    public List<FactureFournisseur> getFacturesFournisseur() {
        return facturesFournisseur;
    }

    /**
     * @param facturesFournisseur the facturesFournisseur to set
     */
    public void setFacturesFournisseur(List<FactureFournisseur> facturesFournisseur) {
        this.facturesFournisseur = facturesFournisseur;
    }

    /**
     * @return the avocat
     */
    public Fournisseur getAvocat() {
        return avocat;
    }

    /**
     * @param avocat the avocat to set
     */
    public void setAvocat(Fournisseur avocat) {
        this.avocat = avocat;
    }

    /**
     * @return the procedure
     */
    public Procedure getProcedure() {
        return procedure;
    }

    /**
     * @param procedure the procedure to set
     */
    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    /**
     * @return the dateAssignation
     */
    public LocalDate getDateAssignation() {
        return dateAssignation;
    }

    /**
     * @param dateAssignation the dateAssignation to set
     */
    public void setDateAssignation(LocalDate dateAssignation) {
        this.dateAssignation = dateAssignation;
    }

    /**
     * @return the ceQuiEstDemande
     */
    public String getCeQuiEstDemande() {
        return ceQuiEstDemande;
    }

    /**
     * @param ceQuiEstDemande the ceQuiEstDemande to set
     */
    public void setCeQuiEstDemande(String ceQuiEstDemande) {
        this.ceQuiEstDemande = ceQuiEstDemande;
    }

    /**
     * @return the fichierAssignation
     */
    public Fichier getFichierAssignation() {
        return fichierAssignation;
    }

    /**
     * @param fichierAssignation the fichierAssignation to set
     */
    public void setFichierAssignation(Fichier fichierAssignation) {
        this.fichierAssignation = fichierAssignation;
    }

    /**
     * @return the datePremiereComparution
     */
    public LocalDate getDatePremiereComparution() {
        return datePremiereComparution;
    }

    /**
     * @param datePremiereComparution the datePremiereComparution to set
     */
    public void setDatePremiereComparution(LocalDate datePremiereComparution) {
        this.datePremiereComparution = datePremiereComparution;
    }

    /**
     * @return the defendeur
     */
    public String getDefendeur() {
        return defendeur;
    }

    /**
     * @param defendeur the defendeur to set
     */
    public void setDefendeur(String defendeur) {
        this.defendeur = defendeur;
    }
    
}
