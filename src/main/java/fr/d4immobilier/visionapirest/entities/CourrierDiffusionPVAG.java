/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class CourrierDiffusionPVAG extends Courrier {
    @ManyToOne(fetch = FetchType.LAZY)
    private PVAG pvag;
    @OneToMany(fetch = FetchType.LAZY)
    private transient List<Coproprietaire> coproprietaires;

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

    /**
     * @return the coproprietaires
     */
    public List<Coproprietaire> getCoproprietaires() {
        return coproprietaires;
    }

    /**
     * @param coproprietaires the coproprietaires to set
     */
    public void setCoproprietaires(List<Coproprietaire> coproprietaires) {
        this.coproprietaires = coproprietaires;
    }
    
}
