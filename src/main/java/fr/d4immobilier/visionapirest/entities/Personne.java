/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Personne.NQ_GET_PERSONNE_BY_NUMTEL, query = "select p from Personne p where lower(p.telPortable) like :numTel "
            + "or lower(p.telPortable) like :numTelTirets "
            + "or lower(p.telPortable) like :numTelPoints "
            + "or lower(p.telPortable) like :numTelEspaces "
            + "or lower(p.telFixe) like :numTel "
            + "or lower(p.telFixe) like :numTelTirets "
            + "or lower(p.telFixe) like :numTelPoints "
            + "or lower(p.telFixe) like :numTelEspaces")
})
public class Personne implements Serializable {

    public static final transient String NQ_GET_PERSONNE_BY_NUMTEL = "getPersonneByNumTel";
    public static final transient int MODE_NORMAL = 0;
    public static final transient int MODE_CONTACT_INTERVENTION = 1;
    public static final transient int MODE_SANS_CIVILITE = 2;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String nom;
    private String prenom;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Adresse adresse;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CompteVision compteVision;
    @OneToMany(mappedBy = "responsable", fetch = FetchType.LAZY)
    private List<Agence> agences;
    @OneToMany(mappedBy = "emetteur", fetch = FetchType.LAZY)
    private List<Action> actionsEmises;
    @OneToMany(mappedBy = "executeur", fetch = FetchType.LAZY)
    private List<Action> actionsRecues;
    @OneToMany(mappedBy = "auteur", fetch = FetchType.LAZY)
    private List<Document> documents;
    private String mail1;
    private String mail2;
    private String telPortable;
    private String telFixe;
    @OneToMany(mappedBy = "emetteur", fetch = FetchType.LAZY)
    private List<Demande> demandes;
    @OneToMany(mappedBy = "destinatairePersonne", fetch = FetchType.LAZY)
    private List<Document> documentsEnvoyes;
    @OneToMany(mappedBy = "personne", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<CompteEnBanquePersonne> compteEnBanquePersonnes;
    @ManyToMany(mappedBy = "membres", fetch = FetchType.LAZY)
    private List<ConseilSyndical> conseilsSyndicaux;
    @OneToMany(mappedBy = "president", fetch = FetchType.LAZY)
    private List<ConseilSyndical> conseilsSyndicauxPresides;
    @OneToMany(mappedBy = "appelantPersonne", fetch = FetchType.LAZY)
    private List<AppelEntrant> appelsEntrants;
    @OneToMany(mappedBy = "emetteurPersonne", fetch = FetchType.LAZY)
    private List<Cheque> cheques;
    @OneToMany(mappedBy = "auteurPersonne", fetch = FetchType.LAZY)
    private List<CommentaireFactureFournisseur> commentaireFactureFournisseurs;
    private transient int modeAffichage = 0;
    @OneToMany(mappedBy = "personne", fetch = FetchType.LAZY)
    private List<AutorisationValidationFactures> autorisationsValidationFactures;
    @OneToMany(mappedBy = "representant", fetch = FetchType.LAZY)
    private List<Societe> societesRepresentees;
    @OneToMany(mappedBy = "attributaire", fetch = FetchType.LAZY)
    private List<Demande> demandesAttribuees;
    @ManyToMany(mappedBy = "historiqueAttributaire", fetch = FetchType.LAZY)
    private List<Demande> historiqueDemandesAttribuees;
    
    private Boolean invitee;

    public Personne() {
        this.compteVision = new CompteVision();
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteVision = new CompteVision();
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
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set

        if (!(object instanceof Personne)) {

            return false;
        }
        Personne other = (Personne) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (modeAffichage == MODE_CONTACT_INTERVENTION) {
            String bat = "";
            if (getAdresse() != null && getAdresse().getBatiment() != null && !getAdresse().getBatiment().isEmpty()) {
                bat = " (Bât " + getAdresse().getBatiment() + ")";
            }
            if (getPrenom() != null) {
                return getNom() + " " + getPrenom() + bat;
            } else {
                return getNom() + bat;
            }
        } else if (modeAffichage == MODE_SANS_CIVILITE) {
            if (getPrenom() != null && !getPrenom().isEmpty()) {
                return getNom() + " " + getPrenom();
            } else {
                return getNom();
            }
        } else {
            String toString = "";
            if (getTitre() != null && !getTitre().isEmpty()) {
                toString = getTitre() + " ";
            }
            if (getPrenom() != null && !getPrenom().isEmpty()) {
                toString = toString + getPrenom() + " ";
            }
            if (toString.equals("")) {
                toString = "M. ou Mme ";
            }
            toString = toString + getNom();
            return toString;
        }
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the compteVision
     */
    public CompteVision getCompteVision() {
        return compteVision;
    }

    /**
     * @param compteVision the compteVision to set
     */
    public void setCompteVision(CompteVision compteVision) {
        this.compteVision = compteVision;
    }

    /**
     * @return the agences
     */
    public List<Agence> getAgences() {
        return agences;
    }

    /**
     * @param agences the agences to set
     */
    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }

    /**
     * @return the actionsEmises
     */
    public List<Action> getActionsEmises() {
        return actionsEmises;
    }

    /**
     * @param actionsEmises the actionsEmises to set
     */
    public void setActionsEmises(List<Action> actionsEmises) {
        this.actionsEmises = actionsEmises;
    }

    /**
     * @return the actionsRecues
     */
    public List<Action> getActionsRecues() {
        return actionsRecues;
    }

    /**
     * @param actionsRecues the actionsRecues to set
     */
    public void setActionsRecues(List<Action> actionsRecues) {
        this.actionsRecues = actionsRecues;
    }

    /**
     * @return the documents
     */
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * @return the mail1
     */
    public String getMail1() {
        return mail1;
    }

    /**
     * @param mail1 the mail1 to set
     */
    public void setMail1(String mail1) {
        this.mail1 = mail1;
    }

    /**
     * @return the mail2
     */
    public String getMail2() {
        return mail2;
    }

    /**
     * @param mail2 the mail2 to set
     */
    public void setMail2(String mail2) {
        this.mail2 = mail2;
    }

    /**
     * @return the telPortable
     */
    public String getTelPortable() {
        return telPortable;
    }

    /**
     * @param telPortable the telPortable to set
     */
    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    /**
     * @return the telFixe
     */
    public String getTelFixe() {
        return telFixe;
    }

    /**
     * @param telFixe the telFixe to set
     */
    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
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
     * @return the documentsEnvoyes
     */
    public List<Document> getDocumentsEnvoyes() {
        return documentsEnvoyes;
    }

    /**
     * @param documentsEnvoyes the documentsEnvoyes to set
     */
    public void setDocumentsEnvoyes(List<Document> documentsEnvoyes) {
        this.documentsEnvoyes = documentsEnvoyes;
    }

    /**
     * @return the compteEnBanquePersonnes
     */
    public List<CompteEnBanquePersonne> getCompteEnBanquePersonnes() {
        return compteEnBanquePersonnes;
    }

    /**
     * @param compteEnBanquePersonnes the compteEnBanquePersonnes to set
     */
    public void setCompteEnBanquePersonnes(List<CompteEnBanquePersonne> compteEnBanquePersonnes) {
        this.compteEnBanquePersonnes = compteEnBanquePersonnes;
    }

    /**
     * @return the conseilsSyndicaux
     */
    public List<ConseilSyndical> getConseilsSyndicaux() {
        return conseilsSyndicaux;
    }

    /**
     * @param conseilsSyndicaux the conseilsSyndicaux to set
     */
    public void setConseilsSyndicaux(List<ConseilSyndical> conseilsSyndicaux) {
        this.conseilsSyndicaux = conseilsSyndicaux;
    }

    /**
     * @return the conseilsSyndicauxPresides
     */
    public List<ConseilSyndical> getConseilsSyndicauxPresides() {
        return conseilsSyndicauxPresides;
    }

    /**
     * @param conseilsSyndicauxPresides the conseilsSyndicauxPresides to set
     */
    public void setConseilsSyndicauxPresides(List<ConseilSyndical> conseilsSyndicauxPresides) {
        this.conseilsSyndicauxPresides = conseilsSyndicauxPresides;
    }

    /**
     * @return the appelsEntrants
     */
    public List<AppelEntrant> getAppelsEntrants() {
        return appelsEntrants;
    }

    /**
     * @param appelsEntrants the appelsEntrants to set
     */
    public void setAppelsEntrants(List<AppelEntrant> appelsEntrants) {
        this.appelsEntrants = appelsEntrants;
    }

    /**
     * @return the cheques
     */
    public List<Cheque> getCheques() {
        return cheques;
    }

    /**
     * @param cheques the cheques to set
     */
    public void setCheques(List<Cheque> cheques) {
        this.cheques = cheques;
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
     * @return the autorisationsValidationFactures
     */
    public List<AutorisationValidationFactures> getAutorisationsValidationFactures() {
        return autorisationsValidationFactures;
    }

    /**
     * @param autorisationsValidationFactures the
     * autorisationsValidationFactures to set
     */
    public void setAutorisationsValidationFactures(List<AutorisationValidationFactures> autorisationsValidationFactures) {
        this.autorisationsValidationFactures = autorisationsValidationFactures;
    }

    
    /**
     * @return the societesRepresentees
     */
    public List<Societe> getSocietesRepresentees() {
        return societesRepresentees;
    }

    /**
     * @param societesRepresentees the societesRepresentees to set
     */
    public void setSocietesRepresentees(List<Societe> societesRepresentees) {
        this.societesRepresentees = societesRepresentees;
    }

    /**
     * @return the demandesAttribuees
     */
    public List<Demande> getDemandesAttribuees() {
        return demandesAttribuees;
    }

    /**
     * @param demandesAttribuees the demandesAttribuees to set
     */
    public void setDemandesAttribuees(List<Demande> demandesAttribuees) {
        this.demandesAttribuees = demandesAttribuees;
    }

    /**
     * @return the historiqueDemandesAttribuees
     */
    public List<Demande> getHistoriqueDemandesAttribuees() {
        return historiqueDemandesAttribuees;
    }

    /**
     * @param historiqueDemandesAttribuees the historiqueDemandesAttribuees to
     * set
     */
    public void setHistoriqueDemandesAttribuees(List<Demande> historiqueDemandesAttribuees) {
        this.historiqueDemandesAttribuees = historiqueDemandesAttribuees;
    }

    /**
     * @return the invitee
     */
    public Boolean getInvitee() {
        return invitee;
    }

    /**
     * @param invitee the invitee to set
     */
    public void setInvitee(Boolean invitee) {
        this.invitee = invitee;
    }
}
