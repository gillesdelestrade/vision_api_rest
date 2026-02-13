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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Lot implements Serializable {
    @OneToMany(mappedBy = "lot", fetch = FetchType.LAZY)
    private List<EmplacementPanneauBALInterphone> emplacementsPanneauBALInterphone;
    @OneToMany(mappedBy = "lotRattache", fetch = FetchType.LAZY)
    private List<MoyenAcces> moyensAccess;
    @ManyToOne(fetch = FetchType.LAZY)
    private Batiment batiment;
    @ManyToOne(fetch = FetchType.LAZY)
    private Mandataire mandataire;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Coproprietaire> coproprietaires;

    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;

    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire representantAG;

    @OneToMany(mappedBy = "lot",cascade={CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Tantieme> tantiemes;
    
    private String numeroDeLot;
    private String etage;
    private String numeroAppartement;
    private Float surface;
    private String nature;


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
        if (!(object instanceof Lot)) {
            return false;
        }
        Lot other = (Lot) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String debut = "";
        String fin = "";
        if ((getCoproprietaires()==null) || (getCoproprietaires().isEmpty())) {
            debut = "<HTML><B>";
            fin = "</B></HTML>";
        } else {
            debut = "<HTML><FONT color=\"gray\">";
            fin = "</FONT></HTML>";
        }
        if ((getNature() != null) && (getNature().isEmpty() == false)) {
            return debut + getNumeroDeLot() + " (" + getNature() + ")" + fin;
        } else {
            return debut + getNumeroDeLot() + fin;
        }
        
    }

    /**
     * @return the coproprietaire
     */


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
     * @return the tantiemes
     */
    public List<Tantieme> getTantiemes() {
        return tantiemes;
    }

    /**
     * @param tantiemes the tantiemes to set
     */
    public void setTantiemes(List<Tantieme> tantiemes) {
        this.tantiemes = tantiemes;
    }

    /**
     * @return the numeroDeLot
     */
    public String getNumeroDeLot() {
        return numeroDeLot;
    }

    /**
     * @param numeroDeLot the numeroDeLot to set
     */
    public void setNumeroDeLot(String numeroDeLot) {
        this.numeroDeLot = numeroDeLot;
    }

    /**
     * @return the coproprietaires
     */
    public List<Coproprietaire> getCoproprietaires() {
        return coproprietaires;
    }

    /**
     * @param coproprietaires the coproprietaires to set
     */
    public void setCoproprietaires(List<Coproprietaire> coproprietaires) {
        this.coproprietaires = coproprietaires;
    }

    /**
     * @return the representantAG
     */
    public Coproprietaire getRepresentantAG() {
        return representantAG;
    }

    /**
     * @param representantAG the representantAG to set
     */
    public void setRepresentantAG(Coproprietaire representantAG) {
        this.representantAG = representantAG;
    }

    /**
     * @return the batiment
     */
    public Batiment getBatiment() {
        return batiment;
    }

    /**
     * @param batiment the batiment to set
     */
    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }

    /**
     * @return the etage
     */
    public String getEtage() {
        return etage;
    }

    /**
     * @param etage the etage to set
     */
    public void setEtage(String etage) {
        this.etage = etage;
    }

    /**
     * @return the numeroAppartement
     */
    public String getNumeroAppartement() {
        return numeroAppartement;
    }

    /**
     * @param numeroAppartement the numeroAppartement to set
     */
    public void setNumeroAppartement(String numeroAppartement) {
        this.numeroAppartement = numeroAppartement;
    }

    /**
     * @return the surface
     */
    public Float getSurface() {
        return surface;
    }

    /**
     * @param surface the surface to set
     */
    public void setSurface(Float surface) {
        this.surface = surface;
    }

    /**
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(String nature) {
        this.nature = nature;
    }

}
