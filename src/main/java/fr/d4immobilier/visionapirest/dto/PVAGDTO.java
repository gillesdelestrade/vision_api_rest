package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PVAGDTO {
    
    private Long id;
    private String dateAG; // Enum converti en String
    private Long assembleeId;
    private Long fichierPVAGId;
    private Long coproprieteId;

    // Constructeur
    public PVAGDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateAG() {
        return dateAG;
    }
    
    public void setDateAG(String dateAG) {
        this.dateAG = dateAG;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }

    public Long getFichierPVAGId() {
        return fichierPVAGId;
    }
    
    public void setFichierPVAGId(Long fichierPVAGId) {
        this.fichierPVAGId = fichierPVAGId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
