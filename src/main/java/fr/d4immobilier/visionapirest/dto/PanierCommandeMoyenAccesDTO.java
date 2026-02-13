package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PanierCommandeMoyenAccesDTO {
    
    private Long id;
    private LocalDate dateCreationPanier;
    private LocalDate dateValidationPanier;
    private LocalDate dateAnnulationPanier;
    private String adresseLivraison;
    private Long coproprieteId;
    private Long coproprietaireId;
    private Long demandeOrigineId;

    // Constructeur
    public PanierCommandeMoyenAccesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateCreationPanier() {
        return dateCreationPanier;
    }
    
    public void setDateCreationPanier(LocalDate dateCreationPanier) {
        this.dateCreationPanier = dateCreationPanier;
    }

    public LocalDate getDateValidationPanier() {
        return dateValidationPanier;
    }
    
    public void setDateValidationPanier(LocalDate dateValidationPanier) {
        this.dateValidationPanier = dateValidationPanier;
    }

    public LocalDate getDateAnnulationPanier() {
        return dateAnnulationPanier;
    }
    
    public void setDateAnnulationPanier(LocalDate dateAnnulationPanier) {
        this.dateAnnulationPanier = dateAnnulationPanier;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }
    
    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getDemandeOrigineId() {
        return demandeOrigineId;
    }
    
    public void setDemandeOrigineId(Long demandeOrigineId) {
        this.demandeOrigineId = demandeOrigineId;
    }
}
