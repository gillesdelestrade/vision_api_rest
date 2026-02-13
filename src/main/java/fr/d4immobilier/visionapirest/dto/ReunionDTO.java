package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ReunionDTO {
    
    private Long id;
    private String dateReunion; // Enum converti en String
    private String objet;
    private String participants;
    private String diffusion;
    private LocalDate dateProchaineReunion;
    private String detailProchaineReunion;
    private Boolean brouillon;
    private Boolean reunionSansSyndic;
    private Boolean dateProvisoire;
    private Long coproprieteId;

    // Constructeur
    public ReunionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateReunion() {
        return dateReunion;
    }
    
    public void setDateReunion(String dateReunion) {
        this.dateReunion = dateReunion;
    }

    public String getObjet() {
        return objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getParticipants() {
        return participants;
    }
    
    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getDiffusion() {
        return diffusion;
    }
    
    public void setDiffusion(String diffusion) {
        this.diffusion = diffusion;
    }

    public LocalDate getDateProchaineReunion() {
        return dateProchaineReunion;
    }
    
    public void setDateProchaineReunion(LocalDate dateProchaineReunion) {
        this.dateProchaineReunion = dateProchaineReunion;
    }

    public String getDetailProchaineReunion() {
        return detailProchaineReunion;
    }
    
    public void setDetailProchaineReunion(String detailProchaineReunion) {
        this.detailProchaineReunion = detailProchaineReunion;
    }

    public Boolean getBrouillon() {
        return brouillon;
    }
    
    public void setBrouillon(Boolean brouillon) {
        this.brouillon = brouillon;
    }

    public Boolean getReunionSansSyndic() {
        return reunionSansSyndic;
    }
    
    public void setReunionSansSyndic(Boolean reunionSansSyndic) {
        this.reunionSansSyndic = reunionSansSyndic;
    }

    public Boolean getDateProvisoire() {
        return dateProvisoire;
    }
    
    public void setDateProvisoire(Boolean dateProvisoire) {
        this.dateProvisoire = dateProvisoire;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
