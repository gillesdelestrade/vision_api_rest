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
public class Rappel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ARappeler aRappeler;
    private LocalDate dateRappel;
    

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
        if (!(object instanceof Rappel)) {
            return false;
        }
        Rappel other = (Rappel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (dateRappel != null) {
            return "Rappel effectué le " + dateRappel.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } else {
            return "Rappel indéterminé";
        }
    }

    /**
     * @return the aRappeler
     */
    public ARappeler getARappeler() {
        return aRappeler;
    }

    /**
     * @param aRappeler the aRappeler to set
     */
    public void setARappeler(ARappeler aRappeler) {
        this.aRappeler = aRappeler;
    }

    /**
     * @return the dateRappel
     */
    public LocalDate getDateRappel() {
        return dateRappel;
    }

    /**
     * @param dateRappel the dateRappel to set
     */
    public void setDateRappel(LocalDate dateRappel) {
        this.dateRappel = dateRappel;
    }
}
