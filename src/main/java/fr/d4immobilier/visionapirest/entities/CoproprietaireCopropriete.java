/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
@NamedQuery(name=CoproprietaireCopropriete.NQ_GET_COPRPRIETAIRE_BY_COPROPRIETE,query="select c from CoproprietaireCopropriete c where c.copropriete.id= :id"),
@NamedQuery(name = CoproprietaireCopropriete.NQ_GET_COPRPRIETAIRES_BY_NOM, query = "select c from CoproprietaireCopropriete c where lower(c.copropriete.nom) like :fragmentNom")
//@NamedQuery(name = CoproprietaireCopropriete.NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO, query = "select c from CoproprietaireCopropriete c where c.copropriete.nom like :fragmentNom and c.copropriete.id=:id")
})

public class CoproprietaireCopropriete extends Coproprietaire implements Serializable {

    
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
        public final static transient String NQ_GET_COPRPRIETAIRE_BY_COPROPRIETE = "getCoproprietaireCoproprieteByCopropriete";
        public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM = "getCoproprietaireCoproprieteByNom";
        public final static transient String NQ_GET_COPRPRIETAIRES_BY_NOM_COPRO = "getCoproprietaireCoproprieteByNomCopro";


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoproprietaireCopropriete)) {
            return false;
        }
        CoproprietaireCopropriete other = (CoproprietaireCopropriete) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getModeAffichage() == AFFICHE_NOM) {
            return getCopropriete().toString();
        } else {
            String s = getCopropriete().toString() + " (" + getCoproprietePourPhaseImport().getTrigramme() + " ";
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
}
