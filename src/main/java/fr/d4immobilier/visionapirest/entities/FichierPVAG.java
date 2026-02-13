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
public class FichierPVAG extends Fichier {
    @OneToOne(fetch = FetchType.LAZY)
    private PVAG pvag;

    /**
     * @return the pvag
     */
    public PVAG getPvag() {
        return pvag;
    }

    /**
     * @param pvag the pvag to set
     */
    public void setPvag(PVAG pvag) {
        this.pvag = pvag;
    }

}
