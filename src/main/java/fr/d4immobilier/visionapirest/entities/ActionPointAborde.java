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
 * @author gilles
 */
@Entity
public class ActionPointAborde extends Action implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    private PointAborde pointAborde;

    /**
     * @return the pointAborde
     */
    public PointAborde getPointAborde() {
        return pointAborde;
    }

    /**
     * @param pointAborde the pointAborde to set
     */
    public void setPointAborde(PointAborde pointAborde) {
        this.pointAborde = pointAborde;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ActionPointAborde)) {
            return false;
        }
        ActionPointAborde other = (ActionPointAborde) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        
        if (this.getId() == null && other.getId() == null && this.getLibelle()!= null) {
            return this.getLibelle().equals(other.getLibelle());
        }
        return true;
    }

    
    

}
