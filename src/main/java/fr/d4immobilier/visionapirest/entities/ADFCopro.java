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
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ADFCopro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private CampagneADF campagneADF;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Fichier> fichiersADF;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Fichier> fichiersAnnexes;
    private LocalDate dateDepotFichierADF;
    private LocalDate dateDepotFichierAnnexe;
    private LocalDate dateFichierADFTraite;
    @ManyToOne(fetch = FetchType.LAZY)
    private SessionTraitementADF sessionTraitementADF;

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
        if (!(object instanceof ADFCopro)) {
            return false;
        }
        ADFCopro other = (ADFCopro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ADFCopro[ id=" + id + " ]";
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
     * @return the campagneADF
     */
    public CampagneADF getCampagneADF() {
        return campagneADF;
    }

    /**
     * @param campagneADF the campagneADF to set
     */
    public void setCampagneADF(CampagneADF campagneADF) {
        this.campagneADF = campagneADF;
    }

    /**
     * @return the fichiersADF
     */
    public List<Fichier> getFichiersADF() {
        return fichiersADF;
    }

    /**
     * @param fichiersADF the fichiersADF to set
     */
    public void setFichiersADF(List<Fichier> fichiersADF) {
        this.fichiersADF = fichiersADF;
    }

    /**
     * @return the fichiersAnnexes
     */
    public List<Fichier> getFichiersAnnexes() {
        return fichiersAnnexes;
    }

    /**
     * @param fichiersAnnexes the fichiersAnnexes to set
     */
    public void setFichiersAnnexes(List<Fichier> fichiersAnnexes) {
        this.fichiersAnnexes = fichiersAnnexes;
    }

    /**
     * @return the dateDepotFichierADF
     */
    public LocalDate getDateDepotFichierADF() {
        return dateDepotFichierADF;
    }

    /**
     * @param dateDepotFichierADF the dateDepotFichierADF to set
     */
    public void setDateDepotFichierADF(LocalDate dateDepotFichierADF) {
        this.dateDepotFichierADF = dateDepotFichierADF;
    }

    /**
     * @return the dateDepotFichierAnnexe
     */
    public LocalDate getDateDepotFichierAnnexe() {
        return dateDepotFichierAnnexe;
    }

    /**
     * @param dateDepotFichierAnnexe the dateDepotFichierAnnexe to set
     */
    public void setDateDepotFichierAnnexe(LocalDate dateDepotFichierAnnexe) {
        this.dateDepotFichierAnnexe = dateDepotFichierAnnexe;
    }

    /**
     * @return the dateFichierADFTraite
     */
    public LocalDate getDateFichierADFTraite() {
        return dateFichierADFTraite;
    }

    /**
     * @param dateFichierADFTraite the dateFichierADFTraite to set
     */
    public void setDateFichierADFTraite(LocalDate dateFichierADFTraite) {
        this.dateFichierADFTraite = dateFichierADFTraite;
    }

    /**
     * @return the sessionTraitementADF
     */
    public SessionTraitementADF getSessionTraitementADF() {
        return sessionTraitementADF;
    }

    /**
     * @param sessionTraitementADF the sessionTraitementADF to set
     */
    public void setSessionTraitementADF(SessionTraitementADF sessionTraitementADF) {
        this.sessionTraitementADF = sessionTraitementADF;
    }
    
}
