package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AssembleeDTO {
    
    private Long id;
    private String dateAssemblee; // Enum converti en String
    private String lieu;
    private String dateFinAssemblee; // Enum converti en String
    private Boolean extraordinaire;
    private Boolean dateAGProvisoire;
    private Boolean formulairesExclusivement;
    private Boolean corbeille;
    private Long coproprieteId;
    private Long pvagId;
    private Long typeTantiemeId;
    private Long fichierMaquetteId;
    private Long fichierTrameRARConvocId;
    private Long bordereauConvocId;
    private Long bordereauDiffusionId;
    private Long fichierRARCSVConvocId;
    private Long fichierRARCSVDiffusionId;
    private Long fichierTrameRARDiffusionId;
    private Long fichierTableExterneConvocationId;
    private Long fichierTableExterneDiffusionId;
    private Long fichierFicheTravauxId;

    // Constructeur
    public AssembleeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateAssemblee() {
        return dateAssemblee;
    }
    
    public void setDateAssemblee(String dateAssemblee) {
        this.dateAssemblee = dateAssemblee;
    }

    public String getLieu() {
        return lieu;
    }
    
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDateFinAssemblee() {
        return dateFinAssemblee;
    }
    
    public void setDateFinAssemblee(String dateFinAssemblee) {
        this.dateFinAssemblee = dateFinAssemblee;
    }

    public Boolean getExtraordinaire() {
        return extraordinaire;
    }
    
    public void setExtraordinaire(Boolean extraordinaire) {
        this.extraordinaire = extraordinaire;
    }

    public Boolean getDateAGProvisoire() {
        return dateAGProvisoire;
    }
    
    public void setDateAGProvisoire(Boolean dateAGProvisoire) {
        this.dateAGProvisoire = dateAGProvisoire;
    }

    public Boolean getFormulairesExclusivement() {
        return formulairesExclusivement;
    }
    
    public void setFormulairesExclusivement(Boolean formulairesExclusivement) {
        this.formulairesExclusivement = formulairesExclusivement;
    }

    public Boolean getCorbeille() {
        return corbeille;
    }
    
    public void setCorbeille(Boolean corbeille) {
        this.corbeille = corbeille;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getPvagId() {
        return pvagId;
    }
    
    public void setPvagId(Long pvagId) {
        this.pvagId = pvagId;
    }

    public Long getTypeTantiemeId() {
        return typeTantiemeId;
    }
    
    public void setTypeTantiemeId(Long typeTantiemeId) {
        this.typeTantiemeId = typeTantiemeId;
    }

    public Long getFichierMaquetteId() {
        return fichierMaquetteId;
    }
    
    public void setFichierMaquetteId(Long fichierMaquetteId) {
        this.fichierMaquetteId = fichierMaquetteId;
    }

    public Long getFichierTrameRARConvocId() {
        return fichierTrameRARConvocId;
    }
    
    public void setFichierTrameRARConvocId(Long fichierTrameRARConvocId) {
        this.fichierTrameRARConvocId = fichierTrameRARConvocId;
    }

    public Long getBordereauConvocId() {
        return bordereauConvocId;
    }
    
    public void setBordereauConvocId(Long bordereauConvocId) {
        this.bordereauConvocId = bordereauConvocId;
    }

    public Long getBordereauDiffusionId() {
        return bordereauDiffusionId;
    }
    
    public void setBordereauDiffusionId(Long bordereauDiffusionId) {
        this.bordereauDiffusionId = bordereauDiffusionId;
    }

    public Long getFichierRARCSVConvocId() {
        return fichierRARCSVConvocId;
    }
    
    public void setFichierRARCSVConvocId(Long fichierRARCSVConvocId) {
        this.fichierRARCSVConvocId = fichierRARCSVConvocId;
    }

    public Long getFichierRARCSVDiffusionId() {
        return fichierRARCSVDiffusionId;
    }
    
    public void setFichierRARCSVDiffusionId(Long fichierRARCSVDiffusionId) {
        this.fichierRARCSVDiffusionId = fichierRARCSVDiffusionId;
    }

    public Long getFichierTrameRARDiffusionId() {
        return fichierTrameRARDiffusionId;
    }
    
    public void setFichierTrameRARDiffusionId(Long fichierTrameRARDiffusionId) {
        this.fichierTrameRARDiffusionId = fichierTrameRARDiffusionId;
    }

    public Long getFichierTableExterneConvocationId() {
        return fichierTableExterneConvocationId;
    }
    
    public void setFichierTableExterneConvocationId(Long fichierTableExterneConvocationId) {
        this.fichierTableExterneConvocationId = fichierTableExterneConvocationId;
    }

    public Long getFichierTableExterneDiffusionId() {
        return fichierTableExterneDiffusionId;
    }
    
    public void setFichierTableExterneDiffusionId(Long fichierTableExterneDiffusionId) {
        this.fichierTableExterneDiffusionId = fichierTableExterneDiffusionId;
    }

    public Long getFichierFicheTravauxId() {
        return fichierFicheTravauxId;
    }
    
    public void setFichierFicheTravauxId(Long fichierFicheTravauxId) {
        this.fichierFicheTravauxId = fichierFicheTravauxId;
    }
}
