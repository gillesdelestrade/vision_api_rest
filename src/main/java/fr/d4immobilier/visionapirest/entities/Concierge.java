/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Concierge.NQ_GET_CONCIERGE_BY_NOM, query = "select c from Concierge c where lower(c.nom) like :fragmentNom")
    })

public class Concierge extends Personne implements Serializable {
    
    private static final long serialVersionUID = 1L;
    public final static transient String NQ_GET_CONCIERGE_BY_NOM = "getConciergeByNom";

    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private String numeroAdherentMedecineDuTravail;

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

    /**
     * @return the numeroAdherentMedecineDuTravail
     */
    public String getNumeroAdherentMedecineDuTravail() {
        return numeroAdherentMedecineDuTravail;
    }

    /**
     * @param numeroAdherentMedecineDuTravail the numeroAdherentMedecineDuTravail to set
     */
    public void setNumeroAdherentMedecineDuTravail(String numeroAdherentMedecineDuTravail) {
        this.numeroAdherentMedecineDuTravail = numeroAdherentMedecineDuTravail;
    }

}
