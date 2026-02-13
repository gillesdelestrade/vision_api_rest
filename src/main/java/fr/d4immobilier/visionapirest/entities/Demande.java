/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Demande implements Serializable, Comparable<Demande> {
    @OneToOne(mappedBy = "demande", fetch = FetchType.LAZY)
    private DemandeSansCompteVision demandeSansCompteVision;
    @OneToOne(mappedBy = "demande", fetch = FetchType.LAZY)
    private ResolutionTravaux resolutionTravaux;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<Sondage> sondages;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<ProchaineEtapeDemande> prochainesEtapesDemandes;

    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<PointAborde> pointsAbordes;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<DemandeDevis> demandeDevis;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<CourrierDemande> courriersDemandes;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<AppelEntrant> appelsEntrant;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<ActionDemande> actionDemandes;
    @OneToMany(mappedBy = "demande", fetch = FetchType.LAZY)
    private List<InterventionDemande> interventionDemandes;
    @OneToMany(mappedBy = "demande", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<FichierDemande> fichierDemandes;
    @OneToMany(mappedBy = "demande", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<EvenementDemande> evenementsDemande;
    private static final long serialVersionUID = 1L;
    public static final int DESCRIPTION_LENGTH = 4000;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateConstat;
    private LocalDate dateButoire;
    private LocalDate dateClotureParD4;
    private LocalDate dateClotureDefinitive;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne emetteur;
    @Column(length = DESCRIPTION_LENGTH)
    private String description;
    private EtatDemande etatDemande;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Boolean visibleParCoproprietaires;
    //private Boolean reponduAuxAttentes;
    private Boolean delaisSatisfaisants;
    private Boolean explicationsClairesCompletes;

    private Importance importance;
    private Urgence urgence;

    @ManyToOne(fetch = FetchType.LAZY)
    private Equipement equipement;

    private Boolean generiqueEquipement;

    private transient boolean surveillanceActive = true;
    private transient boolean aPrendreEnCompte = false;

    private LocalDate notBefore;

    @ManyToOne(fetch = FetchType.LAZY)
    private Personne attributaire;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Personne> historiqueAttributaire;

    @ManyToOne(fetch = FetchType.LAZY)
    private BoiteArchive boiteArchive;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Personne> personnesAbonnees;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Societe> societesAbonnees;

    private Boolean epingle;
    
    private LocalDate dateDemandeClotureCoproprietaire;
    
    private Instant dateDernierImportMailAtraiter;
    
    private Long numero; // numero unique par copropriete
    
    private Boolean suiviCS;
    
    private Boolean dossierPermanent;
    
    private Boolean direct;
    
    private Boolean ag;
    
    private Boolean visibleParLeCS;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        String intitule = getDateConstat().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ";
        if (getEmetteur() != null) {
            intitule = intitule + " " + getEmetteur().toString() + " " + getDescription();
        } else {
            intitule = intitule + " " + getDescription();
        }
        if (isaPrendreEnCompte()) {
            intitule = "<b>" + intitule + "</b>";
        }
        if (getEtatDemande().equals(EtatDemande.OUVERT)) {
            s = "<html><font color=\"red\">" + intitule + "</font></html>";
        } else if (getEtatDemande().equals(EtatDemande.BLOQUE)) {
            s = "<html><font color=\"purple\">" + intitule + "</font></html>";
        } else if (getEtatDemande().equals(EtatDemande.CLOTURE_DEFINITIVEMENT)) {
            s = "<html><font color=\"grey\">" + intitule + "</font></html>";
        } else {
            s = "<html>" + intitule + "</html>";
        }
        return s;
    }

    /**
     * @return the evenementsDemande
     */
    public List<EvenementDemande> getEvenementsDemande() {
        return evenementsDemande;
    }

    /**
     * @param evenementsDemande the evenementsDemande to set
     */
    public void setEvenementsDemande(List<EvenementDemande> evenementsDemande) {
        this.evenementsDemande = evenementsDemande;
    }

    /**
     * @return the dateConstat
     */
    public Instant getDateConstat() {
        return dateConstat;
    }

    /**
     * @param dateConstat the dateConstat to set
     */
    public void setDateConstat(Instant dateConstat) {
        this.dateConstat = dateConstat;
    }

    /**
     * @return the dateButoire
     */
    public LocalDate getDateButoire() {
        return dateButoire;
    }

    /**
     * @param dateButoire the dateButoire to set
     */
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    /**
     * @return the dateClotureParD4
     */
    public LocalDate getDateClotureParD4() {
        return dateClotureParD4;
    }

    /**
     * @param dateClotureParD4 the dateClotureParD4 to set
     */
    public void setDateClotureParD4(LocalDate dateClotureParD4) {
        this.dateClotureParD4 = dateClotureParD4;
    }

    /**
     * @return the dateClotureDefinitive
     */
    public LocalDate getDateClotureDefinitive() {
        return dateClotureDefinitive;
    }

    /**
     * @param dateClotureDefinitive the dateClotureDefinitive to set
     */
    public void setDateClotureDefinitive(LocalDate dateClotureDefinitive) {
        this.dateClotureDefinitive = dateClotureDefinitive;
    }

    /**
     * @return the emetteur
     */
    public Personne getEmetteur() {
        return emetteur;
    }

    /**
     * @param emetteur the emetteur to set
     */
    public void setEmetteur(Personne emetteur) {
        this.emetteur = emetteur;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the etatDemande
     */
    public EtatDemande getEtatDemande() {
        return etatDemande;
    }

    /**
     * @param etatDemande the etatDemande to set
     */
    public void setEtatDemande(EtatDemande etatDemande) {
        this.etatDemande = etatDemande;
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
     * @return the visibleParCoproprietaires
     */
    public Boolean getVisibleParCoproprietaires() {
        return visibleParCoproprietaires;
    }

    /**
     * @param visibleParCoproprietaires the visibleParCoproprietaires to set
     */
    public void setVisibleParCoproprietaires(Boolean visibleParCoproprietaires) {
        this.visibleParCoproprietaires = visibleParCoproprietaires;
    }

    /**
     * @return the delaisSatisfaisants
     */
    public Boolean getDelaisSatisfaisants() {
        return delaisSatisfaisants;
    }

    /**
     * @param delaisSatisfaisants the delaisSatisfaisants to set
     */
    public void setDelaisSatisfaisants(Boolean delaisSatisfaisants) {
        this.delaisSatisfaisants = delaisSatisfaisants;
    }

    /**
     * @return the explicationsClairesCompletes
     */
    public Boolean getExplicationsClairesCompletes() {
        return explicationsClairesCompletes;
    }

    /**
     * @param explicationsClairesCompletes the explicationsClairesCompletes to
     * set
     */
    public void setExplicationsClairesCompletes(Boolean explicationsClairesCompletes) {
        this.explicationsClairesCompletes = explicationsClairesCompletes;
    }

    /**
     * @return the fichierDemandes
     */
    public List<FichierDemande> getFichierDemandes() {
        return fichierDemandes;
    }

    /**
     * @param fichierDemandes the fichierDemandes to set
     */
    public void setFichierDemandes(List<FichierDemande> fichierDemandes) {
        this.fichierDemandes = fichierDemandes;
    }

    /**
     * @return the importance
     */
    public Importance getImportance() {
        return importance;
    }

    /**
     * @param importance the importance to set
     */
    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    /**
     * @return the urgence
     */
    public Urgence getUrgence() {
        return urgence;
    }

    /**
     * @param urgence the urgence to set
     */
    public void setUrgence(Urgence urgence) {
        this.urgence = urgence;
    }

    /**
     * @return the actionDemandes
     */
    public List<ActionDemande> getActionDemandes() {
        return actionDemandes;
    }

    /**
     * @param actionDemandes the actionDemandes to set
     */
    public void setActionDemandes(List<ActionDemande> actionDemandes) {
        this.actionDemandes = actionDemandes;
    }

    /**
     * @return the interventionDemandes
     */
    public List<InterventionDemande> getInterventionDemandes() {
        return interventionDemandes;
    }

    /**
     * @param interventionDemandes the interventionDemandes to set
     */
    public void setInterventionDemandes(List<InterventionDemande> interventionDemandes) {
        this.interventionDemandes = interventionDemandes;
    }

    /**
     * @return the appelsEntrant
     */
    public List<AppelEntrant> getAppelsEntrant() {
        return appelsEntrant;
    }

    /**
     * @param appelsEntrant the appelsEntrant to set
     */
    public void setAppelsEntrant(List<AppelEntrant> appelsEntrant) {
        this.appelsEntrant = appelsEntrant;
    }

    /**
     * @return the courriersDemandes
     */
    public List<CourrierDemande> getCourriersDemandes() {
        return courriersDemandes;
    }

    /**
     * @param courriersDemandes the courriersDemandes to set
     */
    public void setCourriersDemandes(List<CourrierDemande> courriersDemandes) {
        this.courriersDemandes = courriersDemandes;
    }

    /**
     * @return the boiteArchive
     */
    public BoiteArchive getBoiteArchive() {
        return boiteArchive;
    }

    /**
     * @param boiteArchive the boiteArchive to set
     */
    public void setBoiteArchive(BoiteArchive boiteArchive) {
        this.boiteArchive = boiteArchive;
    }

    /**
     * @return the surveillanceActive
     */
    public boolean isSurveillanceActive() {
        return surveillanceActive;
    }

    /**
     * @param surveillanceActive the surveillanceActive to set
     */
    public void setSurveillanceActive(boolean surveillanceActive) {
        this.surveillanceActive = surveillanceActive;
    }

    /**
     * @return the aPrendreEnCompte
     */
    public boolean isaPrendreEnCompte() {
        return aPrendreEnCompte;
    }

    /**
     * @param aPrendreEnCompte the aPrendreEnCompte to set
     */
    public void setaPrendreEnCompte(boolean aPrendreEnCompte) {
        this.aPrendreEnCompte = aPrendreEnCompte;
    }

    /**
     * @return the demandeDevis
     */
    public List<DemandeDevis> getDemandeDevis() {
        return demandeDevis;
    }

    /**
     * @param demandeDevis the demandeDevis to set
     */
    public void setDemandeDevis(List<DemandeDevis> demandeDevis) {
        this.demandeDevis = demandeDevis;
    }

    @Override
    public int compareTo(Demande t) {
        if (this.getPriorite().compareTo(t.getPriorite()) == 0) {
            if (this.getDateConstat().compareTo(t.getDateConstat()) == 0) {
                return this.getId().compareTo(t.getId());
            }
            return this.getDateConstat().compareTo(t.getDateConstat());
        }
        return this.getPriorite().compareTo(t.getPriorite());
    }

    /**
     * @return the equipement
     */
    public Equipement getEquipement() {
        return equipement;
    }

    /**
     * @param equipement the equipement to set
     */
    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    /**
     * @return the generiqueEquipement
     */
    public Boolean getGeneriqueEquipement() {
        return generiqueEquipement;
    }

    /**
     * @param generiqueEquipement the generiqueEquipement to set
     */
    public void setGeneriqueEquipement(Boolean generiqueEquipement) {
        this.generiqueEquipement = generiqueEquipement;
    }

    /**
     * @return the pointsAbordes
     */
    public List<PointAborde> getPointsAbordes() {
        return pointsAbordes;
    }

    /**
     * @param pointsAbordes the pointsAbordes to set
     */
    public void setPointsAbordes(List<PointAborde> pointsAbordes) {
        this.pointsAbordes = pointsAbordes;
    }

    /**
     * @return the attributaire
     */
    public Personne getAttributaire() {
        return attributaire;
    }

    /**
     * @param attributaire the attributaire to set
     */
    public void setAttributaire(Personne attributaire) {
        this.attributaire = attributaire;
    }

    /**
     * @return the historiqueAttributaire
     */
    public List<Personne> getHistoriqueAttributaire() {
        return historiqueAttributaire;
    }

    /**
     * @param historiqueAttributaire the historiqueAttributaire to set
     */
    public void setHistoriqueAttributaire(List<Personne> historiqueAttributaire) {
        this.historiqueAttributaire = historiqueAttributaire;
    }

    /**
     * @return the notBefore
     */
    public LocalDate getNotBefore() {
        return notBefore;
    }

    /**
     * @param notBefore the notBefore to set
     */
    public void setNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * @return the personnesAbonnees
     */
    public List<Personne> getPersonnesAbonnees() {
        return personnesAbonnees;
    }

    /**
     * @param personnesAbonnees the personnesAbonnees to set
     */
    public void setPersonnesAbonnees(List<Personne> personnesAbonnees) {
        this.personnesAbonnees = personnesAbonnees;
    }

    /**
     * @return the societesAbonnees
     */
    public List<Societe> getSocietesAbonnees() {
        return societesAbonnees;
    }

    /**
     * @param societesAbonnees the societesAbonnees to set
     */
    public void setSocietesAbonnees(List<Societe> societesAbonnees) {
        this.societesAbonnees = societesAbonnees;
    }

    /**
     * @return the epingle
     */
    public Boolean getEpingle() {
        return epingle;
    }

    /**
     * @param epingle the epingle to set
     */
    public void setEpingle(Boolean epingle) {
        this.epingle = epingle;
    }

    public Integer getPriorite() {
        Integer priorite = 0;
        if (this.getUrgence() != null && this.getImportance() != null) {
            priorite = 10 - (3 * (2 - this.getUrgence().ordinal()) + 3 - this.getImportance().ordinal());
        }
        return priorite;
    }

    /**
     * @return the dateDemandeClotureCoproprietaire
     */
    public LocalDate getDateDemandeClotureCoproprietaire() {
        return dateDemandeClotureCoproprietaire;
    }

    /**
     * @param dateDemandeClotureCoproprietaire the dateDemandeClotureCoproprietaire to set
     */
    public void setDateDemandeClotureCoproprietaire(LocalDate dateDemandeClotureCoproprietaire) {
        this.dateDemandeClotureCoproprietaire = dateDemandeClotureCoproprietaire;
    }

    /**
     * @return the dateDernierImportMailAtraiter
     */
    public Instant getDateDernierImportMailAtraiter() {
        return dateDernierImportMailAtraiter;
    }

    /**
     * @param dateDernierImportMailAtraiter the dateDernierImportMailAtraiter to set
     */
    public void setDateDernierImportMailAtraiter(Instant dateDernierImportMailAtraiter) {
        this.dateDernierImportMailAtraiter = dateDernierImportMailAtraiter;
    }

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return the suiviCS
     */
    public Boolean getSuiviCS() {
        return suiviCS;
    }

    /**
     * @param suiviCS the suiviCS to set
     */
    public void setSuiviCS(Boolean suiviCS) {
        this.suiviCS = suiviCS;
    }

    /**
     * @return the dossierPermanent
     */
    public Boolean getDossierPermanent() {
        return dossierPermanent;
    }

    /**
     * @param dossierPermanent the dossierPermanent to set
     */
    public void setDossierPermanent(Boolean dossierPermanent) {
        this.dossierPermanent = dossierPermanent;
    }

    /**
     * @return the direct
     */
    public Boolean getDirect() {
        return direct;
    }

    /**
     * @param direct the direct to set
     */
    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    /**
     * @return the ag
     */
    public Boolean getAg() {
        return ag;
    }

    /**
     * @param ag the ag to set
     */
    public void setAg(Boolean ag) {
        this.ag = ag;
    }

    /**
     * @return the visibleParLeCS
     */
    public Boolean getVisibleParLeCS() {
        return visibleParLeCS;
    }

    /**
     * @param visibleParLeCS the visibleParLeCS to set
     */
    public void setVisibleParLeCS(Boolean visibleParLeCS) {
        this.visibleParLeCS = visibleParLeCS;
    }

    /**
     * @return the resolutionTravaux
     */
    public ResolutionTravaux getResolutionTravaux() {
        return resolutionTravaux;
    }

    /**
     * @param resolutionTravaux the resolutionTravaux to set
     */
    public void setResolutionTravaux(ResolutionTravaux resolutionTravaux) {
        this.resolutionTravaux = resolutionTravaux;
    }
}
