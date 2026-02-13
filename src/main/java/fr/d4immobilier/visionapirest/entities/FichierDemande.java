/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostUpdate;

import jakarta.persistence.FetchType;


/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FichierDemande extends Fichier implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    private ReunionV2 reunionV2;
    private static final long serialVersionUID = 1L;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtapeDemande etapeDemande;
    private Boolean aLaCorbeille;
    private Long idDI;
    private Long idDDF;
    @ManyToOne
    private NatureFichierSinistre natureFichierSinistre;

    @Override
    public int hashCode() {        
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);        
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the getId() fields are not set
        if (!(object instanceof FichierDemande)) {
            return false;
        }
        FichierDemande other = (FichierDemande) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomFichier();
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

    @PostLoad
    public void initNomStockage() {
        if (getNomStockage() == null) {
            setNomStockage(getId() + "_" + getNomFichier());
        }
    }

    /**
     * @return the etapeDemande
     */
    public EtapeDemande getEtapeDemande() {
        return etapeDemande;
    }

    /**
     * @param etapeDemande the etapeDemande to set
     */
    public void setEtapeDemande(EtapeDemande etapeDemande) {
        this.etapeDemande = etapeDemande;
    }

    /**
     * @return the aLaCorbeille
     */
    public Boolean getaLaCorbeille() {
        return aLaCorbeille;
    }

    /**
     * @param aLaCorbeille the aLaCorbeille to set
     */
    public void setaLaCorbeille(Boolean aLaCorbeille) {
        this.aLaCorbeille = aLaCorbeille;
    }

    /**
     * @return the reunionV2
     */
    public ReunionV2 getReunionV2() {
        return reunionV2;
    }

    /**
     * @param reunionV2 the reunionV2 to set
     */
    public void setReunionV2(ReunionV2 reunionV2) {
        this.reunionV2 = reunionV2;
    }

    /**
     * @return the idDI
     */
    public Long getIdDI() {
        return idDI;
    }

    /**
     * @param idDI the idDI to set
     */
    public void setIdDI(Long idDI) {
        this.idDI = idDI;
    }

    /**
     * @return the idDDF
     */
    public Long getIdDDF() {
        return idDDF;
    }

    /**
     * @param idDDF the idDDF to set
     */
    public void setIdDDF(Long idDDF) {
        this.idDDF = idDDF;
    }

    /**
     * @return the natureFichierSinistre
     */
    public NatureFichierSinistre getNatureFichierSinistre() {
        return natureFichierSinistre;
    }

    /**
     * @param natureFichierSinistre the natureFichierSinistre to set
     */
    public void setNatureFichierSinistre(NatureFichierSinistre natureFichierSinistre) {
        this.natureFichierSinistre = natureFichierSinistre;
    }
    
    @PostUpdate
    public void envoieMail() {
        
    }

}
