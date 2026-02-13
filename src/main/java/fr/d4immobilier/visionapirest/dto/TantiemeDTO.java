package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TantiemeDTO {
    
    private Long id;
    private Float quotePart;
    private Long lotId;
    private Long typeTantiemeId;
    private Long batimentId;

    // Constructeur
    public TantiemeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Float getQuotePart() {
        return quotePart;
    }
    
    public void setQuotePart(Float quotePart) {
        this.quotePart = quotePart;
    }

    public Long getLotId() {
        return lotId;
    }
    
    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public Long getTypeTantiemeId() {
        return typeTantiemeId;
    }
    
    public void setTypeTantiemeId(Long typeTantiemeId) {
        this.typeTantiemeId = typeTantiemeId;
    }

    public Long getBatimentId() {
        return batimentId;
    }
    
    public void setBatimentId(Long batimentId) {
        this.batimentId = batimentId;
    }
}
