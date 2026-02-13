/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeEnvoi {

    COURRIER_SUIVI,
    R_A_R,
    COLIS,
    RECUPERATION_BUREAU;

    @Override
    public String toString() {
        switch (this) {
            case COURRIER_SUIVI -> {
                return "Courrier Suivi";
            }
            case R_A_R -> {
                return "Recommandé AR";
            }
            case COLIS -> {
                return "Colis";
            }
            case RECUPERATION_BUREAU -> {
                return "Récupération au Bureau";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
