/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Rib implements Serializable {

    public Rib() {
    }

    public Rib(CompteEnBanque compteEnBanque, String codeEtablissement, String codeGuichet, String numeroCompte, String cleRib, String domiciliation) {
        this.compteEnBanque = compteEnBanque;
        this.codeEtablissement = codeEtablissement;
        this.codeGuichet = codeGuichet;
        this.numeroCompte = numeroCompte;
        this.cleRib = cleRib;
        this.domiciliation = domiciliation;
    }


    @OneToOne(mappedBy = "rib", fetch = FetchType.LAZY)
    private CompteEnBanque compteEnBanque;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codeEtablissement;
    private String codeGuichet;
    private String numeroCompte;
    private String cleRib;
    private String domiciliation;

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
        if (!(object instanceof Rib)) {
            return false;
        }
        Rib other = (Rib) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Rib[id=" + id + "]";
    }

    /**
     * @return the codeEtablissement
     */
    public String getCodeEtablissement() {
        return codeEtablissement;
    }

    /**
     * @param codeEtablissement the codeEtablissement to set
     */
    public void setCodeEtablissement(String codeEtablissement) {
        this.codeEtablissement = codeEtablissement;
    }

    /**
     * @return the codeGuichet
     */
    public String getCodeGuichet() {
        return codeGuichet;
    }

    /**
     * @param codeGuichet the codeGuichet to set
     */
    public void setCodeGuichet(String codeGuichet) {
        this.codeGuichet = codeGuichet;
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
     * @return the cleRib
     */
    public String getCleRib() {
        return cleRib;
    }

    /**
     * @param cleRib the cleRib to set
     */
    public void setCleRib(String cleRib) {
        this.cleRib = cleRib;
    }

    /**
     * @return the domiciliation
     */
    public String getDomiciliation() {
        return domiciliation;
    }

    /**
     * @param domiciliation the domiciliation to set
     */
    public void setDomiciliation(String domiciliation) {
        this.domiciliation = domiciliation;
    }

}
