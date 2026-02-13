package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EcheanceFinancementDTO {
    
    private Long id;
    private LocalDate dateEcheance;
    private Float valeurPourcentage;
    private Float valeurEuros;
    private String typeEcheance; // Enum converti en String
    private Long financementTravauxId;

    // Constructeur
    public EcheanceFinancementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateEcheance() {
        return dateEcheance;
    }
    
    public void setDateEcheance(LocalDate dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Float getValeurPourcentage() {
        return valeurPourcentage;
    }
    
    public void setValeurPourcentage(Float valeurPourcentage) {
        this.valeurPourcentage = valeurPourcentage;
    }

    public Float getValeurEuros() {
        return valeurEuros;
    }
    
    public void setValeurEuros(Float valeurEuros) {
        this.valeurEuros = valeurEuros;
    }

    public String getTypeEcheance() {
        return typeEcheance;
    }
    
    public void setTypeEcheance(String typeEcheance) {
        this.typeEcheance = typeEcheance;
    }

    public Long getFinancementTravauxId() {
        return financementTravauxId;
    }
    
    public void setFinancementTravauxId(Long financementTravauxId) {
        this.financementTravauxId = financementTravauxId;
    }
}
