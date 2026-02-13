package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ProcedureDTO {
    
    private Long id;
    private String typeProcedure; // Enum converti en String
    private Long complementProcedureId;

    // Constructeur
    public ProcedureDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeProcedure() {
        return typeProcedure;
    }
    
    public void setTypeProcedure(String typeProcedure) {
        this.typeProcedure = typeProcedure;
    }

    public Long getComplementProcedureId() {
        return complementProcedureId;
    }
    
    public void setComplementProcedureId(Long complementProcedureId) {
        this.complementProcedureId = complementProcedureId;
    }
}
