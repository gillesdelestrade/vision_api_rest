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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EtapeConsigne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Consigne consigne;
    private Integer numeroOrdre;
    private String texteEtape;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierEtape;

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
        if (!(object instanceof EtapeConsigne)) {
            return false;
        }
        EtapeConsigne other = (EtapeConsigne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EtapeConsigne[ id=" + id + " ]";
    }

    /**
     * @return the consigne
     */
    public Consigne getConsigne() {
        return consigne;
    }

    /**
     * @param consigne the consigne to set
     */
    public void setConsigne(Consigne consigne) {
        this.consigne = consigne;
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
     * @return the texteEtape
     */
    public String getTexteEtape() {
        return texteEtape;
    }

    /**
     * @param texteEtape the texteEtape to set
     */
    public void setTexteEtape(String texteEtape) {
        this.texteEtape = texteEtape;
    }

    /**
     * @return the fichierEtape
     */
    public Fichier getFichierEtape() {
        return fichierEtape;
    }

    /**
     * @param fichierEtape the fichierEtape to set
     */
    public void setFichierEtape(Fichier fichierEtape) {
        this.fichierEtape = fichierEtape;
    }
    
}
