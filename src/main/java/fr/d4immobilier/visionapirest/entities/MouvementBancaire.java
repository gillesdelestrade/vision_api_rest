/*
 * To change this template, choose Tools | Templates
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
public class MouvementBancaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private CompteEnBanque compteEnBanque;
    private LocalDate dateMouvement;
    private String numeroOperation;
    private String libelle;
    private Double debit;
    private Double credit;
    private String detail;


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
        if (!(object instanceof MouvementBancaire)) {
            return false;
        }
        MouvementBancaire other = (MouvementBancaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mouvement Bancaire " + ((CompteEnBanqueCopropriete)getCompteEnBanque()).getCopropriete().getTrigramme() + " " + getCredit() + getDebit();
    }

    /**
     * @return the compteEnBanque
     */
    public CompteEnBanque getCompteEnBanque() {
        return compteEnBanque;
    }

    /**
     * @param compteEnBanque the compteEnBanque to set
     */
    public void setCompteEnBanque(CompteEnBanque compteEnBanque) {
        this.compteEnBanque = compteEnBanque;
    }

    /**
     * @return the DateMouvement
     */
    public LocalDate getDateMouvement() {
        return dateMouvement;
    }

    /**
     * @param DateMouvement the DateMouvement to set
     */
    public void setDateMouvement(LocalDate DateMouvement) {
        this.dateMouvement = DateMouvement;
    }

    /**
     * @return the numeroOperation
     */
    public String getNumeroOperation() {
        return numeroOperation;
    }

    /**
     * @param numeroOperation the numeroOperation to set
     */
    public void setNumeroOperation(String numeroOperation) {
        this.numeroOperation = numeroOperation;
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
     * @return the debit
     */
    public Double getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(Double debit) {
        this.debit = debit;
    }

    /**
     * @return the credit
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

}
