package fr.d4immobilier.visionapirest.dto;
import java.util.List;

// dto/ConseilSyndicalDTO.java
public record ConseilSyndicalDTO(
        Long id,
        MembreConseilDTO president,
        List<MembreConseilDTO> membres
        ) {

    public record MembreConseilDTO(
            Long id,
            String nom,
            String type,
            List<BatimentDTO> batiments
            ) {

    }

    public record BatimentDTO(
            Long id,
            String nom
            ) {

    }
}
