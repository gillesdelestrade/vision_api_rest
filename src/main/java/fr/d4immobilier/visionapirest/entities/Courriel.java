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
public class Courriel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String messageId;
    private String emetteur;
    private String sujet;
    private Instant dateReception;
    private Boolean dejaClasse;
    @ManyToOne(fetch = FetchType.LAZY)
    private BoiteMail boiteMail;
    private Boolean fromD4;
    private Boolean destinataireTO;
    private Boolean destinataireCC;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Copropriete> coproprietes;
    private String corps;
    
    /*
    @OneToOne(fetch = FetchType.LAZY)
    private EvenementDemande evenementDemande;
    */
    
    @OneToMany(mappedBy = "courriel", fetch = FetchType.LAZY)
    private List<EvenementDemande> evenementsDemande;
    
    
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
        if (!(object instanceof Courriel)) {
            return false;
        }
        Courriel other = (Courriel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "<html><div style=\"vertical-align:top;\"><table border=0 cellpadding=0 cellspacing=0 width=\"300px\" height=\"50px\"><tr><td width=\"65%\"><b>" + getEmetteur() + "</b></td><td><i>" + getDateReception().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "</i></td></tr><tr><td colspan=2><font color=\"gray\">" + getSujet() + "</td></tr></table>";
    }

    /**
     * @return the messageId
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * @return the emetteur
     */
    public String getEmetteur() {
        return emetteur;
    }

    /**
     * @param emetteur the emetteur to set
     */
    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    /**
     * @return the sujet
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * @param sujet the sujet to set
     */
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    /**
     * @return the dateReception
     */
    public Instant getDateReception() {
        return dateReception;
    }

    /**
     * @param dateReception the dateReception to set
     */
    public void setDateReception(Instant dateReception) {
        this.dateReception = dateReception;
    }

    /**
     * @return the dejaClasse
     */
    public Boolean getDejaClasse() {
        return dejaClasse;
    }

    /**
     * @param dejaClasse the dejaClasse to set
     */
    public void setDejaClasse(Boolean dejaClasse) {
        this.dejaClasse = dejaClasse;
    }

    /**
     * @return the boiteMail
     */
    public BoiteMail getBoiteMail() {
        return boiteMail;
    }

    /**
     * @param boiteMail the boiteMail to set
     */
    public void setBoiteMail(BoiteMail boiteMail) {
        this.boiteMail = boiteMail;
    }

    /**
     * @return the fromD4
     */
    public Boolean getFromD4() {
        return fromD4;
    }

    /**
     * @param fromD4 the fromD4 to set
     */
    public void setFromD4(Boolean fromD4) {
        this.fromD4 = fromD4;
    }

    /**
     * @return the destinataireTO
     */
    public Boolean getDestinataireTO() {
        return destinataireTO;
    }

    /**
     * @param destinataireTO the destinataireTO to set
     */
    public void setDestinataireTO(Boolean destinataireTO) {
        this.destinataireTO = destinataireTO;
    }

    /**
     * @return the destinataireCC
     */
    public Boolean getDestinataireCC() {
        return destinataireCC;
    }

    /**
     * @param destinataireCC the destinataireCC to set
     */
    public void setDestinataireCC(Boolean destinataireCC) {
        this.destinataireCC = destinataireCC;
    }

    /**
     * @return the coproprietes
     */
    public List<Copropriete> getCoproprietes() {
        return coproprietes;
    }

    /**
     * @param coproprietes the coproprietes to set
     */
    public void setCoproprietes(List<Copropriete> coproprietes) {
        this.coproprietes = coproprietes;
    }

    /**
     * @return the corps
     */
    public String getCorps() {
        return corps;
    }

    /**
     * @param corps the corps to set
     */
    public void setCorps(String corps) {
        this.corps = corps;
    }

    /**
     * @return the evenementDemandes
     */
    public List<EvenementDemande> getEvenementsDemande() {
        return evenementsDemande;
    }

    /**
     * @param evenementDemandes the evenementDemandes to set
     */
    public void setEvenementDemandes(List<EvenementDemande> evenementsDemande) {
        this.evenementsDemande = evenementsDemande;
    }

    /**
     * @return the evenementDemande
     */
    /*
    public EvenementDemande getEvenementDemande() {
        return evenementDemande;
    }
    */
    /**
     * @param evenementDemande the evenementDemande to set
     */
    /*
    public void setEvenementDemande(EvenementDemande evenementDemande) {
        this.evenementDemande = evenementDemande;
    }
    */

    

    

}
