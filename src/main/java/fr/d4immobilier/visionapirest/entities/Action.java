/*
 * To change this template, choose Tools | Templates
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

import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Action implements Serializable {
    @OneToMany(mappedBy = "action", fetch = FetchType.LAZY)
    private List<ProchaineEtapeAction> prochainesEtapesActions;
    @ManyToOne(fetch = FetchType.LAZY)
    private Courrier courrier;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne emetteur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne executeur;
    private Instant dateCreation;
    private Instant datePrevue;
    private Instant dateRealisation;
    private Importance importance;
    private Urgence urgence;

    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private String libelle;
    private String commentaire;
    
    private transient Boolean directementImplique;
    
    private LocalDate notBefore; 
    
    private LocalDate dateSignaleTermineParCoproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne personneSignalantTermine;

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
        if (!(object instanceof Action)) {
            return false;
        }
        Action other = (Action) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getLibelle();
    }

    /**
     * @return the emetteur
     */
    public Personne getEmetteur() {
        return emetteur;
    }

    /**
     * @param emetteur the emetteur to set
     */
    public void setEmetteur(Personne emetteur) {
        this.emetteur = emetteur;
    }

    /**
     * @return the executeur
     */
    public Personne getExecuteur() {
        return executeur;
    }

    /**
     * @param executeur the executeur to set
     */
    public void setExecuteur(Personne executeur) {
        this.executeur = executeur;
    }

    /**
     * @return the datePrevue
     */
    public Instant getDatePrevue() {
        return datePrevue;
    }

    /**
     * @param datePrevue the datePrevue to set
     */
    public void setDatePrevue(Instant datePrevue) {
        this.datePrevue = datePrevue;
    }

    /**
     * @return the dateRealisation
     */
    public Instant getDateRealisation() {
        return dateRealisation;
    }

    /**
     * @param dateRealisation the dateRealisation to set
     */
    public void setDateRealisation(Instant dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    /**
     * @return the importance
     */
    public Importance getImportance() {
        return importance;
    }

    /**
     * @param importance the importance to set
     */
    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    /**
     * @return the urgence
     */
    public Urgence getUrgence() {
        return urgence;
    }

    /**
     * @param urgence the urgence to set
     */
    public void setUrgence(Urgence urgence) {
        this.urgence = urgence;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
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
     * @return the directementImplique
     */
    public Boolean getDirectementImplique() {
        return directementImplique;
    }

    /**
     * @param directementImplique the directementImplique to set
     */
    public void setDirectementImplique(Boolean directementImplique) {
        this.directementImplique = directementImplique;
    }

    /**
     * @return the notBefore
     */
    public LocalDate getNotBefore() {
        return notBefore;
    }

    /**
     * @param notBefore the notBefore to set
     */
    public void setNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * @return the courrier
     */
    public Courrier getCourrier() {
        return courrier;
    }

    /**
     * @param courrier the courrier to set
     */
    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }

    /**
     * @return the prochainesEtapesActions
     */
    public List<ProchaineEtapeAction> getProchainesEtapesActions() {
        return prochainesEtapesActions;
    }

    /**
     * @param prochainesEtapesActions the prochainesEtapesActions to set
     */
    public void setProchainesEtapesActions(List<ProchaineEtapeAction> prochainesEtapesActions) {
        this.prochainesEtapesActions = prochainesEtapesActions;
    }

    /**
     * @return the dateSignaleTermineParCoproprietaire
     */
    public LocalDate getDateSignaleTermineParCoproprietaire() {
        return dateSignaleTermineParCoproprietaire;
    }

    /**
     * @param dateSignaleTermineParCoproprietaire the dateSignaleTermineParCoproprietaire to set
     */
    public void setDateSignaleTermineParCoproprietaire(LocalDate dateSignaleTermineParCoproprietaire) {
        this.dateSignaleTermineParCoproprietaire = dateSignaleTermineParCoproprietaire;
    }

    /**
     * @return the personneSignalantTermine
     */
    public Personne getPersonneSignalantTermine() {
        return personneSignalantTermine;
    }

    /**
     * @param personneSignalantTermine the personneSignalantTermine to set
     */
    public void setPersonneSignalantTermine(Personne personneSignalantTermine) {
        this.personneSignalantTermine = personneSignalantTermine;
    }

    

}
