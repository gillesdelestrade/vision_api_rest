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
public enum TypeMoyenAcces {
    TELECOMMANDE,
    VIGIK;
    
    @Override    
    public String toString() {
        switch (this) {
            case TELECOMMANDE -> {
                return "Télécommande";
            }
            case VIGIK -> {            
                return "Vigik";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
}
