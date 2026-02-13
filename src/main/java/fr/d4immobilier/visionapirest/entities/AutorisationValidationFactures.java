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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class AutorisationValidationFactures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private ConseilSyndical conseilSyndical;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne personne;
    private Boolean autoriseAValiderLesFactures;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;

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
        if (!(object instanceof AutorisationValidationFactures)) {
            return false;
        }
        AutorisationValidationFactures other = (AutorisationValidationFactures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.AutorisationValidation[id=" + id + "]";
    }

    /**
     * @return the conseilSyndical
     */
    public ConseilSyndical getConseilSyndical() {
        return conseilSyndical;
    }

    /**
     * @param conseilSyndical the conseilSyndical to set
     */
    public void setConseilSyndical(ConseilSyndical conseilSyndical) {
        this.conseilSyndical = conseilSyndical;
    }

    /**
     * @return the personne
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * @param personne the personne to set
     */
    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    /**
     * @return the autoriseAValiderLesFactures
     */
    public Boolean getAutoriseAValiderLesFactures() {
        return autoriseAValiderLesFactures;
    }

    /**
     * @param autoriseAValiderLesFactures the autoriseAValiderLesFactures to set
     */
    public void setAutoriseAValiderLesFactures(Boolean autoriseAValiderLesFactures) {
        this.autoriseAValiderLesFactures = autoriseAValiderLesFactures;
    }

    /**
     * @return the societe
     */
    public Societe getSociete() {
        return societe;
    }

    /**
     * @param societe the societe to set
     */
    public void setSociete(Societe societe) {
        this.societe = societe;
    }

}
