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
public enum TypeReunion {
    reunion_cs,
    visite_technique;

    @Override
    public String toString() {
        switch (this) {
            case reunion_cs -> {
                return "Réunion de Conseil Syndical";
            }
            case visite_technique -> {
                return "Visite Technique";
            }
        }
        throw new RuntimeException("Invalid value for this");
    }
    
    
}
