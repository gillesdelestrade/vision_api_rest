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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MoyenAccesCatalogueQuantite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private MoyenAccesCatalogue moyenAccesCatalogue;
    private Integer quantite;

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
        if (!(object instanceof MoyenAccesCatalogueQuantite)) {
            return false;
        }
        MoyenAccesCatalogueQuantite other = (MoyenAccesCatalogueQuantite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.MoyenAccesCatalogueQuantite[ id=" + id + " ]";
    }

    /**
     * @return the moyenAccesCatalogue
     */
    public MoyenAccesCatalogue getMoyenAccesCatalogue() {
        return moyenAccesCatalogue;
    }

    /**
     * @param moyenAccesCatalogue the moyenAccesCatalogue to set
     */
    public void setMoyenAccesCatalogue(MoyenAccesCatalogue moyenAccesCatalogue) {
        this.moyenAccesCatalogue = moyenAccesCatalogue;
    }

    /**
     * @return the quantite
     */
    public Integer getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
    
}
