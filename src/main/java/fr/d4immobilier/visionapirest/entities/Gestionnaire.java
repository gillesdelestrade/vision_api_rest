/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Gestionnaire.NQ_GET_ALL_GESTIONNAIRES, query = "select g from Gestionnaire g where g.compteVision.actif=:oui order by g.nom,g.prenom asc"),
    @NamedQuery(name = Gestionnaire.NQ_GET_ALL_GESTIONNAIRES_BY_AGENCE, query = "select g from Gestionnaire g where g.agence.id= :idAgence order by g.nom,g.prenom asc")
})
public class Gestionnaire extends Utilisateur implements Serializable {

    @OneToMany(mappedBy = "gestionnaireSedentaire", fetch = FetchType.LAZY)
    private List<Copropriete> coproprietesGereesEnTantQueSedentaire;
//    @OneToMany(mappedBy = "interlocuteurD4", fetch = FetchType.LAZY)
//    private List<AppelEntrant> appelsEntrants;
    @ManyToOne(fetch = FetchType.LAZY)
    private Agence agence;

    public static final transient String NQ_GET_ALL_GESTIONNAIRES = "getAllGestionnaires";
    public static final transient String NQ_GET_ALL_GESTIONNAIRES_BY_AGENCE = "getAllGestionnairesByAgence";

    @OneToMany(mappedBy = "gestionnaire", fetch = FetchType.LAZY)
    private List<Copropriete> coproprietes;
    private static final long serialVersionUID = 1L;

    private String numeroDePoste;
    private String initialesICS;
    private String fonctiond4;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestionnaire)) {
            return false;
        }
        Gestionnaire other = (Gestionnaire) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /**
     * @return the coproprietes
     */
    public List<Copropriete> getCoproprietes() {
        return coproprietes;
    }

    /**
     * @param coproprietes the coproprietes to set
     */
    public void setCoproprietes(List<Copropriete> coproprietes) {
        this.coproprietes = coproprietes;
    }

    /**
     * @return the agence
     */
    public Agence getAgence() {
        return agence;
    }

    /**
     * @param agence the agence to set
     */
    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    /**
     * @return the numeroDePoste
     */
    public String getNumeroDePoste() {
        return numeroDePoste;
    }

    /**
     * @param numeroDePoste the numeroDePoste to set
     */
    public void setNumeroDePoste(String numeroDePoste) {
        this.numeroDePoste = numeroDePoste;
    }

    /**
     * @return the coproprietesGereesEnTantQueSedentaire
     */
    public List<Copropriete> getCoproprietesGereesEnTantQueSedentaire() {
        return coproprietesGereesEnTantQueSedentaire;
    }

    /**
     * @param coproprietesGereesEnTantQueSedentaire the
     * coproprietesGereesEnTantQueSedentaire to set
     */
    public void setCoproprietesGereesEnTantQueSedentaire(List<Copropriete> coproprietesGereesEnTantQueSedentaire) {
        this.coproprietesGereesEnTantQueSedentaire = coproprietesGereesEnTantQueSedentaire;
    }

    /**
     * @return the initialesICS
     */
    public String getInitialesICS() {
        return initialesICS;
    }

    /**
     * @param initialesICS the initialesICS to set
     */
    public void setInitialesICS(String initialesICS) {
        this.initialesICS = initialesICS;
    }

    /**
     * @return the fonctiond4
     */
    public String getFonctiond4() {
        return fonctiond4;
    }

    /**
     * @param fonctiond4 the fonctiond4 to set
     */
    public void setFonctiond4(String fonctiond4) {
        this.fonctiond4 = fonctiond4;
    }

    public String getInitiales() {
        StringBuilder initiales = new StringBuilder();

        if (getPrenom() != null && !getPrenom().isEmpty()) {
            initiales.append(getPrenom().substring(0, 1).toUpperCase());
        }

        if (getNom() != null && !getNom().isEmpty()) {
            initiales.append(getNom().substring(0, 1).toUpperCase());
        }

        return initiales.toString();
    }

}
