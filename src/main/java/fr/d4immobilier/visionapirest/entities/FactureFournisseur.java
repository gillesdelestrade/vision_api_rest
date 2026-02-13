/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.FetchType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FactureFournisseur implements Serializable,Comparable<FactureFournisseur> {
    @OneToOne(mappedBy = "factureFournisseur", fetch = FetchType.LAZY)
    private DossierContentieuxFacture dossierContentieuxFacture;
    @ManyToMany(mappedBy = "factureFournisseursAnnuleesEtRemplacees", fetch = FetchType.LAZY)
    private List<FactureFournisseur> factureFournisseursQuiAnnulentEtQuiRemplacent;
    @OneToMany(mappedBy = "factureFournisseur", fetch = FetchType.LAZY)
    private List<CourrierFacture> courrierFactures;

    public static final transient int RECUE = 0;
    public static final transient int AU_VISA_D4 = 1;
    public static final transient int AU_VISA_CS = 2;    
    public static final transient int EN_REGLEMENT = 3;
    public static final transient int REGLEE = 4;
    public static final transient int BLOQUEE_D4 = 5;
    public static final transient int BLOQUEE_CS = 6;

    public static final transient int DELAI_DEBUT_ATTENTE_CONTRE_ORDRE = 15;
    public static final transient int DELAI_ATTENTE_CONTRE_ORDRE = 10;
    public static final transient int DELAI_REDEMARRAGE_ATTENTE_CONTRE_ORDRE = 10;
    
    public static final transient int DELAI_DEBUT_ATTENTE_INFO_FOURNISSEUR = 10;
    public static final transient int DELAI_ATTENTE_INFO_FOURNISSEUR = 10;
    public static final transient int DELAI_REDEMARRAGE_ATTENTE_INFO_FOURNISSEUR = 10;
    
    @OneToMany(mappedBy = "factureFournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CommentaireFactureFournisseur> commentairesFactureFournisseurs;
    @OneToOne(mappedBy = "factureFournisseur", fetch = FetchType.LAZY)
    private FichierFacture fichierFacture;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private LocalDate dateReception;
    private LocalDate dateFacture;
    private String reference;
    private Float montant;
    private AvisD4Facture avisD4;
    private AvisFactureCS avisCS;
    @OneToMany(mappedBy = "factureFournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterventionDemande> demandesInterventions;
    private MoyenDePaiement moyenDePaiement;
    private LocalDate dateDeMiseAuPaiement;
    private String referencePaiement;
    @Column(length = 500)
    private String commentaireCS;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne approbateur;
    private LocalDate dateDecisionCS;
    @ManyToOne(fetch = FetchType.LAZY)
    private MotifDecisionFacture motifDecisionFacture;
    private Boolean priseEnCompteParLeBot;
    private transient boolean exclueDuPaiement = false;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<FactureFournisseur> factureFournisseursAnnuleesEtRemplacees;
    @ManyToOne(fetch = FetchType.LAZY)
    private ContratFournisseur contratFournisseur;
    private LocalDate dateDebutPeriode;
    private LocalDate dateFinPeriode;
    private Boolean lettreAccompagnementImprimee;
    private Boolean privative;
    private Boolean cloturee;
    
    private EtatTraitementAuto etatTraitementAuto;
    private LocalDate dateDebutAttenteContreOrdre;
    private LocalDate dateValidationAutomatique;
    private LocalDate dateDebutAttenteInfoFournisseur;
    private LocalDate dateRefusAutomatique;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Batiment> batimentsConcernes;
    
    private LocalDate dateDerniereRelanceAttenteContreOrdre;
    private LocalDate dateDerniereRelanceAttenteInfo;
    
    private LocalDate dateExportComfact;
    
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
        if (!(object instanceof FactureFournisseur)) {
            return false;
        }
        FactureFournisseur other = (FactureFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String avoir = "";
        if (getMontant()<0) {
            avoir = "Avoir ";
        }
        String date = "";
        if (getDateFacture() != null) {
            date = getDateFacture().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        }
        return avoir + getCopropriete().getTrigramme() + " " + date + " : " + new DecimalFormat("###,###,##0.00¤").format(getMontant()) + " " + getReference();
    }

    /**
     * @return the fournisseur
     */
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    /**
     * @param fournisseur the fournisseur to set
     */
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
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
     * @return the dateReception
     */
    public LocalDate getDateReception() {
        return dateReception;
    }

    /**
     * @param dateReception the dateReception to set
     */
    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    /**
     * @return the dateFacture
     */
    public LocalDate getDateFacture() {
        return dateFacture;
    }

    /**
     * @param dateFacture the dateFacture to set
     */
    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the montant
     */
    public Float getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Float montant) {
        this.montant = montant;
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
     * @return the avisCS
     */
    public AvisFactureCS getAvisCS() {
        return avisCS;
    }

    /**
     * @param avisCS the avisCS to set
     */
    public void setAvisCS(AvisFactureCS avisCS) {
        this.avisCS = avisCS;
    }

    /**
     * @return the listeDemandesInterventions
     */
    public List<InterventionDemande> getDemandesInterventions() {
        return demandesInterventions;
    }

    /**
     * @param demandesInterventions the demandesInterventions to set
     */
    public void setDemandesInterventions(List<InterventionDemande> demandesInterventions) {
        this.demandesInterventions = demandesInterventions;
    }

    /**
     * @return the fichierFacture
     */
    public FichierFacture getFichierFacture() {
        return fichierFacture;
    }

    /**
     * @param fichierFacture the fichierFacture to set
     */
    public void setFichierFacture(FichierFacture fichierFacture) {
        this.fichierFacture = fichierFacture;
    }

    /**
     * @return the moyenDePaiement
     */
    public MoyenDePaiement getMoyenDePaiement() {
        return moyenDePaiement;
    }

    /**
     * @param moyenDePaiement the moyenDePaiement to set
     */
    public void setMoyenDePaiement(MoyenDePaiement moyenDePaiement) {
        this.moyenDePaiement = moyenDePaiement;
    }

    /**
     * @return the dateDeMiseAuPaiement
     */
    public LocalDate getDateDeMiseAuPaiement() {
        return dateDeMiseAuPaiement;
    }

    /**
     * @param dateDeMiseAuPaiement the dateDeMiseAuPaiement to set
     */
    public void setDateDeMiseAuPaiement(LocalDate dateDeMiseAuPaiement) {
        this.dateDeMiseAuPaiement = dateDeMiseAuPaiement;
    }

    /**
     * @return the referencePaiement
     */
    public String getReferencePaiement() {
        return referencePaiement;
    }

    /**
     * @param referencePaiement the referencePaiement to set
     */
    public void setReferencePaiement(String referencePaiement) {
        this.referencePaiement = referencePaiement;
    }

    /**
     * @return the commentaireCS
     */
    public String getCommentaireCS() {
        return commentaireCS;
    }

    /**
     * @param commentaireCS the commentaireCS to set
     */
    public void setCommentaireCS(String commentaireCS) {
        this.commentaireCS = commentaireCS;
    }

    /**
     * @return the approbateur
     */
    public Personne getApprobateur() {
        return approbateur;
    }

    /**
     * @param approbateur the approbateur to set
     */
    public void setApprobateur(Personne approbateur) {
        this.approbateur = approbateur;
    }

    /**
     * @return the dateDecisionCS
     */
    public LocalDate getDateDecisionCS() {
        return dateDecisionCS;
    }

    /**
     * @param dateDecisionCS the dateDecisionCS to set
     */
    public void setDateDecisionCS(LocalDate dateDecisionCS) {
        this.dateDecisionCS = dateDecisionCS;
    }

    /**
     * @return the motifDecisionFacture
     */
    public MotifDecisionFacture getMotifDecisionFacture() {
        return motifDecisionFacture;
    }

    /**
     * @param motifDecisionFacture the motifDecisionFacture to set
     */
    public void setMotifDecisionFacture(MotifDecisionFacture motifDecisionFacture) {
        this.motifDecisionFacture = motifDecisionFacture;
    }

    /**
     * @return the exclueDuPaiement
     */
    public boolean isExclueDuPaiement() {
        return exclueDuPaiement;
    }

    /**
     * @param exclueDuPaiement the exclueDuPaiement to set
     */
    public void setExclueDuPaiement(boolean exclueDuPaiement) {
        this.exclueDuPaiement = exclueDuPaiement;
    }

    /**
     * @return the commentairesFactureFournisseurs
     */
    public List<CommentaireFactureFournisseur> getCommentairesFactureFournisseurs() {
        return commentairesFactureFournisseurs;
    }

    /**
     * @param commentairesFactureFournisseurs the commentairesFactureFournisseurs to set
     */
    public void setCommentairesFactureFournisseurs(List<CommentaireFactureFournisseur> commentairesFactureFournisseurs) {
        this.commentairesFactureFournisseurs = commentairesFactureFournisseurs;
    }

    public int getEtat() {
        int etat = RECUE;
        if (AvisD4Facture.en_attente.equals(getAvisD4())) {
            etat = AU_VISA_D4;
        }
        if ((AvisD4Facture.validee.equals(getAvisD4()) || AvisD4Facture.consulter_le_cs.equals(getAvisD4()))
                && (AvisFactureCS.en_attente.equals(getAvisCS())) && (getDateDeMiseAuPaiement() == null)) {
            etat = AU_VISA_CS;
        }
        if (
                ((AvisFactureCS.acceptee.equals(getAvisCS()) && (AvisD4Facture.validee.equals(getAvisD4()) || AvisD4Facture.consulter_le_cs.equals(getAvisD4()))) ||
                (AvisD4Facture.validee.equals(getAvisD4()) && AvisFactureCS.pas_necessaire.equals(getAvisCS()) )  )
                && (getDateDeMiseAuPaiement() == null)) {
            etat = EN_REGLEMENT;
        }
        if (getDateDeMiseAuPaiement() != null) {
            etat = REGLEE;
        }
        if (AvisD4Facture.bloquee.equals(getAvisD4()) && (getDateDeMiseAuPaiement() == null)) {
            etat = BLOQUEE_D4;
        }

        if (AvisD4Facture.bloquee.equals(getAvisD4()) == false && AvisFactureCS.refusee.equals(getAvisCS()) && (getDateDeMiseAuPaiement() == null)) {
            etat = BLOQUEE_CS;
        }

        return etat;
    }

    /**
     * @return the priseEnCompteParLeBot
     */
    public Boolean getPriseEnCompteParLeBot() {
        return priseEnCompteParLeBot;
    }

    /**
     * @param priseEnCompteParLeBot the priseEnCompteParLeBot to set
     */
    public void setPriseEnCompteParLeBot(Boolean priseEnCompteParLeBot) {
        this.priseEnCompteParLeBot = priseEnCompteParLeBot;
    }

    /**
     * @return the courrierFactures
     */
    public List<CourrierFacture> getCourrierFactures() {
        return courrierFactures;
    }

    /**
     * @param courrierFactures the courrierFactures to set
     */
    public void setCourrierFactures(List<CourrierFacture> courrierFactures) {
        this.courrierFactures = courrierFactures;
    }


    /**
     * @return the factureFournisseursQuiAnnulentEtQuiRemplacent
     */
    public List<FactureFournisseur> getFactureFournisseursQuiAnnulentEtQuiRemplacent() {
        return factureFournisseursQuiAnnulentEtQuiRemplacent;
    }

    /**
     * @param factureFournisseursQuiAnnulentEtQuiRemplacent the factureFournisseursQuiAnnulentEtQuiRemplacent to set
     */
    public void setFactureFournisseursQuiAnnulentEtQuiRemplacent(List<FactureFournisseur> factureFournisseursQuiAnnulentEtQuiRemplacent) {
        this.factureFournisseursQuiAnnulentEtQuiRemplacent = factureFournisseursQuiAnnulentEtQuiRemplacent;
    }

    /**
     * @return the factureFournisseursAnnuleesEtRemplacees
     */
    public List<FactureFournisseur> getFactureFournisseursAnnuleesEtRemplacees() {
        return factureFournisseursAnnuleesEtRemplacees;
    }

    /**
     * @param factureFournisseursAnnuleesEtRemplacees the factureFournisseursAnnuleesEtRemplacees to set
     */
    public void setFactureFournisseursAnnuleesEtRemplacees(List<FactureFournisseur> factureFournisseursAnnuleesEtRemplacees) {
        this.factureFournisseursAnnuleesEtRemplacees = factureFournisseursAnnuleesEtRemplacees;
    }

    /**
     * @return the contratFournisseur
     */
    public ContratFournisseur getContratFournisseur() {
        return contratFournisseur;
    }

    /**
     * @param contratFournisseur the contratFournisseur to set
     */
    public void setContratFournisseur(ContratFournisseur contratFournisseur) {
        this.contratFournisseur = contratFournisseur;
    }

    /**
     * @return the dateDebutPeriode
     */
    public LocalDate getDateDebutPeriode() {
        return dateDebutPeriode;
    }

    /**
     * @param dateDebutPeriode the dateDebutPeriode to set
     */
    public void setDateDebutPeriode(LocalDate dateDebutPeriode) {
        this.dateDebutPeriode = dateDebutPeriode;
    }

    /**
     * @return the dateFinPeriode
     */
    public LocalDate getDateFinPeriode() {
        return dateFinPeriode;
    }

    /**
     * @param dateFinPeriode the dateFinPeriode to set
     */
    public void setDateFinPeriode(LocalDate dateFinPeriode) {
        this.dateFinPeriode = dateFinPeriode;
    }

    public static String getEtat(int etat) {
        String e = "";

        switch (etat) {
            case FactureFournisseur.RECUE:
                e = "La facture est enregistr&eacute;e.";
                break;
            case FactureFournisseur.AU_VISA_D4:
                e = "La facture est au Visa de d4";
                break;
            case FactureFournisseur.AU_VISA_CS:
                e = "La facture est au visa du Conseil Syndical";
                break;
            case FactureFournisseur.EN_REGLEMENT:
                e = "La facture est au réglement";
                break;
            case FactureFournisseur.REGLEE:
                e = "La facture est réglée";
                break;
            case FactureFournisseur.BLOQUEE_D4:
                e = "La facture est bloquée par d4";
                break;
            case FactureFournisseur.BLOQUEE_CS:
                e = "La facture est bloquée par le Conseil Syndical";
                break;
        }

        return e;
    }


    @Override
    public int compareTo(FactureFournisseur f) {
        if (getContratFournisseur()!= null) {
            return this.getDateDebutPeriode().compareTo(f.getDateDebutPeriode());
        } else {
            return this.getDateFacture().compareTo(f.getDateFacture());
        }

    }

    /**
     * @return the lettreAccompagnement
     */
    public Boolean getLettreAccompagnementImprimee() {
        return lettreAccompagnementImprimee;
    }

    /**
     * @param lettreAccompagnementImprimee the lettreAccompagnement to set
     */
    public void setLettreAccompagnementImprimee(Boolean lettreAccompagnementImprimee) {
        this.lettreAccompagnementImprimee = lettreAccompagnementImprimee;
    }

    /**
     * @return the privative
     */
    public Boolean getPrivative() {
        return privative;
    }

    /**
     * @param privative the privative to set
     */
    public void setPrivative(Boolean privative) {
        this.privative = privative;
    }

    /**
     * @return the cloturee
     */
    public Boolean getCloturee() {
        return cloturee;
    }

    /**
     * @param cloturee the cloturee to set
     */
    public void setCloturee(Boolean cloturee) {
        this.cloturee = cloturee;
    }

    /**
     * @return the etatTraitementAuto
     */
    public EtatTraitementAuto getEtatTraitementAuto() {
        return etatTraitementAuto;
    }

    /**
     * @param etatTraitementAuto the etatTraitementAuto to set
     */
    public void setEtatTraitementAuto(EtatTraitementAuto etatTraitementAuto) {
        this.etatTraitementAuto = etatTraitementAuto;
    }

    /**
     * @return the dateDebutAttenteContreOrdre
     */
    public LocalDate getDateDebutAttenteContreOrdre() {
        return dateDebutAttenteContreOrdre;
    }

    /**
     * @param dateDebutAttenteContreOrdre the dateDebutAttenteContreOrdre to set
     */
    public void setDateDebutAttenteContreOrdre(LocalDate dateDebutAttenteContreOrdre) {
        this.dateDebutAttenteContreOrdre = dateDebutAttenteContreOrdre;
    }

    /**
     * @return the dateValidationAutomatique
     */
    public LocalDate getDateValidationAutomatique() {
        return dateValidationAutomatique;
    }

    /**
     * @param dateValidationAutomatique the dateValidationAutomatique to set
     */
    public void setDateValidationAutomatique(LocalDate dateValidationAutomatique) {
        this.dateValidationAutomatique = dateValidationAutomatique;
    }

    /**
     * @return the dateDebutAttenteInfoFournisseur
     */
    public LocalDate getDateDebutAttenteInfoFournisseur() {
        return dateDebutAttenteInfoFournisseur;
    }

    /**
     * @param dateDebutAttenteInfoFournisseur the dateDebutAttenteInfoFournisseur to set
     */
    public void setDateDebutAttenteInfoFournisseur(LocalDate dateDebutAttenteInfoFournisseur) {
        this.dateDebutAttenteInfoFournisseur = dateDebutAttenteInfoFournisseur;
    }

    /**
     * @return the dateRefusAutomatique
     */
    public LocalDate getDateRefusAutomatique() {
        return dateRefusAutomatique;
    }

    /**
     * @param dateRefusAutomatique the dateRefusAutomatique to set
     */
    public void setDateRefusAutomatique(LocalDate dateRefusAutomatique) {
        this.dateRefusAutomatique = dateRefusAutomatique;
    }

    /**
     * @return the batimentsConcernes
     */
    public List<Batiment> getBatimentsConcernes() {
        return batimentsConcernes;
    }

    /**
     * @param batimentsConcernes the batimentsConcernes to set
     */
    public void setBatimentsConcernes(List<Batiment> batimentsConcernes) {
        this.batimentsConcernes = batimentsConcernes;
    }

    /**
     * @return the dateDerniereRelanceAttenteContreOrdre
     */
    public LocalDate getDateDerniereRelanceAttenteContreOrdre() {
        return dateDerniereRelanceAttenteContreOrdre;
    }

    /**
     * @param dateDerniereRelanceAttenteContreOrdre the dateDerniereRelanceAttenteContreOrdre to set
     */
    public void setDateDerniereRelanceAttenteContreOrdre(LocalDate dateDerniereRelanceAttenteContreOrdre) {
        this.dateDerniereRelanceAttenteContreOrdre = dateDerniereRelanceAttenteContreOrdre;
    }

    /**
     * @return the dateDerniereRelanceAttenteInfo
     */
    public LocalDate getDateDerniereRelanceAttenteInfo() {
        return dateDerniereRelanceAttenteInfo;
    }

    /**
     * @param dateDerniereRelanceAttenteInfo the dateDerniereRelanceAttenteInfo to set
     */
    public void setDateDerniereRelanceAttenteInfo(LocalDate dateDerniereRelanceAttenteInfo) {
        this.dateDerniereRelanceAttenteInfo = dateDerniereRelanceAttenteInfo;
    }

    /**
     * @return the dateExportComfact
     */
    public LocalDate getDateExportComfact() {
        return dateExportComfact;
    }

    /**
     * @param dateExportComfact the dateExportComfact to set
     */
    public void setDateExportComfact(LocalDate dateExportComfact) {
        this.dateExportComfact = dateExportComfact;
    }

}
