/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PartChequeCoproprietaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Cheque cheque;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    private Float montantPart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartChequeCoproprietaire)) {
            return false;
        }
        PartChequeCoproprietaire other = (PartChequeCoproprietaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PartChequeCoproprietaire[id=" + id + "]";
    }

    /**
     * @return the cheque
     */
    public Cheque getCheque() {
        return cheque;
    }

    /**
     * @param cheque the cheque to set
     */
    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    /**
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the montantPart
     */
    public Float getMontantPart() {
        return montantPart;
    }

    /**
     * @param montantPart the montantPart to set
     */
    public void setMontantPart(Float montantPart) {
        this.montantPart = montantPart;
    }

}
