/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DesistementCheque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Banque banque;
    private Double montant;
    private LocalDate dateCheque;
    private String numeroCheque;
    private String nomTireurCheque;
    private LocalDate dateDesistement;
    @OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private Courrier courrierDesistement;
    @OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private Courrier courrierChequeRetrouve;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

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
        if (!(object instanceof DesistementCheque)) {
            return false;
        }
        DesistementCheque other = (DesistementCheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (numeroCheque == null) {
            return "Nouveau";
        } else {
            return getNumeroCheque() + " (" + getBanque() + ") " + new DecimalFormat("###,###,##0.00¤").format(getMontant()) ;
        }
    }

    /**
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the banque
     */
    public Banque getBanque() {
        return banque;
    }

    /**
     * @param banque the banque to set
     */
    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    /**
     * @return the montant
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    /**
     * @return the dateCheque
     */
    public LocalDate getDateCheque() {
        return dateCheque;
    }

    /**
     * @param dateCheque the dateCheque to set
     */
    public void setDateCheque(LocalDate dateCheque) {
        this.dateCheque = dateCheque;
    }

    /**
     * @return the numeroCheque
     */
    public String getNumeroCheque() {
        return numeroCheque;
    }

    /**
     * @param numeroCheque the numeroCheque to set
     */
    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    /**
     * @return the nomTireurCheque
     */
    public String getNomTireurCheque() {
        return nomTireurCheque;
    }

    /**
     * @param nomTireurCheque the nomTireurCheque to set
     */
    public void setNomTireurCheque(String nomTireurCheque) {
        this.nomTireurCheque = nomTireurCheque;
    }

    /**
     * @return the dateDesistement
     */
    public LocalDate getDateDesistement() {
        return dateDesistement;
    }

    /**
     * @param dateDesistement the dateDesistement to set
     */
    public void setDateDesistement(LocalDate dateDesistement) {
        this.dateDesistement = dateDesistement;
    }

    /**
     * @return the courrierDesistement
     */
    public Courrier getCourrierDesistement() {
        return courrierDesistement;
    }

    /**
     * @param courrierDesistement the courrierDesistement to set
     */
    public void setCourrierDesistement(Courrier courrierDesistement) {
        this.courrierDesistement = courrierDesistement;
    }

    /**
     * @return the courrierChequeRetrouve
     */
    public Courrier getCourrierChequeRetrouve() {
        return courrierChequeRetrouve;
    }

    /**
     * @param courrierChequeRetrouve the courrierChequeRetrouve to set
     */
    public void setCourrierChequeRetrouve(Courrier courrierChequeRetrouve) {
        this.courrierChequeRetrouve = courrierChequeRetrouve;
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
    
}
