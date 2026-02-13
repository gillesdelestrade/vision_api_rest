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
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Bordereau_Coproprietaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private Instant created_at;
    private String adresse;
    private String nom;    
    @ManyToOne(fetch = FetchType.LAZY)
    private Bordereau bordereau;
    private String nom_stockage_rar;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    

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
        if (!(object instanceof Bordereau_Coproprietaire)) {
            return false;
        }
        Bordereau_Coproprietaire other = (Bordereau_Coproprietaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Bordereau_Coproprietaire[ id=" + id + " ]";
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
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
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the bordereau
     */
    public Bordereau getBordereau() {
        return bordereau;
    }

    /**
     * @param bordereau the bordereau to set
     */
    public void setBordereau(Bordereau bordereau) {
        this.bordereau = bordereau;
    }

    /**
     * @return the nom_stockage_rar
     */
    public String getNom_stockage_rar() {
        return nom_stockage_rar;
    }

    /**
     * @param nom_stockage_rar the nom_stockage_rar to set
     */
    public void setNom_stockage_rar(String nom_stockage_rar) {
        this.nom_stockage_rar = nom_stockage_rar;
    }

    /**
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }
    
}
