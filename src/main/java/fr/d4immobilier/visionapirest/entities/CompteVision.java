/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Random;
import jakarta.persistence.*;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = CompteVision.NQ_GET_COMPTE_BY_LOGIN_PASS, query = "select distinct c from CompteVision c left join fetch c.personnes left join fetch c.societes where c.login= :login and c.motDePasse= :password and c.actif=:oui"),
    @NamedQuery(name = CompteVision.NQ_GET_COMPTE_BY_CODE_ACTIVATION, query = "select c from CompteVision c left join fetch c.personnes left join fetch c.societes where c.codeActivation= :ca"),
    @NamedQuery(name = CompteVision.NQ_GET_COMPTE_BY_LOGIN, query = "select c from CompteVision c where c.login= :login")
})
public class CompteVision implements Serializable {

    public static final transient String NQ_GET_COMPTE_BY_LOGIN_PASS = "getCompteByLoginPass";
    public static final transient String NQ_GET_COMPTE_BY_CODE_ACTIVATION = "getCompteByCodeAct";
    public static final transient String NQ_GET_COMPTE_BY_LOGIN = "getCompteByLogin";


    
    @OneToMany(mappedBy = "compteVision", fetch = FetchType.LAZY)
    @OrderColumn(name = "id")
    private List<Personne> personnes;
    
    @OneToMany(mappedBy = "compteVision", fetch = FetchType.LAZY)
    @OrderColumn(name = "id")
    private List<Societe> societes;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String motDePasse;
    @Enumerated(EnumType.STRING)
    private ProfilCompteVision profil;
    private Boolean actif;
    private String codeActivation;

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
        if (!(object instanceof CompteVision)) {
            return false;
        }
        CompteVision other = (CompteVision) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.CompteVision[id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + "]";
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * @return the profil
     */
    public ProfilCompteVision getProfil() {
        return profil;
    }

    /**
     * @param profil the profil to set
     */
    public void setProfil(ProfilCompteVision profil) {
        this.profil = profil;
    }

    /**
     * @return the personne
     */
    public List<Personne> getPersonnes() {
        return personnes;
    }

    /**
     * @param personnes the personne to set
     */
    public void setPersonne(List<Personne> personnes) {
        this.personnes = personnes;
    }

    /**
     * @return the actif
     */
    public Boolean getActif() {
        return actif;
    }

    /**
     * @param actif the actif to set
     */
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public static String genererMotDePasse() {
        String mdp = "";
        String caracteresAutorises = "abcdefghijkmnpqrstuwxyz";
        Random random = new Random(System.currentTimeMillis());
        int longueur = 5;
        for (int i = 0; i < longueur; i++) {
            mdp = mdp + caracteresAutorises.charAt(random.nextInt(caracteresAutorises.length()));
        }
        return mdp;
    }

    /**
     * @return the codeActivation
     */
    public String getCodeActivation() {
        return codeActivation;
    }

    /**
     * @param codeActivation the codeActivation to set
     */
    public void setCodeActivation(String codeActivation) {
        this.codeActivation = codeActivation;
    }


    /**
     * @return the societe
     */
    public List<Societe> getSocietes() {
        return societes;
    }

    /**
     * @param societes the societe to set
     */
    public void setSocietes(List<Societe> societes) {
        this.societes = societes;
    }
    
    public Personne getPersonne() {
        if (getPersonnes() == null || getPersonnes().isEmpty()) {
            return null;
        } else {
            return getPersonnes().get(0);
        }
    }
    
    public Societe getSociete() {
        if (getSocietes() == null || getSocietes().isEmpty()) {
            return null;
        } else {
            return getSocietes().get(0);
        }
    }
}
