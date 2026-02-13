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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Tantieme implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    private Lot lot;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeTantieme typeTantieme;
    private Float quotePart;
    @ManyToOne(fetch = FetchType.LAZY)
    private Batiment batiment;

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
        if (!(object instanceof Tantieme)) {
            return false;
        }
        Tantieme other = (Tantieme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Tantieme[id=" + id + "]";
    }

    /**
     * @return the typeTantieme
     */
    public TypeTantieme getTypeTantieme() {
        return typeTantieme;
    }

    /**
     * @param typeTantieme the typeTantieme to set
     */
    public void setTypeTantieme(TypeTantieme typeTantieme) {
        this.typeTantieme = typeTantieme;
    }

    /**
     * @return the quotePart
     */
    public Float getQuotePart() {
        return quotePart;
    }

    /**
     * @param quotePart the quotePart to set
     */
    public void setQuotePart(Float quotePart) {
        this.quotePart = quotePart;
    }

    /**
     * @return the lot
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * @param lot the lot to set
     */
    public void setLot(Lot lot) {
        this.lot = lot;
    }

    /**
     * @return the batiment
     */
    public Batiment getBatiment() {
        return batiment;
    }

    /**
     * @param batiment the batiment to set
     */
    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }

}
