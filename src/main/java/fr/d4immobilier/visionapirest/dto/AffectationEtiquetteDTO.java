package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AffectationEtiquetteDTO {
    
    private Long id;
    private Long idObjet;
    private String classeObjet;
    private Long etiquetteId;

    // Constructeur
    public AffectationEtiquetteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdObjet() {
        return idObjet;
    }
    
    public void setIdObjet(Long idObjet) {
        this.idObjet = idObjet;
    }

    public String getClasseObjet() {
        return classeObjet;
    }
    
    public void setClasseObjet(String classeObjet) {
        this.classeObjet = classeObjet;
    }

    public Long getEtiquetteId() {
        return etiquetteId;
    }
    
    public void setEtiquetteId(Long etiquetteId) {
        this.etiquetteId = etiquetteId;
    }
}
