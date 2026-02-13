/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class RegroupementResolutions implements Serializable {
    @OneToOne(mappedBy = "regroupementResolutions", fetch = FetchType.LAZY)
    private ResolutionTravaux resolutionTravaux;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Assemblee assemblee;
    private Integer numero;
    private String intitule;
    private String detail;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Batiment> batiments;
    @OneToOne(fetch = FetchType.LAZY)
    private TypeTantieme typeTantieme;
    private Majorite majorite;
    @OneToMany(mappedBy = "regroupementResolutions", fetch = FetchType.LAZY)
    private List<Resolution> resolutions;
    

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
        if (!(object instanceof RegroupementResolutions)) {
            return false;
        }
        RegroupementResolutions other = (RegroupementResolutions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.RegroupementResolutions[ id=" + id + " ]";
    }

    /**
     * @return the assemblee
     */
    public Assemblee getAssemblee() {
        return assemblee;
    }

    /**
     * @param assemblee the assemblee to set
     */
    public void setAssemblee(Assemblee assemblee) {
        this.assemblee = assemblee;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the intitule
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * @param intitule the intitule to set
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return the batiments
     */
    public List<Batiment> getBatiments() {
        return batiments;
    }

    /**
     * @param batiments the batiments to set
     */
    public void setBatiments(List<Batiment> batiments) {
        this.batiments = batiments;
    }

    /**
     * @return the typeTantieme
     */
    public TypeTantieme getTypeTantieme() {
        return typeTantieme;
    }

    /**
     * @param typeTantieme the typeTantieme to set
     */
    public void setTypeTantieme(TypeTantieme typeTantieme) {
        this.typeTantieme = typeTantieme;
    }

    /**
     * @return the majorite
     */
    public Majorite getMajorite() {
        return majorite;
    }

    /**
     * @param majorite the majorite to set
     */
    public void setMajorite(Majorite majorite) {
        this.majorite = majorite;
    }

    /**
     * @return the resolutions
     */
    public List<Resolution> getResolutions() {
        return resolutions;
    }

    /**
     * @param resolutions the resolutions to set
     */
    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    /**
     * @return the resolutionTravaux
     */
    public ResolutionTravaux getResolutionTravaux() {
        return resolutionTravaux;
    }

    /**
     * @param resolutionTravaux the resolutionTravaux to set
     */
    public void setResolutionTravaux(ResolutionTravaux resolutionTravaux) {
        this.resolutionTravaux = resolutionTravaux;
    }
    
}
