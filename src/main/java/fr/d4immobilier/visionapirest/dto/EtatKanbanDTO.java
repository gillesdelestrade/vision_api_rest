package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EtatKanbanDTO {
    
    private Long id;
    private String libelle;
    private Integer numeroOrdre;
    private String dataField;
    private Integer dureeExpirationParDefaut;
    private String couleurEtatKanban; // Enum converti en String
    private Long kanbanId;
    private Long etatKanbanSuivantId;

    // Constructeur
    public EtatKanbanDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getNumeroOrdre() {
        return numeroOrdre;
    }
    
    public void setNumeroOrdre(Integer numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    public String getDataField() {
        return dataField;
    }
    
    public void setDataField(String dataField) {
        this.dataField = dataField;
    }

    public Integer getDureeExpirationParDefaut() {
        return dureeExpirationParDefaut;
    }
    
    public void setDureeExpirationParDefaut(Integer dureeExpirationParDefaut) {
        this.dureeExpirationParDefaut = dureeExpirationParDefaut;
    }

    public String getCouleurEtatKanban() {
        return couleurEtatKanban;
    }
    
    public void setCouleurEtatKanban(String couleurEtatKanban) {
        this.couleurEtatKanban = couleurEtatKanban;
    }

    public Long getKanbanId() {
        return kanbanId;
    }
    
    public void setKanbanId(Long kanbanId) {
        this.kanbanId = kanbanId;
    }

    public Long getEtatKanbanSuivantId() {
        return etatKanbanSuivantId;
    }
    
    public void setEtatKanbanSuivantId(Long etatKanbanSuivantId) {
        this.etatKanbanSuivantId = etatKanbanSuivantId;
    }
}
