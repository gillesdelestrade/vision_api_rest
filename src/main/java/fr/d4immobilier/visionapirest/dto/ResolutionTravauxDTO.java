package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ResolutionTravauxDTO {
    
    private Long id;
    private Float enveloppeCSSyndic;
    private Long regroupementResolutionsId;
    private Long honorairesSurTravauxId;
    private Long demandeId;
    private Long resolutionEnveloppeId;

    // Constructeur
    public ResolutionTravauxDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Float getEnveloppeCSSyndic() {
        return enveloppeCSSyndic;
    }
    
    public void setEnveloppeCSSyndic(Float enveloppeCSSyndic) {
        this.enveloppeCSSyndic = enveloppeCSSyndic;
    }

    public Long getRegroupementResolutionsId() {
        return regroupementResolutionsId;
    }
    
    public void setRegroupementResolutionsId(Long regroupementResolutionsId) {
        this.regroupementResolutionsId = regroupementResolutionsId;
    }

    public Long getHonorairesSurTravauxId() {
        return honorairesSurTravauxId;
    }
    
    public void setHonorairesSurTravauxId(Long honorairesSurTravauxId) {
        this.honorairesSurTravauxId = honorairesSurTravauxId;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getResolutionEnveloppeId() {
        return resolutionEnveloppeId;
    }
    
    public void setResolutionEnveloppeId(Long resolutionEnveloppeId) {
        this.resolutionEnveloppeId = resolutionEnveloppeId;
    }
}
