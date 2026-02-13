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
import jakarta.persistence.OneToOne;
import jakarta.persistence.FetchType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PVAG implements Serializable {
    @OneToOne(mappedBy = "pvag", fetch = FetchType.LAZY)
    private Assemblee assemblee;
    @OneToMany(mappedBy = "pvag", fetch = FetchType.LAZY)
    private List<CourrierDiffusionPVAG> courrierDiffusionPVAGs;
    @OneToOne(mappedBy = "pvag",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private FichierPVAG fichierPVAG;
    @OneToMany(mappedBy = "pvag",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ActionPVAG> actionPVAGs;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Instant dateAG;

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
        if (!(object instanceof PVAG)) {
            return false;
        }
        PVAG other = (PVAG) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return dateAG.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yy")) + " - " + copropriete.getTrigramme();
    }

    /**
     * @return the fichierPVAG
     */
    public FichierPVAG getFichierPVAG() {
        return fichierPVAG;
    }

    /**
     * @param fichierPVAG the fichierPVAG to set
     */
    public void setFichierPVAG(FichierPVAG fichierPVAG) {
        this.fichierPVAG = fichierPVAG;
    }

    /**
     * @return the actionPVAGs
     */
    public List<ActionPVAG> getActionPVAGs() {
        return actionPVAGs;
    }

    /**
     * @param actionPVAGs the actionPVAGs to set
     */
    public void setActionPVAGs(List<ActionPVAG> actionPVAGs) {
        this.actionPVAGs = actionPVAGs;
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
     * @return the dateAG
     */
    public Instant getDateAG() {
        return dateAG;
    }

    /**
     * @param dateAG the dateAG to set
     */
    public void setDateAG(Instant dateAG) {
        this.dateAG = dateAG;
    }

    /**
     * @return the courrierDiffusionPVAGs
     */
    public List<CourrierDiffusionPVAG> getCourrierDiffusionPVAGs() {
        return courrierDiffusionPVAGs;
    }

    /**
     * @param courrierDiffusionPVAGs the courrierDiffusionPVAGs to set
     */
    public void setCourrierDiffusionPVAGs(List<CourrierDiffusionPVAG> courrierDiffusionPVAGs) {
        this.courrierDiffusionPVAGs = courrierDiffusionPVAGs;
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

}
