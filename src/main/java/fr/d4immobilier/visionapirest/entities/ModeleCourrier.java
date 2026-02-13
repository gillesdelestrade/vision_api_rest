/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ModeleCourrier implements Serializable {
    @OneToMany(mappedBy = "modeleCourrier", fetch = FetchType.LAZY)
    private List<Courrier> courriers;
    @OneToMany(mappedBy = "modeleCourrier", fetch = FetchType.LAZY)
    private List<ActionModeleCourrier> actionsModeleCourrier;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String objet;
    @Column(length=2500)
    private String corpsDeTexte;
    private String formuleDePolitesse;


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
        if (!(object instanceof ModeleCourrier)) {
            return false;
        }
        ModeleCourrier other = (ModeleCourrier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getObjet();
    }

    /**
     * @return the actionsModeleCourrier
     */
    public List<ActionModeleCourrier> getActionsModeleCourrier() {
        return actionsModeleCourrier;
    }

    /**
     * @param actionsModeleCourrier the actionsModeleCourrier to set
     */
    public void setActionsModeleCourrier(List<ActionModeleCourrier> actionsModeleCourrier) {
        this.actionsModeleCourrier = actionsModeleCourrier;
    }

    /**
     * @return the objet
     */
    public String getObjet() {
        return objet;
    }

    /**
     * @param objet the objet to set
     */
    public void setObjet(String objet) {
        this.objet = objet;
    }

    /**
     * @return the corpsDeTexte
     */
    public String getCorpsDeTexte() {
        return corpsDeTexte;
    }

    /**
     * @param corpsDeTexte the corpsDeTexte to set
     */
    public void setCorpsDeTexte(String corpsDeTexte) {
        this.corpsDeTexte = corpsDeTexte;
    }

    /**
     * @return the formuleDePolitesse
     */
    public String getFormuleDePolitesse() {
        return formuleDePolitesse;
    }

    /**
     * @param formuleDePolitesse the formuleDePolitesse to set
     */
    public void setFormuleDePolitesse(String formuleDePolitesse) {
        this.formuleDePolitesse = formuleDePolitesse;
    }

    /**
     * @return the courriers
     */
    public List<Courrier> getCourriers() {
        return courriers;
    }

    /**
     * @param courriers the courriers to set
     */
    public void setCourriers(List<Courrier> courriers) {
        this.courriers = courriers;
    }

}
