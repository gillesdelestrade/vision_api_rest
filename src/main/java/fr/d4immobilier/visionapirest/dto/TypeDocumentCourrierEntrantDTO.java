package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TypeDocumentCourrierEntrantDTO {
    
    private Long id;
    private String typeDocument;
    private String abrege;

    // Constructeur
    public TypeDocumentCourrierEntrantDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeDocument() {
        return typeDocument;
    }
    
    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getAbrege() {
        return abrege;
    }
    
    public void setAbrege(String abrege) {
        this.abrege = abrege;
    }
}
