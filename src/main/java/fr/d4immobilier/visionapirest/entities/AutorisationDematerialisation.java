/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class AutorisationDematerialisation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private MatriculeICS matriculeICS;
    private ContenuDematerialisation contenuDematerialisation;
    private SupportDematerialisation supportDematerialisation;
    @OneToMany(mappedBy = "autorisationDematerialisation", fetch = FetchType.LAZY)
    private List<EvenementAutorisationDematerialisation> evenementsAutorisationDematerialisation;
    private StatutAutorisationDematerialisation statutAutorisationDematerialisation;
    
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
        if (!(object instanceof AutorisationDematerialisation)) {
            return false;
        }
        AutorisationDematerialisation other = (AutorisationDematerialisation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.AutorisationDematerialisation[ id=" + id + " ]";
    }

    /**
     * @return the matriculeICS
     */
    public MatriculeICS getMatriculeICS() {
        return matriculeICS;
    }

    /**
     * @param matriculeICS the matriculeICS to set
     */
    public void setMatriculeICS(MatriculeICS matriculeICS) {
        this.matriculeICS = matriculeICS;
    }

    /**
     * @return the contenuDematerialisation
     */
    public ContenuDematerialisation getContenuDematerialisation() {
        return contenuDematerialisation;
    }

    /**
     * @param contenuDematerialisation the contenuDematerialisation to set
     */
    public void setContenuDematerialisation(ContenuDematerialisation contenuDematerialisation) {
        this.contenuDematerialisation = contenuDematerialisation;
    }

    /**
     * @return the supportDematerialisation
     */
    public SupportDematerialisation getSupportDematerialisation() {
        return supportDematerialisation;
    }

    /**
     * @param supportDematerialisation the supportDematerialisation to set
     */
    public void setSupportDematerialisation(SupportDematerialisation supportDematerialisation) {
        this.supportDematerialisation = supportDematerialisation;
    }

    /**
     * @return the evenementsAutorisationDematerialisation
     */
    public List<EvenementAutorisationDematerialisation> getEvenementsAutorisationDematerialisation() {
        return evenementsAutorisationDematerialisation;
    }

    /**
     * @param evenementsAutorisationDematerialisation the evenementsAutorisationDematerialisation to set
     */
    public void setEvenementsAutorisationDematerialisation(List<EvenementAutorisationDematerialisation> evenementsAutorisationDematerialisation) {
        this.evenementsAutorisationDematerialisation = evenementsAutorisationDematerialisation;
    }

    /**
     * @return the statutAutorisationDematerialisation
     */
    public StatutAutorisationDematerialisation getStatutAutorisationDematerialisation() {
        return statutAutorisationDematerialisation;
    }

    /**
     * @param statutAutorisationDematerialisation the statutAutorisationDematerialisation to set
     */
    public void setStatutAutorisationDematerialisation(StatutAutorisationDematerialisation statutAutorisationDematerialisation) {
        this.statutAutorisationDematerialisation = statutAutorisationDematerialisation;
    }
    
}
