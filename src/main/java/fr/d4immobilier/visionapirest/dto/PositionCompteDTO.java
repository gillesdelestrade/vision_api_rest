package fr.d4immobilier.visionapirest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class PositionCompteDTO {
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    
    private Double solde;
    
    public PositionCompteDTO() {}
    
    // Getters et Setters
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public Double getSolde() {
        return solde;
    }
    
    public void setSolde(Double solde) {
        this.solde = solde;
    }
}