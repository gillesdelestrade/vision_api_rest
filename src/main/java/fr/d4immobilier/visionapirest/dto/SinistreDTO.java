package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SinistreDTO {
    
    private Long id;
    private String natureSinistre; // Enum converti en String
    private String lieu;
    private String typeLeseSinistre; // Enum converti en String
    private String typeOrigineSinistre; // Enum converti en String
    private String detailLeseSinistre;
    private String detailOrigineSinistre;
    private Long coproprieteId; // Enum converti en String
    private String referenceChezAssureur;
    private String referenceExpert;
    private String postIt;
    private String motifClotureSinistre; // Enum converti en String
    private String statutSinistre;
    private Long courrierDeclarationSinistreId;
    private Long assuranceId;
    private Long coproprietaireLeseId;
    private Long coproprietaireOrigineId;

    // Constructeur
    public SinistreDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNatureSinistre() {
        return natureSinistre;
    }
    
    public void setNatureSinistre(String natureSinistre) {
        this.natureSinistre = natureSinistre;
    }

    public String getLieu() {
        return lieu;
    }
    
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getTypeLeseSinistre() {
        return typeLeseSinistre;
    }
    
    public void setTypeLeseSinistre(String typeLeseSinistre) {
        this.typeLeseSinistre = typeLeseSinistre;
    }

    public String getTypeOrigineSinistre() {
        return typeOrigineSinistre;
    }
    
    public void setTypeOrigineSinistre(String typeOrigineSinistre) {
        this.typeOrigineSinistre = typeOrigineSinistre;
    }

    public String getDetailLeseSinistre() {
        return detailLeseSinistre;
    }
    
    public void setDetailLeseSinistre(String detailLeseSinistre) {
        this.detailLeseSinistre = detailLeseSinistre;
    }

    public String getDetailOrigineSinistre() {
        return detailOrigineSinistre;
    }
    
    public void setDetailOrigineSinistre(String detailOrigineSinistre) {
        this.detailOrigineSinistre = detailOrigineSinistre;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public String getReferenceChezAssureur() {
        return referenceChezAssureur;
    }
    
    public void setReferenceChezAssureur(String referenceChezAssureur) {
        this.referenceChezAssureur = referenceChezAssureur;
    }

    public String getReferenceExpert() {
        return referenceExpert;
    }
    
    public void setReferenceExpert(String referenceExpert) {
        this.referenceExpert = referenceExpert;
    }

    public String getPostIt() {
        return postIt;
    }
    
    public void setPostIt(String postIt) {
        this.postIt = postIt;
    }

    public String getMotifClotureSinistre() {
        return motifClotureSinistre;
    }
    
    public void setMotifClotureSinistre(String motifClotureSinistre) {
        this.motifClotureSinistre = motifClotureSinistre;
    }

    public String getStatutSinistre() {
        return statutSinistre;
    }
    
    public void setStatutSinistre(String statutSinistre) {
        this.statutSinistre = statutSinistre;
    }

    public Long getCourrierDeclarationSinistreId() {
        return courrierDeclarationSinistreId;
    }
    
    public void setCourrierDeclarationSinistreId(Long courrierDeclarationSinistreId) {
        this.courrierDeclarationSinistreId = courrierDeclarationSinistreId;
    }

    public Long getAssuranceId() {
        return assuranceId;
    }
    
    public void setAssuranceId(Long assuranceId) {
        this.assuranceId = assuranceId;
    }

    public Long getCoproprietaireLeseId() {
        return coproprietaireLeseId;
    }
    
    public void setCoproprietaireLeseId(Long coproprietaireLeseId) {
        this.coproprietaireLeseId = coproprietaireLeseId;
    }

    public Long getCoproprietaireOrigineId() {
        return coproprietaireOrigineId;
    }
    
    public void setCoproprietaireOrigineId(Long coproprietaireOrigineId) {
        this.coproprietaireOrigineId = coproprietaireOrigineId;
    }
}
