/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Budget implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Boolean enCours;
    private Double budgetFonctionnement;
    private Double budgetTravaux;

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
        if (!(object instanceof Budget)) {
            return false;
        }
        Budget other = (Budget) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Budget[ id=" + id + " ]";
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
     * @return the dateDebut
     */
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the enCours
     */
    public Boolean getEnCours() {
        return enCours;
    }

    /**
     * @param enCours the enCours to set
     */
    public void setEnCours(Boolean enCours) {
        this.enCours = enCours;
    }

    /**
     * @return the budgetFonctionnement
     */
    public Double getBudgetFonctionnement() {
        return budgetFonctionnement;
    }

    /**
     * @param budgetFonctionnement the budgetFonctionnement to set
     */
    public void setBudgetFonctionnement(Double budgetFonctionnement) {
        this.budgetFonctionnement = budgetFonctionnement;
    }

    /**
     * @return the budgetTravaux
     */
    public Double getBudgetTravaux() {
        return budgetTravaux;
    }

    /**
     * @param budgetTravaux the budgetTravaux to set
     */
    public void setBudgetTravaux(Double budgetTravaux) {
        this.budgetTravaux = budgetTravaux;
    }
    
}
