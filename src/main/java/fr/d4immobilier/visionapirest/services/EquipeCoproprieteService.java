// EquipeCoproprieteService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class EquipeCoproprieteService {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public EquipeCoproprieteDTO findEquipe(Long coproprieteId) {

        List<Object[]> rows = em.createNativeQuery("""
            SELECT c.id, c.trigramme, c.nom,
                   g1.nom, g1.prenom, g1.mail1,
                   g2.nom, g2.prenom, g2.mail1,
                   co.nom, co.prenom, co.mail1
            FROM Copropriete c
            LEFT JOIN Personne g1 ON c.gestionnaire_id = g1.id
            LEFT JOIN Personne g2 ON c.gestionnaireSedentaire_id = g2.id
            LEFT JOIN Personne co ON c.comptable_id = co.id
            WHERE c.id = :coproprieteId
            """)
            .setParameter("coproprieteId", coproprieteId)
            .getResultList();

        if (rows.isEmpty()) return null;

        Object[] row = rows.get(0);

        CoproprieteSimpleDTO copropriete = new CoproprieteSimpleDTO(
            ((Number) row[0]).longValue(),
            (String) row[1],
            (String) row[2]
        );

        List<MembreEquipeDTO> membres = new ArrayList<>();

        // Gestionnaire principal
        if (row[3] != null) {
            String nom = (String) row[3];
            String prenom = (String) row[4];
            String email = (String) row[5];
            membres.add(new MembreEquipeDTO("gestionnaire1", "Gestionnaire principal",
                buildTrigramme(prenom, nom), nom, prenom, email));
        }

        // Gestionnaire secondaire
        if (row[6] != null) {
            String nom = (String) row[6];
            String prenom = (String) row[7];
            String email = (String) row[8];
            membres.add(new MembreEquipeDTO("gestionnaire2", "Gestionnaire secondaire",
                buildTrigramme(prenom, nom), nom, prenom, email));
        }

        // Comptable
        if (row[9] != null) {
            String nom = (String) row[9];
            String prenom = (String) row[10];
            String email = (String) row[11];
            membres.add(new MembreEquipeDTO("comptable", "Comptable",
                buildTrigramme(prenom, nom), nom, prenom, email));
        }

        return new EquipeCoproprieteDTO(copropriete, membres);
    }

    private String buildTrigramme(String prenom, String nom) {
        String initPrenom = (prenom != null && !prenom.isEmpty()) ? prenom.substring(0, 1).toUpperCase() : "";
        String initNom = (nom != null && !nom.isEmpty()) ? nom.substring(0, 1).toUpperCase() : "";
        return initPrenom + initNom;
    }
}