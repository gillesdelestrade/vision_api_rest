/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum MotifClotureSinistre {

    SANS_SUITE,
    DEDOMMAGE,
    CONVENTION_IRSI;

    @Override
    public String toString() {
        switch (this) {
            case SANS_SUITE -> {
                return "Classé sans suite";
            }
            case DEDOMMAGE -> {
                return "Dédommagé";
            }
            case CONVENTION_IRSI -> {
                return "Convention IRSI";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
