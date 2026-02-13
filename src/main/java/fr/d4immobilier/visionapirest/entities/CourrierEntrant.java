/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class CourrierEntrant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateReception;
    private LocalDate dateCourrier;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeDocumentCourrierEntrant typeDocumentCourrierEntrant;
    private ProvenanceCourrierEntrant provenanceCourrierEntrant;
    @OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private FichierCourrierEntrant fichierCourrierEntrant;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaireProvenance;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fournisseur fournisseurProvenance;
    private Boolean affecte;
    private Boolean nePasClasser;
    private Boolean concerneSinistre;
    
    
    

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
        if (!(object instanceof CourrierEntrant)) {
            return false;
        }
        CourrierEntrant other = (CourrierEntrant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getFichierCourrierEntrant() == null) {
            return "Nouveau";
        } else {
            if (getAffecte() != null && getNePasClasser() != null && getAffecte() && getNePasClasser()) {
                return "<html><font color=\"#006600\">" + getFichierCourrierEntrant().getNomFichier();
            } else {
                return getFichierCourrierEntrant().getNomFichier();
            }
            
        }
    }

    /**
     * @return the dateReception
     */
    public LocalDate getDateReception() {
        return dateReception;
    }

    /**
     * @param dateReception the dateReception to set
     */
    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    /**
     * @return the dateCourrier
     */
    public LocalDate getDateCourrier() {
        return dateCourrier;
    }

    /**
     * @param dateCourrier the dateCourrier to set
     */
    public void setDateCourrier(LocalDate dateCourrier) {
        this.dateCourrier = dateCourrier;
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
     * @return the typeDocumentCourrierEntrant
     */
    public TypeDocumentCourrierEntrant getTypeDocumentCourrierEntrant() {
        return typeDocumentCourrierEntrant;
    }

    /**
     * @param typeDocumentCourrierEntrant the typeDocumentCourrierEntrant to set
     */
    public void setTypeDocumentCourrierEntrant(TypeDocumentCourrierEntrant typeDocumentCourrierEntrant) {
        this.typeDocumentCourrierEntrant = typeDocumentCourrierEntrant;
    }

    /**
     * @return the provenanceCourrierEntrant
     */
    public ProvenanceCourrierEntrant getProvenanceCourrierEntrant() {
        return provenanceCourrierEntrant;
    }

    /**
     * @param provenanceCourrierEntrant the provenanceCourrierEntrant to set
     */
    public void setProvenanceCourrierEntrant(ProvenanceCourrierEntrant provenanceCourrierEntrant) {
        this.provenanceCourrierEntrant = provenanceCourrierEntrant;
    }

    /**
     * @return the fichierCourrierEntrant
     */
    public FichierCourrierEntrant getFichierCourrierEntrant() {
        return fichierCourrierEntrant;
    }

    /**
     * @param fichierCourrierEntrant the fichierCourrierEntrant to set
     */
    public void setFichierCourrierEntrant(FichierCourrierEntrant fichierCourrierEntrant) {
        this.fichierCourrierEntrant = fichierCourrierEntrant;
    }

    /**
     * @return the coproprietaireProvenance
     */
    public Coproprietaire getCoproprietaireProvenance() {
        return coproprietaireProvenance;
    }

    /**
     * @param coproprietaireProvenance the coproprietaireProvenance to set
     */
    public void setCoproprietaireProvenance(Coproprietaire coproprietaireProvenance) {
        this.coproprietaireProvenance = coproprietaireProvenance;
    }

    /**
     * @return the fournisseurProvenance
     */
    public Fournisseur getFournisseurProvenance() {
        return fournisseurProvenance;
    }

    /**
     * @param fournisseurProvenance the fournisseurProvenance to set
     */
    public void setFournisseurProvenance(Fournisseur fournisseurProvenance) {
        this.fournisseurProvenance = fournisseurProvenance;
    }

    /**
     * @return the affecte
     */
    public Boolean getAffecte() {
        return affecte;
    }

    /**
     * @param affecte the affecte to set
     */
    public void setAffecte(Boolean affecte) {
        this.affecte = affecte;
    }

    /**
     * @return the nePasClasser
     */
    public Boolean getNePasClasser() {
        return nePasClasser;
    }

    /**
     * @param nePasClasser the nePasClasser to set
     */
    public void setNePasClasser(Boolean nePasClasser) {
        this.nePasClasser = nePasClasser;
    }

    /**
     * @return the concerneSinistre
     */
    public Boolean getConcerneSinistre() {
        return concerneSinistre;
    }

    /**
     * @param concerneSinistre the concerneSinistre to set
     */
    public void setConcerneSinistre(Boolean concerneSinistre) {
        this.concerneSinistre = concerneSinistre;
    }
    
}
