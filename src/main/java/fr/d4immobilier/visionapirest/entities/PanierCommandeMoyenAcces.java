/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import jakarta.persistence.CascadeType;
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
public class PanierCommandeMoyenAcces implements Serializable {
    @OneToMany(mappedBy = "panierCommandeMoyenAcces", fetch = FetchType.LAZY)
    private List<Livraison> livraisons;

    @OneToMany(mappedBy = "panierCommandeMoyenAcces", fetch = FetchType.LAZY)
    private List<BonDeCommandePanierMoyenAcces> bonsDeCommandePanierMoyenAcces;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @OneToMany(mappedBy = "panierCommandeMoyenAcces",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MoyenAcces> moyensAccesASortirDuStock;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MoyenAccesCatalogueQuantite> moyensAccesCatalogueQuantiteACommander;
    private LocalDate dateCreationPanier;
    private LocalDate dateValidationPanier;
    private LocalDate dateAnnulationPanier;
    private String adresseLivraison;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demandeOrigine;

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
        if (!(object instanceof PanierCommandeMoyenAcces)) {
            return false;
        }
        PanierCommandeMoyenAcces other = (PanierCommandeMoyenAcces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PanierCommandeMoyenAcces[ id=" + id + " ]";
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
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the moyensAccesASortirDuStock
     */
    public List<MoyenAcces> getMoyensAccesASortirDuStock() {
        return moyensAccesASortirDuStock;
    }

    /**
     * @param moyensAccesASortirDuStock the moyensAccesASortirDuStock to set
     */
    public void setMoyensAccesASortirDuStock(List<MoyenAcces> moyensAccesASortirDuStock) {
        this.moyensAccesASortirDuStock = moyensAccesASortirDuStock;
    }

    /**
     * @return the moyensAccesCatalogueACommander
     */
    public List<MoyenAccesCatalogueQuantite> getMoyensAccesCatalogueQuantiteACommander() {
        return moyensAccesCatalogueQuantiteACommander;
    }

    /**
     * @param moyensAccesCatalogueQuantiteACommander the
     * moyensAccesCatalogueACommander to set
     */
    public void setMoyensAccesCatalogueQuantiteACommander(List<MoyenAccesCatalogueQuantite> moyensAccesCatalogueQuantiteACommander) {
        this.moyensAccesCatalogueQuantiteACommander = moyensAccesCatalogueQuantiteACommander;
    }

    /**
     * @return the dateCreationPanier
     */
    public LocalDate getDateCreationPanier() {
        return dateCreationPanier;
    }

    /**
     * @param dateCreationPanier the dateCreationPanier to set
     */
    public void setDateCreationPanier(LocalDate dateCreationPanier) {
        this.dateCreationPanier = dateCreationPanier;
    }

    /**
     * @return the dateValidationPanier
     */
    public LocalDate getDateValidationPanier() {
        return dateValidationPanier;
    }

    /**
     * @param dateValidationPanier the dateValidationPanier to set
     */
    public void setDateValidationPanier(LocalDate dateValidationPanier) {
        this.dateValidationPanier = dateValidationPanier;
    }

    /**
     * @return the dateAnnulationPanier
     */
    public LocalDate getDateAnnulationPanier() {
        return dateAnnulationPanier;
    }

    /**
     * @param dateAnnulationPanier the dateAnnulationPanier to set
     */
    public void setDateAnnulationPanier(LocalDate dateAnnulationPanier) {
        this.dateAnnulationPanier = dateAnnulationPanier;
    }

    /**
     * @return the adresseLivraison
     */
    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * @param adresseLivraison the adresseLivraison to set
     */
    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    /**
     * @return the bonsDeCommandePanierMoyenAcces
     */
    public List<BonDeCommandePanierMoyenAcces> getBonDeCommandePanierMoyenAcces() {
        return bonsDeCommandePanierMoyenAcces;
    }

    /**
     * @param bonsDeCommandePanierMoyenAcces the bonsDeCommandePanierMoyenAcces
     * to set
     */
    public void setBonDeCommandePanierMoyenAcces(List<BonDeCommandePanierMoyenAcces> bonsDeCommandePanierMoyenAcces) {
        this.bonsDeCommandePanierMoyenAcces = bonsDeCommandePanierMoyenAcces;
    }

    public Float getTotalFraisEvoi() {
        HashMap<Fournisseur, Float> map = new HashMap<>();
        Float totalFraisEnvoi = 0f;
        if (getMoyensAccesCatalogueQuantiteACommander() != null) {
            for (MoyenAccesCatalogueQuantite moyenAccesCatalogueQuantite : getMoyensAccesCatalogueQuantiteACommander()) {
                if (map.containsKey(moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFournisseur()) == false) {
                    map.put(moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFournisseur(), moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFraisEnvoi());
                } else {
                    if (map.get(moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFournisseur()) < moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFraisEnvoi()) {
                        map.put(moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFournisseur(), moyenAccesCatalogueQuantite.getMoyenAccesCatalogue().getFraisEnvoi());
                    }
                }
            }
        }
        for (Fournisseur fournisseur : map.keySet()) {
            if (map.get(fournisseur) != null) {
                totalFraisEnvoi += map.get(fournisseur);
            }
        }

        return totalFraisEnvoi;
    }

    /**
     * @return the demandeOrigine
     */
    public Demande getDemandeOrigine() {
        return demandeOrigine;
    }

    /**
     * @param demandeOrigine the demandeOrigine to set
     */
    public void setDemandeOrigine(Demande demandeOrigine) {
        this.demandeOrigine = demandeOrigine;
    }
}
