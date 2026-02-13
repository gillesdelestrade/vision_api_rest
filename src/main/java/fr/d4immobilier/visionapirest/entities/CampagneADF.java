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
import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class CampagneADF implements Serializable {
    @OneToMany(mappedBy = "campagneADF", fetch = FetchType.LAZY)
    private List<ADFCopro> aDFCopros;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private LocalDate dateCreation;
    private Boolean trimestriel;
    private LocalDate dateCloture;

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
        if (!(object instanceof CampagneADF)) {
            return false;
        }
        CampagneADF other = (CampagneADF) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.CampagneADF[ id=" + id + " ]";
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the dateCreation
     */
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the trimestriel
     */
    public Boolean getTrimestriel() {
        return trimestriel;
    }

    /**
     * @param trimestriel the trimestriel to set
     */
    public void setTrimestriel(Boolean trimestriel) {
        this.trimestriel = trimestriel;
    }

    /**
     * @return the dateCloture
     */
    public LocalDate getDateCloture() {
        return dateCloture;
    }

    /**
     * @param dateCloture the dateCloture to set
     */
    public void setDateCloture(LocalDate dateCloture) {
        this.dateCloture = dateCloture;
    }

    /**
     * @return the aDFCopros
     */
    public List<ADFCopro> getaDFCopros() {
        return aDFCopros;
    }

    /**
     * @param aDFCopros the aDFCopros to set
     */
    public void setaDFCopros(List<ADFCopro> aDFCopros) {
        this.aDFCopros = aDFCopros;
    }
    
}
