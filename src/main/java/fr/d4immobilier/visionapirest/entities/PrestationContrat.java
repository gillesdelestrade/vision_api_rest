/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PrestationContrat implements Serializable {
    @ManyToMany(mappedBy = "prestationsConcernees", fetch = FetchType.LAZY)
    private List<TypeEquipement> typeEquipements;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prestation;


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
        if (!(object instanceof PrestationContrat)) {
            return false;
        }
        PrestationContrat other = (PrestationContrat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getPrestation();
    }

    /**
     * @return the prestation
     */
    public String getPrestation() {
        return prestation;
    }

    /**
     * @param prestation the prestation to set
     */
    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

    /**
     * @return the typeEquipements
     */
    public List<TypeEquipement> getTypeEquipements() {
        return typeEquipements;
    }

    /**
     * @param typeEquipements the typeEquipements to set
     */
    public void setTypeEquipements(List<TypeEquipement> typeEquipements) {
        this.typeEquipements = typeEquipements;
    }

}
