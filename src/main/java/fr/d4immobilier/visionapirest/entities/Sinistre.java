/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Sinistre extends Dossier implements Serializable {

    public final static String EVENEMENT_DECLARATION = "Déclaration du sinistre";

    @OneToOne(mappedBy = "sinistre",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private CourrierDeclarationSinistre courrierDeclarationSinistre;

    private static final long serialVersionUID = 1L;
    @ManyToOne(fetch = FetchType.LAZY)
    private Assurance assurance;
    private NatureSinistre natureSinistre;
    private String lieu;
    private TypeLeseSinistre typeLeseSinistre;
    private TypeOrigineSinistre typeOrigineSinistre;
    private String detailLeseSinistre;
    private String detailOrigineSinistre;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaireLese;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaireOrigine;
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Copropriete copropriete;
    private String referenceChezAssureur;
    private String referenceExpert;
    private String postIt;
    private MotifClotureSinistre motifClotureSinistre;
    private String statutSinistre;

    /**
     * @return the assurance
     */
    public Assurance getAssurance() {
        return assurance;
    }

    /**
     * @param assurance the assurance to set
     */
    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    /**
     * @return the natureSinistre
     */
    public NatureSinistre getNatureSinistre() {
        return natureSinistre;
    }

    /**
     * @param natureSinistre the natureSinistre to set
     */
    public void setNatureSinistre(NatureSinistre natureSinistre) {
        this.natureSinistre = natureSinistre;
    }

    /**
     * @return the lieu
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * @param lieu the lieu to set
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     * @return the typeLeseSinistre
     */
    public TypeLeseSinistre getTypeLeseSinistre() {
        return typeLeseSinistre;
    }

    /**
     * @param typeLeseSinistre the typeLeseSinistre to set
     */
    public void setTypeLeseSinistre(TypeLeseSinistre typeLeseSinistre) {
        this.typeLeseSinistre = typeLeseSinistre;
    }

    /**
     * @return the typeOrigineSinistre
     */
    public TypeOrigineSinistre getTypeOrigineSinistre() {
        return typeOrigineSinistre;
    }

    /**
     * @param typeOrigineSinistre the typeOrigineSinistre to set
     */
    public void setTypeOrigineSinistre(TypeOrigineSinistre typeOrigineSinistre) {
        this.typeOrigineSinistre = typeOrigineSinistre;
    }

    /**
     * @return the detailLeseSinistre
     */
    public String getDetailLeseSinistre() {
        return detailLeseSinistre;
    }

    /**
     * @param detailLeseSinistre the detailLeseSinistre to set
     */
    public void setDetailLeseSinistre(String detailLeseSinistre) {
        this.detailLeseSinistre = detailLeseSinistre;
    }

    /**
     * @return the detailOrigineSinistre
     */
    public String getDetailOrigineSinistre() {
        return detailOrigineSinistre;
    }

    /**
     * @param detailOrigineSinistre the detailOrigineSinistre to set
     */
    public void setDetailOrigineSinistre(String detailOrigineSinistre) {
        this.detailOrigineSinistre = detailOrigineSinistre;
    }

    /**
     * @return the coproprietaireLese
     */
    public Coproprietaire getCoproprietaireLese() {
        return coproprietaireLese;
    }

    /**
     * @param coproprietaireLese the coproprietaireLese to set
     */
    public void setCoproprietaireLese(Coproprietaire coproprietaireLese) {
        this.coproprietaireLese = coproprietaireLese;
    }

    /**
     * @return the coproprietaireOrigine
     */
    public Coproprietaire getCoproprietaireOrigine() {
        return coproprietaireOrigine;
    }

    /**
     * @param coproprietaireOrigine the coproprietaireOrigine to set
     */
    public void setCoproprietaireOrigine(Coproprietaire coproprietaireOrigine) {
        this.coproprietaireOrigine = coproprietaireOrigine;
    }

    /**
     * @return the courrierDeclarationSinistre
     */
    public CourrierDeclarationSinistre getCourrierDeclarationSinistre() {
        return courrierDeclarationSinistre;
    }

    /**
     * @param courrierDeclarationSinistre the courrierDeclarationSinistre to set
     */
    public void setCourrierDeclarationSinistre(CourrierDeclarationSinistre courrierDeclarationSinistre) {
        this.courrierDeclarationSinistre = courrierDeclarationSinistre;
    }

    /**
     * @return the referenceChezAssureur
     */
    public String getReferenceChezAssureur() {
        return referenceChezAssureur;
    }

    /**
     * @param referenceChezAssureur the referenceChezAssureur to set
     */
    public void setReferenceChezAssureur(String referenceChezAssureur) {
        this.referenceChezAssureur = referenceChezAssureur;
    }

    /**
     * @return the referenceExpert
     */
    public String getReferenceExpert() {
        return referenceExpert;
    }

    /**
     * @param referenceExpert the referenceExpert to set
     */
    public void setReferenceExpert(String referenceExpert) {
        this.referenceExpert = referenceExpert;
    }

    /**
     * @return the postIt
     */
    public String getPostIt() {
        return postIt;
    }

    /**
     * @param postIt the postIt to set
     */
    public void setPostIt(String postIt) {
        this.postIt = postIt;
    }

    @Override
    public String toString() {
        
        return super.toString() + " : " + getDescription();
    }

    /**
     * @return the motifClotureSinistre
     */
    public MotifClotureSinistre getMotifClotureSinistre() {
        return motifClotureSinistre;
    }

    /**
     * @param motifClotureSinistre the motifClotureSinistre to set
     */
    public void setMotifClotureSinistre(MotifClotureSinistre motifClotureSinistre) {
        this.motifClotureSinistre = motifClotureSinistre;
    }

    /**
     * @return the statutSinistre
     */
    public String getStatutSinistre() {
        return statutSinistre;
    }

    /**
     * @param statutSinistre the statutSinistre to set
     */
    public void setStatutSinistre(String statutSinistre) {
        this.statutSinistre = statutSinistre;
    }

    
    
    
}
