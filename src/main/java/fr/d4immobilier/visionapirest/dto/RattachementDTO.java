// RattachementDTO.java
package fr.d4immobilier.visionapirest.dto;

public record RattachementDTO(
    String type,
    Long id,
    String reference,
    String resolution
) {}