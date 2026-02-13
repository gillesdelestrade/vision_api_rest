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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ModeleMoyenAcces implements Serializable {
//    @ManyToMany(mappedBy = "modelesMoyensAcces", fetch = FetchType.LAZY)
//    private List<Ouvrant> ouvrants;
    @OneToMany(mappedBy = "modeleMoyenAcces", fetch = FetchType.LAZY)
    private List<MoyenAccesCatalogue> moyensAccesCatalogues;
    @OneToOne(mappedBy = "modeleMoyenAcces", fetch = FetchType.LAZY)
    private FichierModeleMoyenAcces fichierModeleMoyenAcces;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String description;
    private TypeMoyenAcces typeMoyenAcces;
    
    

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
        if (!(object instanceof ModeleMoyenAcces)) {
            return false;
        }
        ModeleMoyenAcces other = (ModeleMoyenAcces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ModeleMoyenAcces[ id=" + id + " ]";
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the typeMoyenAcces
     */
    public TypeMoyenAcces getTypeMoyenAcces() {
        return typeMoyenAcces;
    }

    /**
     * @param typeMoyenAcces the typeMoyenAcces to set
     */
    public void setTypeMoyenAcces(TypeMoyenAcces typeMoyenAcces) {
        this.typeMoyenAcces = typeMoyenAcces;
    }

    /**
     * @return the fichierModeleMoyenAcces
     */
    public FichierModeleMoyenAcces getFichierModeleMoyenAcces() {
        return fichierModeleMoyenAcces;
    }

    /**
     * @param fichierModeleMoyenAcces the fichierModeleMoyenAcces to set
     */
    public void setFichierModeleMoyenAcces(FichierModeleMoyenAcces fichierModeleMoyenAcces) {
        this.fichierModeleMoyenAcces = fichierModeleMoyenAcces;
    }

    /**
     * @return the moyensAccesCatalogues
     */
    public List<MoyenAccesCatalogue> getMoyensAccesCatalogues() {
        return moyensAccesCatalogues;
    }

    /**
     * @param moyensAccesCatalogues the moyensAccesCatalogues to set
     */
    public void setMoyensAccesCatalogues(List<MoyenAccesCatalogue> moyensAccesCatalogues) {
        this.moyensAccesCatalogues = moyensAccesCatalogues;
    }
    
}
