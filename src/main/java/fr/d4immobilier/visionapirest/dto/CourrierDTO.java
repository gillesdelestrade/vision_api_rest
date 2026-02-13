package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CourrierDTO {
    
    private Long id;
    private String formuleDePolitesse;
    private String adresseSaisie;
    private String reference;
    private Boolean recommandeAR;
    private String texteRecommandeAR;
    private String vosReferences;
    private String aLAttentionDe;
    private String autre;
    private Integer nombreDePiecesJointes;
    private Long rappelCourrierId;
    private Long aRappelerCourrierId;
    private Long publipostageId;
    private Long coproprieteId;
    private Long modeleCourrierId;
    private Long preuveDeDepotALaPosteId;
    private Long regroupementLignesFacturationId;
    private Long bordereauId;
    private Long fichierId;

    // Constructeur
    public CourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getFormuleDePolitesse() {
        return formuleDePolitesse;
    }
    
    public void setFormuleDePolitesse(String formuleDePolitesse) {
        this.formuleDePolitesse = formuleDePolitesse;
    }

    public String getAdresseSaisie() {
        return adresseSaisie;
    }
    
    public void setAdresseSaisie(String adresseSaisie) {
        this.adresseSaisie = adresseSaisie;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Boolean getRecommandeAR() {
        return recommandeAR;
    }
    
    public void setRecommandeAR(Boolean recommandeAR) {
        this.recommandeAR = recommandeAR;
    }

    public String getTexteRecommandeAR() {
        return texteRecommandeAR;
    }
    
    public void setTexteRecommandeAR(String texteRecommandeAR) {
        this.texteRecommandeAR = texteRecommandeAR;
    }

    public String getVosReferences() {
        return vosReferences;
    }
    
    public void setVosReferences(String vosReferences) {
        this.vosReferences = vosReferences;
    }

    public String getALAttentionDe() {
        return aLAttentionDe;
    }
    
    public void setALAttentionDe(String aLAttentionDe) {
        this.aLAttentionDe = aLAttentionDe;
    }

    public String getAutre() {
        return autre;
    }
    
    public void setAutre(String autre) {
        this.autre = autre;
    }

    public Integer getNombreDePiecesJointes() {
        return nombreDePiecesJointes;
    }
    
    public void setNombreDePiecesJointes(Integer nombreDePiecesJointes) {
        this.nombreDePiecesJointes = nombreDePiecesJointes;
    }

    public Long getRappelCourrierId() {
        return rappelCourrierId;
    }
    
    public void setRappelCourrierId(Long rappelCourrierId) {
        this.rappelCourrierId = rappelCourrierId;
    }

    public Long getARappelerCourrierId() {
        return aRappelerCourrierId;
    }
    
    public void setARappelerCourrierId(Long aRappelerCourrierId) {
        this.aRappelerCourrierId = aRappelerCourrierId;
    }

    public Long getPublipostageId() {
        return publipostageId;
    }
    
    public void setPublipostageId(Long publipostageId) {
        this.publipostageId = publipostageId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getModeleCourrierId() {
        return modeleCourrierId;
    }
    
    public void setModeleCourrierId(Long modeleCourrierId) {
        this.modeleCourrierId = modeleCourrierId;
    }

    public Long getPreuveDeDepotALaPosteId() {
        return preuveDeDepotALaPosteId;
    }
    
    public void setPreuveDeDepotALaPosteId(Long preuveDeDepotALaPosteId) {
        this.preuveDeDepotALaPosteId = preuveDeDepotALaPosteId;
    }

    public Long getRegroupementLignesFacturationId() {
        return regroupementLignesFacturationId;
    }
    
    public void setRegroupementLignesFacturationId(Long regroupementLignesFacturationId) {
        this.regroupementLignesFacturationId = regroupementLignesFacturationId;
    }

    public Long getBordereauId() {
        return bordereauId;
    }
    
    public void setBordereauId(Long bordereauId) {
        this.bordereauId = bordereauId;
    }

    public Long getFichierId() {
        return fichierId;
    }
    
    public void setFichierId(Long fichierId) {
        this.fichierId = fichierId;
    }
}
