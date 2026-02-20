// CoproprietaireService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.Copropriete;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class CoproprietaireService {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<CoproprietaireByEmailDTO> findByEmail(String email) {
        if (email == null || email.isBlank()) return List.of();

        // 1) Trouver les personnes et sociétés avec cet email
        List<Object[]> rows = em.createNativeQuery("""
            SELECT id, 'Personne' AS type, nom, prenom, mail1
            FROM Personne WHERE mail1 = :email
            UNION
            SELECT id, 'Societe' AS type, raisonSociale, '', mail1
            FROM Societe WHERE mail1 = :email
            """)
            .setParameter("email", email)
            .getResultList();

        if (rows.isEmpty()) return List.of();

        List<CoproprietaireByEmailDTO> result = new ArrayList<>();

        for (Object[] row : rows) {
            Long id = ((Number) row[0]).longValue();
            String type = (String) row[1];
            String nom = (String) row[2];
            String prenom = (String) row[3];
            if (prenom != null && prenom.isEmpty()) prenom = null;

            // 2) Trouver les copropriétés
            String fkColumn = "Personne".equals(type) ? "personne_id" : "societe_id";

            List<Object[]> coproRows = em.createNativeQuery("""
                SELECT DISTINCT c.id, c.nom, c.trigramme
                FROM Coproprietaire cop
                JOIN Lot_Coproprietaire lc ON lc.coproprietaires_id = cop.id
                JOIN Lot l ON lc.lots_id = l.id
                JOIN Copropriete c ON l.copropriete_id = c.id
                WHERE cop.""" + fkColumn + " = :entityId")
                .setParameter("entityId", id)
                .getResultList();

            List<CoproprieteCoproprietaireDTO> coproprietes = new ArrayList<>();
            for (Object[] coproRow : coproRows) {
                Long coproId = ((Number) coproRow[0]).longValue();
                String coproNom = (String) coproRow[1];
                String trigramme = (String) coproRow[2];

                // 3) Récupérer l'adresse
                String adresse = findAdresseCopropriete(coproId);

                coproprietes.add(new CoproprieteCoproprietaireDTO(coproId, trigramme, coproNom, adresse));
            }

            result.add(new CoproprietaireByEmailDTO(id, nom, prenom, email, coproprietes));
        }

        return result;
    }

    private String findAdresseCopropriete(Long coproprieteId) {
        try {
            Adresse adresse = em.createQuery(
                "SELECT c.adresse FROM Copropriete c WHERE c.id = :id", Adresse.class)
                .setParameter("id", coproprieteId)
                .getSingleResult();

            if (adresse == null) return null;

            StringBuilder sb = new StringBuilder();
            sb.append(adresse.getPremiereLigneAdresse());
            if (adresse.getComplementAdresse()!= null) sb.append(", ").append(adresse.getComplementAdresse());
            if (adresse.getCodePostal() != null || adresse.getVille() != null) {
                sb.append(", ");
                if (adresse.getCodePostal() != null) sb.append(adresse.getCodePostal()).append(" ");
                if (adresse.getVille() != null) sb.append(adresse.getVille());
            }
            return sb.toString().trim();
        } catch (Exception e) {
            return null;
        }
    }
}