/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum MoyenDePaiement {

    cheque,
    virement,
    prelevement,
    tip;

    @Override
    public String toString() {
        switch (this) {
            case cheque:
                return "Chèque";
            case virement:
                return "Virement";
            case prelevement:
                return "Prélèvement";
            case tip:
                return "TIP";

        }
        throw new RuntimeException("Invalid value for this");
    }
}
