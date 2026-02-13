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
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class TagEvenement_Evenement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long evenement_id;
    private Long tag_id;
    private Instant created_at;

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
        if (!(object instanceof TagEvenement_Evenement)) {
            return false;
        }
        TagEvenement_Evenement other = (TagEvenement_Evenement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.TagEvenement_Evnement[ id=" + id + " ]";
    }

    /**
     * @return the evenement_id
     */
    public Long getEvenement_id() {
        return evenement_id;
    }

    /**
     * @param evenement_id the evenement_id to set
     */
    public void setEvenement_id(Long evenement_id) {
        this.evenement_id = evenement_id;
    }

    /**
     * @return the tag_id
     */
    public Long getTag_id() {
        return tag_id;
    }

    /**
     * @param tag_id the tag_id to set
     */
    public void setTag_id(Long tag_id) {
        this.tag_id = tag_id;
    }

    /**
     * @return the created_at
     */
    public Instant getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }
    
}
