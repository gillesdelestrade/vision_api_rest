/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ContratFournisseur implements Serializable {

    /**
     * @return the augmentationToleree
     */
    public static Float getAugmentationToleree() {
        return augmentationToleree;
    }

    /**
     * @param aAugmentationToleree the augmentationToleree to set
     */
    public static void setAugmentationToleree(Float aAugmentationToleree) {
        augmentationToleree = aAugmentationToleree;
    }

    @OneToMany(mappedBy = "contratFournisseur", fetch = FetchType.LAZY)
    private List<FactureFournisseur> facturesFournisseur;
    @OneToMany(mappedBy = "contratFournisseur", fetch = FetchType.LAZY)
    private List<FichierContrat> fichiersContrat;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private String reference;
    @Column(length = 1024)
    private String description;
    @Column(length = 4096)
    private String commentaire;
    private LocalDate dateContrat;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private MomentPaiementFacturesContrat momentPaiementFacturesContrat;
    private FrequenceFactures frequenceFactures;
    private Float montantForfait;
    private String referenceClient;
    private Boolean validationFacturesPasNecessaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private PrestationContrat prestationContrat;
    private Boolean facturationForfaitaire;
    private transient Integer modeAfichage = 0;
    public final transient Integer AFFICHAGE_NORMAL = 0;
    public final transient Integer AFFICHAGE_RECHERCHE = 1;
    private Integer jourAnniversaire;
    private Integer moisAnniversaire;
    private Integer dureePreavisResiliation;
    
    private static transient Float augmentationToleree = 0.03f;

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
        if (!(object instanceof ContratFournisseur)) {
            return false;
        }
        ContratFournisseur other = (ContratFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getModeAfichage().equals(AFFICHAGE_NORMAL)) {
            if (getCopropriete() == null) {
                return "Nouveau Contrat";
            } else {
                String presta = "";
                if (getPrestationContrat() != null) {
                    presta = getPrestationContrat().getPrestation() + " ";
                }
                return presta + " " + getCopropriete().getTrigramme() + " " + getReference();
            }
        } else {
            String presta = "";
            if (getPrestationContrat() != null) {
                presta = getPrestationContrat().getPrestation() + " ";
            }
            return presta + " " + getFournisseur().getRaisonSociale() + " " + getCopropriete().getTrigramme() + " " + getReference();
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
     * @return the dateContrat
     */
    public LocalDate getDateContrat() {
        return dateContrat;
    }

    /**
     * @param dateContrat the dateContrat to set
     */
    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    /**
     * @return the dateDebut
     */
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the momentPaiementFacturesContrat
     */
    public MomentPaiementFacturesContrat getMomentPaiementFacturesContrat() {
        return momentPaiementFacturesContrat;
    }

    /**
     * @param momentPaiementFacturesContrat the momentPaiementFacturesContrat to set
     */
    public void setMomentPaiementFacturesContrat(MomentPaiementFacturesContrat momentPaiementFacturesContrat) {
        this.momentPaiementFacturesContrat = momentPaiementFacturesContrat;
    }

    /**
     * @return the frequenceFactures
     */
    public FrequenceFactures getFrequenceFactures() {
        return frequenceFactures;
    }

    /**
     * @param frequenceFactures the frequenceFactures to set
     */
    public void setFrequenceFactures(FrequenceFactures frequenceFactures) {
        this.frequenceFactures = frequenceFactures;
    }

    /**
     * @return the montantForfait
     */
    public Float getMontantForfait() {
        return montantForfait;
    }

    /**
     * @param montantForfait the montantForfait to set
     */
    public void setMontantForfait(Float montantForfait) {
        this.montantForfait = montantForfait;
    }

    /**
     * @return the fichiersContrat
     */
    public List<FichierContrat> getFichiersContrat() {
        return fichiersContrat;
    }

    /**
     * @param fichiersContrat the fichiersContrat to set
     */
    public void setFichiersContrat(List<FichierContrat> fichiersContrat) {
        this.fichiersContrat = fichiersContrat;
    }

    /**
     * @return the referenceClient
     */
    public String getReferenceClient() {
        return referenceClient;
    }

    /**
     * @param referenceClient the referenceClient to set
     */
    public void setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
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
     * @return the facturesFournisseur
     */
    public List<FactureFournisseur> getFacturesFournisseur() {
        return facturesFournisseur;
    }

    /**
     * @param facturesFournisseur the facturesFournisseur to set
     */
    public void setFacturesFournisseur(List<FactureFournisseur> facturesFournisseur) {
        this.facturesFournisseur = facturesFournisseur;
    }

    /**
     * @return the validationFacturesNecessaire
     */
    public Boolean getValidationFacturesPasNecessaire() {
        return validationFacturesPasNecessaire;
    }

    /**
     * @param validationFacturesNecessaire the validationFacturesNecessaire to set
     */
    public void setValidationFacturesPasNecessaire(Boolean validationFacturesNecessaire) {
        this.validationFacturesPasNecessaire = validationFacturesNecessaire;
    }

    /**
     * @return the prestationContrat
     */
    public PrestationContrat getPrestationContrat() {
        return prestationContrat;
    }

    /**
     * @param prestationContrat the prestationContrat to set
     */
    public void setPrestationContrat(PrestationContrat prestationContrat) {
        this.prestationContrat = prestationContrat;
    }

    /**
     * @return the facturationForfaitaire
     */
    public Boolean getFacturationForfaitaire() {
        return facturationForfaitaire;
    }

    /**
     * @param facturationForfaitaire the facturationForfaitaire to set
     */
    public void setFacturationForfaitaire(Boolean facturationForfaitaire) {
        this.facturationForfaitaire = facturationForfaitaire;
    }

    /**
     * @return the modeAfichage
     */
    public Integer getModeAfichage() {
        return modeAfichage;
    }

    /**
     * @param modeAfichage the modeAfichage to set
     */
    public void setModeAfichage(Integer modeAfichage) {
        this.modeAfichage = modeAfichage;
    }

    /**
     * @return the jourAnniversaire
     */
    public Integer getJourAnniversaire() {
        return jourAnniversaire;
    }

    /**
     * @param jourAnniversaire the jourAnniversaire to set
     */
    public void setJourAnniversaire(Integer jourAnniversaire) {
        this.jourAnniversaire = jourAnniversaire;
    }

    /**
     * @return the moisAnniversaire
     */
    public Integer getMoisAnniversaire() {
        return moisAnniversaire;
    }

    /**
     * @param moisAnniversaire the moisAnniversaire to set
     */
    public void setMoisAnniversaire(Integer moisAnniversaire) {
        this.moisAnniversaire = moisAnniversaire;
    }

    /**
     * @return the dureePreavisResiliation
     */
    public Integer getDureePreavisResiliation() {
        return dureePreavisResiliation;
    }

    /**
     * @param dureePreavisResiliation the dureePreavisResiliation to set
     */
    public void setDureePreavisResiliation(Integer dureePreavisResiliation) {
        this.dureePreavisResiliation = dureePreavisResiliation;
    }
}
