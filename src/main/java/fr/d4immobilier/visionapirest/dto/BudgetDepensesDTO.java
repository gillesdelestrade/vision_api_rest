package fr.d4immobilier.visionapirest.dto;

import java.math.BigDecimal;

public class BudgetDepensesDTO {
    
    private String mois;
    private Double budgetFonctionnement;
    private Double budgetTravaux;
    private Double depenses;
    private boolean estPasse;
    
    public BudgetDepensesDTO() {}
    
    // Getters et Setters
    
    public String getMois() {
        return mois;
    }
    
    public void setMois(String mois) {
        this.mois = mois;
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
    
    public Double getDepenses() {
        return depenses;
    }
    
    public void setDepenses(Double depenses) {
        this.depenses = depenses;
    }
    
    public boolean isEstPasse() {
        return estPasse;
    }
    
    public void setEstPasse(boolean estPasse) {
        this.estPasse = estPasse;
    }
}