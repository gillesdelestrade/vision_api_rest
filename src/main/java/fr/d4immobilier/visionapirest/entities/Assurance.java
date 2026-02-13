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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Assurance implements Serializable {
    @OneToMany(mappedBy = "assurance", fetch = FetchType.LAZY)
    private List<Sinistre> sinistres;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur courtier;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur compagnieDAssurance;
    private String police;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private TypeAssurance typeAssurance;

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
        if (!(object instanceof Assurance)) {
            return false;
        }
        Assurance other = (Assurance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        if (getTypeAssurance() != null) {
            s = s + getTypeAssurance();
        }
        if (getCompagnieDAssurance()!=null) {
            s = s + " " + getCompagnieDAssurance().getRaisonSociale() + "-";
        } if (getCourtier() != null) {
            s = s + getCourtier().getRaisonSociale() + "-";
        }
        s = s + getPolice();
        return s;
    }

    /**
     * @return the courtier
     */
    public Fournisseur getCourtier() {
        return courtier;
    }

    /**
     * @param courtier the courtier to set
     */
    public void setCourtier(Fournisseur courtier) {
        this.courtier = courtier;
    }

    /**
     * @return the compagnieDAssurance
     */
    public Fournisseur getCompagnieDAssurance() {
        return compagnieDAssurance;
    }

    /**
     * @param compagnieDAssurance the compagnieDAssurance to set
     */
    public void setCompagnieDAssurance(Fournisseur compagnieDAssurance) {
        this.compagnieDAssurance = compagnieDAssurance;
    }

    /**
     * @return the police
     */
    public String getPolice() {
        return police;
    }

    /**
     * @param police the police to set
     */
    public void setPolice(String police) {
        this.police = police;
    }

    /**
     * @return the sinistres
     */
    public List<Sinistre> getSinistres() {
        return sinistres;
    }

    /**
     * @param sinistres the sinistres to set
     */
    public void setSinistres(List<Sinistre> sinistres) {
        this.sinistres = sinistres;
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

    /**
     * @return the typeAssurance
     */
    public TypeAssurance getTypeAssurance() {
        return typeAssurance;
    }

    /**
     * @param typeAssurance the typeAssurance to set
     */
    public void setTypeAssurance(TypeAssurance typeAssurance) {
        this.typeAssurance = typeAssurance;
    }

}
