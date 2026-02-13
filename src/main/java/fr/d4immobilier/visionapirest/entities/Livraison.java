/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Livraison implements Serializable {
    @OneToOne(mappedBy = "livraison",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private DocumentBonDeLivraison documentBonDeLivraison;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "livraisons",cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<MoyenAcces> moyensAcces;    
    private Instant dateExpedition;
    private String numeroSuivi;
    private TypeEnvoi typeEnvoi;
    private String statut;
    private Instant dateLivraison;
    private DestinationLivraison destinationLivraison;
    @OneToOne(mappedBy = "livraison", fetch = FetchType.LAZY)
    private FichierBonDeLivraison fichierBonDeLivraison;
    @ManyToOne(fetch = FetchType.LAZY)
    private PanierCommandeMoyenAcces panierCommandeMoyenAcces;
    private String reference;

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
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Livraison[ id=" + id + " ]";
    }

    /**
     * @return the dateExpedition
     */
    public Instant getDateExpedition() {
        return dateExpedition;
    }

    /**
     * @param dateExpedition the dateExpedition to set
     */
    public void setDateExpedition(Instant dateExpedition) {
        this.dateExpedition = dateExpedition;
    }

    /**
     * @return the numeroSuivi
     */
    public String getNumeroSuivi() {
        return numeroSuivi;
    }

    /**
     * @param numeroSuivi the numeroSuivi to set
     */
    public void setNumeroSuivi(String numeroSuivi) {
        this.numeroSuivi = numeroSuivi;
    }

    /**
     * @return the typeEnvoi
     */
    public TypeEnvoi getTypeEnvoi() {
        return typeEnvoi;
    }

    /**
     * @param typeEnvoi the typeEnvoi to set
     */
    public void setTypeEnvoi(TypeEnvoi typeEnvoi) {
        this.typeEnvoi = typeEnvoi;
    }

    /**
     * @return the statut
     */
    public String getStatut() {
        return statut;
    }

    /**
     * @param statut the statut to set
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }

    /**
     * @return the dateLivraison
     */
    public Instant getDateLivraison() {
        return dateLivraison;
    }

    /**
     * @param dateLivraison the dateLivraison to set
     */
    public void setDateLivraison(Instant dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    /**
     * @return the destinationLivraison
     */
    public DestinationLivraison getDestinationLivraison() {
        return destinationLivraison;
    }

    /**
     * @param destinationLivraison the destinationLivraison to set
     */
    public void setDestinationLivraison(DestinationLivraison destinationLivraison) {
        this.destinationLivraison = destinationLivraison;
    }

    /**
     * @return the fichierBonDeLivraison
     */
    public FichierBonDeLivraison getFichierBonDeLivraison() {
        return fichierBonDeLivraison;
    }

    /**
     * @param fichierBonDeLivraison the fichierBonDeLivraison to set
     */
    public void setFichierBonDeLivraison(FichierBonDeLivraison fichierBonDeLivraison) {
        this.fichierBonDeLivraison = fichierBonDeLivraison;
    }

    /**
     * @return the moyensAcces
     */
    public List<MoyenAcces> getMoyensAcces() {
        return moyensAcces;
    }

    /**
     * @param moyensAcces the moyensAcces to set
     */
    public void setMoyensAcces(List<MoyenAcces> moyensAcces) {
        this.moyensAcces = moyensAcces;
    }

    /**
     * @return the panierCommandeMoyenAcces
     */
    public PanierCommandeMoyenAcces getPanierCommandeMoyenAcces() {
        return panierCommandeMoyenAcces;
    }

    /**
     * @param panierCommandeMoyenAcces the panierCommandeMoyenAcces to set
     */
    public void setPanierCommandeMoyenAcces(PanierCommandeMoyenAcces panierCommandeMoyenAcces) {
        this.panierCommandeMoyenAcces = panierCommandeMoyenAcces;
    }

    /**
     * @return the documentBonDeLivraison
     */
    public DocumentBonDeLivraison getDocumentBonDeLivraison() {
        return documentBonDeLivraison;
    }

    /**
     * @param documentBonDeLivraison the documentBonDeLivraison to set
     */
    public void setDocumentBonDeLivraison(DocumentBonDeLivraison documentBonDeLivraison) {
        this.documentBonDeLivraison = documentBonDeLivraison;
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
    
}
