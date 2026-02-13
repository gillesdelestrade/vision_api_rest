package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CourrierEntrantDTO {
    
    private Long id;
    private LocalDate dateReception;
    private LocalDate dateCourrier;
    private String provenanceCourrierEntrant; // Enum converti en String
    private Boolean affecte;
    private Boolean nePasClasser;
    private Boolean concerneSinistre;
    private Long coproprieteId;
    private Long typeDocumentCourrierEntrantId;
    private Long fichierCourrierEntrantId;
    private Long coproprietaireProvenanceId;
    private Long fournisseurProvenanceId;

    // Constructeur
    public CourrierEntrantDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateReception() {
        return dateReception;
    }
    
    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    public LocalDate getDateCourrier() {
        return dateCourrier;
    }
    
    public void setDateCourrier(LocalDate dateCourrier) {
        this.dateCourrier = dateCourrier;
    }

    public String getProvenanceCourrierEntrant() {
        return provenanceCourrierEntrant;
    }
    
    public void setProvenanceCourrierEntrant(String provenanceCourrierEntrant) {
        this.provenanceCourrierEntrant = provenanceCourrierEntrant;
    }

    public Boolean getAffecte() {
        return affecte;
    }
    
    public void setAffecte(Boolean affecte) {
        this.affecte = affecte;
    }

    public Boolean getNePasClasser() {
        return nePasClasser;
    }
    
    public void setNePasClasser(Boolean nePasClasser) {
        this.nePasClasser = nePasClasser;
    }

    public Boolean getConcerneSinistre() {
        return concerneSinistre;
    }
    
    public void setConcerneSinistre(Boolean concerneSinistre) {
        this.concerneSinistre = concerneSinistre;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getTypeDocumentCourrierEntrantId() {
        return typeDocumentCourrierEntrantId;
    }
    
    public void setTypeDocumentCourrierEntrantId(Long typeDocumentCourrierEntrantId) {
        this.typeDocumentCourrierEntrantId = typeDocumentCourrierEntrantId;
    }

    public Long getFichierCourrierEntrantId() {
        return fichierCourrierEntrantId;
    }
    
    public void setFichierCourrierEntrantId(Long fichierCourrierEntrantId) {
        this.fichierCourrierEntrantId = fichierCourrierEntrantId;
    }

    public Long getCoproprietaireProvenanceId() {
        return coproprietaireProvenanceId;
    }
    
    public void setCoproprietaireProvenanceId(Long coproprietaireProvenanceId) {
        this.coproprietaireProvenanceId = coproprietaireProvenanceId;
    }

    public Long getFournisseurProvenanceId() {
        return fournisseurProvenanceId;
    }
    
    public void setFournisseurProvenanceId(Long fournisseurProvenanceId) {
        this.fournisseurProvenanceId = fournisseurProvenanceId;
    }
}
