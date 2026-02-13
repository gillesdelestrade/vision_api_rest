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
public class FichierReunion extends Fichier implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Reunion reunion;
    @ManyToOne(fetch = FetchType.LAZY)
    private PointAborde pointAborde;

    /**
     * @return the reunion
     */
    public Reunion getReunion() {
        return reunion;
    }

    /**
     * @param reunion the reunion to set
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

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
    
}
