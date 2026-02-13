/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class HistoriqueNavigation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne personneConnectee;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societeConnectee;
    private Instant dateConnexion;
    private String adresseIP;
    private String pageDemandee;

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
        if (!(object instanceof HistoriqueNavigation)) {
            return false;
        }
        HistoriqueNavigation other = (HistoriqueNavigation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.HistoriqueNavigation[ id=" + id + " ]";
    }

    /**
     * @return the personneConnectee
     */
    public Personne getPersonneConnectee() {
        return personneConnectee;
    }

    /**
     * @param personneConnectee the personneConnectee to set
     */
    public void setPersonneConnectee(Personne personneConnectee) {
        this.personneConnectee = personneConnectee;
    }

    /**
     * @return the societeConnectee
     */
    public Societe getSocieteConnectee() {
        return societeConnectee;
    }

    /**
     * @param societeConnectee the societeConnectee to set
     */
    public void setSocieteConnectee(Societe societeConnectee) {
        this.societeConnectee = societeConnectee;
    }

    /**
     * @return the dateConnexion
     */
    public Instant getDateConnexion() {
        return dateConnexion;
    }

    /**
     * @param dateConnexion the dateConnexion to set
     */
    public void setDateConnexion(Instant dateConnexion) {
        this.dateConnexion = dateConnexion;
    }

    /**
     * @return the adresseIP
     */
    public String getAdresseIP() {
        return adresseIP;
    }

    /**
     * @param adresseIP the adresseIP to set
     */
    public void setAdresseIP(String adresseIP) {
        this.adresseIP = adresseIP;
    }

    /**
     * @return the pageDemandee
     */
    public String getPageDemandee() {
        return pageDemandee;
    }

    /**
     * @param pageDemandee the pageDemandee to set
     */
    public void setPageDemandee(String pageDemandee) {
        this.pageDemandee = pageDemandee;
    }
    
}
