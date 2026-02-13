/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PrestationAssureeParUnCoproprietaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private PrestationContrat prestationContrat;
    
    

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
        if (!(object instanceof PrestationAssureeParUnCoproprietaire)) {
            return false;
        }
        PrestationAssureeParUnCoproprietaire other = (PrestationAssureeParUnCoproprietaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PrestationAssureeParUnCoproprietaire[ id=" + id + " ]";
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
     * @return the prestationContrat
     */
    public PrestationContrat getPrestationContrat() {
        return prestationContrat;
    }

    /**
     * @param prestationContrat the prestationContrat to set
     */
    public void setPrestationContrat(PrestationContrat prestationContrat) {
        this.prestationContrat = prestationContrat;
    }
    
}
