/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Copropriete.NQ_GET_ALL_COPROPRIETES, query = "select c from Copropriete c order by c.trigramme asc"),
    @NamedQuery(name = Copropriete.NQ_GET_ALL_COPROPRIETES_BY_GESTIONNAIRE, query = "select c from Copropriete c where c.gestionnaire.id= :gestionnaireId order by c.trigramme asc"),
    @NamedQuery(name = Copropriete.NQ_GET_ALL_COPROPRIETES_BY_AGENCE, query = "select c from Copropriete c where c.gestionnaire.agence.id= :agenceId"),
    @NamedQuery(name = Copropriete.NQ_GET_COPROPRIETES_BY_NOM, query = "select c from Copropriete c where lower(c.nom) like :fragmentNom")
})
public class Copropriete implements Serializable, ContexteVision {

    public static final transient String NQ_GET_ALL_COPROPRIETES = "getAllCoproprietes";
    public static final transient String NQ_GET_ALL_COPROPRIETES_BY_GESTIONNAIRE = "getAllCoproprietesByGestionnaire";
    public static final transient String NQ_GET_ALL_COPROPRIETES_BY_AGENCE = "getAllCoproprietesByAgence";
    public static final transient String NQ_GET_COPROPRIETES_BY_NOM = "getCoproprietesByNom";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    
    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Adresse adresse;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire gestionnaire;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire gestionnaireSedentaire;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire comptable;
    
    private int tantiemes;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Lot> lots;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<DevisD4> devis;
    @OneToMany(mappedBy = "coproprietePourPhaseImport",fetch=FetchType.LAZY)
    private List<Coproprietaire> coproprietairesImport;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Demande> demandes;
    private TypeCopropriete typeCopropriete;
    @OneToMany(mappedBy = "copropriete", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<CompteEnBanqueCopropriete> comptesEnBanqueCopropriete;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<BordereauDeRemiseDeCheque> bordereauxDeRemiseDeCheques;
    private String trigramme;
    private transient int modeAffichage;
    public static transient final int AFFICHAGE_NOM = 1;
    public static transient final int AFFICHAGE_NOM_ADRESSE = 2;
    public static transient final int AFFICHAGE_NOM_TRIGRAMME = 3;
    public static transient final int AFFICHAGE_TRIGRAMME = 4;
    @OneToOne(mappedBy = "copropriete", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private ConseilSyndical conseilSyndical;
    @ManyToMany(mappedBy = "coproprietesSurLesquellesReferencees", fetch = FetchType.LAZY)
    private List<Fournisseur> fournisseursReferences;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Action> actions;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Dossier> dossiers;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<CoproprietaireCopropriete> membresASL;

    private StatutCopropriete statutCopropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Syndic syndic;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<FactureFournisseur> facturesFournisseurs;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Concierge> concierges;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Courrier> courriers;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<ContratFournisseur> contratsFournisseur;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Sinistre> sinistres;
    @OneToMany(mappedBy = "copropriete",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Assurance> assurances;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<BoiteArchive> boitesArchive;
    @OneToMany(mappedBy = "emetteurCopropriete", fetch = FetchType.LAZY)
    private List<Cheque> chequesEmis;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<PanierDemandesIntervention> paniersDemandesInterventions;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Reunion> reunions;
    private String identifiantICS;
    private String numeroSiret;

    private transient boolean objetsAPrendreEnCompte = false;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<PVAG> pVAGs;
    
    private String tantiemesLocauxHabitation;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<CourrierEntrant> courriersEntrants;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Batiment> batiments;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Equipement> equipements;
    
    private LocalDate dateDebutMandat;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Budget> budgets;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<Ouvrant> ouvrants;
    @OneToMany(mappedBy = "copropriete", fetch = FetchType.LAZY)
    private List<PanneauBALInterphone> panneauxBALInterphone;
    
    private String numeroImmatriculation;
    
    private Boolean comptabiliteEnCoursDeSaisie;
    
    private Integer nombreDeVisitesVendues;
    private Integer nombreCSJourneeSurPlaceVendus;
    private Integer nombreCSSoireeSurPlaceVendus;
    private Integer nombreCSJourneeD4Vendus;
    private Integer nombreCSSoireeD4Vendus;
    private Integer nombreDeLotsVendus;
    private Boolean heureAGEnJournee;
    private Boolean lieuAGD4;
    private Integer dureeAGVendue;
    
    
    private Integer nombreCSJourneeSurPlaceReels;
    private Integer nombreCSSoireeSurPlaceReels;
    
    
    
    private Integer gerabilite;
    
    private Integer moisClotureExercice;
    @ManyToMany(mappedBy = "coproprietes", fetch = FetchType.LAZY)
    private List<Courriel> courriels;


    public Copropriete() {
    }

    public Copropriete(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

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
        if (!(object instanceof Copropriete)) {
            return false;
        }
        Copropriete other = (Copropriete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String ts = "";
        if (getModeAffichage() == AFFICHAGE_NOM) {
            ts = getNom();
        } else if (getModeAffichage() == AFFICHAGE_NOM_ADRESSE) {
            ts = getNom() + "\n" + getAdresse().toString();
        } else if (getModeAffichage() == AFFICHAGE_NOM_TRIGRAMME) {
            String ics = "";
            if (getIdentifiantICS() != null && getIdentifiantICS().isEmpty()==false) {
                ics = " (" + getIdentifiantICS() + ")";
            }
            ts = getTrigramme() + " - " + getNom() + ics;
        } else if (getModeAffichage() == AFFICHAGE_TRIGRAMME) {

            ts = getTrigramme();
        } else {
            ts = getNom();
        }
        if (isObjetsAPrendreEnCompte()) {
            ts = "<html><b>" + ts + "</b></html>";
        }

        return ts;

    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the gestionnaire
     */
    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    /**
     * @param gestionnaire the gestionnaire to set
     */
    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    /**
     * @return the tantiemes
     */
    public int getTantiemes() {
        return tantiemes;
    }

    /**
     * @param tantiemes the tantiemes to set
     */
    public void setTantiemes(int tantiemes) {
        this.tantiemes = tantiemes;
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

    @Override
    public String getNomUnique() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the devis
     */
    public List<DevisD4> getDevis() {
        return devis;
    }

    /**
     * @param devis the devis to set
     */
    public void setDevis(List<DevisD4> devis) {
        this.devis = devis;
    }

    /**
     * @return the coproprietairesImport
     */
    public List<Coproprietaire> getCoproprietairesImport() {
        return coproprietairesImport;
    }

    /**
     * @param coproprietairesImport the coproprietairesImport to set
     */
    public void setCoproprietairesImport(List<Coproprietaire> coproprietairesImport) {
        this.coproprietairesImport = coproprietairesImport;
    }

    /**
     * @return the demandes
     */
    public List<Demande> getDemandes() {
        return demandes;
    }

    /**
     * @param demandes the demandes to set
     */
    public void setDemandes(List<Demande> demandes) {
        this.demandes = demandes;
    }

    /**
     * @return the typeCopropriete
     */
    public TypeCopropriete getTypeCopropriete() {
        return typeCopropriete;
    }

    /**
     * @param typeCopropriete the typeCopropriete to set
     */
    public void setTypeCopropriete(TypeCopropriete typeCopropriete) {
        this.typeCopropriete = typeCopropriete;
    }

    /**
     * @return the comptesEnBanqueCopropriete
     */
    public List<CompteEnBanqueCopropriete> getComptesEnBanqueCopropriete() {
        return comptesEnBanqueCopropriete;
    }

    /**
     * @param comptesEnBanqueCopropriete the comptesEnBanqueCopropriete to set
     */
    public void setComptesEnBanqueCopropriete(List<CompteEnBanqueCopropriete> comptesEnBanqueCopropriete) {
        this.comptesEnBanqueCopropriete = comptesEnBanqueCopropriete;
    }

    /**
     * @return the bordereauxDeRemiseDeCheques
     */
    public List<BordereauDeRemiseDeCheque> getBordereauxDeRemiseDeCheques() {
        return bordereauxDeRemiseDeCheques;
    }

    /**
     * @param bordereauxDeRemiseDeCheques the bordereauxDeRemiseDeCheques to set
     */
    public void setBordereauxDeRemiseDeCheques(List<BordereauDeRemiseDeCheque> bordereauxDeRemiseDeCheques) {
        this.bordereauxDeRemiseDeCheques = bordereauxDeRemiseDeCheques;
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
     * @return the trigramme
     */
    public String getTrigramme() {
        return trigramme;
    }

    /**
     * @param trigramme the trigramme to set
     */
    public void setTrigramme(String trigramme) {
        this.trigramme = trigramme;
    }

    /**
     * @return the conseilSyndical
     */
    public ConseilSyndical getConseilSyndical() {
        return conseilSyndical;
    }

    /**
     * @param conseilSyndical the conseilSyndical to set
     */
    public void setConseilSyndical(ConseilSyndical conseilSyndical) {
        this.conseilSyndical = conseilSyndical;
    }

    /**
     * @return the fournisseursReferences
     */
    public List<Fournisseur> getFournisseursReferences() {
        return fournisseursReferences;
    }

    /**
     * @param fournisseursReferences the fournisseursReferences to set
     */
    public void setFournisseursReferences(List<Fournisseur> fournisseursReferences) {
        this.fournisseursReferences = fournisseursReferences;
    }

    /**
     * @return the actions
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * @return the dossiers
     */
    public List<Dossier> getDossiers() {
        return dossiers;
    }

    /**
     * @param dossiers the dossiers to set
     */
    public void setDossiers(List<Dossier> dossiers) {
        this.dossiers = dossiers;
    }

    /**
     * @return the membresASL
     */
    public List<CoproprietaireCopropriete> getMembresASL() {
        return membresASL;
    }

    /**
     * @param membresASL the membresASL to set
     */
    public void setMembresASL(List<CoproprietaireCopropriete> membresASL) {
        this.membresASL = membresASL;
    }

    /**
     * @return the statutCopropriete
     */
    public StatutCopropriete getStatutCopropriete() {
        return statutCopropriete;
    }

    /**
     * @param statutCopropriete the statutCopropriete to set
     */
    public void setStatutCopropriete(StatutCopropriete statutCopropriete) {
        this.statutCopropriete = statutCopropriete;
    }

    /**
     * @return the syndic
     */
    public Syndic getSyndic() {
        return syndic;
    }

    /**
     * @param syndic the syndic to set
     */
    public void setSyndic(Syndic syndic) {
        this.syndic = syndic;
    }

    /**
     * @return the facturesFournisseurs
     */
    public List<FactureFournisseur> getFacturesFournisseurs() {
        return facturesFournisseurs;
    }

    /**
     * @param facturesFournisseurs the facturesFournisseurs to set
     */
    public void setFacturesFournisseurs(List<FactureFournisseur> facturesFournisseurs) {
        this.facturesFournisseurs = facturesFournisseurs;
    }

    /**
     * @return the concierges
     */
    public List<Concierge> getConcierges() {
        return concierges;
    }

    /**
     * @param concierges the concierges to set
     */
    public void setConcierges(List<Concierge> concierges) {
        this.concierges = concierges;
    }

    /**
     * @return the contratsFournisseur
     */
    public List<ContratFournisseur> getContratsFournisseur() {
        return contratsFournisseur;
    }

    /**
     * @param contratsFournisseur the contratsFournisseur to set
     */
    public void setContratsFournisseur(List<ContratFournisseur> contratsFournisseur) {
        this.contratsFournisseur = contratsFournisseur;
    }

    /**
     * @return the courriers
     */
    public List<Courrier> getCourriers() {
        return courriers;
    }

    /**
     * @param courriers the courriers to set
     */
    public void setCourriers(List<Courrier> courriers) {
        this.courriers = courriers;
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
     * @return the assurance
     */
    public List<Assurance> getAssurances() {
        return assurances;
    }

    /**
     * @param assurance the assurance to set
     */
    public void setAssurance(List<Assurance> assurances) {
        this.assurances = assurances;
    }

    /**
     * @return the identifiantICS
     */
    public String getIdentifiantICS() {
        return identifiantICS;
    }

    /**
     * @param identifiantICS the identifiantICS to set
     */
    public void setIdentifiantICS(String identifiantICS) {
        this.identifiantICS = identifiantICS;
    }

    /**
     * @return the objetsAPrendreEnCompte
     */
    public boolean isObjetsAPrendreEnCompte() {
        return objetsAPrendreEnCompte;
    }

    /**
     * @param objetsAPrendreEnCompte the objetsAPrendreEnCompte to set
     */
    public void setObjetsAPrendreEnCompte(boolean objetsAPrendreEnCompte) {
        this.objetsAPrendreEnCompte = objetsAPrendreEnCompte;
    }

    /**
     * @return the numeroSiret
     */
    public String getNumeroSiret() {
        return numeroSiret;
    }

    /**
     * @param numeroSiret the numeroSiret to set
     */
    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    /**
     * @return the pVAGs
     */
    public List<PVAG> getpVAGs() {
        return pVAGs;
    }

    /**
     * @param pVAGs the pVAGs to set
     */
    public void setpVAGs(List<PVAG> pVAGs) {
        this.pVAGs = pVAGs;
    }

    /**
     * @return the reunions
     */
    public List<Reunion> getReunions() {
        return reunions;
    }

    /**
     * @param reunions the reunions to set
     */
    public void setReunions(List<Reunion> reunions) {
        this.reunions = reunions;
    }

    /**
     * @return the tantiemesLocauxHabitation
     */
    public String getTantiemesLocauxHabitation() {
        return tantiemesLocauxHabitation;
    }

    /**
     * @param tantiemesLocauxHabitation the tantiemesLocauxHabitation to set
     */
    public void setTantiemesLocauxHabitation(String tantiemesLocauxHabitation) {
        this.tantiemesLocauxHabitation = tantiemesLocauxHabitation;
    }

    /**
     * @return the batiments
     */
    public List<Batiment> getBatiments() {
        return batiments;
    }

    /**
     * @param batiments the batiments to set
     */
    public void setBatiments(List<Batiment> batiments) {
        this.batiments = batiments;
    }

    /**
     * @return the equipements
     */
    public List<Equipement> getEquipements() {
        return equipements;
    }

    /**
     * @param equipements the equipements to set
     */
    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    /**
     * @return the dateDebutMandat
     */
    public LocalDate getDateDebutMandat() {
        return dateDebutMandat;
    }

    /**
     * @param dateDebutMandat the dateDebutMandat to set
     */
    public void setDateDebutMandat(LocalDate dateDebutMandat) {
        this.dateDebutMandat = dateDebutMandat;
    }

    /**
     * @return the budgets
     */
    public List<Budget> getBudgets() {
        return budgets;
    }

    /**
     * @param budgets the budgets to set
     */
    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    /**
     * @return the gestionnaireSedentaire
     */
    public Gestionnaire getGestionnaireSedentaire() {
        return gestionnaireSedentaire;
    }

    /**
     * @param gestionnaireSedentaire the gestionnaireSedentaire to set
     */
    public void setGestionnaireSedentaire(Gestionnaire gestionnaireSedentaire) {
        this.gestionnaireSedentaire = gestionnaireSedentaire;
    }

    /**
     * @return the comptable
     */
    public Gestionnaire getComptable() {
        return comptable;
    }

    /**
     * @param comptable the comptable to set
     */
    public void setComptable(Gestionnaire comptable) {
        this.comptable = comptable;
    }

    /**
     * @return the numeroImmatriculation
     */
    public String getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    /**
     * @param numeroImmatriculation the numeroImmatriculation to set
     */
    public void setNumeroImmatriculation(String numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    /**
     * @return the comptabiliteEnCoursDeSaisie
     */
    public Boolean getComptabiliteEnCoursDeSaisie() {
        return comptabiliteEnCoursDeSaisie;
    }

    /**
     * @param comptabiliteEnCoursDeSaisie the comptabiliteEnCoursDeSaisie to set
     */
    public void setComptabiliteEnCoursDeSaisie(Boolean comptabiliteEnCoursDeSaisie) {
        this.comptabiliteEnCoursDeSaisie = comptabiliteEnCoursDeSaisie;
    }

    /**
     * @return the nombreDeVisitesVendues
     */
    public Integer getNombreDeVisitesVendues() {
        return nombreDeVisitesVendues;
    }

    /**
     * @param nombreDeVisitesVendues the nombreDeVisitesVendues to set
     */
    public void setNombreDeVisitesVendues(Integer nombreDeVisitesVendues) {
        this.nombreDeVisitesVendues = nombreDeVisitesVendues;
    }

    /**
     * @return the nombreCSJourneeSurPlaceVendus
     */
    public Integer getNombreCSJourneeSurPlaceVendus() {
        return nombreCSJourneeSurPlaceVendus;
    }

    /**
     * @param nombreCSJourneeSurPlaceVendus the nombreCSJourneeSurPlaceVendus to set
     */
    public void setNombreCSJourneeSurPlaceVendus(Integer nombreCSJourneeSurPlaceVendus) {
        this.nombreCSJourneeSurPlaceVendus = nombreCSJourneeSurPlaceVendus;
    }

    /**
     * @return the nombreCSSoireeSurPlaceVendus
     */
    public Integer getNombreCSSoireeSurPlaceVendus() {
        return nombreCSSoireeSurPlaceVendus;
    }

    /**
     * @param nombreCSSoireeSurPlaceVendus the nombreCSSoireeSurPlaceVendus to set
     */
    public void setNombreCSSoireeSurPlaceVendus(Integer nombreCSSoireeSurPlaceVendus) {
        this.nombreCSSoireeSurPlaceVendus = nombreCSSoireeSurPlaceVendus;
    }

    /**
     * @return the nombreCSJourneeD4Vendus
     */
    public Integer getNombreCSJourneeD4Vendus() {
        return nombreCSJourneeD4Vendus;
    }

    /**
     * @param nombreCSJourneeD4Vendus the nombreCSJourneeD4Vendus to set
     */
    public void setNombreCSJourneeD4Vendus(Integer nombreCSJourneeD4Vendus) {
        this.nombreCSJourneeD4Vendus = nombreCSJourneeD4Vendus;
    }

    /**
     * @return the nombreCSSoireeD4Vendus
     */
    public Integer getNombreCSSoireeD4Vendus() {
        return nombreCSSoireeD4Vendus;
    }

    /**
     * @param nombreCSSoireeD4Vendus the nombreCSSoireeD4Vendus to set
     */
    public void setNombreCSSoireeD4Vendus(Integer nombreCSSoireeD4Vendus) {
        this.nombreCSSoireeD4Vendus = nombreCSSoireeD4Vendus;
    }

    /**
     * @return the nombreDeLotsVendus
     */
    public Integer getNombreDeLotsVendus() {
        return nombreDeLotsVendus;
    }

    /**
     * @param nombreDeLotsVendus the nombreDeLotsVendus to set
     */
    public void setNombreDeLotsVendus(Integer nombreDeLotsVendus) {
        this.nombreDeLotsVendus = nombreDeLotsVendus;
    }

    /**
     * @return the heureAGEnJournee
     */
    public Boolean getHeureAGEnJournee() {
        return heureAGEnJournee;
    }

    /**
     * @param heureAGEnJournee the heureAGEnJournee to set
     */
    public void setHeureAGEnJournee(Boolean heureAGEnJournee) {
        this.heureAGEnJournee = heureAGEnJournee;
    }

    /**
     * @return the lieuAGD4
     */
    public Boolean getLieuAGD4() {
        return lieuAGD4;
    }

    /**
     * @param lieuAGD4 the lieuAGD4 to set
     */
    public void setLieuAGD4(Boolean lieuAGD4) {
        this.lieuAGD4 = lieuAGD4;
    }

    /**
     * @return the dureeAGVendue
     */
    public Integer getDureeAGVendue() {
        return dureeAGVendue;
    }

    /**
     * @param dureeAGVendue the dureeAGVendue to set
     */
    public void setDureeAGVendue(Integer dureeAGVendue) {
        this.dureeAGVendue = dureeAGVendue;
    }

    /**
     * @return the gerabilite
     */
    public Integer getGerabilite() {
        return gerabilite;
    }

    /**
     * @param gerabilite the gerabilite to set
     */
    public void setGerabilite(Integer gerabilite) {
        this.gerabilite = gerabilite;
    }

    /**
     * @return the nombreCSJourneeSurPlaceReels
     */
    public Integer getNombreCSJourneeSurPlaceReels() {
        return nombreCSJourneeSurPlaceReels;
    }

    /**
     * @param nombreCSJourneeSurPlaceReels the nombreCSJourneeSurPlaceReels to set
     */
    public void setNombreCSJourneeSurPlaceReels(Integer nombreCSJourneeSurPlaceReels) {
        this.nombreCSJourneeSurPlaceReels = nombreCSJourneeSurPlaceReels;
    }

    /**
     * @return the nombreCSSoireeSurPlaceReels
     */
    public Integer getNombreCSSoireeSurPlaceReels() {
        return nombreCSSoireeSurPlaceReels;
    }

    /**
     * @param nombreCSSoireeSurPlaceReels the nombreCSSoireeSurPlaceReels to set
     */
    public void setNombreCSSoireeSurPlaceReels(Integer nombreCSSoireeSurPlaceReels) {
        this.nombreCSSoireeSurPlaceReels = nombreCSSoireeSurPlaceReels;
    }

    /**
     * @return the moisClotureExercice
     */
    public Integer getMoisClotureExercice() {
        return moisClotureExercice;
    }

    /**
     * @param moisClotureExercice the moisClotureExercice to set
     */
    public void setMoisClotureExercice(Integer moisClotureExercice) {
        this.moisClotureExercice = moisClotureExercice;
    }
}
