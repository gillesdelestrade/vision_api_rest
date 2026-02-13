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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EtapeDemande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelleEnCours;
    private String libelleTermine;
    private String classeConcernee;
    private String libelleEtape;
    private Float ordre;
    private ActionEtapeDemande actionEtapeDemande;
    private Boolean clotureManuelleNecessaire;
    

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
        if (!(object instanceof EtapeDemande)) {
            return false;
        }
        EtapeDemande other = (EtapeDemande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EtapeDemande[ id=" + id + " ]";
    }


    /**
     * @return the classeConcernee
     */
    public String getClasseConcernee() {
        return classeConcernee;
    }

    /**
     * @param classeConcernee the classeConcernee to set
     */
    public void setClasseConcernee(String classeConcernee) {
        this.classeConcernee = classeConcernee;
    }

    /**
     * @return the ordre
     */
    public Float getOrdre() {
        return ordre;
    }

    /**
     * @param ordre the ordre to set
     */
    public void setOrdre(Float ordre) {
        this.ordre = ordre;
    }

    /**
     * @return the libelleEnCours
     */
    public String getLibelleEnCours() {
        return libelleEnCours;
    }

    /**
     * @param libelleEnCours the libelleEnCours to set
     */
    public void setLibelleEnCours(String libelleEnCours) {
        this.libelleEnCours = libelleEnCours;
    }

    /**
     * @return the libelleTermine
     */
    public String getLibelleTermine() {
        return libelleTermine;
    }

    /**
     * @param libelleTermine the libelleTermine to set
     */
    public void setLibelleTermine(String libelleTermine) {
        this.libelleTermine = libelleTermine;
    }

    /**
     * @return the actionEtapeDemande
     */
    public ActionEtapeDemande getActionEtapeDemande() {
        return actionEtapeDemande;
    }

    /**
     * @param actionEtapeDemande the actionEtapeDemande to set
     */
    public void setActionEtapeDemande(ActionEtapeDemande actionEtapeDemande) {
        this.actionEtapeDemande = actionEtapeDemande;
    }

    /**
     * @return the libelleEtape
     */
    public String getLibelleEtape() {
        return libelleEtape;
    }

    /**
     * @param libelleEtape the libelleEtape to set
     */
    public void setLibelleEtape(String libelleEtape) {
        this.libelleEtape = libelleEtape;
    }

    /**
     * @return the clotureManuelleNecessaire
     */
    public Boolean getClotureManuelleNecessaire() {
        return clotureManuelleNecessaire;
    }

    /**
     * @param clotureManuelleNecessaire the clotureManuelleNecessaire to set
     */
    public void setClotureManuelleNecessaire(Boolean clotureManuelleNecessaire) {
        this.clotureManuelleNecessaire = clotureManuelleNecessaire;
    }
    
}
