package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EtapePlanifAGDTO {
    
    private Long id;
    private String dateCible; // Enum converti en String
    private String dateRealisation; // Enum converti en String
    private String dateDebut; // Enum converti en String
    private Integer pourcentageAvancement;
    private Integer dureeReelle;
    private Long assembleeId;
    private Long etapePlanifAGModeleId;
    private Long acteurId;

    // Constructeur
    public EtapePlanifAGDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCible() {
        return dateCible;
    }
    
    public void setDateCible(String dateCible) {
        this.dateCible = dateCible;
    }

    public String getDateRealisation() {
        return dateRealisation;
    }
    
    public void setDateRealisation(String dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    public String getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getPourcentageAvancement() {
        return pourcentageAvancement;
    }
    
    public void setPourcentageAvancement(Integer pourcentageAvancement) {
        this.pourcentageAvancement = pourcentageAvancement;
    }

    public Integer getDureeReelle() {
        return dureeReelle;
    }
    
    public void setDureeReelle(Integer dureeReelle) {
        this.dureeReelle = dureeReelle;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }

    public Long getEtapePlanifAGModeleId() {
        return etapePlanifAGModeleId;
    }
    
    public void setEtapePlanifAGModeleId(Long etapePlanifAGModeleId) {
        this.etapePlanifAGModeleId = etapePlanifAGModeleId;
    }

    public Long getActeurId() {
        return acteurId;
    }
    
    public void setActeurId(Long acteurId) {
        this.acteurId = acteurId;
    }
}
