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
public class FichierContrat extends Fichier implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    private ContratFournisseur contratFournisseur;

    /**
     * @return the contratFournisseur
     */
    public ContratFournisseur getContratFournisseur() {
        return contratFournisseur;
    }

    /**
     * @param contratFournisseur the contratFournisseur to set
     */
    public void setContratFournisseur(ContratFournisseur contratFournisseur) {
        this.contratFournisseur = contratFournisseur;
    }

    @Override
    public String toString() {
        return getNomFichier();
    }




}
