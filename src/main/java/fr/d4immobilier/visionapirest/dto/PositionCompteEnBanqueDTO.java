package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PositionCompteEnBanqueDTO {
    
    private Long id;
    private LocalDate datePosition;
    private Double position;
    private Long compteEnBanqueId;

    // Constructeur
    public PositionCompteEnBanqueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePosition() {
        return datePosition;
    }
    
    public void setDatePosition(LocalDate datePosition) {
        this.datePosition = datePosition;
    }

    public Double getPosition() {
        return position;
    }
    
    public void setPosition(Double position) {
        this.position = position;
    }

    public Long getCompteEnBanqueId() {
        return compteEnBanqueId;
    }
    
    public void setCompteEnBanqueId(Long compteEnBanqueId) {
        this.compteEnBanqueId = compteEnBanqueId;
    }
}
