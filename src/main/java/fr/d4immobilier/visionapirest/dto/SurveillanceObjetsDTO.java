package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SurveillanceObjetsDTO {
    
    private Long id;
    private Long idPersonne;
    private String dateDePriseEnCompte; // Enum converti en String
    private Long objetASurveillerId;

    // Constructeur
    public SurveillanceObjetsDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPersonne() {
        return idPersonne;
    }
    
    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getDateDePriseEnCompte() {
        return dateDePriseEnCompte;
    }
    
    public void setDateDePriseEnCompte(String dateDePriseEnCompte) {
        this.dateDePriseEnCompte = dateDePriseEnCompte;
    }

    public Long getObjetASurveillerId() {
        return objetASurveillerId;
    }
    
    public void setObjetASurveillerId(Long objetASurveillerId) {
        this.objetASurveillerId = objetASurveillerId;
    }
}
