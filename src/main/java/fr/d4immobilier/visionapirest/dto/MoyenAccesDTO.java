package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MoyenAccesDTO {
    
    private Long id;
    private String numero;
    private String dateCommande; // Enum converti en String
    private String dateEntreeDansLeStock; // Enum converti en String
    private String dateSortieDuSotck; // Enum converti en String
    private String dateDeclarationPerte; // Enum converti en String
    private String dateDesactivation; // Enum converti en String
    private String observations;
    private Boolean aLaCorbeille;
    private Long panierCommandeMoyenAccesId;
    private Long moyenAccesCatalogueId;
    private Long lotRattacheId;
    private Long emplacementStockId;

    // Constructeur
    public MoyenAccesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateCommande() {
        return dateCommande;
    }
    
    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDateEntreeDansLeStock() {
        return dateEntreeDansLeStock;
    }
    
    public void setDateEntreeDansLeStock(String dateEntreeDansLeStock) {
        this.dateEntreeDansLeStock = dateEntreeDansLeStock;
    }

    public String getDateSortieDuSotck() {
        return dateSortieDuSotck;
    }
    
    public void setDateSortieDuSotck(String dateSortieDuSotck) {
        this.dateSortieDuSotck = dateSortieDuSotck;
    }

    public String getDateDeclarationPerte() {
        return dateDeclarationPerte;
    }
    
    public void setDateDeclarationPerte(String dateDeclarationPerte) {
        this.dateDeclarationPerte = dateDeclarationPerte;
    }

    public String getDateDesactivation() {
        return dateDesactivation;
    }
    
    public void setDateDesactivation(String dateDesactivation) {
        this.dateDesactivation = dateDesactivation;
    }

    public String getObservations() {
        return observations;
    }
    
    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Boolean getALaCorbeille() {
        return aLaCorbeille;
    }
    
    public void setALaCorbeille(Boolean aLaCorbeille) {
        this.aLaCorbeille = aLaCorbeille;
    }

    public Long getPanierCommandeMoyenAccesId() {
        return panierCommandeMoyenAccesId;
    }
    
    public void setPanierCommandeMoyenAccesId(Long panierCommandeMoyenAccesId) {
        this.panierCommandeMoyenAccesId = panierCommandeMoyenAccesId;
    }

    public Long getMoyenAccesCatalogueId() {
        return moyenAccesCatalogueId;
    }
    
    public void setMoyenAccesCatalogueId(Long moyenAccesCatalogueId) {
        this.moyenAccesCatalogueId = moyenAccesCatalogueId;
    }

    public Long getLotRattacheId() {
        return lotRattacheId;
    }
    
    public void setLotRattacheId(Long lotRattacheId) {
        this.lotRattacheId = lotRattacheId;
    }

    public Long getEmplacementStockId() {
        return emplacementStockId;
    }
    
    public void setEmplacementStockId(Long emplacementStockId) {
        this.emplacementStockId = emplacementStockId;
    }
}
