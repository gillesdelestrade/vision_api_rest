/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gilles
 */
@Entity
public class PointAborde implements Serializable {
    @OneToMany(mappedBy = "pointAborde", fetch = FetchType.LAZY)
    private List<FichierReunion> fichiersReunion;
    @OneToMany(mappedBy = "pointAborde",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ActionPointAborde> actionsPointAborde;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Reunion reunion;
    private String description;
    private String commentaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;

    private transient boolean recherche;

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
        if (!(object instanceof PointAborde)) {
            return false;
        }
        PointAborde other = (PointAborde) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.id == null && other.id == null && this.description != null) {
            return this.description.equals(other.description);
        } 
        return true;
    }

    @Override
    public String toString() {
        if (recherche) {
            return "<html><b>" + getDescription() + "</b></html>";
        } else {
            return getDescription();
        }
        
    }

    /**
     * @return the actionsPointAborde
     */
    public List<ActionPointAborde> getActionsPointAborde() {
        return actionsPointAborde;
    }

    /**
     * @param actionsPointAborde the actionsPointAborde to set
     */
    public void setActionsPointAborde(List<ActionPointAborde> actionsPointAborde) {
        this.actionsPointAborde = actionsPointAborde;
    }

    /**
     * @return the reunion
     */
    public Reunion getReunion() {
        return reunion;
    }

    /**
     * @param reunion the reunion to set
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
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
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the recherche
     */
    public boolean isRecherche() {
        return recherche;
    }

    /**
     * @param recherche the recherche to set
     */
    public void setRecherche(boolean recherche) {
        this.recherche = recherche;
    }

    /**
     * @return the fichiersReunion
     */
    public List<FichierReunion> getFichiersReunion() {
        return fichiersReunion;
    }

    /**
     * @param fichiersReunion the fichiersReunion to set
     */
    public void setFichiersReunion(List<FichierReunion> fichiersReunion) {
        this.fichiersReunion = fichiersReunion;
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

}
