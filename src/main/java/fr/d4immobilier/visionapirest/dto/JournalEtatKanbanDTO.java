package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class JournalEtatKanbanDTO {
    
    private Long id;
    private String dateEntree; // Enum converti en String
    private String dateSortie; // Enum converti en String
    private Integer numeroEntreeJournal;
    private LocalDate dateExpiration;
    private Long demandeId;
    private Long etatKanbanId;

    // Constructeur
    public JournalEtatKanbanDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateEntree() {
        return dateEntree;
    }
    
    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getDateSortie() {
        return dateSortie;
    }
    
    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Integer getNumeroEntreeJournal() {
        return numeroEntreeJournal;
    }
    
    public void setNumeroEntreeJournal(Integer numeroEntreeJournal) {
        this.numeroEntreeJournal = numeroEntreeJournal;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }
    
    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Long getDemandeId() {
        return demandeId;
    }
    
    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public Long getEtatKanbanId() {
        return etatKanbanId;
    }
    
    public void setEtatKanbanId(Long etatKanbanId) {
        this.etatKanbanId = etatKanbanId;
    }
}
