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
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
@NamedQuery(name=PositionCompteEnBanque.NQ_GET_POSITION_EN_ORDRE,query="select p from PositionCompteEnBanque p where p.compteEnBanque.id=:id and p.datePosition>:date order by p.datePosition asc")

})
public class PositionCompteEnBanque implements Serializable {
    public static final transient String NQ_GET_POSITION_EN_ORDRE  = "getPositionsEnOrdre";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private CompteEnBanque compteEnBanque;
    private LocalDate datePosition;
    private Double position;

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
        if (!(object instanceof PositionCompteEnBanque)) {
            return false;
        }
        PositionCompteEnBanque other = (PositionCompteEnBanque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Position " + ((CompteEnBanqueCopropriete)getCompteEnBanque()).getCopropriete().getTrigramme() + " " + getPosition();
    }

    /**
     * @return the datePosition
     */
    public LocalDate getDatePosition() {
        return datePosition;
    }

    /**
     * @param datePosition the datePosition to set
     */
    public void setDatePosition(LocalDate datePosition) {
        this.datePosition = datePosition;
    }

    /**
     * @return the compteEnBanque
     */
    public CompteEnBanque getCompteEnBanque() {
        return compteEnBanque;
    }

    /**
     * @param compteEnBanque the compteEnBanque to set
     */
    public void setCompteEnBanque(CompteEnBanque compteEnBanque) {
        this.compteEnBanque = compteEnBanque;
    }

    /**
     * @return the position
     */
    public Double getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Double position) {
        this.position = position;
    }

}
