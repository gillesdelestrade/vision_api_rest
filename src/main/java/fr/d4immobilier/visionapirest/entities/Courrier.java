/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Courrier extends Document implements Serializable {
     @OneToOne(mappedBy = "courrier",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private RappelCourrier rappelCourrier;
    @OneToOne(mappedBy = "courrier",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private ARappelerCourrier aRappelerCourrier;
    

    

    @OneToOne(mappedBy = "courrier",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Publipostage publipostage;
    private static final long serialVersionUID = 1L;
    private String formuleDePolitesse;
    private String adresseSaisie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @OneToMany(mappedBy = "courrier", fetch = FetchType.LAZY)
    private List<Action> actions;
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeleCourrier modeleCourrier;

    private String reference;
    private Boolean recommandeAR;
    private String texteRecommandeAR;
    private String vosReferences;
    private String aLAttentionDe;
    private String autre;

    private Integer nombreDePiecesJointes;
    @OneToMany(mappedBy = "courrierPourPieceJointe", fetch = FetchType.LAZY)
    private List<Fichier> piecesJointes;

    @ManyToOne(fetch = FetchType.LAZY)
    private PreuveDeDepotALaPoste preuveDeDepotALaPoste;
    
    @OneToOne(fetch = FetchType.LAZY)
    private RegroupementLignesFacturation regroupementLignesFacturation;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Bordereau bordereau;

    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichier;
    
    /**
     * @return the modeleCourrier
     */
    public ModeleCourrier getModeleCourrier() {
        return modeleCourrier;
    }

    /**
     * @param modeleCourrier the modeleCourrier to set
     */
    public void setModeleCourrier(ModeleCourrier modeleCourrier) {
        this.modeleCourrier = modeleCourrier;
    }

    /**
     * @return the formuleDePolitesse
     */
    public String getFormuleDePolitesse() {
        return formuleDePolitesse;
    }

    /**
     * @param formuleDePolitesse the formuleDePolitesse to set
     */
    public void setFormuleDePolitesse(String formuleDePolitesse) {
        this.formuleDePolitesse = formuleDePolitesse;
    }

    /**
     * @return the actions
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * @return the copropriete
     */
    public Copropriete getCopropriete() {
        return copropriete;
    }

    /**
     * @param copropriete the copropriete to set
     */
    public void setCopropriete(Copropriete copropriete) {
        this.copropriete = copropriete;
    }

    /**
     * @return the adresseSaisie
     */
    public String getAdresseSaisie() {
        return adresseSaisie;
    }

    /**
     * @param adresseSaisie the adresseSaisie to set
     */
    public void setAdresseSaisie(String adresseSaisie) {
        this.adresseSaisie = adresseSaisie;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return getReference() + " : " + getTitre();
    }

    /**
     * @return the recommandeAR
     */
    public Boolean getRecommandeAR() {
        return recommandeAR;
    }

    /**
     * @param recommandeAR the recommandeAR to set
     */
    public void setRecommandeAR(Boolean recommandeAR) {
        this.recommandeAR = recommandeAR;
    }

    /**
     * @return the vosReferences
     */
    public String getVosReferences() {
        return vosReferences;
    }

    /**
     * @param vosReferences the vosReferences to set
     */
    public void setVosReferences(String vosReferences) {
        this.vosReferences = vosReferences;
    }

    /**
     * @return the aLAttentionDe
     */
    public String getaLAttentionDe() {
        return aLAttentionDe;
    }

    /**
     * @param aLAttentionDe the aLAttentionDe to set
     */
    public void setaLAttentionDe(String aLAttentionDe) {
        this.aLAttentionDe = aLAttentionDe;
    }

    /**
     * @return the autre
     */
    public String getAutre() {
        return autre;
    }

    /**
     * @param autre the autre to set
     */
    public void setAutre(String autre) {
        this.autre = autre;
    }

    /**
     * @return the nombreDePiecesJointes
     */
    public Integer getNombreDePiecesJointes() {
        return nombreDePiecesJointes;
    }

    /**
     * @param nombreDePiecesJointes the nombreDePiecesJointes to set
     */
    public void setNombreDePiecesJointes(Integer nombreDePiecesJointes) {
        this.nombreDePiecesJointes = nombreDePiecesJointes;
    }

    /**
     * @return the piecesJointes
     */
    public List<Fichier> getPiecesJointes() {
        return piecesJointes;
    }

    /**
     * @param piecesJointes the piecesJointes to set
     */
    public void setPiecesJointes(List<Fichier> piecesJointes) {
        this.piecesJointes = piecesJointes;
    }

    /**
     * @return the texteRecommandeAR
     */
    public String getTexteRecommandeAR() {
        return texteRecommandeAR;
    }

    /**
     * @param texteRecommandeAR the texteRecommandeAR to set
     */
    public void setTexteRecommandeAR(String texteRecommandeAR) {
        this.texteRecommandeAR = texteRecommandeAR;
    }

    /**
     * @return the publipostage
     */
    public Publipostage getPublipostage() {
        return publipostage;
    }

    /**
     * @param publipostage the publipostage to set
     */
    public void setPublipostage(Publipostage publipostage) {
        this.publipostage = publipostage;
    }

    /**
     * @return the preuveDeDepotALaPoste
     */
    public PreuveDeDepotALaPoste getPreuveDeDepotALaPoste() {
        return preuveDeDepotALaPoste;
    }

    /**
     * @param preuveDeDepotALaPoste the preuveDeDepotALaPoste to set
     */
    public void setPreuveDeDepotALaPoste(PreuveDeDepotALaPoste preuveDeDepotALaPoste) {
        this.preuveDeDepotALaPoste = preuveDeDepotALaPoste;
    }

    /**
     * @return the regroupementLignesFacturation
     */
    public RegroupementLignesFacturation getRegroupementLignesFacturation() {
        return regroupementLignesFacturation;
    }

    /**
     * @param regroupementLignesFacturation the regroupementLignesFacturation to set
     */
    public void setRegroupementLignesFacturation(RegroupementLignesFacturation regroupementLignesFacturation) {
        this.regroupementLignesFacturation = regroupementLignesFacturation;
    }

    /**
     * @return the aRappelerCourrier
     */
    public ARappelerCourrier getaRappelerCourrier() {
        return aRappelerCourrier;
    }

    /**
     * @param aRappelerCourrier the aRappelerCourrier to set
     */
    public void setaRappelerCourrier(ARappelerCourrier aRappelerCourrier) {
        this.aRappelerCourrier = aRappelerCourrier;
    }

    /**
     * @return the rappelCourrier
     */
    public RappelCourrier getRappelCourrier() {
        return rappelCourrier;
    }

    /**
     * @param rappelCourrier the rappelCourrier to set
     */
    public void setRappelCourrier(RappelCourrier rappelCourrier) {
        this.rappelCourrier = rappelCourrier;
    }

    /**
     * @return the bordereau
     */
    public Bordereau getBordereau() {
        return bordereau;
    }

    /**
     * @param bordereau the bordereau to set
     */
    public void setBordereau(Bordereau bordereau) {
        this.bordereau = bordereau;
    }

    /**
     * @return the fichier
     */
    public Fichier getFichier() {
        return fichier;
    }

    /**
     * @param fichier the fichier to set
     */
    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
    }




    
}
