/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
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
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class FactureD4 implements Serializable {

    @OneToMany(mappedBy = "factureD4", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RegroupementLignesFacturation> regroupementsLignesFacturation;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private LocalDate dateFacture;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;
    private Double montantTotalHT;
    private Double montantTotalTTC;
    private TypeFactureD4 typeFactureD4;
    private Instant dateValidation;
    private Instant dateEdition;
    private LocalDate dateDebutPeriode;
    private LocalDate dateFinPeriode;

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
        if (!(object instanceof FactureD4)) {
            return false;
        }
        FactureD4 other = (FactureD4) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getReference() != null) {
            return getReference();
        } else {
            if (getDateFacture() != null) {
                if (getTypeFactureD4() != null) {
                    return getDateFacture().format(DateTimeFormatter.ofPattern("ddddMMyy")) + " " + getCopropriete().getTrigramme() + " " + getTypeFactureD4().toStringAbrege();
                } else {
                    return getDateFacture().format(DateTimeFormatter.ofPattern("ddddMMyy")) + " " + getCopropriete().getTrigramme() + " Inconnu";
                }
            } else {
                if (getTypeFactureD4() != null) {

                    if (getTypeFactureD4().equals(TypeFactureD4.FRAIS_DE_GESTION) && getDateDebutPeriode() != null && getDateFinPeriode() != null) {
                        if (getCopropriete() != null) {
                            return getCopropriete().getTrigramme() + " " + getTypeFactureD4().toStringAbrege() + dateDebutPeriode.format(DateTimeFormatter.ofPattern("MM-yyyy"));
                        } else {
                            return getTypeFactureD4().toStringAbrege() + dateDebutPeriode.format(DateTimeFormatter.ofPattern("MM-yyyy"));
                        }
                    }

                    if (getCopropriete() != null) {
                        return "temp " + getCopropriete().getTrigramme() + " " + getTypeFactureD4().toStringAbrege();
                    } else {
                        return "temp - " + getTypeFactureD4().toStringAbrege();
                    }

                } else {
                    if (getCopropriete() != null) {
                        return "temp " + getCopropriete().getTrigramme() + " Inconnu";
                    } else {
                        return "Nouvelle Facture";
                    }
                }

            }
        }

    }

    /**
     * @return the regroupementsLignesFacturation
     */
    public List<RegroupementLignesFacturation> getRegroupementsLignesFacturation() {
        return regroupementsLignesFacturation;
    }

    /**
     * @param regroupementsLignesFacturation the regroupementsLignesFacturation to set
     */
    public void setRegroupementsLignesFacturation(List<RegroupementLignesFacturation> regroupementsLignesFacturation) {
        this.regroupementsLignesFacturation = regroupementsLignesFacturation;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the dateFacture
     */
    public LocalDate getDateFacture() {
        return dateFacture;
    }

    /**
     * @param dateFacture the dateFacture to set
     */
    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
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
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the societe
     */
    public Societe getSociete() {
        return societe;
    }

    /**
     * @param societe the societe to set
     */
    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    /**
     * @return the montantTotalHT
     */
    public Double getMontantTotalHT() {
        return montantTotalHT;
    }

    /**
     * @param montantTotalHT the montantTotalHT to set
     */
    public void setMontantTotalHT(Double montantTotalHT) {
        this.montantTotalHT = montantTotalHT;
    }

    /**
     * @return the montantTotalTTc
     */
    public Double getMontantTotalTTC() {
        return montantTotalTTC;
    }

    /**
     * @param montantTotalTTC the montantTotalTTc to set
     */
    public void setMontantTotalTTC(Double montantTotalTTC) {
        this.montantTotalTTC = montantTotalTTC;
    }

    /**
     * @return the typeFactureD4
     */
    public TypeFactureD4 getTypeFactureD4() {
        return typeFactureD4;
    }

    /**
     * @param typeFactureD4 the typeFactureD4 to set
     */
    public void setTypeFactureD4(TypeFactureD4 typeFactureD4) {
        this.typeFactureD4 = typeFactureD4;
    }

    /**
     * @return the dateValidation
     */
    public Instant getDateValidation() {
        return dateValidation;
    }

    /**
     * @param dateValidation the dateValidation to set
     */
    public void setDateValidation(Instant dateValidation) {
        this.dateValidation = dateValidation;
    }

    /**
     * @return the dateEdition
     */
    public Instant getDateEdition() {
        return dateEdition;
    }

    /**
     * @param dateEdition the dateEdition to set
     */
    public void setDateEdition(Instant dateEdition) {
        this.dateEdition = dateEdition;
    }

    /**
     * @return the dateDebutPeriode
     */
    public LocalDate getDateDebutPeriode() {
        return dateDebutPeriode;
    }

    /**
     * @param dateDebutPeriode the dateDebutPeriode to set
     */
    public void setDateDebutPeriode(LocalDate dateDebutPeriode) {
        this.dateDebutPeriode = dateDebutPeriode;
    }

    /**
     * @return the dateFinPeriode
     */
    public LocalDate getDateFinPeriode() {
        return dateFinPeriode;
    }

    /**
     * @param dateFinPeriode the dateFinPeriode to set
     */
    public void setDateFinPeriode(LocalDate dateFinPeriode) {
        this.dateFinPeriode = dateFinPeriode;
    }
}
