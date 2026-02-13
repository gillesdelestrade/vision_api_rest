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
public class SymptomeTypeEquipement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symptome;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeEquipement typeEquipement;
    private Boolean direct;

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
        if (!(object instanceof SymptomeTypeEquipement)) {
            return false;
        }
        SymptomeTypeEquipement other = (SymptomeTypeEquipement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.SymptomeTypeEquipement[ id=" + id + " ]";
    }

    /**
     * @return the symptome
     */
    public String getSymptome() {
        return symptome;
    }

    /**
     * @param symptome the symptome to set
     */
    public void setSymptome(String symptome) {
        this.symptome = symptome;
    }

    /**
     * @return the typeEquipement
     */
    public TypeEquipement getTypeEquipement() {
        return typeEquipement;
    }

    /**
     * @param typeEquipement the typeEquipement to set
     */
    public void setTypeEquipement(TypeEquipement typeEquipement) {
        this.typeEquipement = typeEquipement;
    }

    /**
     * @return the direct
     */
    public Boolean getDirect() {
        return direct;
    }

    /**
     * @param direct the direct to set
     */
    public void setDirect(Boolean direct) {
        this.direct = direct;
    }
    
}
