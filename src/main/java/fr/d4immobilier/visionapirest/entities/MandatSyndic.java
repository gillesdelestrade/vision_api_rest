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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MandatSyndic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @OneToOne(fetch = FetchType.LAZY)
    private PVAG pvag;
    @OneToOne(fetch = FetchType.LAZY)
    private ContratFournisseur contratFournisseur;
    
    

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
        if (!(object instanceof MandatSyndic)) {
            return false;
        }
        MandatSyndic other = (MandatSyndic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.MandatSyndic[ id=" + id + " ]";
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
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
     * @return the pvag
     */
    public PVAG getPvag() {
        return pvag;
    }

    /**
     * @param pvag the pvag to set
     */
    public void setPvag(PVAG pvag) {
        this.pvag = pvag;
    }

    /**
     * @return the contratFournisseur
     */
    public ContratFournisseur getContratFournisseur() {
        return contratFournisseur;
    }

    /**
     * @param contratFournisseur the contratFournisseur to set
     */
    public void setContratFournisseur(ContratFournisseur contratFournisseur) {
        this.contratFournisseur = contratFournisseur;
    }
    
}
