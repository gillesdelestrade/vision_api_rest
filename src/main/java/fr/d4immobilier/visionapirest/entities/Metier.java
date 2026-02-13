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
public class Metier implements Serializable {
    @OneToMany(mappedBy = "metier", fetch = FetchType.LAZY)
    private List<MotCleMetier> motsCleMetier;
    @ManyToMany(mappedBy = "metiers", fetch = FetchType.LAZY)
    private List<Fournisseur> fournisseurs;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String metier;

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
        if (!(object instanceof Metier)) {
            return false;
        }
        Metier other = (Metier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getMetier();
    }

    /**
     * @return the fournisseurs
     */
    public List<Fournisseur> getFournisseurs() {
        return fournisseurs;
    }

    /**
     * @param fournisseurs the fournisseurs to set
     */
    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }

    /**
     * @return the metier
     */
    public String getMetier() {
        return metier;
    }

    /**
     * @param metier the metier to set
     */
    public void setMetier(String metier) {
        this.metier = metier;
    }

    /**
     * @return the motsCleMetier
     */
    public List<MotCleMetier> getMotsCleMetier() {
        return motsCleMetier;
    }

    /**
     * @param motsCleMetier the motsCleMetier to set
     */
    public void setMotsCleMetier(List<MotCleMetier> motsCleMetier) {
        this.motsCleMetier = motsCleMetier;
    }

}
