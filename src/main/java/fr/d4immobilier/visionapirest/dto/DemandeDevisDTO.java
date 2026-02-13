package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeDevisDTO {
    
    private Long id;
    private LocalDate dateDemandeDevis;
    private String objet;
    private String reference;
    private String lieuIntervention;
    private LocalDate dateCloture;
    private String motifClotureDemandeDevis; // Enum converti en String
    private Long demandeId;
    private Long interventionDemandeId;

    // Constructeur
    public DemandeDevisDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDemandeDevis() {
        return dateDemandeDevis;
    }
    
    public void setDateDemandeDevis(LocalDate dateDemandeDevis) {
        this.dateDemandeDevis = dateDemandeDevis;
    }

    public String getObjet() {
        return objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLieuIntervention() {
        return lieuIntervention;
    }
    
    public void setLieuIntervention(String lieuIntervention) {
        this.lieuIntervention = lieuIntervention;
    }

    public LocalDate getDateCloture() {
        return dateCloture;
    }
    
    public void setDateCloture(LocalDate dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getMotifClotureDemandeDevis() {
        return motifClotureDemandeDevis;
    }
    
    public void setMotifClotureDemandeDevis(String motifClotureDemandeDevis) {
        this.motifClotureDemandeDevis = motifClotureDemandeDevis;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getInterventionDemandeId() {
        return interventionDemandeId;
    }
    
    public void setInterventionDemandeId(Long interventionDemandeId) {
        this.interventionDemandeId = interventionDemandeId;
    }
}
