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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PanneauBALInterphone implements Serializable {
    @OneToMany(mappedBy = "panneauBALInterphone", fetch = FetchType.LAZY)
    private List<EmplacementPanneauBALInterphone> emplacements;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Batiment batiment;
    private TypePanneau typePanneau;
    private Integer nbColonnes;
    private Integer nbLignes;
    private String libelle;

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
        if (!(object instanceof PanneauBALInterphone)) {
            return false;
        }
        PanneauBALInterphone other = (PanneauBALInterphone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PanneauBALInterphone[ id=" + id + " ]";
    }

    /**
     * @return the emplacements
     */
    public List<EmplacementPanneauBALInterphone> getEmplacements() {
        return emplacements;
    }

    /**
     * @param emplacements the emplacements to set
     */
    public void setEmplacements(List<EmplacementPanneauBALInterphone> emplacements) {
        this.emplacements = emplacements;
    }

    /**
     * @return the copropriete
     */
    public Copropriete getCopropriete() {
        return copropriete;
    }

    /**
     * @param copropriete the copropriete to set
     */
    public void setCopropriete(Copropriete copropriete) {
        this.copropriete = copropriete;
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

    /**
     * @return the typePanneau
     */
    public TypePanneau getTypePanneau() {
        return typePanneau;
    }

    /**
     * @param typePanneau the typePanneau to set
     */
    public void setTypePanneau(TypePanneau typePanneau) {
        this.typePanneau = typePanneau;
    }

    /**
     * @return the nbColonnes
     */
    public Integer getNbColonnes() {
        return nbColonnes;
    }

    /**
     * @param nbColonnes the nbColonnes to set
     */
    public void setNbColonnes(Integer nbColonnes) {
        this.nbColonnes = nbColonnes;
    }

    /**
     * @return the nbLignes
     */
    public Integer getNbLignes() {
        return nbLignes;
    }

    /**
     * @param nbLignes the nbLignes to set
     */
    public void setNbLignes(Integer nbLignes) {
        this.nbLignes = nbLignes;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
