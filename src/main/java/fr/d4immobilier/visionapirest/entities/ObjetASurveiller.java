/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gilles
 */
@Entity
public class ObjetASurveiller implements Serializable {
    @OneToMany(mappedBy = "objetASurveiller",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SurveillanceObjets> surveillancesObjets;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idObjetASurveiller;
    private String classeObjet;
    private Instant dateDerniereMiseAJour;
    private Long idCopropriete;
    private Long idPersonneModifiant;
    private Long idAuteur;
    private Boolean visibleParTous;

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
        if (!(object instanceof ObjetASurveiller)) {
            return false;
        }
        ObjetASurveiller other = (ObjetASurveiller) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ObjetASurveiller[id=" + id + "]";
    }

    /**
     * @return the idObjetASurveiller
     */
    public Long getIdObjetASurveiller() {
        return idObjetASurveiller;
    }

    /**
     * @param idObjetASurveiller the idObjetASurveiller to set
     */
    public void setIdObjetASurveiller(Long idObjetASurveiller) {
        this.idObjetASurveiller = idObjetASurveiller;
    }

    /**
     * @return the classeObjet
     */
    public String getClasseObjet() {
        return classeObjet;
    }

    /**
     * @param classeObjet the classeObjet to set
     */
    public void setClasseObjet(String classeObjet) {
        this.classeObjet = classeObjet;
    }

    /**
     * @return the dateDerniereMiseAJour
     */
    public Instant getDateDerniereMiseAJour() {
        return dateDerniereMiseAJour;
    }

    /**
     * @param dateDerniereMiseAJour the dateDerniereMiseAJour to set
     */
    public void setDateDerniereMiseAJour(Instant dateDerniereMiseAJour) {
        this.dateDerniereMiseAJour = dateDerniereMiseAJour;
    }

    /**
     * @return the idCopropriete
     */
    public Long getIdCopropriete() {
        return idCopropriete;
    }

    /**
     * @param idCopropriete the idCopropriete to set
     */
    public void setIdCopropriete(Long idCopropriete) {
        this.idCopropriete = idCopropriete;
    }

    /**
     * @return the idPersonneModifiant
     */
    public Long getIdPersonneModifiant() {
        return idPersonneModifiant;
    }

    /**
     * @param idPersonneModifiant the idPersonneModifiant to set
     */
    public void setIdPersonneModifiant(Long idPersonneModifiant) {
        this.idPersonneModifiant = idPersonneModifiant;
    }

    /**
     * @return the idAuteur
     */
    public Long getIdAuteur() {
        return idAuteur;
    }

    /**
     * @param idAuteur the idAuteur to set
     */
    public void setIdAuteur(Long idAuteur) {
        this.idAuteur = idAuteur;
    }

    /**
     * @return the visibleParTous
     */
    public Boolean getVisibleParTous() {
        return visibleParTous;
    }

    /**
     * @param visibleParTous the visibleParTous to set
     */
    public void setVisibleParTous(Boolean visibleParTous) {
        this.visibleParTous = visibleParTous;
    }

    /**
     * @return the surveillancesObjets
     */
    public List<SurveillanceObjets> getSurveillancesObjets() {
        return surveillancesObjets;
    }

    /**
     * @param surveillancesObjets the surveillancesObjets to set
     */
    public void setSurveillancesObjets(List<SurveillanceObjets> surveillancesObjets) {
        this.surveillancesObjets = surveillancesObjets;
    }

}
