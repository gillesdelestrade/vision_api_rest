/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name=Assemblee.NQ_GET_ASSEMBLEES_BY_COPRO,query="select a from Assemblee a where a.copropriete.id= :coproprieteId")
})
public class Assemblee implements Serializable {

    public static final transient String NQ_GET_ASSEMBLEES_BY_COPRO = "getAssembleesByCopro";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Instant dateAssemblee;
    private String lieu;
    @OneToMany(mappedBy = "assemblee",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Resolution> resolutions;
    @OneToMany(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private List<Presence> presences;
    private Instant dateFinAssemblee;
    @OneToOne(fetch = FetchType.LAZY)
    private PVAG pvag;
    private Boolean extraordinaire;
    @OneToMany(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private List<EtapePlanifAG> etapesPlanifAG;
    private Boolean dateAGProvisoire;
    @OneToMany(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private List<RegroupementResolutions> regroupementsResolutions;
    private Boolean formulairesExclusivement;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeTantieme typeTantieme;    
    @OneToMany(fetch = FetchType.LAZY)
    private List<Batiment> batiments;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierMaquette;
    private Boolean corbeille;
    @OneToOne(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private FichierTrameRARConvoc fichierTrameRARConvoc;
    @OneToOne(fetch = FetchType.LAZY)
    private Bordereau bordereauConvoc;
    @OneToOne(fetch = FetchType.LAZY)
    private Bordereau bordereauDiffusion;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierRARCSVConvoc;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierRARCSVDiffusion;
    @OneToOne(fetch = FetchType.LAZY)
    private FichierTrameRARDiffusion fichierTrameRARDiffusion;    
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierTableExterneConvocation;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierTableExterneDiffusion;
    @OneToMany(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private List<FichierProjetRepartition> fichiersProjetRepartition;
    @OneToMany(mappedBy = "assemblee", fetch = FetchType.LAZY)
    private List<FichierDecompteCharge> fichiersDecompteCharge;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichierFicheTravaux;

    public Assemblee() {
    }

    public Assemblee(Copropriete copropriete, Instant dateAssemblee, String lieu) {
        this.copropriete = copropriete;
        this.dateAssemblee = dateAssemblee;
        this.lieu = lieu;
    }



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
        if (!(object instanceof Assemblee)) {
            return false;
        }
        Assemblee other = (Assemblee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Assemblée générale [" + getCopropriete().getNom() + "] du " + getDateAssemblee().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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
     * @return the dateAssemblee
     */
    public Instant getDateAssemblee() {
        return dateAssemblee;
    }

    /**
     * @param dateAssemblee the dateAssemblee to set
     */
    public void setDateAssemblee(Instant dateAssemblee) {
        this.dateAssemblee = dateAssemblee;
    }

    /**
     * @return the lieu
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * @param lieu the lieu to set
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     * @return the pointsAbordes
     */
    public List<Resolution> getResolutions() {
        return resolutions;
    }

    /**
     * @param resolutions the pointsAbordes to set
     */
    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    /**
     * @return the presences
     */
    public List<Presence> getPresences() {
        return presences;
    }

    /**
     * @param presences the presences to set
     */
    public void setPresences(List<Presence> presences) {
        this.presences = presences;
    }

    /**
     * @return the dateFinAssemblee
     */
    public Instant getDateFinAssemblee() {
        return dateFinAssemblee;
    }

    /**
     * @param dateFinAssemblee the dateFinAssemblee to set
     */
    public void setDateFinAssemblee(Instant dateFinAssemblee) {
        this.dateFinAssemblee = dateFinAssemblee;
    }

    /**
     * @return the pvag
     */
    public PVAG getPvag() {
        return pvag;
    }

    /**
     * @param pvag the pvag to set
     */
    public void setPvag(PVAG pvag) {
        this.pvag = pvag;
    }

    /**
     * @return the extraordinaire
     */
    public Boolean getExtraordinaire() {
        return extraordinaire;
    }

    /**
     * @param extraordinaire the extraordinaire to set
     */
    public void setExtraordinaire(Boolean extraordinaire) {
        this.extraordinaire = extraordinaire;
    }

    /**
     * @return the dateAGProvisoire
     */
    public Boolean getDateAGProvisoire() {
        return dateAGProvisoire;
    }

    /**
     * @param dateAGProvisoire the dateAGProvisoire to set
     */
    public void setDateAGProvisoire(Boolean dateAGProvisoire) {
        this.dateAGProvisoire = dateAGProvisoire;
    }

    /**
     * @return the formulairesExclusivement
     */
    public Boolean getFormulairesExclusivement() {
        return formulairesExclusivement;
    }

    /**
     * @param formulairesExclusivement the formulairesExclusivement to set
     */
    public void setFormulairesExclusivement(Boolean formulairesExclusivement) {
        this.formulairesExclusivement = formulairesExclusivement;
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
     * @return the fichierMaquette
     */
    public Fichier getFichierMaquette() {
        return fichierMaquette;
    }

    /**
     * @param fichierMaquette the fichierMaquette to set
     */
    public void setFichierMaquette(Fichier fichierMaquette) {
        this.fichierMaquette = fichierMaquette;
    }

    /**
     * @return the corbeille
     */
    public Boolean getCorbeille() {
        return corbeille;
    }

    /**
     * @param corbeille the corbeille to set
     */
    public void setCorbeille(Boolean corbeille) {
        this.corbeille = corbeille;
    }

    /**
     * @return the fichierTrameRARConvoc
     */
    public FichierTrameRARConvoc getFichierTrameRARConvoc() {
        return fichierTrameRARConvoc;
    }

    /**
     * @param fichierTrameRARConvoc the fichierTrameRARConvoc to set
     */
    public void setFichierTrameRARConvoc(FichierTrameRARConvoc fichierTrameRARConvoc) {
        this.fichierTrameRARConvoc = fichierTrameRARConvoc;
    }

    /**
     * @return the bordereauConvoc
     */
    public Bordereau getBordereauConvoc() {
        return bordereauConvoc;
    }

    /**
     * @param bordereauConvoc the bordereauConvoc to set
     */
    public void setBordereauConvoc(Bordereau bordereauConvoc) {
        this.bordereauConvoc = bordereauConvoc;
    }

    /**
     * @return the bordereauDiffusion
     */
    public Bordereau getBordereauDiffusion() {
        return bordereauDiffusion;
    }

    /**
     * @param bordereauDiffusion the bordereauDiffusion to set
     */
    public void setBordereauDiffusion(Bordereau bordereauDiffusion) {
        this.bordereauDiffusion = bordereauDiffusion;
    }

    /**
     * @return the fichierRARCSVConvoc
     */
    public Fichier getFichierRARCSVConvoc() {
        return fichierRARCSVConvoc;
    }

    /**
     * @param fichierRARCSVConvoc the fichierRARCSVConvoc to set
     */
    public void setFichierRARCSVConvoc(Fichier fichierRARCSVConvoc) {
        this.fichierRARCSVConvoc = fichierRARCSVConvoc;
    }

    /**
     * @return the fichierRARCSVDiffusion
     */
    public Fichier getFichierRARCSVDiffusion() {
        return fichierRARCSVDiffusion;
    }

    /**
     * @param fichierRARCSVDiffusion the fichierRARCSVDiffusion to set
     */
    public void setFichierRARCSVDiffusion(Fichier fichierRARCSVDiffusion) {
        this.fichierRARCSVDiffusion = fichierRARCSVDiffusion;
    }

    /**
     * @return the fichierTrameRARDiffusion
     */
    public FichierTrameRARDiffusion getFichierTrameRARDiffusion() {
        return fichierTrameRARDiffusion;
    }

    /**
     * @param fichierTrameRARDiffusion the fichierTrameRARDiffusion to set
     */
    public void setFichierTrameRARDiffusion(FichierTrameRARDiffusion fichierTrameRARDiffusion) {
        this.fichierTrameRARDiffusion = fichierTrameRARDiffusion;
    }

    /**
     * @return the fichierTableExterneConvocation
     */
    public Fichier getFichierTableExterneConvocation() {
        return fichierTableExterneConvocation;
    }

    /**
     * @param fichierTableExterneConvocation the fichierTableExterneConvocation to set
     */
    public void setFichierTableExterneConvocation(Fichier fichierTableExterneConvocation) {
        this.fichierTableExterneConvocation = fichierTableExterneConvocation;
    }

    /**
     * @return the fichierTableExterneDiffusion
     */
    public Fichier getFichierTableExterneDiffusion() {
        return fichierTableExterneDiffusion;
    }

    /**
     * @param fichierTableExterneDiffusion the fichierTableExterneDiffusion to set
     */
    public void setFichierTableExterneDiffusion(Fichier fichierTableExterneDiffusion) {
        this.fichierTableExterneDiffusion = fichierTableExterneDiffusion;
    }

    /**
     * @return the fichiersProjetRepartition
     */
    public List<FichierProjetRepartition> getFichiersProjetRepartition() {
        return fichiersProjetRepartition;
    }

    /**
     * @param fichiersProjetRepartition the fichiersProjetRepartition to set
     */
    public void setFichiersProjetRepartition(List<FichierProjetRepartition> fichiersProjetRepartition) {
        this.fichiersProjetRepartition = fichiersProjetRepartition;
    }

    /**
     * @return the fichiersDecompteCharge
     */
    public List<FichierDecompteCharge> getFichiersDecompteCharge() {
        return fichiersDecompteCharge;
    }

    /**
     * @param fichiersDecompteCharge the fichiersDecompteCharge to set
     */
    public void setFichiersDecompteCharge(List<FichierDecompteCharge> fichiersDecompteCharge) {
        this.fichiersDecompteCharge = fichiersDecompteCharge;
    }

    /**
     * @return the fichierFicheTravaux
     */
    public Fichier getFichierFicheTravaux() {
        return fichierFicheTravaux;
    }

    /**
     * @param fichierFicheTravaux the fichierFicheTravaux to set
     */
    public void setFichierFicheTravaux(Fichier fichierFicheTravaux) {
        this.fichierFicheTravaux = fichierFicheTravaux;
    }

    

}
