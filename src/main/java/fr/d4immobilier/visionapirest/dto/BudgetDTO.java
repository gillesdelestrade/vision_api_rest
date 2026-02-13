package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BudgetDTO {
    
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Boolean enCours;
    private Double budgetFonctionnement;
    private Double budgetTravaux;
    private Long coproprieteId;

    // Constructeur
    public BudgetDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }
    
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Boolean getEnCours() {
        return enCours;
    }
    
    public void setEnCours(Boolean enCours) {
        this.enCours = enCours;
    }

    public Double getBudgetFonctionnement() {
        return budgetFonctionnement;
    }
    
    public void setBudgetFonctionnement(Double budgetFonctionnement) {
        this.budgetFonctionnement = budgetFonctionnement;
    }

    public Double getBudgetTravaux() {
        return budgetTravaux;
    }
    
    public void setBudgetTravaux(Double budgetTravaux) {
        this.budgetTravaux = budgetTravaux;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
