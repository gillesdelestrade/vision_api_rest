package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierDemandeDTO {
    
    private Long id;
    private Boolean aLaCorbeille;
    private Long idDI;
    private Long idDDF;
    private Long reunionV2Id;
    private Long demandeId;
    private Long etapeDemandeId;
    private Long natureFichierSinistreId;

    // Constructeur
    public FichierDemandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getALaCorbeille() {
        return aLaCorbeille;
    }
    
    public void setALaCorbeille(Boolean aLaCorbeille) {
        this.aLaCorbeille = aLaCorbeille;
    }

    public Long getIdDI() {
        return idDI;
    }
    
    public void setIdDI(Long idDI) {
        this.idDI = idDI;
    }

    public Long getIdDDF() {
        return idDDF;
    }
    
    public void setIdDDF(Long idDDF) {
        this.idDDF = idDDF;
    }

    public Long getReunionV2Id() {
        return reunionV2Id;
    }
    
    public void setReunionV2Id(Long reunionV2Id) {
        this.reunionV2Id = reunionV2Id;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getEtapeDemandeId() {
        return etapeDemandeId;
    }
    
    public void setEtapeDemandeId(Long etapeDemandeId) {
        this.etapeDemandeId = etapeDemandeId;
    }

    public Long getNatureFichierSinistreId() {
        return natureFichierSinistreId;
    }
    
    public void setNatureFichierSinistreId(Long natureFichierSinistreId) {
        this.natureFichierSinistreId = natureFichierSinistreId;
    }
}
