/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class RegroupementLignesFacturation implements Serializable {
    @OneToOne(mappedBy = "regroupementLignesFacturation", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private Courrier courrier;
    @OneToMany(mappedBy = "regroupementLignesFacturation", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LigneFacturation> lignesFacturation;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    @ManyToOne(fetch = FetchType.LAZY)
    private FactureD4 factureD4;

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
        if (!(object instanceof RegroupementLignesFacturation)) {
            return false;
        }
        RegroupementLignesFacturation other = (RegroupementLignesFacturation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RLF = " + getIntitule();
    }

    /**
     * @return the intitule
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * @param intitule the intitule to set
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     * @return the factureD4
     */
    public FactureD4 getFactureD4() {
        return factureD4;
    }

    /**
     * @param factureD4 the factureD4 to set
     */
    public void setFactureD4(FactureD4 factureD4) {
        this.factureD4 = factureD4;
    }

    /**
     * @return the lignesFacturation
     */
    public List<LigneFacturation> getLignesFacturation() {
        return lignesFacturation;
    }

    /**
     * @param lignesFacturation the lignesFacturation to set
     */
    public void setLignesFacturation(List<LigneFacturation> lignesFacturation) {
        this.lignesFacturation = lignesFacturation;
    }

    /**
     * @return the courrier
     */
    public Courrier getCourrier() {
        return courrier;
    }

    /**
     * @param courrier the courrier to set
     */
    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }
    
}
