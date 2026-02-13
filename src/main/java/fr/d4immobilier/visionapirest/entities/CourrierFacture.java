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
public class CourrierFacture extends Courrier implements Serializable {

    public static final transient String COMMENTAIRE_COURRIER = "Envoi de courrier ";

    @ManyToOne(fetch = FetchType.LAZY)
    private FactureFournisseur factureFournisseur;

    /**
     * @return the factureFournisseur
     */
    public FactureFournisseur getFactureFournisseur() {
        return factureFournisseur;
    }

    /**
     * @param factureFournisseur the factureFournisseur to set
     */
    public void setFactureFournisseur(FactureFournisseur factureFournisseur) {
        this.factureFournisseur = factureFournisseur;
    }



}
