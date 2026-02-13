/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = CoproprietairePersonne.NQ_GET_COPRPRIETAIRES_BY_NOM, query = "select c from CoproprietairePersonne c where lower(c.personne.nom) like :fragmentNom"),
    //@NamedQuery(name = CoproprietairePersonne.NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO, query = "select c from CoproprietairePersonne c where c.personne.nom like :fragmentNom and c.copropriete.id=:id"),
    @NamedQuery(name = CoproprietairePersonne.NQ_GET_COPRPRIETAIRES_BY_NOM_EXACT, query = "select c from CoproprietairePersonne c where c.personne.nom= :nom and c.personne.prenom= :prenom"),
    @NamedQuery(name = CoproprietairePersonne.NQ_GET_COPRPRIETAIRES_BY_ID_PERSONNE, query = "select c from CoproprietairePersonne c left join fetch c.coproprietePourPhaseImport where c.personne.id= :id"),
    @NamedQuery(name = CoproprietairePersonne.NQ_GET_COPRPRIETAIRES_PERSONNE_BY_NUM_TEL, query = "select c from CoproprietairePersonne c where lower(c.personne.telPortable) like :numTel "
    + "or lower(c.personne.telPortable) like :numTelTirets "
    + "or lower(c.personne.telPortable) like :numTelPoints "
    + "or lower(c.personne.telPortable) like :numTelEspaces "
    + "or lower(c.personne.telFixe) like :numTel "
    + "or lower(c.personne.telFixe) like :numTelTirets "
    + "or lower(c.personne.telFixe) like :numTelPoints "
    + "or lower(c.personne.telFixe) like :numTelEspaces")
})

public class CoproprietairePersonne extends Coproprietaire implements Serializable {

    private static final long serialVersionUID = 1L;
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM = "getCoproprietairesPersonnesByNom";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO = "getCoproprietairesPersonnesByNomCopro";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM_EXACT = "getCoproprietairesPersonnesByNomExact";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_ID_PERSONNE = "getCoproprietairesPersonnesByidPersonne";
    public final static transient String NQ_GET_COPRPRIETAIRES_PERSONNE_BY_NUM_TEL = "getCoproprietairesPersonnesByNumTel";
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Personne personne;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoproprietairePersonne)) {
            return false;
        }
        CoproprietairePersonne other = (CoproprietairePersonne) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getModeAffichage() == AFFICHE_NOM) {
            return getPersonne().toString();
        } else {
            String s = "";
            if (getCoproprietePourPhaseImport() != null) {
                s = getPersonne().toString() + " (" + getCoproprietePourPhaseImport().getTrigramme() + " ";
            } else {
                s = getPersonne().toString() + " ";
            }
            
            for (Lot l : getLots()) {
                if (s.contains(l.getCopropriete().getTrigramme() + " ") == false) {
                    s = s + l.getCopropriete().getTrigramme() + " ";
                }
            }
            s = s + ")";
            return s;
        }


    }
}
