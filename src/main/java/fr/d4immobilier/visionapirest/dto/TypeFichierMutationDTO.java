/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record TypeFichierMutationDTO(
    String type,
    String libelle,
    List<FichierMutationInfoDTO> fichiers,
    List<PvagInfoDTO> pvags
) {}
