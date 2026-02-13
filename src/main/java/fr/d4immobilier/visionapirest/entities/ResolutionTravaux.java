/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class ResolutionTravaux implements Serializable {
    
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private RegroupementResolutions regroupementResolutions;
    @OneToMany(mappedBy = "resolutionTravaux", fetch = FetchType.LAZY)
    private List<OptionTravaux> optionsTravaux;
    private Float enveloppeCSSyndic;
    @OneToOne(mappedBy = "resolutionTravaux", fetch = FetchType.LAZY)
    private HonorairesSurTravaux honorairesSurTravaux;
    @OneToMany(mappedBy = "resolutionTravaux", fetch = FetchType.LAZY)
    private List<FinancementTravaux> financementsTravaux;
    @OneToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @OneToOne(fetch = FetchType.LAZY)
    private Resolution resolutionEnveloppe;
    
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
        if (!(object instanceof ResolutionTravaux)) {
            return false;
        }
        ResolutionTravaux other = (ResolutionTravaux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ResolutionTravaux[ id=" + id + " ]";
    }

    /**
     * @return the regroupementResolutions
     */
    public RegroupementResolutions getRegroupementResolutions() {
        return regroupementResolutions;
    }

    /**
     * @param regroupementResolutions the regroupementResolutions to set
     */
    public void setRegroupementResolutions(RegroupementResolutions regroupementResolutions) {
        this.regroupementResolutions = regroupementResolutions;
    }

    /**
     * @return the optionsTravaux
     */
    public List<OptionTravaux> getOptionsTravaux() {
        return optionsTravaux;
    }

    /**
     * @param optionsTravaux the optionsTravaux to set
     */
    public void setOptionsTravaux(List<OptionTravaux> optionsTravaux) {
        this.optionsTravaux = optionsTravaux;
    }

    /**
     * @return the enveloppeCSSyndic
     */
    public Float getEnveloppeCSSyndic() {
        return enveloppeCSSyndic;
    }

    /**
     * @param enveloppeCSSyndic the enveloppeCSSyndic to set
     */
    public void setEnveloppeCSSyndic(Float enveloppeCSSyndic) {
        this.enveloppeCSSyndic = enveloppeCSSyndic;
    }

    /**
     * @return the honorairesSurTravaux
     */
    public HonorairesSurTravaux getHonorairesSurTravaux() {
        return honorairesSurTravaux;
    }

    /**
     * @param honorairesSurTravaux the honorairesSurTravaux to set
     */
    public void setHonorairesSurTravaux(HonorairesSurTravaux honorairesSurTravaux) {
        this.honorairesSurTravaux = honorairesSurTravaux;
    }

    /**
     * @return the financementsTravaux
     */
    public List<FinancementTravaux> getFinancementsTravaux() {
        return financementsTravaux;
    }

    /**
     * @param financementsTravaux the financementsTravaux to set
     */
    public void setFinancementsTravaux(List<FinancementTravaux> financementsTravaux) {
        this.financementsTravaux = financementsTravaux;
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    /**
     * @return the resolutionEnveloppe
     */
    public Resolution getResolutionEnveloppe() {
        return resolutionEnveloppe;
    }

    /**
     * @param resolutionEnveloppe the resolutionEnveloppe to set
     */
    public void setResolutionEnveloppe(Resolution resolutionEnveloppe) {
        this.resolutionEnveloppe = resolutionEnveloppe;
    }
    
}
