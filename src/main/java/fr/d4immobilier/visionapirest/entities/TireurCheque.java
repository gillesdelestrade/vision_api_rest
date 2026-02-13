/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class TireurCheque implements Serializable {
    @OneToMany(mappedBy = "tireurCheque", fetch = FetchType.LAZY)
    private List<Cheque> cheques;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomTireurCheque;
    private String numeroBanque;
    private String numeroCompte;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Coproprietaire> coproprietairesConcernes;



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
        if (!(object instanceof TireurCheque)) {
            return false;
        }
        TireurCheque other = (TireurCheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomTireurCheque();
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
     * @return the nomTireurCheque
     */
    public String getNomTireurCheque() {
        return nomTireurCheque;
    }

    /**
     * @param nomTireurCheque the nomTireurCheque to set
     */
    public void setNomTireurCheque(String nomTireurCheque) {
        this.nomTireurCheque = nomTireurCheque;
    }

    /**
     * @return the numeroBanque
     */
    public String getNumeroBanque() {
        return numeroBanque;
    }

    /**
     * @param numeroBanque the numeroBanque to set
     */
    public void setNumeroBanque(String numeroBanque) {
        this.numeroBanque = numeroBanque;
    }

    /**
     * @return the numeroCompte
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * @param numeroCompte the numeroCompte to set
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * @return the coproprietairesConcernes
     */
    public List<Coproprietaire> getCoproprietairesConcernes() {
        return coproprietairesConcernes;
    }

    /**
     * @param coproprietairesConcernes the coproprietairesConcernes to set
     */
    public void setCoproprietairesConcernes(List<Coproprietaire> coproprietairesConcernes) {
        this.coproprietairesConcernes = coproprietairesConcernes;
    }

}
