/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum RetourRecommandeAR {
    ok,
    refuse,
    non_reclame,
    boite_non_identifiable,
    boite_inaccessible,
    anomalie_adresse;

    @Override
    public String toString() {
        switch (this) {
            case ok:
                return "OK";
            case refuse:
                return "Refusé";
            case non_reclame:
                return "Non réclamé";
            case boite_non_identifiable:
                return "Boîte non identifiable";
                case boite_inaccessible:
                return "Boîte inaccessible";
            case anomalie_adresse:
                return "Anomalie adresse";
        }
        throw new RuntimeException("Invalid value for this");
    }
}
