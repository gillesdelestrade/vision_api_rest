/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ARappelerCourrier extends ARappeler {
    
    
    
    @OneToOne(fetch = FetchType.LAZY)
    private Courrier courrier;

    /**
     * @return the courrier
     */
    public Courrier getCourrier() {
        return courrier;
    }

    /**
     * @param courrier the courrier to set
     */
    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }
    
}
