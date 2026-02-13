package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CompteEnBanqueDTO {
    
    private Long id;
    private String typeCompteEnBanque; // Enum converti en String
    private String intituleCompte;
    private String bic;
    private Long banqueId;
    private Long ribId;
    private Long ibanId;

    // Constructeur
    public CompteEnBanqueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeCompteEnBanque() {
        return typeCompteEnBanque;
    }
    
    public void setTypeCompteEnBanque(String typeCompteEnBanque) {
        this.typeCompteEnBanque = typeCompteEnBanque;
    }

    public String getIntituleCompte() {
        return intituleCompte;
    }
    
    public void setIntituleCompte(String intituleCompte) {
        this.intituleCompte = intituleCompte;
    }

    public String getBic() {
        return bic;
    }
    
    public void setBic(String bic) {
        this.bic = bic;
    }

    public Long getBanqueId() {
        return banqueId;
    }
    
    public void setBanqueId(Long banqueId) {
        this.banqueId = banqueId;
    }

    public Long getRibId() {
        return ribId;
    }
    
    public void setRibId(Long ribId) {
        this.ribId = ribId;
    }

    public Long getIbanId() {
        return ibanId;
    }
    
    public void setIbanId(Long ibanId) {
        this.ibanId = ibanId;
    }
}
