/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class DestinataireCourrier implements Serializable, Comparable<DestinataireCourrier> {
    public static final transient int NON_RAR = 0;
    public static final transient int RAR_NON_ENVOYE = 1;
    public static final transient int RAR_ENVOYE_NON_REVENU = 2;
    public static final transient int RAR_ENVOYE_REVENU_OK = 3;
    public static final transient int RAR_ENVOYE_REVENU_PAS_OK = 4;
    @ManyToOne(fetch = FetchType.LAZY)
    private Publipostage publipostage;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adresseDestinataire;
    private String numeroRAR;
    private LocalDate dateReceptionAR;
    private RetourRecommandeAR retourRecommandeAR;
    @OneToOne(fetch = FetchType.LAZY)
    private Bordereau_Coproprietaire bordereau_Coproprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;


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
        if (!(object instanceof DestinataireCourrier)) {
            return false;
        }
        DestinataireCourrier other = (DestinataireCourrier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getAdresseDestinataire()/* + " (" + new SimpleDateFormat("dd/MM/yyyy").format(getPublipostage().getCourrier().getDateCreation()) + ")"*/;
    }

    /**
     * @return the adresseDestinataire
     */
    public String getAdresseDestinataire() {
        return adresseDestinataire;
    }

    /**
     * @param adresseDestinataire the adresseDestinataire to set
     */
    public void setAdresseDestinataire(String adresseDestinataire) {
        this.adresseDestinataire = adresseDestinataire;
    }

    /**
     * @return the numeroRAR
     */
    public String getNumeroRAR() {
        return numeroRAR;
    }

    /**
     * @param numeroRAR the numeroRAR to set
     */
    public void setNumeroRAR(String numeroRAR) {
        this.numeroRAR = numeroRAR;
    }

    /**
     * @return the dateReceptionAR
     */
    public LocalDate getDateReceptionAR() {
        return dateReceptionAR;
    }

    /**
     * @param dateReceptionAR the dateReceptionAR to set
     */
    public void setDateReceptionAR(LocalDate dateReceptionAR) {
        this.dateReceptionAR = dateReceptionAR;
    }

    /**
     * @return the retourRecommandeAR
     */
    public RetourRecommandeAR getRetourRecommandeAR() {
        return retourRecommandeAR;
    }

    /**
     * @param retourRecommandeAR the retourRecommandeAR to set
     */
    public void setRetourRecommandeAR(RetourRecommandeAR retourRecommandeAR) {
        this.retourRecommandeAR = retourRecommandeAR;
    }

    /**
     * @return the publipostage
     */
    public Publipostage getPublipostage() {
        return publipostage;
    }

    /**
     * @param publipostage the publipostage to set
     */
    public void setPublipostage(Publipostage publipostage) {
        this.publipostage = publipostage;
    }

    @Override
    public int compareTo(DestinataireCourrier o) {
        if (o != null) {
            return this.toString().compareToIgnoreCase(o.toString());
        } else {
            return this.toString().compareToIgnoreCase("");
        }
    }

    /**
     * @return the bordereau_Coproprietaire
     */
    public Bordereau_Coproprietaire getBordereau_Coproprietaire() {
        return bordereau_Coproprietaire;
    }

    /**
     * @param bordereau_Coproprietaire the bordereau_Coproprietaire to set
     */
    public void setBordereau_Coproprietaire(Bordereau_Coproprietaire bordereau_Coproprietaire) {
        this.bordereau_Coproprietaire = bordereau_Coproprietaire;
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

}
