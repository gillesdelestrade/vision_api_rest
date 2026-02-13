package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ADFCoproDTO {
    
    private Long id;
    private LocalDate dateDepotFichierADF;
    private LocalDate dateDepotFichierAnnexe;
    private LocalDate dateFichierADFTraite;
    private Long coproprieteId;
    private Long campagneADFId;
    private Long sessionTraitementADFId;

    // Constructeur
    public ADFCoproDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDepotFichierADF() {
        return dateDepotFichierADF;
    }
    
    public void setDateDepotFichierADF(LocalDate dateDepotFichierADF) {
        this.dateDepotFichierADF = dateDepotFichierADF;
    }

    public LocalDate getDateDepotFichierAnnexe() {
        return dateDepotFichierAnnexe;
    }
    
    public void setDateDepotFichierAnnexe(LocalDate dateDepotFichierAnnexe) {
        this.dateDepotFichierAnnexe = dateDepotFichierAnnexe;
    }

    public LocalDate getDateFichierADFTraite() {
        return dateFichierADFTraite;
    }
    
    public void setDateFichierADFTraite(LocalDate dateFichierADFTraite) {
        this.dateFichierADFTraite = dateFichierADFTraite;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getCampagneADFId() {
        return campagneADFId;
    }
    
    public void setCampagneADFId(Long campagneADFId) {
        this.campagneADFId = campagneADFId;
    }

    public Long getSessionTraitementADFId() {
        return sessionTraitementADFId;
    }
    
    public void setSessionTraitementADFId(Long sessionTraitementADFId) {
        this.sessionTraitementADFId = sessionTraitementADFId;
    }
}
