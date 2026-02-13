package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ResolutionDTO {
    
    private Long id;
    private String intitule;
    private Integer numero;
    private String detail;
    private String majoriteRequise; // Enum converti en String
    private Integer numeroNiveau2;
    private Integer numeroNiveau3;
    private String detailModifie;
    private String phraseConclusion;
    private Long regroupementResolutionsId;
    private Long typeTantiemeId;
    private Long assembleeId;

    // Constructeur
    public ResolutionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }
    
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMajoriteRequise() {
        return majoriteRequise;
    }
    
    public void setMajoriteRequise(String majoriteRequise) {
        this.majoriteRequise = majoriteRequise;
    }

    public Integer getNumeroNiveau2() {
        return numeroNiveau2;
    }
    
    public void setNumeroNiveau2(Integer numeroNiveau2) {
        this.numeroNiveau2 = numeroNiveau2;
    }

    public Integer getNumeroNiveau3() {
        return numeroNiveau3;
    }
    
    public void setNumeroNiveau3(Integer numeroNiveau3) {
        this.numeroNiveau3 = numeroNiveau3;
    }

    public String getDetailModifie() {
        return detailModifie;
    }
    
    public void setDetailModifie(String detailModifie) {
        this.detailModifie = detailModifie;
    }

    public String getPhraseConclusion() {
        return phraseConclusion;
    }
    
    public void setPhraseConclusion(String phraseConclusion) {
        this.phraseConclusion = phraseConclusion;
    }

    public Long getRegroupementResolutionsId() {
        return regroupementResolutionsId;
    }
    
    public void setRegroupementResolutionsId(Long regroupementResolutionsId) {
        this.regroupementResolutionsId = regroupementResolutionsId;
    }

    public Long getTypeTantiemeId() {
        return typeTantiemeId;
    }
    
    public void setTypeTantiemeId(Long typeTantiemeId) {
        this.typeTantiemeId = typeTantiemeId;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }
}
