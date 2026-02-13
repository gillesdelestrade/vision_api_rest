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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EtapePlanifAG implements Serializable,Comparable<EtapePlanifAG> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Assemblee assemblee;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtapePlanifAGModele etapePlanifAGModele;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire acteur;
    @OneToMany(fetch = FetchType.LAZY)
    private List<EtapePlanifAG> predecesseurs;
    private Instant dateCible;
    private Instant dateRealisation;
    @OneToMany(mappedBy = "etapePlanifAG", fetch = FetchType.LAZY)
    private List<HistoriqueModificationEtapePlanifAG> historiquesModification;
    private Instant dateDebut;
    private Integer pourcentageAvancement;
    private Integer dureeReelle;

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
        if (!(object instanceof EtapePlanifAG)) {
            return false;
        }
        EtapePlanifAG other = (EtapePlanifAG) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EtapePlanifAG[ id=" + id + " ]";
    }

    /**
     * @return the assemblee
     */
    public Assemblee getAssemblee() {
        return assemblee;
    }

    /**
     * @param assemblee the assemblee to set
     */
    public void setAssemblee(Assemblee assemblee) {
        this.assemblee = assemblee;
    }

    /**
     * @return the etapePlanifAGModele
     */
    public EtapePlanifAGModele getEtapePlanifAGModele() {
        return etapePlanifAGModele;
    }

    /**
     * @param etapePlanifAGModele the etapePlanifAGModele to set
     */
    public void setEtapePlanifAGModele(EtapePlanifAGModele etapePlanifAGModele) {
        this.etapePlanifAGModele = etapePlanifAGModele;
    }

    /**
     * @return the acteur
     */
    public Gestionnaire getActeur() {
        return acteur;
    }

    /**
     * @param acteur the acteur to set
     */
    public void setActeur(Gestionnaire acteur) {
        this.acteur = acteur;
    }

    /**
     * @return the predecesseurs
     */
    public List<EtapePlanifAG> getPredecesseurs() {
        return predecesseurs;
    }

    /**
     * @param predecesseurs the predecesseurs to set
     */
    public void setPredecesseurs(List<EtapePlanifAG> predecesseurs) {
        this.predecesseurs = predecesseurs;
    }

    /**
     * @return the dateCible
     */
    public Instant getDateCible() {
        return dateCible;
    }

    /**
     * @param dateCible the dateCible to set
     */
    public void setDateCible(Instant dateCible) {
        this.dateCible = dateCible;
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
     * @return the historiquesModification
     */
    public List<HistoriqueModificationEtapePlanifAG> getHistoriquesModification() {
        return historiquesModification;
    }

    /**
     * @param historiquesModification the historiquesModification to set
     */
    public void setHistoriquesModification(List<HistoriqueModificationEtapePlanifAG> historiquesModification) {
        this.historiquesModification = historiquesModification;
    }

    /**
     * @return the dateDebut
     */
    public Instant getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Instant dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the pourcentageAvancement
     */
    public Integer getPourcentageAvancement() {
        return pourcentageAvancement;
    }

    /**
     * @param pourcentageAvancement the pourcentageAvancement to set
     */
    public void setPourcentageAvancement(Integer pourcentageAvancement) {
        this.pourcentageAvancement = pourcentageAvancement;
    }

    @Override
    public int compareTo(EtapePlanifAG o) {
        return this.getEtapePlanifAGModele().getNumeroOrdre().compareTo(o.getEtapePlanifAGModele().getNumeroOrdre());
    }

    /**
     * @return the dureeReelle
     */
    public Integer getDureeReelle() {
        return dureeReelle;
    }

    /**
     * @param dureeReelle the dureeReelle to set
     */
    public void setDureeReelle(Integer dureeReelle) {
        this.dureeReelle = dureeReelle;
    }
    
}
