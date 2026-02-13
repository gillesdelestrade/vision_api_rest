package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class IbanDTO {
    
    private Long id;
    private String bloc1;
    private String bloc2;
    private String bloc3;
    private String bloc4;
    private String bloc5;
    private String bloc6;
    private String bloc7;
    private Long compteEnBanqueId;

    // Constructeur
    public IbanDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getBloc1() {
        return bloc1;
    }
    
    public void setBloc1(String bloc1) {
        this.bloc1 = bloc1;
    }

    public String getBloc2() {
        return bloc2;
    }
    
    public void setBloc2(String bloc2) {
        this.bloc2 = bloc2;
    }

    public String getBloc3() {
        return bloc3;
    }
    
    public void setBloc3(String bloc3) {
        this.bloc3 = bloc3;
    }

    public String getBloc4() {
        return bloc4;
    }
    
    public void setBloc4(String bloc4) {
        this.bloc4 = bloc4;
    }

    public String getBloc5() {
        return bloc5;
    }
    
    public void setBloc5(String bloc5) {
        this.bloc5 = bloc5;
    }

    public String getBloc6() {
        return bloc6;
    }
    
    public void setBloc6(String bloc6) {
        this.bloc6 = bloc6;
    }

    public String getBloc7() {
        return bloc7;
    }
    
    public void setBloc7(String bloc7) {
        this.bloc7 = bloc7;
    }

    public Long getCompteEnBanqueId() {
        return compteEnBanqueId;
    }
    
    public void setCompteEnBanqueId(Long compteEnBanqueId) {
        this.compteEnBanqueId = compteEnBanqueId;
    }
}
