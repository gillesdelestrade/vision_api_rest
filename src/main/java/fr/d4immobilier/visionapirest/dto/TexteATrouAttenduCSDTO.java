package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TexteATrouAttenduCSDTO {
    
    private Long id;
    private String texteATrou;
    private Long attenduCSId;

    // Constructeur
    public TexteATrouAttenduCSDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTexteATrou() {
        return texteATrou;
    }
    
    public void setTexteATrou(String texteATrou) {
        this.texteATrou = texteATrou;
    }

    public Long getAttenduCSId() {
        return attenduCSId;
    }
    
    public void setAttenduCSId(Long attenduCSId) {
        this.attenduCSId = attenduCSId;
    }
}
