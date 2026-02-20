/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ContextePromptLLM implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contexte;

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
        if (!(object instanceof ContextePromptLLM)) {
            return false;
        }
        ContextePromptLLM other = (ContextePromptLLM) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.visionapirest.entities.ContextePromptLLM[ id=" + id + " ]";
    }

    /**
     * @return the contexte
     */
    public String getContexte() {
        return contexte;
    }

    /**
     * @param contexte the contexte to set
     */
    public void setContexte(String contexte) {
        this.contexte = contexte;
    }
    
}
