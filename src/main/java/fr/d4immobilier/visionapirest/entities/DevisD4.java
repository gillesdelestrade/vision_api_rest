/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */

@Entity
public class DevisD4 extends Document implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

    private StatutDevis statutDevis;



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevisD4)) {
            return false;
        }
        DevisD4 other = (DevisD4) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Devis[id=" + getId() + "]";
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
     * @return the statutDevis
     */
    public StatutDevis getStatutDevis() {
        return statutDevis;
    }

    /**
     * @param statutDevis the statutDevis to set
     */
    public void setStatutDevis(StatutDevis statutDevis) {
        this.statutDevis = statutDevis;
    }

}
