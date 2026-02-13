/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EcheanceFinancement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private FinancementTravaux financementTravaux;
    private LocalDate dateEcheance; 
    private Float valeurPourcentage;
    private Float valeurEuros;
    private TypeEcheance typeEcheance;

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
        if (!(object instanceof EcheanceFinancement)) {
            return false;
        }
        EcheanceFinancement other = (EcheanceFinancement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EcheanceFinancement[ id=" + id + " ]";
    }

    /**
     * @return the financementTravaux
     */
    public FinancementTravaux getFinancementTravaux() {
        return financementTravaux;
    }

    /**
     * @param financementTravaux the financementTravaux to set
     */
    public void setFinancementTravaux(FinancementTravaux financementTravaux) {
        this.financementTravaux = financementTravaux;
    }

    /**
     * @return the dateEcheance
     */
    public LocalDate getDateEcheance() {
        return dateEcheance;
    }

    /**
     * @param dateEcheance the dateEcheance to set
     */
    public void setDateEcheance(LocalDate dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    /**
     * @return the valeurPourcentage
     */
    public Float getValeurPourcentage() {
        return valeurPourcentage;
    }

    /**
     * @param valeurPourcentage the valeurPourcentage to set
     */
    public void setValeurPourcentage(Float valeurPourcentage) {
        this.valeurPourcentage = valeurPourcentage;
    }

    /**
     * @return the valeurEuros
     */
    public Float getValeurEuros() {
        return valeurEuros;
    }

    /**
     * @param valeurEuros the valeurEuros to set
     */
    public void setValeurEuros(Float valeurEuros) {
        this.valeurEuros = valeurEuros;
    }

    /**
     * @return the typeEcheance
     */
    public TypeEcheance getTypeEcheance() {
        return typeEcheance;
    }

    /**
     * @param typeEcheance the typeEcheance to set
     */
    public void setTypeEcheance(TypeEcheance typeEcheance) {
        this.typeEcheance = typeEcheance;
    }
    
}
