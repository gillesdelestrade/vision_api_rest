/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ReunionV2 extends Reunion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "reunionV2", fetch = FetchType.LAZY)
    private List<EvenementDemande> evenementsDemande;
    @OneToMany(mappedBy = "reunionV2", fetch = FetchType.LAZY)
    private List<FichierDemande> fichiersDemande;
    @OneToMany(mappedBy = "reunionV2", fetch = FetchType.LAZY)
    private List<ActionDemande> actionsDemande;
    
    private TypeReunion typeReunion;

    /**
     * @return the evenementsDemande
     */
    public List<EvenementDemande> getEvenementsDemande() {
        return evenementsDemande;
    }

    /**
     * @param evenementsDemande the evenementsDemande to set
     */
    public void setEvenementsDemande(List<EvenementDemande> evenementsDemande) {
        this.evenementsDemande = evenementsDemande;
    }

    /**
     * @return the fichiersDemande
     */
    public List<FichierDemande> getFichiersDemande() {
        return fichiersDemande;
    }

    /**
     * @param fichiersDemande the fichiersDemande to set
     */
    public void setFichiersDemande(List<FichierDemande> fichiersDemande) {
        this.fichiersDemande = fichiersDemande;
    }

    /**
     * @return the actionsDemande
     */
    public List<ActionDemande> getActionsDemande() {
        return actionsDemande;
    }

    /**
     * @param actionsDemande the actionsDemande to set
     */
    public void setActionsDemande(List<ActionDemande> actionsDemande) {
        this.actionsDemande = actionsDemande;
    }

    /**
     * @return the typeReunion
     */
    public TypeReunion getTypeReunion() {
        return typeReunion;
    }

    /**
     * @param typeReunion the typeReunion to set
     */
    public void setTypeReunion(TypeReunion typeReunion) {
        this.typeReunion = typeReunion;
    }
    
}
