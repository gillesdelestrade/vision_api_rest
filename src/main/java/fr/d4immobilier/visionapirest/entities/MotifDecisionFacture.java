/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
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
public class MotifDecisionFacture implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @OneToMany(mappedBy = "motifDecisionFacture", fetch = FetchType.LAZY)
    private List<FactureFournisseur> factureFournisseurs;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif;
    private AvisD4Facture avisD4;
    private String contenuMailType;

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
        if (!(object instanceof MotifDecisionFacture)) {
            return false;
        }
        MotifDecisionFacture other = (MotifDecisionFacture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getMotif();
    }

    /**
     * @return the factureFournisseurs
     */
    public List<FactureFournisseur> getFactureFournisseurs() {
        return factureFournisseurs;
    }

    /**
     * @param factureFournisseurs the factureFournisseurs to set
     */
    public void setFactureFournisseurs(List<FactureFournisseur> factureFournisseurs) {
        this.factureFournisseurs = factureFournisseurs;
    }

    /**
     * @return the motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * @param motif the motif to set
     */
    public void setMotif(String motif) {
        this.motif = motif;
    }

    /**
     * @return the avisD4
     */
    public AvisD4Facture getAvisD4() {
        return avisD4;
    }

    /**
     * @param avisD4 the avisD4 to set
     */
    public void setAvisD4(AvisD4Facture avisD4) {
        this.avisD4 = avisD4;
    }

    /**
     * @return the contenuMailType
     */
    public String getContenuMailType() {
        return contenuMailType;
    }

    /**
     * @param contenuMailType the contenuMailType to set
     */
    public void setContenuMailType(String contenuMailType) {
        this.contenuMailType = contenuMailType;
    }

}
