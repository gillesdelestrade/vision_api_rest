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
public class FonctionAPIFournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private APIFournisseur aPIFournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private LexiqueAPID4 lexiqueAPID4;
    private String urlRequete;
    private String structureDonneesEnvoyees;
    private String structureDonneesRecues;

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
        if (!(object instanceof FonctionAPIFournisseur)) {
            return false;
        }
        FonctionAPIFournisseur other = (FonctionAPIFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.FonctionAPIFournisseur[ id=" + id + " ]";
    }

    /**
     * @return the aPIFournisseur
     */
    public APIFournisseur getaPIFournisseur() {
        return aPIFournisseur;
    }

    /**
     * @param aPIFournisseur the aPIFournisseur to set
     */
    public void setaPIFournisseur(APIFournisseur aPIFournisseur) {
        this.aPIFournisseur = aPIFournisseur;
    }

    /**
     * @return the lexiqueAPID4
     */
    public LexiqueAPID4 getLexiqueAPID4() {
        return lexiqueAPID4;
    }

    /**
     * @param lexiqueAPID4 the lexiqueAPID4 to set
     */
    public void setLexiqueAPID4(LexiqueAPID4 lexiqueAPID4) {
        this.lexiqueAPID4 = lexiqueAPID4;
    }

    /**
     * @return the urlRequete
     */
    public String getUrlRequete() {
        return urlRequete;
    }

    /**
     * @param urlRequete the urlRequete to set
     */
    public void setUrlRequete(String urlRequete) {
        this.urlRequete = urlRequete;
    }

    /**
     * @return the structureDonneesEnvoyees
     */
    public String getStructureDonneesEnvoyees() {
        return structureDonneesEnvoyees;
    }

    /**
     * @param structureDonneesEnvoyees the structureDonneesEnvoyees to set
     */
    public void setStructureDonneesEnvoyees(String structureDonneesEnvoyees) {
        this.structureDonneesEnvoyees = structureDonneesEnvoyees;
    }

    /**
     * @return the structureDonneesRecues
     */
    public String getStructureDonneesRecues() {
        return structureDonneesRecues;
    }

    /**
     * @param structureDonneesRecues the structureDonneesRecues to set
     */
    public void setStructureDonneesRecues(String structureDonneesRecues) {
        this.structureDonneesRecues = structureDonneesRecues;
    }
    
}
