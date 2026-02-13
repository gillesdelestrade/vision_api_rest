package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ReunionResumeDTO {

    private Long id;
    private String type; // "REUNION" ou "REUNION_V2"
    private LocalDate dateReunion;
    private String objet;
    private List<String> pointsAbordes;
    private List<String> fichiers;
    private boolean reunionSansSyndic;

    public ReunionResumeDTO() {
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateReunion() {
        return dateReunion;
    }

    public void setDateReunion(LocalDate dateReunion) {
        this.dateReunion = dateReunion;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public List<String> getPointsAbordes() {
        return pointsAbordes;
    }

    public void setPointsAbordes(List<String> pointsAbordes) {
        this.pointsAbordes = pointsAbordes;
    }

    public List<String> getFichiers() {
        return fichiers;
    }

    public void setFichiers(List<String> fichiers) {
        this.fichiers = fichiers;
    }

    public boolean isReunionSansSyndic() {
        return reunionSansSyndic;
    }

    public void setReunionSansSyndic(boolean reunionSansSyndic) {
        this.reunionSansSyndic = reunionSansSyndic;
    }
}
