/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PassageOblige implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Integer jourSemaine;
    private Integer heureDebut;
    private Integer minutesDebut;
    private Integer heureFin;
    private Integer minutesFin;

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
        if (!(object instanceof PassageOblige)) {
            return false;
        }
        PassageOblige other = (PassageOblige) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PassageOblige[ id=" + id + " ]";
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
     * @return the jourSemaine
     */
    public Integer getJourSemaine() {
        return jourSemaine;
    }

    /**
     * @param jourSemaine the jourSemaine to set
     */
    public void setJourSemaine(Integer jourSemaine) {
        this.jourSemaine = jourSemaine;
    }

    /**
     * @return the heureDebut
     */
    public Integer getHeureDebut() {
        return heureDebut;
    }

    /**
     * @param heureDebut the heureDebut to set
     */
    public void setHeureDebut(Integer heureDebut) {
        this.heureDebut = heureDebut;
    }

    /**
     * @return the minutesDebut
     */
    public Integer getMinutesDebut() {
        return minutesDebut;
    }

    /**
     * @param minutesDebut the minutesDebut to set
     */
    public void setMinutesDebut(Integer minutesDebut) {
        this.minutesDebut = minutesDebut;
    }

    /**
     * @return the heureFin
     */
    public Integer getHeureFin() {
        return heureFin;
    }

    /**
     * @param heureFin the heureFin to set
     */
    public void setHeureFin(Integer heureFin) {
        this.heureFin = heureFin;
    }

    /**
     * @return the minutesFin
     */
    public Integer getMinutesFin() {
        return minutesFin;
    }

    /**
     * @param minutesFin the minutesFin to set
     */
    public void setMinutesFin(Integer minutesFin) {
        this.minutesFin = minutesFin;
    }
    
    
    public String getDuree() {
        String s = "";
        int nbMinutesDebut = heureDebut * 60 + minutesDebut;
        int nbMinutesFin = heureFin * 60 + minutesFin;
        
        int nbMinutesTotal = nbMinutesFin - nbMinutesDebut;
        
        if (nbMinutesTotal > 60) {
            s = (nbMinutesTotal / 60) + "h " + (nbMinutesTotal%60) + "min";
        } else {
            s = nbMinutesTotal + " min";
        }
        return s;
    }
    
    public String getWidth() {
        
        int nbMinutesDebut = heureDebut * 60 + minutesDebut;
        int nbMinutesFin = heureFin * 60 + minutesFin;
        
        int nbMinutesTotal = nbMinutesFin - nbMinutesDebut;
        
        Float f = ((float) nbMinutesTotal)/6f;
        return new DecimalFormat("0.00").format(f) + "%";
    }
    
    public String getMarginLeft() {
        int nbMinutesDebut = heureDebut * 60 + minutesDebut;
        int nbMinutesDebutjournee = 9 * 60;
        
        Float f = ((float)(nbMinutesDebut - nbMinutesDebutjournee)) / 6f; // 9h-19h = 10h = 600 minutes / 100 pour le pourcentage, donc 6f
        
        return new DecimalFormat("0.00").format(f) + "%";
        
    }
}
