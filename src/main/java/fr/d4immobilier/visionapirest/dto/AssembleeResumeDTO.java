package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.util.List;

public class AssembleeResumeDTO {
    
    private Long id;
    private LocalDate dateAssemblee;
    private Boolean dateProvisoire;
    private String type;
    private List<String> batiments;
    private String cleRepartition;
    private String procesVerbalUrl;
    private String procesVerbalMiniatureUrl;
    
    public AssembleeResumeDTO() {}
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDate getDateAssemblee() {
        return dateAssemblee;
    }
    
    public void setDateAssemblee(LocalDate dateAssemblee) {
        this.dateAssemblee = dateAssemblee;
    }
    
    public Boolean getDateProvisoire() {
        return dateProvisoire;
    }
    
    public void setDateProvisoire(Boolean dateProvisoire) {
        this.dateProvisoire = dateProvisoire;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public List<String> getBatiments() {
        return batiments;
    }
    
    public void setBatiments(List<String> batiments) {
        this.batiments = batiments;
    }
    
    public String getCleRepartition() {
        return cleRepartition;
    }
    
    public void setCleRepartition(String cleRepartition) {
        this.cleRepartition = cleRepartition;
    }
    
    public String getProcesVerbalUrl() {
        return procesVerbalUrl;
    }
    
    public void setProcesVerbalUrl(String procesVerbalUrl) {
        this.procesVerbalUrl = procesVerbalUrl;
    }
    
    public String getProcesVerbalMiniatureUrl() {
        return procesVerbalMiniatureUrl;
    }
    
    public void setProcesVerbalMiniatureUrl(String procesVerbalMiniatureUrl) {
        this.procesVerbalMiniatureUrl = procesVerbalMiniatureUrl;
    }
}