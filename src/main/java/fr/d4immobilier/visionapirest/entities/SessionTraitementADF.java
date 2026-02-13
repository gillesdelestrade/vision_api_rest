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
public class SessionTraitementADF implements Serializable {
    @OneToMany(mappedBy = "sessionTraitementADF", fetch = FetchType.LAZY)
    private List<ADFCopro> aDFsCopro;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dateCreation;
    private LocalDate dateTraitement;
    private Fichier fichierZip;
    private String libelle;

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
        if (!(object instanceof SessionTraitementADF)) {
            return false;
        }
        SessionTraitementADF other = (SessionTraitementADF) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.SessionTraitementADF[ id=" + id + " ]";
    }

    /**
     * @return the aDFsCopro
     */
    public List<ADFCopro> getaDFsCopro() {
        return aDFsCopro;
    }

    /**
     * @param aDFsCopro the aDFsCopro to set
     */
    public void setaDFsCopro(List<ADFCopro> aDFsCopro) {
        this.aDFsCopro = aDFsCopro;
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
     * @return the dateTraitement
     */
    public LocalDate getDateTraitement() {
        return dateTraitement;
    }

    /**
     * @param dateTraitement the dateTraitement to set
     */
    public void setDateTraitement(LocalDate dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    /**
     * @return the fichierZip
     */
    public Fichier getFichierZip() {
        return fichierZip;
    }

    /**
     * @param fichierZip the fichierZip to set
     */
    public void setFichierZip(Fichier fichierZip) {
        this.fichierZip = fichierZip;
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
    
}
