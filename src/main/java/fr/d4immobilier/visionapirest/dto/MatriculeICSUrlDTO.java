/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.dto;

public record MatriculeICSUrlDTO(
    Long id,
    String matricule,
    String login,
    Integer rgpd,
    String url
) {}