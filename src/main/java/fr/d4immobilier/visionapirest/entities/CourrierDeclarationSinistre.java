/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class CourrierDeclarationSinistre extends CourrierDemande implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @OneToOne(fetch = FetchType.LAZY)
    private Sinistre sinistre;

    

    @Override
    public String toString() {
        return "Declaration Sinistre " + getTitre();
    }

    /**
     * @return the sinistre
     */
    public Sinistre getSinistre() {
        return sinistre;
    }

    /**
     * @param sinistre the sinistre to set
     */
    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

}
