/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ARappeler implements Serializable, Comparable<ARappeler> {
    @OneToMany(mappedBy = "aRappeler",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Rappel> rappels;
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate dateButoire;
    
    @Column(length=1024)
    private String postIt;
    
    @Column(length=1024)
    private String consigne;
    
    private Boolean actif;
    private Boolean ack;
    

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
        if (!(object instanceof ARappeler)) {
            return false;
        }
        ARappeler other = (ARappeler) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDateButoire().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    /**
     * @return the dateButoire
     */
    public LocalDate getDateButoire() {
        return dateButoire;
    }

    /**
     * @param dateButoire the dateButoire to set
     */
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    /**
     * @return the postIt
     */
    public String getPostIt() {
        return postIt;
    }

    /**
     * @param postIt the postIt to set
     */
    public void setPostIt(String postIt) {
        this.postIt = postIt;
    }

    /**
     * @return the consigne
     */
    public String getConsigne() {
        return consigne;
    }

    /**
     * @param consigne the consigne to set
     */
    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    /**
     * @return the rappels
     */
    public List<Rappel> getRappels() {
        return rappels;
    }

    /**
     * @param rappels the rappels to set
     */
    public void setRappels(List<Rappel> rappels) {
        this.rappels = rappels;
    }

    /**
     * @return the actif
     */
    public Boolean getActif() {
        return actif;
    }

    /**
     * @param actif the actif to set
     */
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    @Override
    public int compareTo(ARappeler t) {
        return getDateButoire().compareTo(t.getDateButoire());
    }

    /**
     * @return the ack
     */
    public Boolean getAck() {
        return ack;
    }

    /**
     * @param ack the ack to set
     */
    public void setAck(Boolean ack) {
        this.ack = ack;
    }
    
}
