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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class APIFournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    private String APIKeyD4;
    private String APIKeyExt;

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
        if (!(object instanceof APIFournisseur)) {
            return false;
        }
        APIFournisseur other = (APIFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.APIFournisseur[ id=" + id + " ]";
    }

    /**
     * @return the fournisseur
     */
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    /**
     * @param fournisseur the fournisseur to set
     */
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    /**
     * @return the APIKeyD4
     */
    public String getAPIKeyD4() {
        return APIKeyD4;
    }

    /**
     * @param APIKeyD4 the APIKeyD4 to set
     */
    public void setAPIKeyD4(String APIKeyD4) {
        this.APIKeyD4 = APIKeyD4;
    }

    /**
     * @return the APIKeyExt
     */
    public String getAPIKeyExt() {
        return APIKeyExt;
    }

    /**
     * @param APIKeyExt the APIKeyExt to set
     */
    public void setAPIKeyExt(String APIKeyExt) {
        this.APIKeyExt = APIKeyExt;
    }
    
}
