/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
@NamedQuery(name=CoproprietaireSociete.NQ_GET_COPRPRIETAIRES_BY_NOM,query="select c from CoproprietaireSociete c where lower(c.societe.raisonSociale) like :fragmentNom"),
//@NamedQuery(name=CoproprietaireSociete.NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO,query="select c from CoproprietaireSociete c where c.societe.raisonSociale like :fragmentNom and c.copropriete.id=:id"),
@NamedQuery(name=CoproprietaireSociete.NQ_GET_COPRPRIETAIRES_BY_NOM_EXACT,query="select c from CoproprietaireSociete c where c.societe.raisonSociale= :raisonSociale"),
@NamedQuery(name=CoproprietaireSociete.NQ_GET_COPRPRIETAIRES_BY_SOCIETE,query="select c from CoproprietaireSociete c left join fetch c.coproprietePourPhaseImport where c.societe.id= :id"),
@NamedQuery(name=CoproprietaireSociete.NQ_GET_COPRPRIETAIRES_SOCIETE_BY_NUM_TEL,query="select c from CoproprietaireSociete c where lower(c.societe.telFixe) like :numTel "
    + "or lower(c.societe.telPortable) like :numTelTirets "
    + "or lower(c.societe.telPortable) like :numTelPoints "
    + "or lower(c.societe.telPortable) like :numTelEspaces "
    + "or lower(c.societe.telFixe) like :numTel "
    + "or lower(c.societe.telFixe) like :numTelTirets "
    + "or lower(c.societe.telFixe) like :numTelPoints "
    + "or lower(c.societe.telFixe) like :numTelEspaces")


})
public class CoproprietaireSociete extends Coproprietaire implements Serializable {
    private static final long serialVersionUID = 1L;
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM = "getCoproprietairesSocietesByNom";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO = "getCoproprietairesSocietesByNomCopro";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM_EXACT = "getCoproprietairesSocietesByNomExact";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_SOCIETE = "getCoproprietairesSocietesBySociete";
    public final static transient String NQ_GET_COPRPRIETAIRES_SOCIETE_BY_NUM_TEL = "getCoproprietairesSocietesByNumTel";
    

    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Societe societe;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoproprietaireSociete)) {
            return false;
        }
        CoproprietaireSociete other = (CoproprietaireSociete) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getModeAffichage() == AFFICHE_NOM) {
            return getSociete().toString();
        } else {
            String s = getSociete().toString() + " (" + getCoproprietePourPhaseImport().getTrigramme() + " ";
            for (Lot l : getLots()) {
                if (s.contains(l.getCopropriete().getTrigramme() + " ") == false) {
                    s = s + l.getCopropriete().getTrigramme() + " ";
                }
            }
            s = s + ")";
            return s;
        }


    }

    /**
     * @return the Societe
     */
    public Societe getSociete() {
        return societe;
    }

    /**
     * @param Societe the Societe to set
     */
    public void setSociete(Societe societe) {
        this.societe = societe;
    }

}
