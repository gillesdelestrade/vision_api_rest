package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MotCleMetierDTO {
    
    private Long id;
    private String importanceMotCle; // Enum converti en String
    private Long motPertinentId;
    private Long metierId;

    // Constructeur
    public MotCleMetierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getImportanceMotCle() {
        return importanceMotCle;
    }
    
    public void setImportanceMotCle(String importanceMotCle) {
        this.importanceMotCle = importanceMotCle;
    }

    public Long getMotPertinentId() {
        return motPertinentId;
    }
    
    public void setMotPertinentId(Long motPertinentId) {
        this.motPertinentId = motPertinentId;
    }

    public Long getMetierId() {
        return metierId;
    }
    
    public void setMetierId(Long metierId) {
        this.metierId = metierId;
    }
}
