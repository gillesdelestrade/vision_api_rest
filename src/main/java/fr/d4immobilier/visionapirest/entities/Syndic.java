/*
 * To change this template, choose Tools | Templates
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
public class Syndic extends Societe implements Serializable  {
    @OneToMany(mappedBy = "syndic", fetch = FetchType.LAZY)
    private List<Copropriete> coproprietes;
    private static final long serialVersionUID = 1L;

    /**
     * @return the coproprietes
     */
    public List<Copropriete> getCoproprietes() {
        return coproprietes;
    }

    /**
     * @param coproprietes the coproprietes to set
     */
    public void setCoproprietes(List<Copropriete> coproprietes) {
        this.coproprietes = coproprietes;
    }
    

}
