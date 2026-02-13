/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Dossier extends Demande implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String titre;

    public static transient int AFFICHAGE_TITRE = 0;
    public static transient int AFFICHAGE_TITRE_COPRO = 1;

    private transient int modeAffichage = 0;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Copropriete copropriete;
    
    @Override
    public String toString() {
        String s = getTitre();
        if (getModeAffichage() == AFFICHAGE_TITRE_COPRO) {
            s = getCopropriete().getTrigramme() + " - " + getTitre();
        }
        if (isaPrendreEnCompte()) {
            s = "<b>" + s + "</b>";
        }
        return "<html>" + s ;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the modeAffichage
     */
    public int getModeAffichage() {
        return modeAffichage;
    }

    /**
     * @param modeAffichage the modeAffichage to set
     */
    public void setModeAffichage(int modeAffichage) {
        this.modeAffichage = modeAffichage;
    }

   

    

}
