/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DemandeDeRappel extends Demande implements Comparable<Demande>{
    @OneToMany(mappedBy = "demandeDeRappel", fetch = FetchType.LAZY)
    private List<RappelTelephonique> rappelsTelephoniques;
    private static final long serialVersionUID = 1L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire gestionnaireQuiDoitRappeler;
    private Instant dateAppel;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandeDeRappel)) {
            return false;
        }
        DemandeDeRappel other = (DemandeDeRappel) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /**
     * @return the gestionnaireQuiDoitRappeler
     */
    public Gestionnaire getGestionnaireQuiDoitRappeler() {
        return gestionnaireQuiDoitRappeler;
    }

    /**
     * @param gestionnaireQuiDoitRappeler the gestionnaireQuiDoitRappeler to set
     */
    public void setGestionnaireQuiDoitRappeler(Gestionnaire gestionnaireQuiDoitRappeler) {
        this.gestionnaireQuiDoitRappeler = gestionnaireQuiDoitRappeler;
    }

    /**
     * @return the dateAppel
     */
    public Instant getDateAppel() {
        return dateAppel;
    }

    /**
     * @param dateAppel the dateAppel to set
     */
    public void setDateAppel(Instant dateAppel) {
        this.dateAppel = dateAppel;
    }

    /**
     * @return the rappelsTelephoniques
     */
    public List<RappelTelephonique> getRappelsTelephoniques() {
        return rappelsTelephoniques;
    }

    /**
     * @param rappelsTelephoniques the rappelsTelephoniques to set
     */
    public void setRappelsTelephoniques(List<RappelTelephonique> rappelsTelephoniques) {
        this.rappelsTelephoniques = rappelsTelephoniques;
    }

    @Override
    public int compareTo(Demande t) {
      
        if (this.getDateAppel() != null && t instanceof DemandeDeRappel && ((DemandeDeRappel)t).getDateAppel() != null) {
            return this.getDateAppel().compareTo(((DemandeDeRappel)t).getDateAppel());
        } else {
            return super.compareTo(t);
        }        
        
    }
    
}
