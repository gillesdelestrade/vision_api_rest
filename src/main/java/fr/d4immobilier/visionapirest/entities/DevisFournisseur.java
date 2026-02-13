/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DevisFournisseur implements Serializable {

    @OneToMany(mappedBy = "devisFournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CommentaireDevisFournisseur> commentairesDevisFournisseurs;
    @OneToOne(mappedBy = "devisFournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private FichierDevisFournisseur fichierDevisFournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private DemandeDevisFournisseur demandeDevisFournisseur;
    public static final transient int RECU = 0;
    public static final transient int AU_VISA_D4 = 1;
    public static final transient int AU_VISA_CS = 2;
    public static final transient int ACCEPTE = 4;
    public static final transient int BLOQUE_D4 = 5;
    public static final transient int BLOQUE_CS = 6;
    public static final transient int AFFICHAGE_COMPLET = 0;
    public static final transient int AFFICHAGE_REFERENCE = 1;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private LocalDate dateReception;
    private LocalDate dateDevis;
    private String reference;
    private Float montant;
    private AvisD4Devis avisD4;
    private AvisDevisCS avisCS;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private InterventionDemande demandeIntervention;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne approbateur;
    private LocalDate dateDecisionCS;
    private Boolean priseEnCompteParLeBot;
    private String commentaire;
    private transient int modeAffichage;
    private Boolean masquer;
    private LocalDate dateEnvoiAuConseilSyndical;
    private String detailEnvoiAuConseilSyndical;
    private String elementsANoter;

    @OneToOne(fetch = FetchType.LAZY)
    private FichierDemande fichierKBIS;
    @OneToOne(fetch = FetchType.LAZY)
    private FichierDemande fichierVigilanceURSSAF;
    @OneToOne(fetch = FetchType.LAZY)
    private FichierDemande fichierTravailleursEtrangers;
    @OneToOne(fetch = FetchType.LAZY)
    private FichierDemande fichierRCPro;
    @OneToOne(fetch = FetchType.LAZY)
    private FichierDemande fichierAssuranceDecennale;

    private Boolean fichierKBISConforme;
    private Boolean fichierVigilanceURSSAFConforme;
    private Boolean fichierTravailleursEtrangersConforme;
    private Boolean fichierRCProConforme;
    private Boolean fichierAssuranceDecennaleConforme;
    private Boolean fichierAssuranceDecennaleNonConcerne;

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
        if (!(object instanceof DevisFournisseur)) {
            return false;
        }
        DevisFournisseur other = (DevisFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        if (getModeAffichage() == AFFICHAGE_COMPLET) {
            String date = "";
            if (getDateDevis() != null) {
                date = getDateDevis().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
            }
            return getCopropriete().getTrigramme() + " " + date + " : " + new DecimalFormat("###,###,##0.00¤").format(getMontant()) + " " + getReference();
        } else if (getModeAffichage() == AFFICHAGE_REFERENCE) {
            return getReference();
        } else {
            String date = "";
            if (getDateDevis() != null) {
                date = getDateDevis().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
            }
            return getCopropriete().getTrigramme() + " " + date + " : " + new DecimalFormat("###,###,##0.00¤").format(getMontant()) + " " + getReference();
        }
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
    public LocalDate getDateDevis() {
        return dateDevis;
    }

    /**
     * @param dateDevis the dateDevis to set
     */
    public void setDateDevis(LocalDate dateDevis) {
        this.dateDevis = dateDevis;
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
    public AvisD4Devis getAvisD4() {
        return avisD4;
    }

    /**
     * @param avisD4 the avisD4 to set
     */
    public void setAvisD4(AvisD4Devis avisD4) {
        this.avisD4 = avisD4;
    }

    /**
     * @return the avisCS
     */
    public AvisDevisCS getAvisCS() {
        return avisCS;
    }

    /**
     * @param avisCS the avisCS to set
     */
    public void setAvisCS(AvisDevisCS avisCS) {
        this.avisCS = avisCS;
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

    public int getEtat() {
        int etat = RECU;
        if (AvisD4Devis.en_attente.equals(getAvisD4())) {
            etat = AU_VISA_D4;
        }
        if ((AvisD4Devis.valide.equals(getAvisD4()) || AvisD4Devis.consulter_le_cs.equals(getAvisD4()))
                && (AvisDevisCS.en_attente.equals(getAvisCS()))) {
            etat = AU_VISA_CS;
        }

        if (getDateDecisionCS() != null) {
            etat = ACCEPTE;
        }
        if (AvisD4Devis.bloque.equals(getAvisD4())) {
            etat = BLOQUE_D4;
        }

        if (AvisD4Devis.bloque.equals(getAvisD4()) == false && AvisDevisCS.refuse.equals(getAvisCS())) {
            etat = BLOQUE_CS;
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
     * @return the demandeIntervention
     */
    public InterventionDemande getDemandeIntervention() {
        return demandeIntervention;
    }

    /**
     * @param demandeIntervention the demandeIntervention to set
     */
    public void setDemandeIntervention(InterventionDemande demandeIntervention) {
        this.demandeIntervention = demandeIntervention;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the demandeDevisFournisseur
     */
    public DemandeDevisFournisseur getDemandeDevisFournisseur() {
        return demandeDevisFournisseur;
    }

    /**
     * @param demandeDevisFournisseur the demandeDevisFournisseur to set
     */
    public void setDemandeDevisFournisseur(DemandeDevisFournisseur demandeDevisFournisseur) {
        this.demandeDevisFournisseur = demandeDevisFournisseur;
    }

    /**
     * @return the fichierDevisFournisseur
     */
    public FichierDevisFournisseur getFichierDevisFournisseur() {
        return fichierDevisFournisseur;
    }

    /**
     * @param fichierDevisFournisseur the fichierDevisFournisseur to set
     */
    public void setFichierDevisFournisseur(FichierDevisFournisseur fichierDevisFournisseur) {
        this.fichierDevisFournisseur = fichierDevisFournisseur;
    }

    /**
     * @return the commentairesDevisFournisseurs
     */
    public List<CommentaireDevisFournisseur> getCommentairesDevisFournisseurs() {
        return commentairesDevisFournisseurs;
    }

    /**
     * @param commentairesDevisFournisseurs the commentairesDevisFournisseurs to
     * set
     */
    public void setCommentairesDevisFournisseurs(List<CommentaireDevisFournisseur> commentairesDevisFournisseurs) {
        this.commentairesDevisFournisseurs = commentairesDevisFournisseurs;
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
     * @return the masquer
     */
    public Boolean getMasquer() {
        return masquer;
    }

    /**
     * @param masquer the masquer to set
     */
    public void setMasquer(Boolean masquer) {
        this.masquer = masquer;
    }

    /**
     * @return the dateEnvoiAuConseilSyndical
     */
    public LocalDate getDateEnvoiAuConseilSyndical() {
        return dateEnvoiAuConseilSyndical;
    }

    /**
     * @param dateEnvoiAuConseilSyndical the dateEnvoiAuConseilSyndical to set
     */
    public void setDateEnvoiAuConseilSyndical(LocalDate dateEnvoiAuConseilSyndical) {
        this.dateEnvoiAuConseilSyndical = dateEnvoiAuConseilSyndical;
    }

    /**
     * @return the detailEnvoiAuConseilSyndical
     */
    public String getDetailEnvoiAuConseilSyndical() {
        return detailEnvoiAuConseilSyndical;
    }

    /**
     * @param detailEnvoiAuConseilSyndical the detailEnvoiAuConseilSyndical to
     * set
     */
    public void setDetailEnvoiAuConseilSyndical(String detailEnvoiAuConseilSyndical) {
        this.detailEnvoiAuConseilSyndical = detailEnvoiAuConseilSyndical;
    }

    /**
     * @return the elementsANoter
     */
    public String getElementsANoter() {
        return elementsANoter;
    }

    /**
     * @param elementsANoter the elementsANoter to set
     */
    public void setElementsANoter(String elementsANoter) {
        this.elementsANoter = elementsANoter;
    }

    /**
     * @return the fichierKBIS
     */
    public FichierDemande getFichierKBIS() {
        return fichierKBIS;
    }

    /**
     * @param fichierKBIS the fichierKBIS to set
     */
    public void setFichierKBIS(FichierDemande fichierKBIS) {
        this.fichierKBIS = fichierKBIS;
    }

    /**
     * @return the fichierVigilanceURSSAF
     */
    public FichierDemande getFichierVigilanceURSSAF() {
        return fichierVigilanceURSSAF;
    }

    /**
     * @param fichierVigilanceURSSAF the fichierVigilanceURSSAF to set
     */
    public void setFichierVigilanceURSSAF(FichierDemande fichierVigilanceURSSAF) {
        this.fichierVigilanceURSSAF = fichierVigilanceURSSAF;
    }

    /**
     * @return the fichierTravailleursEtrangers
     */
    public FichierDemande getFichierTravailleursEtrangers() {
        return fichierTravailleursEtrangers;
    }

    /**
     * @param fichierTravailleursEtrangers the fichierTravailleursEtrangers to
     * set
     */
    public void setFichierTravailleursEtrangers(FichierDemande fichierTravailleursEtrangers) {
        this.fichierTravailleursEtrangers = fichierTravailleursEtrangers;
    }

    /**
     * @return the fichierRCPro
     */
    public FichierDemande getFichierRCPro() {
        return fichierRCPro;
    }

    /**
     * @param fichierRCPro the fichierRCPro to set
     */
    public void setFichierRCPro(FichierDemande fichierRCPro) {
        this.fichierRCPro = fichierRCPro;
    }

    /**
     * @return the fichierAssuranceDecennale
     */
    public FichierDemande getFichierAssuranceDecennale() {
        return fichierAssuranceDecennale;
    }

    /**
     * @param fichierAssuranceDecennale the fichierAssuranceDecennale to set
     */
    public void setFichierAssuranceDecennale(FichierDemande fichierAssuranceDecennale) {
        this.fichierAssuranceDecennale = fichierAssuranceDecennale;
    }

    /**
     * @return the fichierKBISConforme
     */
    public Boolean getFichierKBISConforme() {
        return fichierKBISConforme;
    }

    /**
     * @param fichierKBISConforme the fichierKBISConforme to set
     */
    public void setFichierKBISConforme(Boolean fichierKBISConforme) {
        this.fichierKBISConforme = fichierKBISConforme;
    }

    /**
     * @return the fichierVigilanceURSSAFConforme
     */
    public Boolean getFichierVigilanceURSSAFConforme() {
        return fichierVigilanceURSSAFConforme;
    }

    /**
     * @param fichierVigilanceURSSAFConforme the fichierVigilanceURSSAFConforme
     * to set
     */
    public void setFichierVigilanceURSSAFConforme(Boolean fichierVigilanceURSSAFConforme) {
        this.fichierVigilanceURSSAFConforme = fichierVigilanceURSSAFConforme;
    }

    /**
     * @return the fichierTravailleursEtrangersConforme
     */
    public Boolean getFichierTravailleursEtrangersConforme() {
        return fichierTravailleursEtrangersConforme;
    }

    /**
     * @param fichierTravailleursEtrangersConforme the
     * fichierTravailleursEtrangersConforme to set
     */
    public void setFichierTravailleursEtrangersConforme(Boolean fichierTravailleursEtrangersConforme) {
        this.fichierTravailleursEtrangersConforme = fichierTravailleursEtrangersConforme;
    }

    /**
     * @return the fichierRCProConforme
     */
    public Boolean getFichierRCProConforme() {
        return fichierRCProConforme;
    }

    /**
     * @param fichierRCProConforme the fichierRCProConforme to set
     */
    public void setFichierRCProConforme(Boolean fichierRCProConforme) {
        this.fichierRCProConforme = fichierRCProConforme;
    }

    /**
     * @return the fichierAssuranceDecennaleConforme
     */
    public Boolean getFichierAssuranceDecennaleConforme() {
        return fichierAssuranceDecennaleConforme;
    }

    /**
     * @param fichierAssuranceDecennaleConforme the
     * fichierAssuranceDecennaleConforme to set
     */
    public void setFichierAssuranceDecennaleConforme(Boolean fichierAssuranceDecennaleConforme) {
        this.fichierAssuranceDecennaleConforme = fichierAssuranceDecennaleConforme;
    }

    /**
     * @return the fichierAssuranceDecennaleNonConcerne
     */
    public Boolean getFichierAssuranceDecennaleNonConcerne() {
        return fichierAssuranceDecennaleNonConcerne;
    }

    /**
     * @param fichierAssuranceDecennaleNonConcerne the
     * fichierAssuranceDecennaleNonConcerne to set
     */
    public void setFichierAssuranceDecennaleNonConcerne(Boolean fichierAssuranceDecennaleNonConcerne) {
        this.fichierAssuranceDecennaleNonConcerne = fichierAssuranceDecennaleNonConcerne;
    }

    public Boolean getBPADisponible() {
        if (getMontant() == null || getMontant() < 5500f) {
            return Boolean.TRUE;
        } else {
            if (Boolean.TRUE.equals(getFichierKBISConforme())
                    && getFichierKBIS() != null
                    && Boolean.TRUE.equals(getFichierVigilanceURSSAFConforme())
                    && getFichierVigilanceURSSAF() != null
                    && Boolean.TRUE.equals(getFichierTravailleursEtrangersConforme())
                    && getFichierTravailleursEtrangers() != null
                    && Boolean.TRUE.equals(getFichierRCProConforme())
                    && getFichierRCPro() != null
                    && (Boolean.TRUE.equals(getFichierAssuranceDecennaleNonConcerne())
                    || (Boolean.TRUE.equals(getFichierAssuranceDecennaleConforme())
                    && getFichierAssuranceDecennale() != null))) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        }
    }

    public String getDescriptionFichiersObligatoires() {
        String s = "";

        if (getMontant() == null || getMontant() < 5500f) {
            // ben rien en fait
        } else {
            if (getFichierKBIS() == null) {
                s = "Le fichier KBIS est absent<br/>";
            } else {
                if (Boolean.FALSE.equals(getFichierKBISConforme())) {
                    s = "Le fichier KBIS n'est pas conforme<br/>";
                } else if (getFichierKBISConforme() == null) {
                    s = "Le fichier KBIS n'a pas encore été examiné<br/>";
                }
            }
            if (getFichierVigilanceURSSAF() == null) {
                s = s + "Le fichier Vigilance URSSAF est absent<br/>";
            } else {
                if (Boolean.FALSE.equals(getFichierVigilanceURSSAFConforme())) {
                    s = s + "Le fichier Vigilance URSSAF n'est pas conforme<br/>";
                } else if (getFichierVigilanceURSSAFConforme() == null) {
                    s = s + "Le fichier Vigilance URSSAF n'a pas encore été examiné<br/>";
                }
            }
            if (getFichierTravailleursEtrangers() == null) {
                s = s + "Le fichier de la liste des travailleurs étrangers est absent<br/>";
            } else {
                if (Boolean.FALSE.equals(getFichierTravailleursEtrangersConforme())) {
                    s = s + "Le fichier de la liste des travailleurs étrangers n'est pas conforme<br/>";
                } else if (getFichierTravailleursEtrangersConforme() == null) {
                    s = s + "Le fichier de la liste des travailleurs étrangers n'a pas encore été examiné<br/>";
                }
            }
            if (getFichierRCPro() == null) {
                s = s + "Le fichier Attestation Assurance Responsabilité Civile Professionnelle est absent<br/>";
            } else {
                if (Boolean.FALSE.equals(getFichierRCProConforme())) {
                    s = s + "Le fichier Attestation Assurance Responsabilité Civile Professionnelle n'est pas conforme<br/>";
                } else if (getFichierRCProConforme() == null) {
                    s = s + "Le fichier Attestation Assurance Responsabilité Civile Professionnelle n'a pas encore été examiné<br/>";
                }
            }
            if (Boolean.TRUE.equals(getFichierAssuranceDecennaleNonConcerne()) == false) {
                if (getFichierAssuranceDecennale() == null) {
                    s = s + "Le fichier Attestation Assurance Decennale est absent<br/>";
                } else {
                    if (Boolean.FALSE.equals(getFichierAssuranceDecennaleConforme())) {
                        s = s + "Le fichier Attestation Assurance Decennale n'est pas conforme<br/>";
                    } else if (getFichierAssuranceDecennaleConforme() == null) {
                        s = s + "Le fichier Attestation Assurance Decennale n'a pas encore été examiné<br/>";
                    }
                }
            }

        }
        return s;
    }
}
