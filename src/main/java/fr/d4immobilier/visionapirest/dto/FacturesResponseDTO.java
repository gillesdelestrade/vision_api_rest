// FacturesResponseDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record FacturesResponseDTO(
    List<BatimentFacturesDTO> facturesAViser,
    List<BatimentFacturesDTO> facturesViseesAPayer,
    List<AnneeFacturesDTO> facturesPayees,
    List<AnneeFacturesDTO> facturesRejetees
) {}