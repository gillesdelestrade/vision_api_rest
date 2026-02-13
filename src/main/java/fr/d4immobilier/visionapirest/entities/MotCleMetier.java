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
public class MotCleMetier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private MotPertinent motPertinent;
    @ManyToOne(fetch = FetchType.LAZY)
    private Metier metier;
    private ImportanceMotCle importanceMotCle;

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
        if (!(object instanceof MotCleMetier)) {
            return false;
        }
        MotCleMetier other = (MotCleMetier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getMotPertinent().toString();
    }

    /**
     * @return the motPertinent
     */
    public MotPertinent getMotPertinent() {
        return motPertinent;
    }

    /**
     * @param motPertinent the motPertinent to set
     */
    public void setMotPertinent(MotPertinent motPertinent) {
        this.motPertinent = motPertinent;
    }

    /**
     * @return the metier
     */
    public Metier getMetier() {
        return metier;
    }

    /**
     * @param metier the metier to set
     */
    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    /**
     * @return the importanceMotCle
     */
    public ImportanceMotCle getImportanceMotCle() {
        return importanceMotCle;
    }

    /**
     * @param importanceMotCle the importanceMotCle to set
     */
    public void setImportanceMotCle(ImportanceMotCle importanceMotCle) {
        this.importanceMotCle = importanceMotCle;
    }
    
}
