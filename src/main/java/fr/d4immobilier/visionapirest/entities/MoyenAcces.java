/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class MoyenAcces implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    private PanierCommandeMoyenAcces panierCommandeMoyenAcces;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private MoyenAccesCatalogue moyenAccesCatalogue;
    private String numero;
    private Instant dateCommande;
    private Instant dateEntreeDansLeStock;
    private Instant dateSortieDuSotck;
    private Instant dateDeclarationPerte;
    private Instant dateDesactivation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Lot lotRattache;
    private String observations;    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Livraison> livraisons;
    @ManyToOne(fetch = FetchType.LAZY)
    private EmplacementStock emplacementStock;
    private Boolean aLaCorbeille;
    
    

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
        if (!(object instanceof MoyenAcces)) {
            return false;
        }
        MoyenAcces other = (MoyenAcces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.MoyenAcces[ id=" + id + " ]";
    }

    /**
     * @return the moyenAccesCatalogue
     */
    public MoyenAccesCatalogue getMoyenAccesCatalogue() {
        return moyenAccesCatalogue;
    }

    /**
     * @param moyenAccesCatalogue the moyenAccesCatalogue to set
     */
    public void setMoyenAccesCatalogue(MoyenAccesCatalogue moyenAccesCatalogue) {
        this.moyenAccesCatalogue = moyenAccesCatalogue;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the dateCommande
     */
    public Instant getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the dateCommande to set
     */
    public void setDateCommande(Instant dateCommande) {
        this.dateCommande = dateCommande;
    }

    /**
     * @return the dateEntreeDansLeStock
     */
    public Instant getDateEntreeDansLeStock() {
        return dateEntreeDansLeStock;
    }

    /**
     * @param dateEntreeDansLeStock the dateEntreeDansLeStock to set
     */
    public void setDateEntreeDansLeStock(Instant dateEntreeDansLeStock) {
        this.dateEntreeDansLeStock = dateEntreeDansLeStock;
    }

    /**
     * @return the dateSortieDuSotck
     */
    public Instant getDateSortieDuSotck() {
        return dateSortieDuSotck;
    }

    /**
     * @param dateSortieDuSotck the dateSortieDuSotck to set
     */
    public void setDateSortieDuSotck(Instant dateSortieDuSotck) {
        this.dateSortieDuSotck = dateSortieDuSotck;
    }

    /**
     * @return the dateDeclarationPerte
     */
    public Instant getDateDeclarationPerte() {
        return dateDeclarationPerte;
    }

    /**
     * @param dateDeclarationPerte the dateDeclarationPerte to set
     */
    public void setDateDeclarationPerte(Instant dateDeclarationPerte) {
        this.dateDeclarationPerte = dateDeclarationPerte;
    }

    /**
     * @return the dateDesactivation
     */
    public Instant getDateDesactivation() {
        return dateDesactivation;
    }

    /**
     * @param dateDesactivation the dateDesactivation to set
     */
    public void setDateDesactivation(Instant dateDesactivation) {
        this.dateDesactivation = dateDesactivation;
    }

    /**
     * @return the lotRattache
     */
    public Lot getLotRattache() {
        return lotRattache;
    }

    /**
     * @param lotRattache the lotRattache to set
     */
    public void setLotRattache(Lot lotRattache) {
        this.lotRattache = lotRattache;
    }

    /**
     * @return the observations
     */
    public String getObservations() {
        return observations;
    }

    /**
     * @param observations the observations to set
     */
    public void setObservations(String observations) {
        this.observations = observations;
    }

    /**
     * @return the livraisons
     */
    public List<Livraison> getLivraisons() {
        return livraisons;
    }

    /**
     * @param livraisons the livraisons to set
     */
    public void setLivraisons(List<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    /**
     * @return the emplacementStock
     */
    public EmplacementStock getEmplacementStock() {
        return emplacementStock;
    }

    /**
     * @param emplacementStock the emplacementStock to set
     */
    public void setEmplacementStock(EmplacementStock emplacementStock) {
        this.emplacementStock = emplacementStock;
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
    
}
