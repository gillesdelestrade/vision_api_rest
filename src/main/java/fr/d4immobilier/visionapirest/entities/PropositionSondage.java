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
public class PropositionSondage implements Serializable {
    @OneToMany(mappedBy = "propositionSondage", fetch = FetchType.LAZY)
    private List<ResultatSondage> resultatSondages;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texte;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fichier fichier;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sondage sondage;

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
        if (!(object instanceof PropositionSondage)) {
            return false;
        }
        PropositionSondage other = (PropositionSondage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PropositionSondage[ id=" + id + " ]";
    }

    /**
     * @return the resultatSondages
     */
    public List<ResultatSondage> getResultatSondages() {
        return resultatSondages;
    }

    /**
     * @param resultatSondages the resultatSondages to set
     */
    public void setResultatSondages(List<ResultatSondage> resultatSondages) {
        this.resultatSondages = resultatSondages;
    }

    /**
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * @param texte the texte to set
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * @return the fichier
     */
    public Fichier getFichier() {
        return fichier;
    }

    /**
     * @param fichier the fichier to set
     */
    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
    }

    /**
     * @return the sondage
     */
    public Sondage getSondage() {
        return sondage;
    }

    /**
     * @param sondage the sondage to set
     */
    public void setSondage(Sondage sondage) {
        this.sondage = sondage;
    }
    
}
