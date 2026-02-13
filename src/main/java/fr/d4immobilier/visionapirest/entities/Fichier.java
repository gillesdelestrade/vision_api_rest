/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Fichier implements Serializable {

    @ManyToMany(mappedBy = "fichiers", fetch = FetchType.LAZY)
    private List<Resolution> resolutions;

    @ManyToOne(fetch = FetchType.LAZY)
    private Courrier courrierPourPieceJointe;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomFichier;
    private String nomStockage;
    private Instant dateCreation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne auteur;
    private transient File file;
    

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
        if (!(object instanceof Fichier)) {
            return false;
        }
        Fichier other = (Fichier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomFichier();
    }

    /**
     * @return the nomFichier
     */
    public String getNomFichier() {
        return nomFichier;
    }

    /**
     * @param nomFichier the nomFichier to set
     */
    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    /**
     * @return the nomStockage
     */
    public String getNomStockage() {
        return nomStockage;
    }

    /**
     * @param nomStockage the nomStockage to set
     */
    public void setNomStockage(String nomStockage) {
        this.nomStockage = nomStockage;
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the auteur
     */
    public Personne getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the courrierPourPieceJointe
     */
    public Courrier getCourrierPourPieceJointe() {
        return courrierPourPieceJointe;
    }

    /**
     * @param courrierPourPieceJointe the courrierPourPieceJointe to set
     */
    public void setCourrierPourPieceJointe(Courrier courrierPourPieceJointe) {
        this.courrierPourPieceJointe = courrierPourPieceJointe;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the resolutions
     */
    public List<Resolution> getResolutions() {
        return resolutions;
    }

    /**
     * @param resolutions the resolutions to set
     */
    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    @PrePersist
    private void initNomStockage() {
        if (getNomStockage() == null) {
            UUID uuid = UUID.randomUUID();
            setNomStockage(uuid.toString() + "_" + getNomFichier());
        }

    }

}
