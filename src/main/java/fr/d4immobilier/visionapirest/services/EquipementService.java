/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.BatimentEquipementsDTO;
import fr.d4immobilier.visionapirest.dto.EquipementDTO;
import fr.d4immobilier.visionapirest.entities.Equipement;
import fr.d4immobilier.visionapirest.mappers.EquipementMapper;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class EquipementService {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private EquipementMapper equipementMapper;

    public List<BatimentEquipementsDTO> findEquipementsGroupedByBatiment(Long coproprieteId) {
        List<Equipement> equipements = em.createQuery(
                "SELECT e FROM Equipement e "
                + "LEFT JOIN FETCH e.typeEquipement "
                + "LEFT JOIN FETCH e.batiment "
                + "LEFT JOIN FETCH e.fournisseur "
                + "WHERE e.copropriete.id = :id "
                + "ORDER BY e.batiment.libelle ASC, e.typeEquipement.typeEquipement ASC",
                Equipement.class)
                .setParameter("id", coproprieteId)
                .getResultList();

        // Grouper par bâtiment (null → clé spéciale)
        Map<Long, List<Equipement>> grouped = new LinkedHashMap<>();

        // Initialiser le groupe "Général" en premier
        grouped.put(-1L, new ArrayList<>());

        for (Equipement e : equipements) {
            if (e.getBatiment() == null) {
                grouped.get(-1L).add(e);
            } else {
                grouped.computeIfAbsent(e.getBatiment().getId(), k -> new ArrayList<>()).add(e);
            }
        }

        // Construire la liste de DTOs
        List<BatimentEquipementsDTO> result = new ArrayList<>();

        for (Map.Entry<Long, List<Equipement>> entry : grouped.entrySet()) {
            if (entry.getValue().isEmpty()) {
                continue; // skip "Général" si vide
            }
            Long batId = entry.getKey();
            String batLibelle;

            if (batId == -1L) {
                batLibelle = "Général";
            } else {
                batLibelle = entry.getValue().getFirst().getBatiment().getLibelle();
            }

            List<EquipementDTO> dtos = entry.getValue().stream()
                    .map(equipementMapper::toDTO)
                    .toList();

            result.add(new BatimentEquipementsDTO(batId, batLibelle, dtos));
        }

        return result;
    }
}
