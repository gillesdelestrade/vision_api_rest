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
public class DemandeDevis implements Serializable, Comparable<DemandeDevis> {

    @OneToMany(mappedBy = "demandeDevis", fetch = FetchType.LAZY)
    private List<FichierDemandeDevis> fichiersDemandeDevis;
    @OneToMany(mappedBy = "demandeDevis", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DemandeDevisFournisseur> demandeDevisFournisseurs;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    private LocalDate dateDemandeDevis;
    @Column(length = 2048)
    private String objet;

    private String reference;
    private String lieuIntervention;

    private LocalDate dateCloture;
    private MotifClotureDemandeDevis motifClotureDemandeDevis;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Personne> contactsSurPlace;

    @OneToOne(fetch = FetchType.LAZY)
    private InterventionDemande interventionDemande;

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
        if (!(object instanceof DemandeDevis)) {
            return false;
        }
        DemandeDevis other = (DemandeDevis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getReference() + " : " + getObjet();
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
     * @return the dateDemandeDevis
     */
    public LocalDate getDateDemandeDevis() {
        return dateDemandeDevis;
    }

    /**
     * @param dateDemandeDevis the dateDemandeDevis to set
     */
    public void setDateDemandeDevis(LocalDate dateDemandeDevis) {
        this.dateDemandeDevis = dateDemandeDevis;
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
     * @return the demandeDevisFournisseurs
     */
    public List<DemandeDevisFournisseur> getDemandeDevisFournisseurs() {
        return demandeDevisFournisseurs;
    }

    /**
     * @param demandeDevisFournisseurs the demandeDevisFournisseurs to set
     */
    public void setDemandeDevisFournisseurs(List<DemandeDevisFournisseur> demandeDevisFournisseurs) {
        this.demandeDevisFournisseurs = demandeDevisFournisseurs;
    }

    /**
     * @return the contactsSurPlace
     */
    public List<Personne> getContactsSurPlace() {
        return contactsSurPlace;
    }

    /**
     * @param contactsSurPlace the contactsSurPlace to set
     */
    public void setContactsSurPlace(List<Personne> contactsSurPlace) {
        this.contactsSurPlace = contactsSurPlace;
    }

    /**
     * @return the fichiersDemandeDevis
     */
    public List<FichierDemandeDevis> getFichiersDemandeDevis() {
        return fichiersDemandeDevis;
    }

    /**
     * @param fichiersDemandeDevis the fichiersDemandeDevis to set
     */
    public void setFichiersDemandeDevis(List<FichierDemandeDevis> fichiersDemandeDevis) {
        this.fichiersDemandeDevis = fichiersDemandeDevis;
    }

    /**
     * @return the dateCloture
     */
    public LocalDate getDateCloture() {
        return dateCloture;
    }

    /**
     * @param dateCloture the dateCloture to set
     */
    public void setDateCloture(LocalDate dateCloture) {
        this.dateCloture = dateCloture;
    }

    /**
     * @return the motifClotureDemandeDevis
     */
    public MotifClotureDemandeDevis getMotifClotureDemandeDevis() {
        return motifClotureDemandeDevis;
    }

    /**
     * @param motifClotureDemandeDevis the motifClotureDemandeDevis to set
     */
    public void setMotifClotureDemandeDevis(MotifClotureDemandeDevis motifClotureDemandeDevis) {
        this.motifClotureDemandeDevis = motifClotureDemandeDevis;
    }

    /**
     * @return the interventionDemande
     */
    public InterventionDemande getInterventionDemande() {
        return interventionDemande;
    }

    /**
     * @param interventionDemande the interventionDemande to set
     */
    public void setInterventionDemande(InterventionDemande interventionDemande) {
        this.interventionDemande = interventionDemande;
    }

    @Override
    public int compareTo(DemandeDevis o) {
        if (this.getDateDemandeDevis() != null && o != null && o.getDateDemandeDevis() != null) {
            return this.getDateDemandeDevis().compareTo(o.getDateDemandeDevis());
        } else return 0;
    }

}
