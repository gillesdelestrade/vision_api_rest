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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class SuppressionFraisDeRelance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private LocalDate dateDemandeSuppression;
    private String motif;
    private Boolean fraisSupprimes;

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
        if (!(object instanceof SuppressionFraisDeRelance)) {
            return false;
        }
        SuppressionFraisDeRelance other = (SuppressionFraisDeRelance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (dateDemandeSuppression != null) {
            String s = dateDemandeSuppression.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (fraisSupprimes == null || fraisSupprimes.equals(Boolean.FALSE)) {
                s = s + " refusée";
            } else {
                s = s + " accordée";
            }
            return s;
        } else {
            return "Nouvelle Demande";
        }
        
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
     * @return the dateDemandeSuppression
     */
    public LocalDate getDateDemandeSuppression() {
        return dateDemandeSuppression;
    }

    /**
     * @param dateDemandeSuppression the dateDemandeSuppression to set
     */
    public void setDateDemandeSuppression(LocalDate dateDemandeSuppression) {
        this.dateDemandeSuppression = dateDemandeSuppression;
    }

    /**
     * @return the motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * @param motif the motif to set
     */
    public void setMotif(String motif) {
        this.motif = motif;
    }

    /**
     * @return the fraisSupprimes
     */
    public Boolean getFraisSupprimes() {
        return fraisSupprimes;
    }

    /**
     * @param fraisSupprimes the fraisSupprimes to set
     */
    public void setFraisSupprimes(Boolean fraisSupprimes) {
        this.fraisSupprimes = fraisSupprimes;
    }
    
    
    
}
