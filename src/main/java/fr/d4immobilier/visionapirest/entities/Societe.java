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
public class Societe implements Serializable {

    public static final transient int MODE_NORMAL = 0;
    public static final transient int MODE_CONTACT_INTERVENTION = 1;
    public static final transient int MODE_SANS_CIVILITE = 2;
    @OneToMany(mappedBy = "societe", fetch = FetchType.LAZY)
    private List<AutorisationValidationFactures> autorisationsValidationFactures;
    @ManyToMany(mappedBy = "membresSocietes", fetch = FetchType.LAZY)
    private List<ConseilSyndical> conseilsSyndicaux;
    @OneToMany(mappedBy = "presidentSociete", fetch = FetchType.LAZY)
    private List<ConseilSyndical> conseilsSyndicauxPresides;
    @OneToMany(mappedBy = "auteurSociete", fetch = FetchType.LAZY)
    private List<CommentaireFactureFournisseur> commentaireFactureFournisseurs;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CompteVision compteVision;
    @OneToMany(mappedBy = "societe", fetch = FetchType.LAZY)
    private List<CompteEnBanqueSociete> compteEnBanqueSocietes;
    @OneToMany(mappedBy = "emetteurSociete", fetch = FetchType.LAZY)
    private List<Cheque> cheques;
    @OneToMany(mappedBy = "appelantSociete", fetch = FetchType.LAZY)
    private List<AppelEntrant> appelsEntrants;
    @OneToMany(mappedBy = "destinataireSociete", fetch = FetchType.LAZY)
    private List<Document> documentsEnvoyes;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formeJuridique;
    private String raisonSociale;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Adresse adresse;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Personne representant;
    private String mail1;
    private String mail2;
    private String telPortable;
    private String telFixe;
    private String fax;
    private transient int modeAffichage = 0;

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
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
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
            String rep = "";
            if (getRepresentant() != null) {
                rep = "(" + getRepresentant() + ")";
            }
            if (getFormeJuridique() == null) {
                return getRaisonSociale() + rep + bat;
            } else {
                return getRaisonSociale() + " " + getFormeJuridique() + rep + bat;
            }
        } else {
            if (getFormeJuridique() == null) {
                return getRaisonSociale();
            } else {
                return getRaisonSociale() + " " + getFormeJuridique();
            }
        }

    }

    /**
     * @return the formeJuridique
     */
    public String getFormeJuridique() {
        return formeJuridique;
    }

    /**
     * @param formeJuridique the formeJuridique to set
     */
    public void setFormeJuridique(String formeJuridique) {
        this.formeJuridique = formeJuridique;
    }

    /**
     * @return the nom
     */
    public String getRaisonSociale() {
        return raisonSociale;
    }

    /**
     * @param nom the nom to set
     */
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
     * @return the representant
     */
    public Personne getRepresentant() {
        return representant;
    }

    /**
     * @param representant the representant to set
     */
    public void setRepresentant(Personne representant) {
        this.representant = representant;
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
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the compteEnBanqueSocietes
     */
    public List<CompteEnBanqueSociete> getCompteEnBanqueSocietes() {
        return compteEnBanqueSocietes;
    }

    /**
     * @param compteEnBanqueSocietes the compteEnBanqueSocietes to set
     */
    public void setCompteEnBanqueSocietes(List<CompteEnBanqueSociete> compteEnBanqueSocietes) {
        this.compteEnBanqueSocietes = compteEnBanqueSocietes;
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
     * @param autorisationsValidationFactures the autorisationsValidationFactures to set
     */
    public void setAutorisationsValidationFactures(List<AutorisationValidationFactures> autorisationsValidationFactures) {
        this.autorisationsValidationFactures = autorisationsValidationFactures;
    }
    
    
}
