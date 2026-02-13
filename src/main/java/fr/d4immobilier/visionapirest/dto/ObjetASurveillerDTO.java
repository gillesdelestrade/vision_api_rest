package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ObjetASurveillerDTO {
    
    private Long id;
    private Long idObjetASurveiller;
    private String classeObjet;
    private String dateDerniereMiseAJour; // Enum converti en String
    private Long idCopropriete;
    private Long idPersonneModifiant;
    private Long idAuteur;
    private Boolean visibleParTous;

    // Constructeur
    public ObjetASurveillerDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdObjetASurveiller() {
        return idObjetASurveiller;
    }
    
    public void setIdObjetASurveiller(Long idObjetASurveiller) {
        this.idObjetASurveiller = idObjetASurveiller;
    }

    public String getClasseObjet() {
        return classeObjet;
    }
    
    public void setClasseObjet(String classeObjet) {
        this.classeObjet = classeObjet;
    }

    public String getDateDerniereMiseAJour() {
        return dateDerniereMiseAJour;
    }
    
    public void setDateDerniereMiseAJour(String dateDerniereMiseAJour) {
        this.dateDerniereMiseAJour = dateDerniereMiseAJour;
    }

    public Long getIdCopropriete() {
        return idCopropriete;
    }
    
    public void setIdCopropriete(Long idCopropriete) {
        this.idCopropriete = idCopropriete;
    }

    public Long getIdPersonneModifiant() {
        return idPersonneModifiant;
    }
    
    public void setIdPersonneModifiant(Long idPersonneModifiant) {
        this.idPersonneModifiant = idPersonneModifiant;
    }

    public Long getIdAuteur() {
        return idAuteur;
    }
    
    public void setIdAuteur(Long idAuteur) {
        this.idAuteur = idAuteur;
    }

    public Boolean getVisibleParTous() {
        return visibleParTous;
    }
    
    public void setVisibleParTous(Boolean visibleParTous) {
        this.visibleParTous = visibleParTous;
    }
}
