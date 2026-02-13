package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CoproprietaireDTO {
    
    private Long id;
    private String codeBarrePresent;
    private String codeBarrePouvoir;
    private Long coproprietePourPhaseImportId;
    private Long mandataireId;

    // Constructeur
    public CoproprietaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeBarrePresent() {
        return codeBarrePresent;
    }
    
    public void setCodeBarrePresent(String codeBarrePresent) {
        this.codeBarrePresent = codeBarrePresent;
    }

    public String getCodeBarrePouvoir() {
        return codeBarrePouvoir;
    }
    
    public void setCodeBarrePouvoir(String codeBarrePouvoir) {
        this.codeBarrePouvoir = codeBarrePouvoir;
    }

    public Long getCoproprietePourPhaseImportId() {
        return coproprietePourPhaseImportId;
    }
    
    public void setCoproprietePourPhaseImportId(Long coproprietePourPhaseImportId) {
        this.coproprietePourPhaseImportId = coproprietePourPhaseImportId;
    }

    public Long getMandataireId() {
        return mandataireId;
    }
    
    public void setMandataireId(Long mandataireId) {
        this.mandataireId = mandataireId;
    }
}
