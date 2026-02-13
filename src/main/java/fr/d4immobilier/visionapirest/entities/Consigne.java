/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Consigne implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    @ManyToMany(mappedBy = "consignes", fetch = FetchType.LAZY)
    private List<ExpressionCle> expressionsCles;
    @OneToMany(mappedBy = "consigne", fetch = FetchType.LAZY)
    private List<EtapeConsigne> etapesConsigne;
    private static long serialVersionUID = 1L;
    

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
        if (!(object instanceof Consigne)) {
            return false;
        }
        Consigne other = (Consigne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Consigne[ id=" + id + " ]";
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the expressionsCles
     */
    public List<ExpressionCle> getExpressionsCles() {
        return expressionsCles;
    }

    /**
     * @param expressionsCles the expressionsCles to set
     */
    public void setExpressionsCles(List<ExpressionCle> expressionsCles) {
        this.expressionsCles = expressionsCles;
    }

    /**
     * @return the etapesConsigne
     */
    public List<EtapeConsigne> getEtapesConsigne() {
        return etapesConsigne;
    }

    /**
     * @param etapesConsigne the etapesConsigne to set
     */
    public void setEtapesConsigne(List<EtapeConsigne> etapesConsigne) {
        this.etapesConsigne = etapesConsigne;
    }
    
}
