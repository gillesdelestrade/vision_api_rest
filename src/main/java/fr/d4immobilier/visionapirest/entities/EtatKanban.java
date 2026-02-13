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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EtatKanban implements Serializable, Comparable<EtatKanban> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;
    private String libelle;
    private Integer numeroOrdre;
    private String dataField;
    private Integer dureeExpirationParDefaut;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtatKanban etatKanbanSuivant;
    private CouleurEtatKanban couleurEtatKanban;

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
        if (!(object instanceof EtatKanban)) {
            return false;
        }
        EtatKanban other = (EtatKanban) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EtatKanban[ id=" + id + " ]";
    }

    /**
     * @return the kanban
     */
    public Kanban getKanban() {
        return kanban;
    }

    /**
     * @param kanban the kanban to set
     */
    public void setKanban(Kanban kanban) {
        this.kanban = kanban;
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
     * @return the numeroOrdre
     */
    public Integer getNumeroOrdre() {
        return numeroOrdre;
    }

    /**
     * @param numeroOrdre the numeroOrdre to set
     */
    public void setNumeroOrdre(Integer numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    /**
     * @return the dataField
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * @param dataField the dataField to set
     */
    public void setDataField(String dataField) {
        this.dataField = dataField;
    }

    @Override
    public int compareTo(EtatKanban o) {
        return this.getNumeroOrdre().compareTo(o.getNumeroOrdre());
    }

    /**
     * @return the dureeExpirationParDefaut
     */
    public Integer getDureeExpirationParDefaut() {
        return dureeExpirationParDefaut;
    }

    /**
     * @param dureeExpirationParDefaut the dureeExpirationParDefaut to set
     */
    public void setDureeExpirationParDefaut(Integer dureeExpirationParDefaut) {
        this.dureeExpirationParDefaut = dureeExpirationParDefaut;
    }

    /**
     * @return the etatKanbanSuivant
     */
    public EtatKanban getEtatKanbanSuivant() {
        return etatKanbanSuivant;
    }

    /**
     * @param etatKanbanSuivant the etatKanbanSuivant to set
     */
    public void setEtatKanbanSuivant(EtatKanban etatKanbanSuivant) {
        this.etatKanbanSuivant = etatKanbanSuivant;
    }

    /**
     * @return the couleurEtatKanban
     */
    public CouleurEtatKanban getCouleurEtatKanban() {
        return couleurEtatKanban;
    }

    /**
     * @param couleurEtatKanban the couleurEtatKanban to set
     */
    public void setCouleurEtatKanban(CouleurEtatKanban couleurEtatKanban) {
        this.couleurEtatKanban = couleurEtatKanban;
    }
    
}
