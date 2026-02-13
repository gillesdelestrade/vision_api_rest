/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import jakarta.persistence.NamedAttributeNode;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.NamedSubgraph;
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedEntityGraph(
        name = "DemandeDevisFournisseur.withFournisseur",
        attributeNodes = {
            @NamedAttributeNode("fournisseur")
        }
)

@NamedEntityGraph(
        name = "DemandeDevisFournisseur.withFournisseurAndRepresentant",
        attributeNodes = {
            @NamedAttributeNode(
                    value = "fournisseur",
                    subgraph = "fournisseur-subgraph"
            )
        },
        subgraphs = {
            @NamedSubgraph(
                    name = "fournisseur-subgraph",
                    attributeNodes = {
                        @NamedAttributeNode("representant")
                    }
            )
        }
)

public class DemandeDevisFournisseur implements Serializable {

    @OneToOne(mappedBy = "demandeDevisFournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DocumentDemandeDevis documentDemandeDevis;
    @OneToOne(mappedBy = "demandeDevisFournisseur", fetch = FetchType.LAZY)
    private FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.LAZY)
    private DemandeDevis demandeDevis;
    @OneToMany(mappedBy = "demandeDevisFournisseur", fetch = FetchType.LAZY)
    private List<DevisFournisseur> devisFournisseurs;
    private Instant datePriseEnCompteFournisseur;
    private String periodeRemiseDevisPrevue;
    private LocalDate dateReceptionDevis;
    private LocalDate dateRappel;
    private LocalDate dateAnnulation;
    private String historique;
    private Boolean prioritaire;
    private Integer nombreRelances;

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
        if (!(object instanceof DemandeDevisFournisseur)) {
            return false;
        }
        DemandeDevisFournisseur other = (DemandeDevisFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.DemandeDevisFournisseur[id=" + id + "]";
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
     * @return the devisFournisseurs
     */
    public List<DevisFournisseur> getDevisFournisseurs() {
        return devisFournisseurs;
    }

    /**
     * @param devisFournisseurs the devisFournisseurs to set
     */
    public void setDevisFournisseurs(List<DevisFournisseur> devisFournisseurs) {
        this.devisFournisseurs = devisFournisseurs;
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
     * @return the periodeRemiseDevisPrevue
     */
    public String getPeriodeRemiseDevisPrevue() {
        return periodeRemiseDevisPrevue;
    }

    /**
     * @param periodeRemiseDevisPrevue the periodeRemiseDevisPrevue to set
     */
    public void setPeriodeRemiseDevisPrevue(String periodeRemiseDevisPrevue) {
        this.periodeRemiseDevisPrevue = periodeRemiseDevisPrevue;
    }

    /**
     * @return the dateReceptionDevis
     */
    public LocalDate getDateReceptionDevis() {
        return dateReceptionDevis;
    }

    /**
     * @param dateReceptionDevis the dateReceptionDevis to set
     */
    public void setDateReceptionDevis(LocalDate dateReceptionDevis) {
        this.dateReceptionDevis = dateReceptionDevis;
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
     * @return the documentDemandeDevis
     */
    public DocumentDemandeDevis getDocumentDemandeDevis() {
        return documentDemandeDevis;
    }

    /**
     * @param documentDemandeDevis the documentDemandeDevis to set
     */
    public void setDocumentDemandeDevis(DocumentDemandeDevis documentDemandeDevis) {
        this.documentDemandeDevis = documentDemandeDevis;
    }

    /**
     * @return the fichierDemandeDevisFournisseur
     */
    public FichierDemandeDevisFournisseur getFichierDemandeDevisFournisseur() {
        return fichierDemandeDevisFournisseur;
    }

    /**
     * @param fichierDemandeDevisFournisseur the fichierDemandeDevisFournisseur
     * to set
     */
    public void setFichierDemandeDevisFournisseur(FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur) {
        this.fichierDemandeDevisFournisseur = fichierDemandeDevisFournisseur;
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

}
