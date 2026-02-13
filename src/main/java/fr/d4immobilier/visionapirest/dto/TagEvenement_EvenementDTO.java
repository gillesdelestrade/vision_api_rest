package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TagEvenement_EvenementDTO {
    
    private Long id;
    private Long evenement_id;
    private Long tag_id;
    private String created_at; // Enum converti en String

    // Constructeur
    public TagEvenement_EvenementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getEvenement_id() {
        return evenement_id;
    }
    
    public void setEvenement_id(Long evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Long getTag_id() {
        return tag_id;
    }
    
    public void setTag_id(Long tag_id) {
        this.tag_id = tag_id;
    }

    public String getCreated_at() {
        return created_at;
    }
    
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
