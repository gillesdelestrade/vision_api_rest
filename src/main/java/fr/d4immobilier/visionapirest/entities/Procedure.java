/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Procedure extends Dossier implements Serializable {
    @OneToOne(mappedBy = "procedure",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ComplementProcedure complementProcedure;
    private static final long serialVersionUID = 1L;
    
    private TypeProcedure typeProcedure;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedure)) {
            return false;
        }
        Procedure other = (Procedure) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Procedure[ id=" + getId() + " ]";
    }

    /**
     * @return the typeProcedure
     */
    public TypeProcedure getTypeProcedure() {
        return typeProcedure;
    }

    /**
     * @param typeProcedure the typeProcedure to set
     */
    public void setTypeProcedure(TypeProcedure typeProcedure) {
        this.typeProcedure = typeProcedure;
    }

    /**
     * @return the complementProcedure
     */
    public ComplementProcedure getComplementProcedure() {
        return complementProcedure;
    }

    /**
     * @param complementProcedure the complementProcedure to set
     */
    public void setComplementProcedure(ComplementProcedure complementProcedure) {
        this.complementProcedure = complementProcedure;
    }
    
}
