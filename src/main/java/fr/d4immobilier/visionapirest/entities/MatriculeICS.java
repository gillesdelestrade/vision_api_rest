/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MatriculeICS implements Serializable {
    @OneToMany(mappedBy = "matriculeICS", fetch = FetchType.LAZY)
    private List<AutorisationDematerialisation> autorisationsDematerialisation;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;    
    private String matricule;
    private String login;
    private String passwd;
    private Integer rgpd;
    private String permalink;

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
        if (!(object instanceof MatriculeICS)) {
            return false;
        }
        MatriculeICS other = (MatriculeICS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.MatriculeICS[ id=" + id + " ]";
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
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the rgpd
     */
    public Integer getRgpd() {
        return rgpd;
    }

    /**
     * @param rgpd the rgpd to set
     */
    public void setRgpd(Integer rgpd) {
        this.rgpd = rgpd;
    }

    /**
     * @return the permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * @param permalink the permalink to set
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * @return the autorisationsDematerialisation
     */
    public List<AutorisationDematerialisation> getAutorisationsDematerialisation() {
        return autorisationsDematerialisation;
    }

    /**
     * @param autorisationsDematerialisation the autorisationsDematerialisation to set
     */
    public void setAutorisationsDematerialisation(List<AutorisationDematerialisation> autorisationsDematerialisation) {
        this.autorisationsDematerialisation = autorisationsDematerialisation;
    }
    
}
