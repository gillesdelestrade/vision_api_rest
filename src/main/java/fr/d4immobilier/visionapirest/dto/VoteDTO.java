package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class VoteDTO {
    
    private Long id;
    private String choixVote; // Enum converti en String
    private Long resolutionId;
    private Long affectationId;

    // Constructeur
    public VoteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getChoixVote() {
        return choixVote;
    }
    
    public void setChoixVote(String choixVote) {
        this.choixVote = choixVote;
    }

    public Long getResolutionId() {
        return resolutionId;
    }
    
    public void setResolutionId(Long resolutionId) {
        this.resolutionId = resolutionId;
    }

    public Long getAffectationId() {
        return affectationId;
    }
    
    public void setAffectationId(Long affectationId) {
        this.affectationId = affectationId;
    }
}
