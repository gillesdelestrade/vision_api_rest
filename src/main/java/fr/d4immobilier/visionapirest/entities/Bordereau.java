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
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Bordereau implements Serializable {
    @OneToMany(mappedBy = "bordereau", fetch = FetchType.LAZY)
    private List<Bordereau_Coproprietaire> bordereaux_Coproprietaire;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_stockage;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire gestionnaire;
    private Instant created_at;
    private Instant updated_at;
    private String texte;
    private LocalDate date;

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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bordereau)) {
            return false;
        }
        Bordereau other = (Bordereau) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Bordereau[ id=" + getId() + " ]";
    }

    /**
     * @return the nom_stockage
     */
    public String getNomStockage() {
        return nom_stockage;
    }

    /**
     * @param nomStockage the nom_stockage to set
     */
    public void setNomStockage(String nomStockage) {
        this.nom_stockage = nomStockage;
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
     * @return the gestionnaire
     */
    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    /**
     * @param gestionnaire the gestionnaire to set
     */
    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
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

    /**
     * @return the updated_at
     */
    public Instant getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Instant updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * @param texte the texte to set
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the bordereaux_Coproprietaire
     */
    public List<Bordereau_Coproprietaire> getBordereaux_Coproprietaire() {
        return bordereaux_Coproprietaire;
    }

    /**
     * @param bordereaux_Coproprietaire the bordereaux_Coproprietaire to set
     */
    public void setBordereaux_Coproprietaire(List<Bordereau_Coproprietaire> bordereaux_Coproprietaire) {
        this.bordereaux_Coproprietaire = bordereaux_Coproprietaire;
    }
    
}
