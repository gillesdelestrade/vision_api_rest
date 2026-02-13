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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity

public class CompteEnBanque implements Serializable {

    

    @OneToMany(mappedBy = "compteEnBanque", fetch = FetchType.LAZY)
    private List<PositionCompteEnBanque> positionsCompteEnBanque;
    @OneToMany(mappedBy = "compteEnBanque", fetch = FetchType.LAZY)
    private List<MouvementBancaire> mouvementsBancaires;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TypeCompteEnBanque typeCompteEnBanque;

    @ManyToOne(fetch = FetchType.LAZY)
    private Banque banque;

    private String intituleCompte;
    @OneToOne(fetch = FetchType.LAZY)
    private Rib rib;

    @OneToOne(fetch = FetchType.LAZY)
    private Iban iban;

    private String bic;

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
        if (!(object instanceof CompteEnBanque)) {
            return false;
        }
        CompteEnBanque other = (CompteEnBanque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.CompteEnBanque[id=" + id + "]";
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
     * @return the intituleCompte
     */
    public String getIntituleCompte() {
        return intituleCompte;
    }

    /**
     * @param intituleCompte the intituleCompte to set
     */
    public void setIntituleCompte(String intituleCompte) {
        this.intituleCompte = intituleCompte;
    }

    /**
     * @return the rib
     */
    public Rib getRib() {
        return rib;
    }

    /**
     * @param rib the rib to set
     */
    public void setRib(Rib rib) {
        this.rib = rib;
    }

    /**
     * @return the iban
     */
    public Iban getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    public void setIban(Iban iban) {
        this.iban = iban;
    }

    /**
     * @return the bic
     */
    public String getBic() {
        return bic;
    }

    /**
     * @param bic the bic to set
     */
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
     * @return the typeCompteEnBanque
     */
    public TypeCompteEnBanque getTypeCompteEnBanque() {
        return typeCompteEnBanque;
    }

    /**
     * @param typeCompteEnBanque the typeCompteEnBanque to set
     */
    public void setTypeCompteEnBanque(TypeCompteEnBanque typeCompteEnBanque) {
        this.typeCompteEnBanque = typeCompteEnBanque;
    }

    /**
     * @return the mouvementsBancaires
     */
    public List<MouvementBancaire> getMouvementsBancaires() {
        return mouvementsBancaires;
    }

    /**
     * @param mouvementsBancaires the mouvementsBancaires to set
     */
    public void setMouvementsBancaires(List<MouvementBancaire> mouvementsBancaires) {
        this.mouvementsBancaires = mouvementsBancaires;
    }

    /**
     * @return the positionsCompteEnBanque
     */
    public List<PositionCompteEnBanque> getPositionsCompteEnBanque() {
        return positionsCompteEnBanque;
    }

    /**
     * @param positionsCompteEnBanque the positionsCompteEnBanque to set
     */
    public void setPositionsCompteEnBanque(List<PositionCompteEnBanque> positionsCompteEnBanque) {
        this.positionsCompteEnBanque = positionsCompteEnBanque;
    }

}
