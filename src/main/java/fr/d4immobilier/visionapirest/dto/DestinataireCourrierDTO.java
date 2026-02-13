package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DestinataireCourrierDTO {
    
    private Long id;
    private String adresseDestinataire;
    private String numeroRAR;
    private LocalDate dateReceptionAR;
    private String retourRecommandeAR; // Enum converti en String
    private Long publipostageId;
    private Long bordereau_CoproprietaireId;
    private Long coproprietaireId;

    // Constructeur
    public DestinataireCourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresseDestinataire() {
        return adresseDestinataire;
    }
    
    public void setAdresseDestinataire(String adresseDestinataire) {
        this.adresseDestinataire = adresseDestinataire;
    }

    public String getNumeroRAR() {
        return numeroRAR;
    }
    
    public void setNumeroRAR(String numeroRAR) {
        this.numeroRAR = numeroRAR;
    }

    public LocalDate getDateReceptionAR() {
        return dateReceptionAR;
    }
    
    public void setDateReceptionAR(LocalDate dateReceptionAR) {
        this.dateReceptionAR = dateReceptionAR;
    }

    public String getRetourRecommandeAR() {
        return retourRecommandeAR;
    }
    
    public void setRetourRecommandeAR(String retourRecommandeAR) {
        this.retourRecommandeAR = retourRecommandeAR;
    }

    public Long getPublipostageId() {
        return publipostageId;
    }
    
    public void setPublipostageId(Long publipostageId) {
        this.publipostageId = publipostageId;
    }

    public Long getBordereau_CoproprietaireId() {
        return bordereau_CoproprietaireId;
    }
    
    public void setBordereau_CoproprietaireId(Long bordereau_CoproprietaireId) {
        this.bordereau_CoproprietaireId = bordereau_CoproprietaireId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }
}
