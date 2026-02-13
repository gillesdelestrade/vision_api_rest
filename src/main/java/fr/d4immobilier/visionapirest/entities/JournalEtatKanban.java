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
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class JournalEtatKanban implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtatKanban etatKanban;
    private Instant dateEntree;
    private Instant dateSortie;
    private Integer numeroEntreeJournal;
    private LocalDate dateExpiration;

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
        if (!(object instanceof JournalEtatKanban)) {
            return false;
        }
        JournalEtatKanban other = (JournalEtatKanban) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.JournalEtatKanban[ id=" + id + " ]";
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    /**
     * @return the etatKanban
     */
    public EtatKanban getEtatKanban() {
        return etatKanban;
    }

    /**
     * @param etatKanban the etatKanban to set
     */
    public void setEtatKanban(EtatKanban etatKanban) {
        this.etatKanban = etatKanban;
    }

    /**
     * @return the dateEntree
     */
    public Instant getDateEntree() {
        return dateEntree;
    }

    /**
     * @param dateEntree the dateEntree to set
     */
    public void setDateEntree(Instant dateEntree) {
        this.dateEntree = dateEntree;
    }

    /**
     * @return the dateSortie
     */
    public Instant getDateSortie() {
        return dateSortie;
    }

    /**
     * @param dateSortie the dateSortie to set
     */
    public void setDateSortie(Instant dateSortie) {
        this.dateSortie = dateSortie;
    }

    /**
     * @return the numeroEntreeJournal
     */
    public Integer getNumeroEntreeJournal() {
        return numeroEntreeJournal;
    }

    /**
     * @param numeroEntreeJournal the numeroEntreeJournal to set
     */
    public void setNumeroEntreeJournal(Integer numeroEntreeJournal) {
        this.numeroEntreeJournal = numeroEntreeJournal;
    }

    /**
     * @return the dateExpiration
     */
    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    /**
     * @param dateExpiration the dateExpiration to set
     */
    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    
}
