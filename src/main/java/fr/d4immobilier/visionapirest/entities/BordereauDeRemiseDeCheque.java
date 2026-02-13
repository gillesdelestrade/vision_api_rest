/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class BordereauDeRemiseDeCheque implements Serializable,Comparable<BordereauDeRemiseDeCheque> {
    @OneToMany(mappedBy = "bordereauDeRemiseDeCheque", cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Cheque> cheques;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant dateImpression;

    private EtatBordereauCheques etatBordereauCheques;

    private String nom;

    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

    @ManyToOne(fetch = FetchType.LAZY)
    private CompteEnBanqueCopropriete compteEnBanqueCopropriete;

    private String numeroRemise;

    public final transient int NB_CHEQUES_MAX = 18;


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
        if (!(object instanceof BordereauDeRemiseDeCheque)) {
            return false;
        }
        BordereauDeRemiseDeCheque other = (BordereauDeRemiseDeCheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCopropriete().getTrigramme() + " : " + new DecimalFormat("###,###,##0.00¤").format(getMontantTotal());
    }

    /**
     * @return the cheques
     */
    public List<Cheque> getCheques() {
        return cheques;
    }

    /**
     * @param cheques the cheques to set
     */
    public void setCheques(List<Cheque> cheques) {
        this.cheques = cheques;
    }

    /**
     * @return the dateImpression
     */
    public Instant getDateImpression() {
        return dateImpression;
    }

    /**
     * @param dateImpression the dateImpression to set
     */
    public void setDateImpression(Instant dateImpression) {
        this.dateImpression = dateImpression;
    }

    /**
     * @return the etatBordereauCheques
     */
    public EtatBordereauCheques getEtatBordereauCheques() {
        return etatBordereauCheques;
    }

    /**
     * @param etatBordereauCheques the etatBordereauCheques to set
     */
    public void setEtatBordereauCheques(EtatBordereauCheques etatBordereauCheques) {
        this.etatBordereauCheques = etatBordereauCheques;
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
     * @return the compteEnBanqueCopropriete
     */
    public CompteEnBanqueCopropriete getCompteEnBanqueCopropriete() {
        return compteEnBanqueCopropriete;
    }

    /**
     * @param compteEnBanqueCopropriete the compteEnBanqueCopropriete to set
     */
    public void setCompteEnBanqueCopropriete(CompteEnBanqueCopropriete compteEnBanqueCopropriete) {
        this.compteEnBanqueCopropriete = compteEnBanqueCopropriete;
    }

    /**
     * @return the numeroRemise
     */
    public String getNumeroRemise() {
        return numeroRemise;
    }

    /**
     * @param numeroRemise the numeroRemise to set
     */
    public void setNumeroRemise(String numeroRemise) {
        this.numeroRemise = numeroRemise;
    }

    public Float getMontantTotal() {
        Float f = 0f;
        if (cheques != null && cheques.isEmpty() == false) {
            for (Cheque c : cheques) {
                f = f + c.getMontant();
            }
        }
        return f;
    }

    @Override
    public int compareTo(BordereauDeRemiseDeCheque t) {
        return this.getMontantTotal().compareTo(t.getMontantTotal());
    }

}
