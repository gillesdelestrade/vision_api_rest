/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Publipostage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private Courrier courrier;
    @OneToMany(mappedBy = "publipostage",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DestinataireCourrier> destinataires;
    @OneToOne(fetch = FetchType.LAZY)
    private PreuveDeDepotALaPoste preuveDeDepotALaPoste;

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
        if (!(object instanceof Publipostage)) {
            return false;
        }
        Publipostage other = (Publipostage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Publipostage[id=" + id + "]";
    }

    /**
     * @return the courrier
     */
    public Courrier getCourrier() {
        return courrier;
    }

    /**
     * @param courrier the courrier to set
     */
    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }

    /**
     * @return the destinataires
     */
    public List<DestinataireCourrier> getDestinataires() {
        return destinataires;
    }

    /**
     * @param destinataires the destinataires to set
     */
    public void setDestinataires(List<DestinataireCourrier> destinataires) {
        this.destinataires = destinataires;
    }

    /**
     * @return the preuveDeDepotALaPoste
     */
    public PreuveDeDepotALaPoste getPreuveDeDepotALaPoste() {
        return preuveDeDepotALaPoste;
    }

    /**
     * @param preuveDeDepotALaPoste the preuveDeDepotALaPoste to set
     */
    public void setPreuveDeDepotALaPoste(PreuveDeDepotALaPoste preuveDeDepotALaPoste) {
        this.preuveDeDepotALaPoste = preuveDeDepotALaPoste;
    }

}
