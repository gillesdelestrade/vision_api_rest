package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.InterventionDemandeDetailDTO;
import fr.d4immobilier.visionapirest.dto.InterventionFournisseurRow;
import fr.d4immobilier.visionapirest.dto.InterventionTermineeDTO;
import fr.d4immobilier.visionapirest.dto.InterventionsParFournisseurDTO;
import fr.d4immobilier.visionapirest.dto.InterventionsTermineesResponseDTO;
import fr.d4immobilier.visionapirest.repositories.InterventionDemandeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class InterventionDemandeService {

    @Inject
    private InterventionDemandeRepository repository;

    public Optional<InterventionDemandeDetailDTO> getDetail(Long id) {
        return repository.findDetailById(id).map(i -> new InterventionDemandeDetailDTO(
                i.getId(),
                i.getObjet(),
                i.getDateCreationDemande().atZone(ZoneId.systemDefault()).toLocalDateTime(),
                i.getReference(),
                i.getLieuIntervention(),

                i.getDemande() != null ? i.getDemande().getId() : null,

                i.getFournisseur() != null ? i.getFournisseur().getId() : null,
                i.getFournisseur() != null ? i.getFournisseur().getRaisonSociale() : null,
                i.getFournisseur() != null ? i.getFournisseur().getMail1() : null,
                i.getFournisseur() != null ? i.getFournisseur().getTelPortable() : null,
                i.getFournisseur() != null ? i.getFournisseur().getTelFixe() : null,

                i.getDevisFournisseur() != null ? i.getDevisFournisseur().getId() : null,
                i.getDevisFournisseur() != null ? i.getDevisFournisseur().getReference() : null,
                i.getDevisFournisseur() != null ? i.getDevisFournisseur().getMontant() : null,
                i.getDevisFournisseur() != null && i.getDevisFournisseur().getFichierDevisFournisseur() != null
                        ? i.getDevisFournisseur().getFichierDevisFournisseur().getNomStockage() : null,

                i.getFichierDemandeIntervention() != null ? i.getFichierDemandeIntervention().getId() : null,
                i.getFichierDemandeIntervention() != null
                        ? i.getFichierDemandeIntervention().getNomStockage() : null,

                i.getDateRappel(),
                i.getPlageInterventionPrevue(),
                i.getDateAnnulation() != null ? i.getDateAnnulation().atStartOfDay() : null,
                i.getDateInterventionRealisee() != null ? i.getDateInterventionRealisee().atStartOfDay() : null,
                i.getDatePriseEnCompteFournisseur() != null ? i.getDatePriseEnCompteFournisseur().atZone(ZoneId.systemDefault()).toLocalDateTime() : null,
                i.getHistorique()
        ));
    }
    
    

    public InterventionsTermineesResponseDTO getTermineesParFournisseur(Long coproprieteId) {

        List<InterventionFournisseurRow> rows = repository.findTermineesByCopropriete(coproprieteId);

        List<InterventionsParFournisseurDTO> groupes = rows.stream()
                .collect(Collectors.groupingBy(
                        InterventionFournisseurRow::fournisseurId,
                        LinkedHashMap::new,
                        Collectors.toList()
                ))
                .entrySet().stream()
                .map(entry -> {
                    InterventionFournisseurRow first = entry.getValue().getFirst();
                    List<InterventionTermineeDTO> interventions = entry.getValue().stream()
                            .map(row -> new InterventionTermineeDTO(
                                    row.id(),
                                    row.objet(),
                                    row.dateCreationDemande()
                            ))
                            .toList();
                    return new InterventionsParFournisseurDTO(
                            first.fournisseurId(),
                            first.fournisseurRaisonSociale(),
                            interventions
                    );
                })
                .toList();

        return new InterventionsTermineesResponseDTO(coproprieteId, groupes);
    }

}