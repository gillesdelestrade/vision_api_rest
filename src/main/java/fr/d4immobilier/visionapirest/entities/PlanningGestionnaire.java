/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PlanningGestionnaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate datePlanning;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire gestionnaire;
    private DemiJournee demiJournee;
    private MotifAbsenceGestionnaire motifAbsenceGestionnaire;
    private String log;
    

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
        if (!(object instanceof PlanningGestionnaire)) {
            return false;
        }
        PlanningGestionnaire other = (PlanningGestionnaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PresenceGestionnaire[ id=" + id + " ]";
    }

    /**
     * @return the datePlanning
     */
    public LocalDate getDatePlanning() {
        return datePlanning;
    }

    /**
     * @param datePlanning the datePlanning to set
     */
    public void setDatePlanning(LocalDate datePlanning) {
        this.datePlanning = datePlanning;
    }

    /**
     * @return the gestionnaire
     */
    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    /**
     * @param gestionnaire the gestionnaire to set
     */
    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    /**
     * @return the demiJournee
     */
    public DemiJournee getDemiJournee() {
        return demiJournee;
    }

    /**
     * @param demiJournee the demiJournee to set
     */
    public void setDemiJournee(DemiJournee demiJournee) {
        this.demiJournee = demiJournee;
    }

    /**
     * @return the motifAbsenceGestionnaire
     */
    public MotifAbsenceGestionnaire getMotifAbsenceGestionnaire() {
        return motifAbsenceGestionnaire;
    }

    /**
     * @param motifAbsenceGestionnaire the motifAbsenceGestionnaire to set
     */
    public void setMotifAbsenceGestionnaire(MotifAbsenceGestionnaire motifAbsenceGestionnaire) {
        this.motifAbsenceGestionnaire = motifAbsenceGestionnaire;
    }

    /**
     * @return the log
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(String log) {
        this.log = log;
    }
    
}
