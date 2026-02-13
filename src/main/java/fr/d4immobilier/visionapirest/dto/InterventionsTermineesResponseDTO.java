/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.dto;

/**
 *
 * @author gillesdelestrade
 */

import java.util.List;

public record InterventionsTermineesResponseDTO(
        Long coproprieteId,
        List<InterventionsParFournisseurDTO> groupes
) {
}