package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PouvoirAGDTO {
    
    private Long id;
    private Long coproprietaireReceveurId;
    private Long coproprietaireDonneurId;
    private Long assembleeId;

    // Constructeur
    public PouvoirAGDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoproprietaireReceveurId() {
        return coproprietaireReceveurId;
    }
    
    public void setCoproprietaireReceveurId(Long coproprietaireReceveurId) {
        this.coproprietaireReceveurId = coproprietaireReceveurId;
    }

    public Long getCoproprietaireDonneurId() {
        return coproprietaireDonneurId;
    }
    
    public void setCoproprietaireDonneurId(Long coproprietaireDonneurId) {
        this.coproprietaireDonneurId = coproprietaireDonneurId;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }
}
