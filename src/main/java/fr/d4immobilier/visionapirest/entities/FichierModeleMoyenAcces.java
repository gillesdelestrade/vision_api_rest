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
public class FichierModeleMoyenAcces extends Fichier implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @OneToOne(fetch = FetchType.LAZY)
    private ModeleMoyenAcces modeleMoyenAcces;

    

    @Override
    public String toString() {
        return getNomFichier();
    }

    /**
     * @return the modeleMoyenAcces
     */
    public ModeleMoyenAcces getModeleMoyenAcces() {
        return modeleMoyenAcces;
    }

    /**
     * @param modeleMoyenAcces the modeleMoyenAcces to set
     */
    public void setModeleMoyenAcces(ModeleMoyenAcces modeleMoyenAcces) {
        this.modeleMoyenAcces = modeleMoyenAcces;
    }




}
