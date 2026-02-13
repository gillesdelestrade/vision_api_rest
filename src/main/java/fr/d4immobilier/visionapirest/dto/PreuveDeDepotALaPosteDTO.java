package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PreuveDeDepotALaPosteDTO {
    
    private Long id;
    private LocalDate dateDepot;

    // Constructeur
    public PreuveDeDepotALaPosteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDepot() {
        return dateDepot;
    }
    
    public void setDateDepot(LocalDate dateDepot) {
        this.dateDepot = dateDepot;
    }
}
