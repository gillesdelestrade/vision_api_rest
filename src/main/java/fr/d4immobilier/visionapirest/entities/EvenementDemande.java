/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EvenementDemande implements Serializable, Comparable<EvenementDemande> {

    //@OneToOne(mappedBy = "evenementDemande", fetch = FetchType.LAZY)
    @ManyToOne(fetch = FetchType.LAZY)
    private Courriel courriel;

    @ManyToOne(fetch = FetchType.LAZY)
    private ReunionV2 reunionV2;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    private Instant dateEvenement;
    @OneToOne(fetch = FetchType.LAZY)
    private Personne auteur;

    private String texte;
    public static final transient String CREATION = "Création de la fiche";
    public static final transient String CONSULTATION = "Consultation de la fiche";
    public static final transient String PRISE_EN_COMPTE = "Prise en compte de la fiche";
    public static final transient String CLOTURE_D4 = "Demande de cloture de la fiche par d4";
    public static final transient String CLOTURE = "Cloture de la fiche";
    public static final transient String REFUS_CLOTURE = "Cloture de la fiche non validée";
    public static final transient String CREATION_POUR = "Création de la fiche p/c ";
    public static final transient String CREATION_PAR = "Création de la fiche par ";
    public static final transient String DEMANDE_ASSIGNEE = "Demande confiée à ";
    public static final transient String ABONNEMENT = " a abonné à cette demande ";
    public static final transient String DEMANDE_CLOTURE_COPROPRIETAIRE = "Demande de cloture de la fiche.";
    public static final transient String DEMANDE_CLOTURE_COPROPRIETAIRE_ANNULEE = "Demande de cloture de la fiche annulée.";
    public static final transient String DEMANDE_DE_RAPPEL_POUR = "Demande de rappel pour ";
    public static final transient String CLOTURE_ANNULEE = "Cloture de la fiche annulée";

    private transient Boolean depuisLeJAR;
    private transient Boolean noMail;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtapeDemande etapeDemande;
    private Boolean aLaCorbeille;

    private Boolean clotureEtapeDemande;

    private Boolean copieParMail;

    private transient List<Personne> destinatairesPersonne;
    private transient List<Societe> destinatairesSociete;

    private Long idDI;
    private Long idDDF;

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
        if (!(object instanceof EvenementDemande)) {
            return false;
        }
        EvenementDemande other = (EvenementDemande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getTexte().contains("<a href")) {
            return "<html>" + getTexte() + "</html>";
        } else {
            return getTexte();
        }
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    /**
     * @return the dateEvenement
     */
    public Instant getDateEvenement() {
        return dateEvenement;
    }

    /**
     * @param dateEvenement the dateEvenement to set
     */
    public void setDateEvenement(Instant dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    /**
     * @return the auteur
     */
    public Personne getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * @param texte the texte to set
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    
    

    /**
     * @return the depuisLeJAR
     */
    public Boolean getDepuisLeJAR() {
        return depuisLeJAR;
    }

    /**
     * @param depuisLeJAR the depuisLeJAR to set
     */
    public void setDepuisLeJAR(Boolean depuisLeJAR) {
        this.depuisLeJAR = depuisLeJAR;
    }

    @Override
    public int compareTo(EvenementDemande t) {
        return this.getDateEvenement().compareTo(t.getDateEvenement());
    }

    /**
     * @return the etapeDemande
     */
    public EtapeDemande getEtapeDemande() {
        return etapeDemande;
    }

    /**
     * @param etapeDemande the etapeDemande to set
     */
    public void setEtapeDemande(EtapeDemande etapeDemande) {
        this.etapeDemande = etapeDemande;
    }

    /**
     * @return the noMail
     */
    public Boolean getNoMail() {
        return noMail;
    }

    /**
     * @param noMail the noMail to set
     */
    public void setNoMail(Boolean noMail) {
        this.noMail = noMail;
    }

    /**
     * @return the aLaCorbeille
     */
    public Boolean getaLaCorbeille() {
        return aLaCorbeille;
    }

    /**
     * @param aLaCorbeille the aLaCorbeille to set
     */
    public void setaLaCorbeille(Boolean aLaCorbeille) {
        this.aLaCorbeille = aLaCorbeille;
    }

    public Boolean evenementSysteme() {
        String[] evenementsSysteme = {CLOTURE, CLOTURE_D4, CONSULTATION, CREATION, CREATION_POUR, DEMANDE_ASSIGNEE, PRISE_EN_COMPTE, REFUS_CLOTURE, ABONNEMENT};
        if (getTexte() == null) {
            return Boolean.FALSE;
        }
        for (String evenementSysteme : evenementsSysteme) {
            if (getTexte().contains(evenementSysteme)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * @return the clotureEtapeDemande
     */
    public Boolean getClotureEtapeDemande() {
        return clotureEtapeDemande;
    }

    /**
     * @param clotureEtapeDemande the clotureEtapeDemande to set
     */
    public void setClotureEtapeDemande(Boolean clotureEtapeDemande) {
        this.clotureEtapeDemande = clotureEtapeDemande;
    }

    /**
     * @return the reunionV2
     */
    public ReunionV2 getReunionV2() {
        return reunionV2;
    }

    /**
     * @param reunionV2 the reunionV2 to set
     */
    public void setReunionV2(ReunionV2 reunionV2) {
        this.reunionV2 = reunionV2;
    }

    /**
     * @return the courriel
     */
    public Courriel getCourriel() {
        return courriel;
    }

    /**
     * @param courriel the courriel to set
     */
    public void setCourriel(Courriel courriel) {
        this.courriel = courriel;
    }

    /**
     * @return the copieParMail
     */
    public Boolean getCopieParMail() {
        return copieParMail;
    }

    /**
     * @param copieParMail the copieParMail to set
     */
    public void setCopieParMail(Boolean copieParMail) {
        this.copieParMail = copieParMail;
    }

    /**
     * @return the destinatairesPersonne
     */
    public List<Personne> getDestinatairesPersonne() {
        return destinatairesPersonne;
    }

    /**
     * @param destinatairesPersonne the destinatairesPersonne to set
     */
    public void setDestinatairesPersonne(List<Personne> destinatairesPersonne) {
        this.destinatairesPersonne = destinatairesPersonne;
    }

    /**
     * @return the destinatairesSociete
     */
    public List<Societe> getDestinatairesSociete() {
        return destinatairesSociete;
    }

    /**
     * @param destinatairesSociete the destinatairesSociete to set
     */
    public void setDestinatairesSociete(List<Societe> destinatairesSociete) {
        this.destinatairesSociete = destinatairesSociete;
    }

    /**
     * @return the idDI
     */
    public Long getIdDI() {
        return idDI;
    }

    /**
     * @param idDI the idDI to set
     */
    public void setIdDI(Long idDI) {
        this.idDI = idDI;
    }

    /**
     * @return the idDDF
     */
    public Long getIdDDF() {
        return idDDF;
    }

    /**
     * @param idDDF the idDDF to set
     */
    public void setIdDDF(Long idDDF) {
        this.idDDF = idDDF;
    }

    public Boolean estUnEvenementSysteme() {
        Boolean systeme = Boolean.FALSE;
        if (getTexte() != null) {
            systeme = systeme || getTexte().contains(EvenementDemande.ABONNEMENT);
            systeme = systeme || getTexte().equals(EvenementDemande.CLOTURE);
            systeme = systeme || getTexte().equals(EvenementDemande.CLOTURE_ANNULEE);
            systeme = systeme || getTexte().equals(EvenementDemande.CLOTURE_D4);
            systeme = systeme || getTexte().equals(EvenementDemande.CONSULTATION);
            systeme = systeme || getTexte().equals(EvenementDemande.CREATION);
            systeme = systeme || getTexte().startsWith(EvenementDemande.CREATION_PAR);
            systeme = systeme || getTexte().startsWith(EvenementDemande.CREATION_POUR);
            systeme = systeme || getTexte().startsWith(EvenementDemande.DEMANDE_ASSIGNEE);
            systeme = systeme || getTexte().equals(EvenementDemande.DEMANDE_CLOTURE_COPROPRIETAIRE);
            systeme = systeme || getTexte().equals(EvenementDemande.DEMANDE_CLOTURE_COPROPRIETAIRE_ANNULEE);
            systeme = systeme || getTexte().startsWith(EvenementDemande.DEMANDE_DE_RAPPEL_POUR);
            systeme = systeme || getTexte().equals(EvenementDemande.PRISE_EN_COMPTE);
            systeme = systeme || getTexte().equals(EvenementDemande.REFUS_CLOTURE);
        }
        return systeme;
    }

    public String getMarginLeft() {
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(dateEvenement, ZoneId.systemDefault());
        Calendar c = GregorianCalendar.from(zonedDateTime);
        int nbMinutesDebut = c.get(Calendar.HOUR_OF_DAY) * 60 + c.get(Calendar.MINUTE);
        int nbMinutesDebutjournee = 11 * 60 + 30;

        Float f = ((float) (nbMinutesDebut - nbMinutesDebutjournee)) / 3.6f;

        return new DecimalFormat("0.00").format(f) + "%";

    }

}
