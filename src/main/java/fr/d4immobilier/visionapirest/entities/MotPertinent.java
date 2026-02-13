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
public class MotPertinent implements Serializable {
    @OneToOne(mappedBy = "motPertinent", fetch = FetchType.LAZY)
    private MotCleFournisseur motCleFournisseur;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mot;

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
        if (!(object instanceof MotPertinent)) {
            return false;
        }
        MotPertinent other = (MotPertinent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getMot();
    }

    /**
     * @return the mot
     */
    public String getMot() {
        return mot;
    }

    /**
     * @param mot the mot to set
     */
    public void setMot(String mot) {
        this.mot = mot;
    }
    
}
