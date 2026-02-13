/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Coproprietaire.NQ_GET_COPRPRIETAIRES_BY_COPROPRIETE, query = "select distinct c from Coproprietaire c join c.lots l where l.copropriete.id= :coproprieteId"),
    @NamedQuery(name = Coproprietaire.NQ_GET_COPRPRIETAIRES_BY_CODE_BARRE_PRESENT, query = "select c from Coproprietaire c where c.codeBarrePresent= :cbp")

})
public class Coproprietaire implements Serializable, Comparable<Coproprietaire> {

    @OneToMany(mappedBy = "coproprietaire", fetch = FetchType.LAZY)
    private List<ResultatSondage> resultatSondages;
    @OneToMany(mappedBy = "coproprietaire", fetch = FetchType.LAZY)
    private List<MatriculeICS> matriculesICS;
    @OneToMany(mappedBy = "coproprietaireProvenance", fetch = FetchType.LAZY)
    private List<CourrierEntrant> courriersEntrants;
    @OneToMany(mappedBy = "coproprietaire", fetch = FetchType.LAZY)
    private List<SuppressionFraisDeRelance> suppressionFraisDeRelances;
    @OneToMany(mappedBy = "coproprietaire", fetch = FetchType.LAZY)
    private List<PartChequeCoproprietaire> partsChequeCoproprietaires;
    @ManyToMany(mappedBy = "coproprietairesConcernes", fetch = FetchType.LAZY)
    private List<TireurCheque> tireursCheques;
    @OneToMany(mappedBy = "coproprietaireOrigine", fetch = FetchType.LAZY)
    private List<Sinistre> sinistresEnTantQuOrigine;
    @OneToMany(mappedBy = "coproprietaireLese", fetch = FetchType.LAZY)
    private List<Sinistre> sinistresEnTantQueLese;
    @OneToMany(mappedBy = "representantAG", fetch = FetchType.LAZY)
    private List<Lot> lotsARepresenterEnAG;

    public final static transient String NQ_GET_COPRPRIETAIRES_BY_COPROPRIETE = "getCoproprietairesByCopropriete";
    public final static transient String NQ_GET_COPRPRIETAIRES_BY_CODE_BARRE_PRESENT = "getCoproprietairesByCodeBarrePresent";

    public final transient static int AFFICHE_NOM = 0;
    public final transient static int AFFICHE_NOM_COPROS = 1;

    private transient int modeAffichage = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "coproprietaires", fetch = FetchType.LAZY)
    private List<Lot> lots;
    private static final long serialVersionUID = 1L;
    private String codeBarrePresent;
    private String codeBarrePouvoir;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete coproprietePourPhaseImport;
    @ManyToOne(fetch = FetchType.LAZY)
    private Mandataire mandataire;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coproprietaire)) {
            return false;
        }
        Coproprietaire other = (Coproprietaire) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /**
     * @return the lots
     */
    public List<Lot> getLots() {
        return lots;
    }

    /**
     * @param lots the lots to set
     */
    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }

    /**
     * @return the codeBarre
     */
    public String getCodeBarrePresent() {
        return codeBarrePresent;
    }

    /**
     * @param codeBarre the codeBarre to set
     */
    public void setCodeBarrePresent(String codeBarrePresent) {
        this.codeBarrePresent = codeBarrePresent;
    }

    /**
     * @return the codeBarrePouvoir
     */
    public String getCodeBarrePouvoir() {
        return codeBarrePouvoir;
    }

    /**
     * @param codeBarrePouvoir the codeBarrePouvoir to set
     */
    public void setCodeBarrePouvoir(String codeBarrePouvoir) {
        this.codeBarrePouvoir = codeBarrePouvoir;
    }

    /**
     * @return the lotsARepresenterEnAG
     */
    public List<Lot> getLotsARepresenterEnAG() {
        return lotsARepresenterEnAG;
    }

    /**
     * @param lotsARepresenterEnAG the lotsARepresenterEnAG to set
     */
    public void setLotsARepresenterEnAG(List<Lot> lotsARepresenterEnAG) {
        this.lotsARepresenterEnAG = lotsARepresenterEnAG;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the coproprietePourPhaseImport
     */
    public Copropriete getCoproprietePourPhaseImport() {
        return coproprietePourPhaseImport;
    }

    /**
     * @param coproprietePourPhaseImport the coproprietePourPhaseImport to set
     */
    public void setCoproprietePourPhaseImport(Copropriete coproprietePourPhaseImport) {
        this.coproprietePourPhaseImport = coproprietePourPhaseImport;
    }

    /**
     * @return the modeAffichage
     */
    public int getModeAffichage() {
        return modeAffichage;
    }

    /**
     * @param modeAffichage the modeAffichage to set
     */
    public void setModeAffichage(int modeAffichage) {
        this.modeAffichage = modeAffichage;
    }

    /**
     * @return the suppressionFraisDeRelances
     */
    public List<SuppressionFraisDeRelance> getSuppressionFraisDeRelances() {
        return suppressionFraisDeRelances;
    }

    /**
     * @param suppressionFraisDeRelances the suppressionFraisDeRelances to set
     */
    public void setSuppressionFraisDeRelances(List<SuppressionFraisDeRelance> suppressionFraisDeRelances) {
        this.suppressionFraisDeRelances = suppressionFraisDeRelances;
    }

    /**
     * @return the matriculesICS
     */
    public List<MatriculeICS> getMatriculesICS() {
        return matriculesICS;
    }

    /**
     * @param matriculesICS the matriculesICS to set
     */
    public void setMatriculesICS(List<MatriculeICS> matriculesICS) {
        this.matriculesICS = matriculesICS;
    }

    @Override
    public int compareTo(Coproprietaire o) {
        if (o != null) {
            return this.toString().compareToIgnoreCase(o.toString());
        } else {
            return this.toString().compareToIgnoreCase("");
        }
    }

    /**
     * @return the mandataire
     */
    public Mandataire getMandataire() {
        return mandataire;
    }

    /**
     * @param mandataire the mandataire to set
     */
    public void setMandataire(Mandataire mandataire) {
        this.mandataire = mandataire;
    }

}
