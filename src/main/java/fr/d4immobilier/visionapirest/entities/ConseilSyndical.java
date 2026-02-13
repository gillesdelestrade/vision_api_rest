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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ConseilSyndical implements Serializable {
    @OneToMany(mappedBy = "conseilSyndical",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AutorisationValidationFactures> autorisationsValidationFactures;

    public ConseilSyndical() {
        //this.membres = new ArrayList<Personne>();
    }



    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne president;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Personne> membres;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe presidentSociete;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Societe> membresSocietes;
    
    private String mail;

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
        if (!(object instanceof ConseilSyndical)) {
            return false;
        }
        ConseilSyndical other = (ConseilSyndical) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ConseilSyndical[id=" + id + "]";
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
     * @return the president
     */
    public Personne getPresident() {
        return president;
    }

    /**
     * @param president the president to set
     */
    public void setPresident(Personne president) {
        this.president = president;
    }

    /**
     * @return the membres
     */
    public List<Personne> getMembres() {
        return membres;
    }

    /**
     * @param membres the membres to set
     */
    public void setMembres(List<Personne> membres) {
        this.membres = membres;
    }

    /**
     * @return the autorisationsValidationFactures
     */
    public List<AutorisationValidationFactures> getAutorisationsValidationFactures() {
        return autorisationsValidationFactures;
    }

    /**
     * @param autorisationsValidationFactures the autorisationsValidationFactures to set
     */
    public void setAutorisationsValidationFactures(List<AutorisationValidationFactures> autorisationsValidationFactures) {
        this.autorisationsValidationFactures = autorisationsValidationFactures;
    }

    /**
     * @return the presidentSociete
     */
    public Societe getPresidentSociete() {
        return presidentSociete;
    }

    /**
     * @param presidentSociete the presidentSociete to set
     */
    public void setPresidentSociete(Societe presidentSociete) {
        this.presidentSociete = presidentSociete;
    }

    /**
     * @return the membresSocietes
     */
    public List<Societe> getMembresSocietes() {
        return membresSocietes;
    }

    /**
     * @param membresSocietes the membresSocietes to set
     */
    public void setMembresSocietes(List<Societe> membresSocietes) {
        this.membresSocietes = membresSocietes;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

}
