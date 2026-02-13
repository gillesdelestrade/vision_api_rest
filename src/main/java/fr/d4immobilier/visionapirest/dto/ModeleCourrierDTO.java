package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ModeleCourrierDTO {
    
    private Long id;
    private String objet;
    private String corpsDeTexte;
    private String formuleDePolitesse;

    // Constructeur
    public ModeleCourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getObjet() {
        return objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCorpsDeTexte() {
        return corpsDeTexte;
    }
    
    public void setCorpsDeTexte(String corpsDeTexte) {
        this.corpsDeTexte = corpsDeTexte;
    }

    public String getFormuleDePolitesse() {
        return formuleDePolitesse;
    }
    
    public void setFormuleDePolitesse(String formuleDePolitesse) {
        this.formuleDePolitesse = formuleDePolitesse;
    }
}
