package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class HistoriqueNavigationDTO {
    
    private Long id;
    private String dateConnexion; // Enum converti en String
    private String adresseIP;
    private String pageDemandee;
    private Long personneConnecteeId;
    private Long societeConnecteeId;

    // Constructeur
    public HistoriqueNavigationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateConnexion() {
        return dateConnexion;
    }
    
    public void setDateConnexion(String dateConnexion) {
        this.dateConnexion = dateConnexion;
    }

    public String getAdresseIP() {
        return adresseIP;
    }
    
    public void setAdresseIP(String adresseIP) {
        this.adresseIP = adresseIP;
    }

    public String getPageDemandee() {
        return pageDemandee;
    }
    
    public void setPageDemandee(String pageDemandee) {
        this.pageDemandee = pageDemandee;
    }

    public Long getPersonneConnecteeId() {
        return personneConnecteeId;
    }
    
    public void setPersonneConnecteeId(Long personneConnecteeId) {
        this.personneConnecteeId = personneConnecteeId;
    }

    public Long getSocieteConnecteeId() {
        return societeConnecteeId;
    }
    
    public void setSocieteConnecteeId(Long societeConnecteeId) {
        this.societeConnecteeId = societeConnecteeId;
    }
}
