/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class InterventionDemande implements Serializable {
    @OneToOne(mappedBy = "interventionDemande", fetch = FetchType.LAZY)
    private DemandeDevis demandeDevis;
    @OneToOne(mappedBy = "demandeIntervention", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DevisFournisseur devisFournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private PanierDemandesIntervention panierDemandesIntervention;
    @OneToOne(mappedBy = "interventionDemande", fetch = FetchType.LAZY)
    private FichierInterventionDemande fichierDemandeIntervention;
    @ManyToOne(fetch = FetchType.LAZY)
    private FactureFournisseur factureFournisseur;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateCreationDemande;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    private String reference;
    private String objet;
    private String lieuIntervention;
    private Instant datePriseEnCompteFournisseur;
    private String plageInterventionPrevue;
    @Column(name = "daterappel")
    private LocalDate dateRappel;
    private LocalDate dateInterventionRealisee;
    private LocalDate dateAnnulation;
    private String historique;
    private Boolean analyzed;
    @ManyToOne(fetch = FetchType.LAZY)
    private Metier metier;
    private transient int modeAffichage;
    public static final int MODE_OBJET_SEUL = 0;
    public static final int MODE_COMPLET = 1;
    private Boolean prioritaire;
    private Integer nombreRelances;
    private Instant dateAccordCS;
   
    private Integer idViaAPIFournisseur;
    
    private transient Integer ancienneValeurIdViaAPIFournisseur;


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
        if (!(object instanceof InterventionDemande)) {
            return false;
        }
        InterventionDemande other = (InterventionDemande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (MODE_COMPLET == getModeAffichage()) {
            return getReference() + " : " + getObjet();
        } else {
            return getObjet();
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
     * @return the objet
     */
    public String getObjet() {
        return objet;
    }

    /**
     * @param objet the objet to set
     */
    public void setObjet(String objet) {
        this.objet = objet;
    }

    /**
     * @return the dateCreationDemande
     */
    public Instant getDateCreationDemande() {
        return dateCreationDemande;
    }

    /**
     * @param dateCreationDemande the dateCreationDemande to set
     */
    public void setDateCreationDemande(Instant dateCreationDemande) {
        this.dateCreationDemande = dateCreationDemande;
    }

    /**
     * @return the lieuIntervention
     */
    public String getLieuIntervention() {
        return lieuIntervention;
    }

    /**
     * @param lieuIntervention the lieuIntervention to set
     */
    public void setLieuIntervention(String lieuIntervention) {
        this.lieuIntervention = lieuIntervention;
    }

    /**
     * @return the factureFournisseur
     */
    public FactureFournisseur getFactureFournisseur() {
        return factureFournisseur;
    }

    /**
     * @param factureFournisseur the factureFournisseur to set
     */
    public void setFactureFournisseur(FactureFournisseur factureFournisseur) {
        this.factureFournisseur = factureFournisseur;
    }

    /**
     * @return the fichierDemandeIntervention
     */
    public FichierInterventionDemande getFichierDemandeIntervention() {
        return fichierDemandeIntervention;
    }

    /**
     * @param fichierDemandeIntervention the fichierDemandeIntervention to set
     */
    public void setFichierDemandeIntervention(FichierInterventionDemande fichierDemandeIntervention) {
        this.fichierDemandeIntervention = fichierDemandeIntervention;
    }

    /**
     * @return the panierDemandesIntervention
     */
    public PanierDemandesIntervention getPanierDemandesIntervention() {
        return panierDemandesIntervention;
    }

    /**
     * @param panierDemandesIntervention the panierDemandesIntervention to set
     */
    public void setPanierDemandesIntervention(PanierDemandesIntervention panierDemandesIntervention) {
        this.panierDemandesIntervention = panierDemandesIntervention;
    }

    /**
     * @return the datePriseEnCompteFournisseur
     */
    public Instant getDatePriseEnCompteFournisseur() {
        return datePriseEnCompteFournisseur;
    }

    /**
     * @param datePriseEnCompteFournisseur the datePriseEnCompteFournisseur to
     * set
     */
    public void setDatePriseEnCompteFournisseur(Instant datePriseEnCompteFournisseur) {
        this.datePriseEnCompteFournisseur = datePriseEnCompteFournisseur;
    }

    /**
     * @return the plageInterventionPrevue
     */
    public String getPlageInterventionPrevue() {
        return plageInterventionPrevue;
    }

    /**
     * @param plageInterventionPrevue the plageInterventionPrevue to set
     */
    public void setPlageInterventionPrevue(String plageInterventionPrevue) {
        this.plageInterventionPrevue = plageInterventionPrevue;
    }

    /**
     * @return the dateRappel
     */
    public LocalDate getDateRappel() {
        return dateRappel;
    }

    /**
     * @param dateRappel the dateRappel to set
     */
    public void setDateRappel(LocalDate dateRappel) {
        this.dateRappel = dateRappel;
    }

    /**
     * @return the dateInterventionRealisee
     */
    public LocalDate getDateInterventionRealisee() {
        return dateInterventionRealisee;
    }

    /**
     * @param dateInterventionRealisee the dateInterventionRealisee to set
     */
    public void setDateInterventionRealisee(LocalDate dateInterventionRealisee) {
        this.dateInterventionRealisee = dateInterventionRealisee;
    }

    /**
     * @return the dateAnnulation
     */
    public LocalDate getDateAnnulation() {
        return dateAnnulation;
    }

    /**
     * @param dateAnnulation the dateAnnulation to set
     */
    public void setDateAnnulation(LocalDate dateAnnulation) {
        this.dateAnnulation = dateAnnulation;
    }

    /**
     * @return the devisFournisseur
     */
    public DevisFournisseur getDevisFournisseur() {
        return devisFournisseur;
    }

    /**
     * @param devisFournisseur the devisFournisseur to set
     */
    public void setDevisFournisseur(DevisFournisseur devisFournisseur) {
        this.devisFournisseur = devisFournisseur;
    }

    /**
     * @return the historique
     */
    public String getHistorique() {
        return historique;
    }

    /**
     * @param historique the historique to set
     */
    public void setHistorique(String historique) {
        this.historique = historique;
    }

    /**
     * @return the demandeDevis
     */
    public DemandeDevis getDemandeDevis() {
        return demandeDevis;
    }

    /**
     * @param demandeDevis the demandeDevis to set
     */
    public void setDemandeDevis(DemandeDevis demandeDevis) {
        this.demandeDevis = demandeDevis;
    }

    /**
     * @return the analyzed
     */
    public Boolean getAnalyzed() {
        return analyzed;
    }

    /**
     * @param analyzed the analyzed to set
     */
    public void setAnalyzed(Boolean analyzed) {
        this.analyzed = analyzed;
    }

    /**
     * @return the metier
     */
    public Metier getMetier() {
        return metier;
    }

    /**
     * @param metier the metier to set
     */
    public void setMetier(Metier metier) {
        this.metier = metier;
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
     * @return the prioritaire
     */
    public Boolean getPrioritaire() {
        return prioritaire;
    }

    /**
     * @param prioritaire the prioritaire to set
     */
    public void setPrioritaire(Boolean prioritaire) {
        this.prioritaire = prioritaire;
    }

    /**
     * @return the nombreRelances
     */
    public Integer getNombreRelances() {
        return nombreRelances;
    }

    /**
     * @param nombreRelances the nombreRelances to set
     */
    public void setNombreRelances(Integer nombreRelances) {
        this.nombreRelances = nombreRelances;
    }

    /**
     * @return the dateAccordCS
     */
    public Instant getDateAccordCS() {
        return dateAccordCS;
    }

    /**
     * @param dateAccordCS the dateAccordCS to set
     */
    public void setDateAccordCS(Instant dateAccordCS) {
        this.dateAccordCS = dateAccordCS;
    }

    /**
     * @return the idViaAPIFournisseur
     */
    public Integer getIdViaAPIFournisseur() {
        return idViaAPIFournisseur;
    }

    /**
     * @param idViaAPIFournisseur the idViaAPIFournisseur to set
     */
    public void setIdViaAPIFournisseur(Integer idViaAPIFournisseur) {
        this.idViaAPIFournisseur = idViaAPIFournisseur;
        
    }
    
    
    
    
}
