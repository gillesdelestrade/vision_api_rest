/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum Majorite {

    ARTICLE_24,
    ARTICLE_25,
    ARTICLE_26,
    UNANIMITE,
    ARTICLE_25_1,
    ARTICLE_25_SANS_25_1,
    SANS_OBJET,
    RECAP_RESULTAT,
    ARTICLE_25_PRESENCE_INSUFFISANTE,
    ARTICLE_26_AVEC_PASSERELLE,
    ARTICLE_26_1;

    @Override
    public String toString() {
        switch (this) {
            case ARTICLE_24:
                return "24";
            case ARTICLE_25:
                return "25";
            case ARTICLE_25_1:
                return "25-1";
            case ARTICLE_26:
                return "26";
            case UNANIMITE:
                return "Unanimité";
            case ARTICLE_25_SANS_25_1:
                return "25 sans 25-1";
            case SANS_OBJET:
                return "Sans Objet";
            case RECAP_RESULTAT:
                return "Résultats";
            case ARTICLE_25_PRESENCE_INSUFFISANTE:
                return "25";
            case ARTICLE_26_AVEC_PASSERELLE:
                return "26 (avec passerelle)";
            case ARTICLE_26_1:
                return "26-1";
        }
        throw new RuntimeException("Invalid value for this");
    }
    
    
    public String toStringLong() {
        switch (this) {
            case ARTICLE_24:
                return "Article 24";
            case ARTICLE_25:
                return "Article 25";
            case ARTICLE_25_1:
                return "Article 25-1";
            case ARTICLE_26:
                return "Article 26";
            case UNANIMITE:
                return "Unanimité";
            case ARTICLE_25_SANS_25_1:
                return "Article 25 sans 25-1";
            case SANS_OBJET:
                return "Sans Objet";
            case RECAP_RESULTAT:
                return "Résultats";
            case ARTICLE_25_PRESENCE_INSUFFISANTE:
                return "Article 25";
        }
        throw new RuntimeException("Invalid value for this");
    }

    
}
