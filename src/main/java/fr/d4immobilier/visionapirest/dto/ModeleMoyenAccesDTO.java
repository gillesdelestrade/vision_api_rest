package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ModeleMoyenAccesDTO {
    
    private Long id;    private String marque;
    private String modele;
    private String description;
    private String typeMoyenAcces; // Enum converti en String
    private Long fichierModeleMoyenAccesId;

    // Constructeur
    public ModeleMoyenAccesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }    public String getMarque() {
        return marque;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }
    
    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeMoyenAcces() {
        return typeMoyenAcces;
    }
    
    public void setTypeMoyenAcces(String typeMoyenAcces) {
        this.typeMoyenAcces = typeMoyenAcces;
    }

    public Long getFichierModeleMoyenAccesId() {
        return fichierModeleMoyenAccesId;
    }
    
    public void setFichierModeleMoyenAccesId(Long fichierModeleMoyenAccesId) {
        this.fichierModeleMoyenAccesId = fichierModeleMoyenAccesId;
    }
}
