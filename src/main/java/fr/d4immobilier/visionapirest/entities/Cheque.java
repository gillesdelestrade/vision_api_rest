/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Cheque implements Serializable {

    public static final transient int AFFICHAGE_TOTAL = 0;
    public static final transient int AFFICHAGE_NUM_MONTANT = 1;
    public static final transient int AFFICHAGE_NUM = 2;
    @OneToMany(mappedBy = "cheque", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PartChequeCoproprietaire> partsChequeCoproprietaires;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Banque banque;
    private String numero;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne emetteurPersonne;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe emetteurSociete;
    private Float montant;
    @ManyToOne(fetch = FetchType.LAZY)
    private BordereauDeRemiseDeCheque bordereauDeRemiseDeCheque;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete emetteurCopropriete;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TireurCheque tireurCheque;
    private transient int modeAffichage;
    private LocalDate dateEncaissementSouhaite;
    
    

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
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (modeAffichage == AFFICHAGE_TOTAL) {
            if (getMontant() == null) {
                return "Nouveau Chèque";
            }
            if (getEmetteurPersonne() != null) {
                return getEmetteurPersonne().toString() + " " + getMontant() + " € ";
            } else if (getEmetteurSociete() != null) {
                return getEmetteurSociete().toString() + " " + getMontant() + " € ";
            } else if (getEmetteurCopropriete() != null) {
                return getEmetteurCopropriete().getNom() + " " + getMontant() + " € ";
            } else if (getTireurCheque() != null) {
                return getTireurCheque().getNomTireurCheque() + " " + getMontant() + " € ";
            } else {
                return "Chèque " + getMontant() + " € ";
            }
        } else if (modeAffichage == AFFICHAGE_NUM_MONTANT) {
            return getNumero() + " : " + getMontant() + " € ";
        } else if (modeAffichage == AFFICHAGE_NUM) {
            return getNumero();
        } else {
            return "Chèque " + getMontant() + " € ";
        }

    }

    public String toStringTotal() {
        
            if (getMontant() == null) {
                return "Nouveau Chèque";
            }
            if (getEmetteurPersonne() != null) {
                return getEmetteurPersonne().toString() + " " + getMontant() + " € ";
            } else if (getEmetteurSociete() != null) {
                return getEmetteurSociete().toString() + " " + getMontant() + " € ";
            } else if (getEmetteurCopropriete() != null) {
                return getEmetteurCopropriete().getNom() + " " + getMontant() + " € ";
            } else if (getTireurCheque() != null) {
                return getTireurCheque().getNomTireurCheque() + " " + getMontant() + " € ";
            } else {
                return "Chèque " + getMontant() + " € ";
            }
       

    }

    /**
     * @return the banque
     */
    public Banque getBanque() {
        return banque;
    }

    /**
     * @param banque the banque to set
     */
    public void setBanque(Banque banque) {
        this.banque = banque;
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
     * @return the emetteurPersonne
     */
    public Personne getEmetteurPersonne() {
        return emetteurPersonne;
    }

    /**
     * @param emetteurPersonne the emetteurPersonne to set
     */
    public void setEmetteurPersonne(Personne emetteurPersonne) {
        this.emetteurPersonne = emetteurPersonne;
    }

    /**
     * @return the emetteurSociete
     */
    public Societe getEmetteurSociete() {
        return emetteurSociete;
    }

    /**
     * @param emetteurSociete the emetteurSociete to set
     */
    public void setEmetteurSociete(Societe emetteurSociete) {
        this.emetteurSociete = emetteurSociete;
    }

    /**
     * @return the montant
     */
    public Float getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    /**
     * @return the bordereauDeRemiseDeCheque
     */
    public BordereauDeRemiseDeCheque getBordereauDeRemiseDeCheque() {
        return bordereauDeRemiseDeCheque;
    }

    /**
     * @param bordereauDeRemiseDeCheque the bordereauDeRemiseDeCheque to set
     */
    public void setBordereauDeRemiseDeCheque(BordereauDeRemiseDeCheque bordereauDeRemiseDeCheque) {
        this.bordereauDeRemiseDeCheque = bordereauDeRemiseDeCheque;
    }

    /**
     * @return the emetteurCopropriete
     */
    public Copropriete getEmetteurCopropriete() {
        return emetteurCopropriete;
    }

    /**
     * @param emetteurCopropriete the emetteurCopropriete to set
     */
    public void setEmetteurCopropriete(Copropriete emetteurCopropriete) {
        this.emetteurCopropriete = emetteurCopropriete;
    }

    /**
     * @return the partsChequeCoproprietaires
     */
    public List<PartChequeCoproprietaire> getPartsChequeCoproprietaires() {
        return partsChequeCoproprietaires;
    }

    /**
     * @param partsChequeCoproprietaires the partsChequeCoproprietaires to set
     */
    public void setPartsChequeCoproprietaires(List<PartChequeCoproprietaire> partsChequeCoproprietaires) {
        this.partsChequeCoproprietaires = partsChequeCoproprietaires;
    }

    /**
     * @return the tireurCheque
     */
    public TireurCheque getTireurCheque() {
        return tireurCheque;
    }

    /**
     * @param tireurCheque the tireurCheque to set
     */
    public void setTireurCheque(TireurCheque tireurCheque) {
        this.tireurCheque = tireurCheque;
    }

    /**
     * @return the modeAffichage
     */
    public int getModeAffichage() {
        return modeAffichage;
    }

    /**
     * @param modeAffichage the modeAffichage to set
     */
    public void setModeAffichage(int modeAffichage) {
        this.modeAffichage = modeAffichage;
    }

    /**
     * @return the dateEncaissementSouhaite
     */
    public LocalDate getDateEncaissementSouhaite() {
        return dateEncaissementSouhaite;
    }

    /**
     * @param dateEncaissementSouhaite the dateEncaissementSouhaite to set
     */
    public void setDateEncaissementSouhaite(LocalDate dateEncaissementSouhaite) {
        this.dateEncaissementSouhaite = dateEncaissementSouhaite;
    }
}
