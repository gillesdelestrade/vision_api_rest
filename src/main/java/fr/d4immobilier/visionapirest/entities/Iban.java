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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Iban implements Serializable {

    public Iban() {
    }

    public Iban(CompteEnBanque compteEnBanque, String bloc1, String bloc2, String bloc3, String bloc4, String bloc5, String bloc6, String bloc7) {
        this.compteEnBanque = compteEnBanque;
        this.bloc1 = bloc1;
        this.bloc2 = bloc2;
        this.bloc3 = bloc3;
        this.bloc4 = bloc4;
        this.bloc5 = bloc5;
        this.bloc6 = bloc6;
        this.bloc7 = bloc7;
    }

    

    @OneToOne(mappedBy = "iban", fetch = FetchType.LAZY)
    private CompteEnBanque compteEnBanque;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloc1;
    private String bloc2;
    private String bloc3;
    private String bloc4;
    private String bloc5;
    private String bloc6;
    private String bloc7;


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
        if (!(object instanceof Iban)) {
            return false;
        }
        Iban other = (Iban) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Iban[id=" + id + "]";
    }

    /**
     * @return the bloc1
     */
    public String getBloc1() {
        return bloc1;
    }

    /**
     * @param bloc1 the bloc1 to set
     */
    public void setBloc1(String bloc1) {
        this.bloc1 = bloc1;
    }

    /**
     * @return the bloc2
     */
    public String getBloc2() {
        return bloc2;
    }

    /**
     * @param bloc2 the bloc2 to set
     */
    public void setBloc2(String bloc2) {
        this.bloc2 = bloc2;
    }

    /**
     * @return the bloc3
     */
    public String getBloc3() {
        return bloc3;
    }

    /**
     * @param bloc3 the bloc3 to set
     */
    public void setBloc3(String bloc3) {
        this.bloc3 = bloc3;
    }

    /**
     * @return the bloc4
     */
    public String getBloc4() {
        return bloc4;
    }

    /**
     * @param bloc4 the bloc4 to set
     */
    public void setBloc4(String bloc4) {
        this.bloc4 = bloc4;
    }

    /**
     * @return the bloc5
     */
    public String getBloc5() {
        return bloc5;
    }

    /**
     * @param bloc5 the bloc5 to set
     */
    public void setBloc5(String bloc5) {
        this.bloc5 = bloc5;
    }

    /**
     * @return the bloc6
     */
    public String getBloc6() {
        return bloc6;
    }

    /**
     * @param bloc6 the bloc6 to set
     */
    public void setBloc6(String bloc6) {
        this.bloc6 = bloc6;
    }

    /**
     * @return the bloc7
     */
    public String getBloc7() {
        return bloc7;
    }

    /**
     * @param bloc7 the bloc7 to set
     */
    public void setBloc7(String bloc7) {
        this.bloc7 = bloc7;
    }

}
