package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class HistoriqueModificationEtapePlanifAGDTO {
    
    private Long id;
    private String dateModification; // Enum converti en String
    private String ancienneDateCible; // Enum converti en String
    private String nouvelleDateCible; // Enum converti en String
    private String modeModification; // Enum converti en String
    private Long etapePlanifAGId;
    private Long ancienActeurId;
    private Long nouvelActeurId;

    // Constructeur
    public HistoriqueModificationEtapePlanifAGDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateModification() {
        return dateModification;
    }
    
    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public String getAncienneDateCible() {
        return ancienneDateCible;
    }
    
    public void setAncienneDateCible(String ancienneDateCible) {
        this.ancienneDateCible = ancienneDateCible;
    }

    public String getNouvelleDateCible() {
        return nouvelleDateCible;
    }
    
    public void setNouvelleDateCible(String nouvelleDateCible) {
        this.nouvelleDateCible = nouvelleDateCible;
    }

    public String getModeModification() {
        return modeModification;
    }
    
    public void setModeModification(String modeModification) {
        this.modeModification = modeModification;
    }

    public Long getEtapePlanifAGId() {
        return etapePlanifAGId;
    }
    
    public void setEtapePlanifAGId(Long etapePlanifAGId) {
        this.etapePlanifAGId = etapePlanifAGId;
    }

    public Long getAncienActeurId() {
        return ancienActeurId;
    }
    
    public void setAncienActeurId(Long ancienActeurId) {
        this.ancienActeurId = ancienActeurId;
    }

    public Long getNouvelActeurId() {
        return nouvelActeurId;
    }
    
    public void setNouvelActeurId(Long nouvelActeurId) {
        this.nouvelActeurId = nouvelActeurId;
    }
}
