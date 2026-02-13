/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gilles
 */
@Entity
public class Reunion implements Serializable, Comparable<Reunion> {
    //@OneToOne(fetch = FetchType.LAZY)
    //private transient ODJReunion oDJReunion;
    private transient Long idODJReunion;
    @OneToMany(mappedBy = "reunion",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FichierReunion> fichiersReunion;
    @OneToMany(mappedBy = "reunion",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PointAborde> pointsAbordes;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Instant dateReunion;
    private String objet;
    
    private String participants;
    
    private String diffusion;
    private LocalDate dateProchaineReunion;
    private String detailProchaineReunion;

    private Boolean brouillon;
    
    private Boolean reunionSansSyndic;
    
    private Boolean dateProvisoire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reunion)) {
            return false;
        }
        Reunion other = (Reunion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCopropriete().getTrigramme() + " du " + dateReunion.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    /**
     * @return the pointsAbordes
     */
    public List<PointAborde> getPointsAbordes() {
        return pointsAbordes;
    }

    /**
     * @param pointsAbordes the pointsAbordes to set
     */
    public void setPointsAbordes(List<PointAborde> pointsAbordes) {
        this.pointsAbordes = pointsAbordes;
    }

    /**
     * @return the copropriete
     */
    public Copropriete getCopropriete() {
        return copropriete;
    }

    /**
     * @param copropriete the copropriete to set
     */
    public void setCopropriete(Copropriete copropriete) {
        this.copropriete = copropriete;
    }

    /**
     * @return the dateReunion
     */
    public Instant getDateReunion() {
        return dateReunion;
    }

    /**
     * @param dateReunion the dateReunion to set
     */
    public void setDateReunion(Instant dateReunion) {
        this.dateReunion = dateReunion;
    }

    /**
     * @return the objet
     */
    public String getObjet() {
        return objet;
    }

    /**
     * @param objet the objet to set
     */
    public void setObjet(String objet) {
        this.objet = objet;
    }

    /**
     * @return the participants
     */
    public String getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(String participants) {
        this.participants = participants;
    }

    /**
     * @return the diffusion
     */
    public String getDiffusion() {
        return diffusion;
    }

    /**
     * @param diffusion the diffusion to set
     */
    public void setDiffusion(String diffusion) {
        this.diffusion = diffusion;
    }

    /**
     * @return the dateProchaineReunion
     */
    public LocalDate getDateProchaineReunion() {
        return dateProchaineReunion;
    }

    /**
     * @param dateProchaineReunion the dateProchaineReunion to set
     */
    public void setDateProchaineReunion(LocalDate dateProchaineReunion) {
        this.dateProchaineReunion = dateProchaineReunion;
    }

    /**
     * @return the detailProchaineReunion
     */
    public String getDetailProchaineReunion() {
        return detailProchaineReunion;
    }

    /**
     * @param detailProchaineReunion the detailProchaineReunion to set
     */
    public void setDetailProchaineReunion(String detailProchaineReunion) {
        this.detailProchaineReunion = detailProchaineReunion;
    }

    /**
     * @return the brouillon
     */
    public Boolean getBrouillon() {
        return brouillon;
    }

    /**
     * @param brouillon the brouillon to set
     */
    public void setBrouillon(Boolean brouillon) {
        this.brouillon = brouillon;
    }

    /**
     * @return the fichiersReunion
     */
    public List<FichierReunion> getFichiersReunion() {
        return fichiersReunion;
    }

    /**
     * @param fichiersReunion the fichiersReunion to set
     */
    public void setFichiersReunion(List<FichierReunion> fichiersReunion) {
        this.fichiersReunion = fichiersReunion;
    }

    @Override
    public int compareTo(Reunion t) {
        return this.getDateReunion().compareTo(t.getDateReunion());
    }

    /**
     * @return the reunionSansSyndic
     */
    public Boolean getReunionSansSyndic() {
        return reunionSansSyndic;
    }

    /**
     * @param reunionSansSyndic the reunionSansSyndic to set
     */
    public void setReunionSansSyndic(Boolean reunionSansSyndic) {
        this.reunionSansSyndic = reunionSansSyndic;
    }

    /**
     * @return the dateProvisoire
     */
    public Boolean getDateProvisoire() {
        return dateProvisoire;
    }

    /**
     * @param dateProvisoire the dateProvisoire to set
     */
    public void setDateProvisoire(Boolean dateProvisoire) {
        this.dateProvisoire = dateProvisoire;
    }

//    /**
//     * @return the oDJReunion
//     */
//    public ODJReunion getoDJReunion() {
//        return oDJReunion;
//    }
//
//    /**
//     * @param oDJReunion the oDJReunion to set
//     */
//    public void setoDJReunion(ODJReunion oDJReunion) {
//        this.oDJReunion = oDJReunion;
//    }

    /**
     * @return the idODJReunion
     */
    public Long getIdODJReunion() {
        return idODJReunion;
    }

    /**
     * @param idODJReunion the idODJReunion to set
     */
    public void setIdODJReunion(Long idODJReunion) {
        this.idODJReunion = idODJReunion;
    }

}
