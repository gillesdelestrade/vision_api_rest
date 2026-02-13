/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EtapePlanifAGModele implements Serializable,Comparable<EtapePlanifAGModele> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroOrdre;
    private String libelle;
    @OneToMany(fetch = FetchType.LAZY)
    private List<EtapePlanifAGModele> predecesseurs;
    private ResponsableEtapePlanifAGModele responsableEtapePlanifAGModele;
    private Integer dureeTacheRapide;
    private Integer dureeTacheNormale;
    private Integer dureeTacheLongue;
    private Integer dureeTacheTresLongue;
    

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
        if (!(object instanceof EtapePlanifAGModele)) {
            return false;
        }
        EtapePlanifAGModele other = (EtapePlanifAGModele) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EtapePlanifAGModele[ id=" + id + " ]";
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
     * @return the predecesseur
     */
    public List<EtapePlanifAGModele> getPredecesseurs() {
        return predecesseurs;
    }

    /**
     * @param predecesseur the predecesseur to set
     */
    public void setPredecesseurs(List<EtapePlanifAGModele> predecesseurs) {
        this.predecesseurs = predecesseurs;
    }

    /**
     * @return the responsableEtapePlanifAGModele
     */
    public ResponsableEtapePlanifAGModele getResponsableEtapePlanifAGModele() {
        return responsableEtapePlanifAGModele;
    }

    /**
     * @param responsableEtapePlanifAGModele the responsableEtapePlanifAGModele to set
     */
    public void setResponsableEtapePlanifAGModele(ResponsableEtapePlanifAGModele responsableEtapePlanifAGModele) {
        this.responsableEtapePlanifAGModele = responsableEtapePlanifAGModele;
    }

    /**
     * @return the dureeTacheRapide
     */
    public Integer getDureeTacheRapide() {
        return dureeTacheRapide;
    }

    /**
     * @param dureeTacheRapide the dureeTacheRapide to set
     */
    public void setDureeTacheRapide(Integer dureeTacheRapide) {
        this.dureeTacheRapide = dureeTacheRapide;
    }

    /**
     * @return the dureeTacheNormale
     */
    public Integer getDureeTacheNormale() {
        return dureeTacheNormale;
    }

    /**
     * @param dureeTacheNormale the dureeTacheNormale to set
     */
    public void setDureeTacheNormale(Integer dureeTacheNormale) {
        this.dureeTacheNormale = dureeTacheNormale;
    }

    /**
     * @return the dureeTacheLongue
     */
    public Integer getDureeTacheLongue() {
        return dureeTacheLongue;
    }

    /**
     * @param dureeTacheLongue the dureeTacheLongue to set
     */
    public void setDureeTacheLongue(Integer dureeTacheLongue) {
        this.dureeTacheLongue = dureeTacheLongue;
    }

    /**
     * @return the dureeTacheTresLongue
     */
    public Integer getDureeTacheTresLongue() {
        return dureeTacheTresLongue;
    }

    /**
     * @param dureeTacheTresLongue the dureeTacheTresLongue to set
     */
    public void setDureeTacheTresLongue(Integer dureeTacheTresLongue) {
        this.dureeTacheTresLongue = dureeTacheTresLongue;
    }

    @Override
    public int compareTo(EtapePlanifAGModele o) {
        return this.getNumeroOrdre().compareTo(o.getNumeroOrdre());
    }
    
    
}
