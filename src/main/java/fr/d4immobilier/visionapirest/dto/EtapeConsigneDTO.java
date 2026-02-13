package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EtapeConsigneDTO {
    
    private Long id;
    private Integer numeroOrdre;
    private String texteEtape;
    private Long consigneId;
    private Long fichierEtapeId;

    // Constructeur
    public EtapeConsigneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroOrdre() {
        return numeroOrdre;
    }
    
    public void setNumeroOrdre(Integer numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    public String getTexteEtape() {
        return texteEtape;
    }
    
    public void setTexteEtape(String texteEtape) {
        this.texteEtape = texteEtape;
    }

    public Long getConsigneId() {
        return consigneId;
    }
    
    public void setConsigneId(Long consigneId) {
        this.consigneId = consigneId;
    }

    public Long getFichierEtapeId() {
        return fichierEtapeId;
    }
    
    public void setFichierEtapeId(Long fichierEtapeId) {
        this.fichierEtapeId = fichierEtapeId;
    }
}
