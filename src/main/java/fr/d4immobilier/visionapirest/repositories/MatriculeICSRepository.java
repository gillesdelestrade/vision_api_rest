package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.MatriculeICSUrlDTO;
import fr.d4immobilier.visionapirest.entities.MatriculeICS;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Stateless
public class MatriculeICSRepository extends GenericRepository<MatriculeICS, Long> {
    
    @Override
    protected Class<MatriculeICS> getEntityClass() {
        return MatriculeICS.class;
    }
    
    @PersistenceContext
    private EntityManager em;

    public List<MatriculeICSUrlDTO> findByCopropriete(Long idCopropriete) {
        String sql = """
            SELECT m.id, m.matricule, m.login, m.passwd, m.rgpd
            FROM conseilsyndical cs
            INNER JOIN conseilsyndical_personne csp ON cs.id = csp.conseilssyndicaux_id
            INNER JOIN coproprietaire cop ON csp.membres_id = cop.personne_id
            INNER JOIN matriculeics m ON m.coproprietaire_id = cop.id AND m.copropriete_id = :idCopropriete
            WHERE cs.copropriete_id = :idCopropriete
            """;

        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery(sql)
            .setParameter("idCopropriete", idCopropriete)
            .getResultList();

        return rows.stream().map(r -> {
            Long id = ((Number) r[0]).longValue();
            String matricule = (String) r[1];
            String login = (String) r[2];
            String passwd = (String) r[3];
            Integer rgpd = r[4] != null ? ((Number) r[4]).intValue() : null;

            String url = "https://extranet2.ics.fr/login_externe.php?login=%s&mdp=%s&groupe=d4immo&rgpd=%s"
                .formatted(
                    URLEncoder.encode(login, StandardCharsets.UTF_8),
                    URLEncoder.encode(passwd, StandardCharsets.UTF_8),
                    rgpd != null ? rgpd : ""
                );

            return new MatriculeICSUrlDTO(id, matricule, login, rgpd, url);
        }).toList();
    }
}

