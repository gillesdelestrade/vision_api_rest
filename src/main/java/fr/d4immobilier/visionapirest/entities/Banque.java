/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */

@Entity
@NamedQueries({
    @NamedQuery(name=Banque.NQ_GET_ALL_BANQUES,query="select b from Banque b order by b.raisonSociale asc"),
    @NamedQuery(name=Banque.NQ_GET_BANQUE_BY_NOM,query="select b from Banque b where b.raisonSociale=:rs and b.lieu=:lieu")
})


public class Banque extends Societe implements Serializable {
    @ManyToMany(mappedBy = "banques", fetch = FetchType.LAZY)
    private List<CodeBanqueCMC7> codesBanqueCMC7;
    private static final long serialVersionUID = 1L;
    private String agence;
    private String lieu;
    private String codeCMC7;
    
    
    public static final transient String NQ_GET_ALL_BANQUES = "getAllBanques";
    public static final transient String NQ_GET_BANQUE_BY_NOM = "getBanqueByNom";


    @Override
    public String toString() {
        String s = getRaisonSociale();
        if (getLieu() != null) {
            s = s + " " + getLieu();
        }
        if (getAgence() != null) {
            s = s + " " + getAgence();
        }
        return s;
    }

    /**
     * @return the agence
     */
    public String getAgence() {
        return agence;
    }

    /**
     * @param agence the agence to set
     */
    public void setAgence(String agence) {
        this.agence = agence;
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
     * @return the codeCMC7
     */
    public String getCodeCMC7() {
        return codeCMC7;
    }

    /**
     * @param codeCMC7 the codeCMC7 to set
     */
    public void setCodeCMC7(String codeCMC7) {
        this.codeCMC7 = codeCMC7;
    }

    /**
     * @return the codesBanqueCMC7
     */
    public List<CodeBanqueCMC7> getCodesBanqueCMC7() {
        return codesBanqueCMC7;
    }

    /**
     * @param codesBanqueCMC7 the codesBanqueCMC7 to set
     */
    public void setCodesBanqueCMC7(List<CodeBanqueCMC7> codesBanqueCMC7) {
        this.codesBanqueCMC7 = codesBanqueCMC7;
    }

}
