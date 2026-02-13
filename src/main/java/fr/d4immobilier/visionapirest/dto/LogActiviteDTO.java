package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class LogActiviteDTO {
    
    private Long id;
    private String dateActivite; // Enum converti en String
    private String description;
    private Integer nbPages;
    private Integer nbDocuments;
    private Integer dureeAppelEnSecondes;
    private Long userId;
    private Long coproprieteId;

    // Constructeur
    public LogActiviteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateActivite() {
        return dateActivite;
    }
    
    public void setDateActivite(String dateActivite) {
        this.dateActivite = dateActivite;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbPages() {
        return nbPages;
    }
    
    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    public Integer getNbDocuments() {
        return nbDocuments;
    }
    
    public void setNbDocuments(Integer nbDocuments) {
        this.nbDocuments = nbDocuments;
    }

    public Integer getDureeAppelEnSecondes() {
        return dureeAppelEnSecondes;
    }
    
    public void setDureeAppelEnSecondes(Integer dureeAppelEnSecondes) {
        this.dureeAppelEnSecondes = dureeAppelEnSecondes;
    }

    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
