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
public class BoiteMail implements Serializable {
    @OneToMany(mappedBy = "boiteMail", fetch = FetchType.LAZY)
    private List<Courriel> courriels;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomBoite;
    private String serveur;
    private String login;
    private String password;
    

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
        if (!(object instanceof BoiteMail)) {
            return false;
        }
        BoiteMail other = (BoiteMail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getLogin();
    }

    /**
     * @return the courriels
     */
    public List<Courriel> getCourriels() {
        return courriels;
    }

    /**
     * @param courriels the courriels to set
     */
    public void setCourriels(List<Courriel> courriels) {
        this.courriels = courriels;
    }

    /**
     * @return the nomBoite
     */
    public String getNomBoite() {
        return nomBoite;
    }

    /**
     * @param nomBoite the nomBoite to set
     */
    public void setNomBoite(String nomBoite) {
        this.nomBoite = nomBoite;
    }

    /**
     * @return the serveur
     */
    public String getServeur() {
        return serveur;
    }

    /**
     * @param serveur the serveur to set
     */
    public void setServeur(String serveur) {
        this.serveur = serveur;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
