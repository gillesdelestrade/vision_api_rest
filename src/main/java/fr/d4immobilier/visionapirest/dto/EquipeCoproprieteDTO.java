// EquipeCoproprieteDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record EquipeCoproprieteDTO(
    CoproprieteSimpleDTO copropriete,
    List<MembreEquipeDTO> membres
) {}