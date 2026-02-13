/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Resolution implements Serializable, Comparable<Resolution> {
    @ManyToOne(fetch = FetchType.LAZY)
    private RegroupementResolutions regroupementResolutions;
    @OneToMany(mappedBy = "resolution",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vote> votes;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private Integer numero;
    private String detail;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeTantieme typeTantieme;
    private Majorite majoriteRequise;
    @ManyToOne(fetch = FetchType.LAZY)
    private Assemblee assemblee;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Fichier> fichiers; 
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Fournisseur> fournisseursConsultesEnAttente;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Batiment> batiments;
    
    @Transient
    private List<Coproprietaire> coproprietairesAbsents;
    private Integer numeroNiveau2;
    private Integer numeroNiveau3;
    
    private String detailModifie;
    private String phraseConclusion;

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
        if (!(object instanceof Resolution)) {
            return false;
        }
        Resolution other = (Resolution) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.entities.Resolution[id=" + id + "]";
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
     * @return the votes
     */
    public List<Vote> getVotes() {
        return votes;
    }

    /**
     * @param votes the votes to set
     */
    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public Vote findVoteByTag(Tag tag) {
        if (getVotes()==null) setVotes(new ArrayList<Vote>());
        if (tag != null) {
            for (Vote vote : getVotes()) {
                if (vote.getAffectation() == null) vote.setAffectation(new Affectation());
                if (vote.getAffectation().getTag() == null) vote.getAffectation().setTag(new Tag());
                if (vote.getAffectation().getTag().equals(tag)) {
                    return vote;
                }
            }
        }
        return null;
    }

    public Affectation getAffectation(Tag tag) {
        if (tag != null) {
            if (getAssemblee() == null) setAssemblee(new Assemblee());
            if (getAssemblee().getPresences()==null) getAssemblee().setPresences(new ArrayList<Presence>());
            for (Presence presence : getAssemblee().getPresences()) {
                if (presence.getAffectation().getTag().equals(tag)) {
                    return presence.getAffectation();
                }
            }
        }
        return null;
    }

    /**
     * @return the majoriteRequise
     */
    public Majorite getMajoriteRequise() {
        return majoriteRequise;
    }

    /**
     * @param majoriteRequise the majoriteRequise to set
     */
    public void setMajoriteRequise(Majorite majoriteRequise) {
        this.majoriteRequise = majoriteRequise;
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

    @Override
    public int compareTo(Resolution t) {
        return this.getNumero().compareTo(t.getNumero());
    }


    /**
     * @return the fournisseursConsultesEnAttente
     */
    public List<Fournisseur> getFournisseursConsultesEnAttente() {
        return fournisseursConsultesEnAttente;
    }

    /**
     * @param fournisseursConsultesEnAttente the fournisseursConsultesEnAttente to set
     */
    public void setFournisseursConsultesEnAttente(List<Fournisseur> fournisseursConsultesEnAttente) {
        this.fournisseursConsultesEnAttente = fournisseursConsultesEnAttente;
    }

    /**
     * @return the fichiers
     */
    public List<Fichier> getFichiers() {
        return fichiers;
    }

    /**
     * @param fichiers the fichiers to set
     */
    public void setFichiers(List<Fichier> fichiers) {
        this.fichiers = fichiers;
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
     * @return the coproprietairesAbsents
     */
    public List<Coproprietaire> getCoproprietairesAbsents() {
        return coproprietairesAbsents;
    }

    /**
     * @param coproprietairesAbsents the coproprietairesAbsents to set
     */
    public void setCoproprietairesAbsents(List<Coproprietaire> coproprietairesAbsents) {
        this.coproprietairesAbsents = coproprietairesAbsents;
    }

    /**
     * @return the numeroNiveau2
     */
    public Integer getNumeroNiveau2() {
        return numeroNiveau2;
    }

    /**
     * @param numeroNiveau2 the numeroNiveau2 to set
     */
    public void setNumeroNiveau2(Integer numeroNiveau2) {
        this.numeroNiveau2 = numeroNiveau2;
    }

    /**
     * @return the numeroNiveau3
     */
    public Integer getNumeroNiveau3() {
        return numeroNiveau3;
    }

    /**
     * @param numeroNiveau3 the numeroNiveau3 to set
     */
    public void setNumeroNiveau3(Integer numeroNiveau3) {
        this.numeroNiveau3 = numeroNiveau3;
    }

    /**
     * @return the regroupementResolutions
     */
    public RegroupementResolutions getRegroupementResolutions() {
        return regroupementResolutions;
    }

    /**
     * @param regroupementResolutions the regroupementResolutions to set
     */
    public void setRegroupementResolutions(RegroupementResolutions regroupementResolutions) {
        this.regroupementResolutions = regroupementResolutions;
    }

    /**
     * @return the detailModifie
     */
    public String getDetailModifie() {
        return detailModifie;
    }

    /**
     * @param detailModifie the detailModifie to set
     */
    public void setDetailModifie(String detailModifie) {
        this.detailModifie = detailModifie;
    }

    /**
     * @return the phraseConclusion
     */
    public String getPhraseConclusion() {
        return phraseConclusion;
    }

    /**
     * @param phraseConclusion the phraseConclusion to set
     */
    public void setPhraseConclusion(String phraseConclusion) {
        this.phraseConclusion = phraseConclusion;
    }


}
