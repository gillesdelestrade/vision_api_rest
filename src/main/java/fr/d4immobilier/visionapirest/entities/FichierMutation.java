/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class FichierMutation extends Fichier implements Serializable  {
    private static final long serialVersionUID = 1L;
    
    private TypeFichierMutation typeFichierMutation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

    /**
     * @return the typeFichierMutation
     */
    public TypeFichierMutation getTypeFichierMutation() {
        return typeFichierMutation;
    }

    /**
     * @param typeFichierMutation the typeFichierMutation to set
     */
    public void setTypeFichierMutation(TypeFichierMutation typeFichierMutation) {
        this.typeFichierMutation = typeFichierMutation;
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
    
    
}
