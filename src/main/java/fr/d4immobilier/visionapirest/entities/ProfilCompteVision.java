/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum ProfilCompteVision {
    ADMINISTRATEUR,
    GESTIONNAIRE,
    ADMINISTRATIF,
    COPROPRIETAIRE,
    FOURNISSEUR,
    CONCIERGE;
    
    public boolean hasTheRightTo(GestionnaireFonctionnalites gf) {
        return true;
    }


}
