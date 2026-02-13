// AnneeCourriersDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record AnneeCourriersDTO(
    Integer annee,
    List<CourrierListDTO> courriers
) {}