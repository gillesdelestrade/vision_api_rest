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
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Audience implements Serializable,Comparable<Audience> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ComplementProcedure complementProcedure;
    private TypeAudience typeAudience;
    private LocalDate dateAudience;
    private String commentaire;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Fichier> fichiers;

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
        if (!(object instanceof Audience)) {
            return false;
        }
        Audience other = (Audience) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Audience[ id=" + id + " ]";
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

    /**
     * @return the typeAudience
     */
    public TypeAudience getTypeAudience() {
        return typeAudience;
    }

    /**
     * @param typeAudience the typeAudience to set
     */
    public void setTypeAudience(TypeAudience typeAudience) {
        this.typeAudience = typeAudience;
    }

    /**
     * @return the dateAudience
     */
    public LocalDate getDateAudience() {
        return dateAudience;
    }

    /**
     * @param dateAudience the dateAudience to set
     */
    public void setDateAudience(LocalDate dateAudience) {
        this.dateAudience = dateAudience;
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
     * @return the fichiers
     */
    public List<Fichier> getFichiers() {
        return fichiers;
    }

    /**
     * @param fichiers the fichiers to set
     */
    public void setFichiers(List<Fichier> fichiers) {
        this.fichiers = fichiers;
    }

    @Override
    public int compareTo(Audience o) {
        if (this.getDateAudience() != null && o.getDateAudience() != null) {
            return this.getDateAudience().compareTo(o.getDateAudience());
        } else if (this.getId() != null && o.getId() != null) {
            return this.getId().compareTo(o.getId());
        } else {
            return 1;
        }
        
    }
    
}
