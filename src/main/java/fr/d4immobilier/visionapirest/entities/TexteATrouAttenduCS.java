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
public class TexteATrouAttenduCS implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private AttenduCS attenduCS;
    private String texteATrou;

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
        if (!(object instanceof TexteATrouAttenduCS)) {
            return false;
        }
        TexteATrouAttenduCS other = (TexteATrouAttenduCS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.TexteATrouAttenduCS[ id=" + id + " ]";
    }

    /**
     * @return the attenduCS
     */
    public AttenduCS getAttenduCS() {
        return attenduCS;
    }

    /**
     * @param attenduCS the attenduCS to set
     */
    public void setAttenduCS(AttenduCS attenduCS) {
        this.attenduCS = attenduCS;
    }

    /**
     * @return the texteATrou
     */
    public String getTexteATrou() {
        return texteATrou;
    }

    /**
     * @param texteATrou the texteATrou to set
     */
    public void setTexteATrou(String texteATrou) {
        this.texteATrou = texteATrou;
    }
    
}
