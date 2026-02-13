/*
 * To change this template, choose Tools | Templates
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
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Resolution resolution;
    @ManyToOne(fetch = FetchType.LAZY)
    private Affectation affectation;

    private ChoixVote choixVote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Vote)) {
            return false;
        }
        Vote other = (Vote) object;
        if ((this.getChoixVote() == null && other.getChoixVote() != null) || (this.getChoixVote() != null && !this.getChoixVote().equals(other.getChoixVote())) || (this.getAffectation().getTag() == null & other.getAffectation().getTag() != null) || (this.getAffectation().getTag() != null && !this.getAffectation().getTag().equals(other.getAffectation().getTag()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.entities.Vote[id=" + getId() + "]";
    }

    /**
     * @return the pointAborde
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param pointAborde the pointAborde to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * @return the affectation
     */
    public Affectation getAffectation() {
        return affectation;
    }

    /**
     * @param affectation the affectation to set
     */
    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }

    /**
     * @return the choixVote
     */
    public ChoixVote getChoixVote() {
        return choixVote;
    }

    /**
     * @param choixVote the choixVote to set
     */
    public void setChoixVote(ChoixVote choixVote) {
        this.choixVote = choixVote;
    }

}
