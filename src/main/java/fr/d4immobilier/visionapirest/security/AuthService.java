package fr.d4immobilier.visionapirest.security;

import fr.d4immobilier.visionapirest.dto.auth.IdentiteDTO;
import fr.d4immobilier.visionapirest.dto.auth.LoginResponse;
import fr.d4immobilier.visionapirest.dto.auth.LoginStepOneResponse;
import fr.d4immobilier.visionapirest.entities.*;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import org.mindrot.jbcrypt.BCrypt;
import fr.d4immobilier.visionapirest.services.ConseilSyndicalService;
import fr.d4immobilier.visionapirest.dto.auth.CoproprieteCoproprietaireDTO;
import fr.d4immobilier.visionapirest.dto.auth.UserInfoDTO;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class AuthService {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private JwtService jwtService;

    @Inject
    private ConseilSyndicalService conseilSyndicalService;

    /**
 * Étape 1 : Authentifie le compte et retourne les identités disponibles.
 * Si une seule identité, retourne directement null pour stepOne
 * et le LoginResponse final est récupérable via authenticateDirectIfSingle().
 */
public LoginStepOneResponse authenticateStepOne(String login, String password) {
    CompteVision compte = findCompteVisionByLogin(login);
    
    if (compte == null) return null;
    
    if (compte.getActif() == null || !compte.getActif()) return null;
    
    if (!verifyPassword(password, compte.getMotDePasse())) return null;
    
    List<IdentiteDTO> identites = findAllIdentites(compte);
    
    if (identites.isEmpty()) return null;
    
    String sessionToken = jwtService.generateSessionToken(compte.getId());
    
    return new LoginStepOneResponse(sessionToken, identites);
}

    /**
     * Étape 2 : Sélectionne une identité et retourne le token final
     */
    public LoginResponse authenticateStepTwo(String sessionToken, Role role, Long userId) {
        // Valider le token de session
        if (!jwtService.validateToken(sessionToken)) {
            return null;
        }

        // Extraire l'ID du compte depuis le token de session
        Long compteId = jwtService.getCompteIdFromSessionToken(sessionToken);

        // Vérifier que l'identité sélectionnée appartient bien à ce compte
        CompteVision compte = em.find(CompteVision.class, compteId);
        if (compte == null) {
            return null;
        }

        // Créer le token final pour l'identité sélectionnée
        return createLoginResponseForIdentity(compte, role, userId);
    }

    /**
     * Trouve toutes les identités liées à un CompteVision
     */
    private List<IdentiteDTO> findAllIdentites(CompteVision compte) {
        List<IdentiteDTO> identites = new ArrayList<>();

        // Récupérer toutes les Personnes liées à ce compte
        List<Personne> personnes = em.createQuery(
                "SELECT p FROM Personne p WHERE p.compteVision.id = :compteId",
                Personne.class)
                .setParameter("compteId", compte.getId())
                .getResultList();

        // Pour chaque Personne, vérifier si c'est un Gestionnaire ou un CoproprietairePersonne
        for (Personne personne : personnes) {
            // Vérifier si c'est un Gestionnaire
            try {
                Gestionnaire gestionnaire = em.createQuery(
                        "SELECT g FROM Gestionnaire g WHERE g.id = :id",
                        Gestionnaire.class)
                        .setParameter("id", personne.getId())
                        .getSingleResult();

                identites.add(new IdentiteDTO(
                        Role.GESTIONNAIRE,
                        gestionnaire.getId(),
                        gestionnaire.getNom() + " " + gestionnaire.getPrenom() + " (Gestionnaire)",
                        "Gestionnaire"
                ));
                continue; // Pas besoin de chercher CoproprietairePersonne
            } catch (NoResultException e) {
                // Pas un Gestionnaire
            }

            // Vérifier si cette Personne est liée à un CoproprietairePersonne
            try {
                CoproprietairePersonne coproprietairePersonne = em.createQuery(
                        "SELECT cp FROM CoproprietairePersonne cp WHERE cp.personne.id = :personneId",
                        CoproprietairePersonne.class)
                        .setParameter("personneId", personne.getId())
                        .getSingleResult();

                identites.add(new IdentiteDTO(
                        Role.COPROPRIETAIRE,
                        coproprietairePersonne.getId(),
                        personne.getNom() + " " + personne.getPrenom() + " (Copropriétaire)",
                        "CoproprietairePersonne"
                ));
            } catch (NoResultException e) {
                // Pas un CoproprietairePersonne non plus
            }
        }

        // Récupérer toutes les Societes liées à ce compte
        List<Societe> societes = em.createQuery(
                "SELECT s FROM Societe s WHERE s.compteVision.id = :compteId",
                Societe.class)
                .setParameter("compteId", compte.getId())
                .getResultList();

        // Pour chaque Societe, vérifier si c'est un Fournisseur ou un CoproprietaireSociete
        for (Societe societe : societes) {
            // Vérifier si c'est un Fournisseur
            try {
                Fournisseur fournisseur = em.createQuery(
                        "SELECT f FROM Fournisseur f WHERE f.id = :id",
                        Fournisseur.class)
                        .setParameter("id", societe.getId())
                        .getSingleResult();

                identites.add(new IdentiteDTO(
                        Role.FOURNISSEUR,
                        fournisseur.getId(),
                        societe.getRaisonSociale() + " (Fournisseur)",
                        "Fournisseur"
                ));
                continue; // Pas besoin de chercher CoproprietaireSociete
            } catch (NoResultException e) {
                // Pas un Fournisseur
            }

            // Vérifier si cette Societe est liée à un CoproprietaireSociete
            try {
                CoproprietaireSociete coproprietaireSociete = em.createQuery(
                        "SELECT cs FROM CoproprietaireSociete cs WHERE cs.societe.id = :societeId",
                        CoproprietaireSociete.class)
                        .setParameter("societeId", societe.getId())
                        .getSingleResult();

                identites.add(new IdentiteDTO(
                        Role.COPROPRIETAIRE,
                        coproprietaireSociete.getId(),
                        societe.getRaisonSociale() + " (Copropriétaire)",
                        "CoproprietaireSociete"
                ));
            } catch (NoResultException e) {
                // Pas un CoproprietaireSociete non plus
            }
        }

        return identites;
    }

    /**
     * Tente d'authentifier comme CoproprietairePersonne
     */
    private LoginResponse tryAsCoproprietairePersonne(CompteVision compte) {
        try {
            Personne personne = em.createQuery(
                    "SELECT p FROM Personne p WHERE p.compteVision.id = :compteId",
                    Personne.class)
                    .setParameter("compteId", compte.getId())
                    .getSingleResult();

            CoproprietairePersonne coproprietairePersonne = em.createQuery(
                    "SELECT cp FROM CoproprietairePersonne cp WHERE cp.personne.id = :personneId",
                    CoproprietairePersonne.class)
                    .setParameter("personneId", personne.getId())
                    .getSingleResult();

            String token = jwtService.generateToken(
                    coproprietairePersonne.getId(),
                    compte.getLogin(),
                    Role.COPROPRIETAIRE
            );

            UserInfoDTO user = new UserInfoDTO();
            user.setId(coproprietairePersonne.getId());
            user.setNom(personne.getNom());
            user.setPrenom(personne.getPrenom());
            user.setEmail(personne.getMail1());
            user.setRole(Role.COPROPRIETAIRE);
            user.setCoproprietes(findCoproprietesPersonne(coproprietairePersonne.getId(), personne.getId()));

            return new LoginResponse(token, user);
        } catch (NoResultException e) {
            return null;
        }
    }

    /**
     * Tente d'authentifier comme CoproprietaireSociete
     */
    private LoginResponse tryAsCoproprietaireSociete(CompteVision compte) {
        try {
            Societe societe = em.createQuery(
                    "SELECT s FROM Societe s WHERE s.compteVision.id = :compteId",
                    Societe.class)
                    .setParameter("compteId", compte.getId())
                    .getSingleResult();

            CoproprietaireSociete coproprietaireSociete = em.createQuery(
                    "SELECT cs FROM CoproprietaireSociete cs WHERE cs.societe.id = :societeId",
                    CoproprietaireSociete.class)
                    .setParameter("societeId", societe.getId())
                    .getSingleResult();

            String token = jwtService.generateToken(
                    coproprietaireSociete.getId(),
                    compte.getLogin(),
                    Role.COPROPRIETAIRE
            );

            UserInfoDTO user = new UserInfoDTO();
            user.setId(coproprietaireSociete.getId());
            user.setNom(societe.getRaisonSociale());
            user.setPrenom(null);
            user.setEmail(societe.getMail1());
            user.setRole(Role.COPROPRIETAIRE);
            user.setCoproprietes(findCoproprietesSociete(coproprietaireSociete.getId(), societe.getId()));

            return new LoginResponse(token, user);
        } catch (NoResultException e) {
            return null;
        }
    }

    /**
     * Tente d'authentifier comme Gestionnaire
     */
    private LoginResponse tryAsGestionnaire(CompteVision compte) {
        try {
            Gestionnaire gestionnaire = em.createQuery(
                    "SELECT g FROM Gestionnaire g WHERE g.compteVision.id = :compteId",
                    Gestionnaire.class)
                    .setParameter("compteId", compte.getId())
                    .getSingleResult();

            String token = jwtService.generateToken(
                    gestionnaire.getId(),
                    compte.getLogin(),
                    Role.GESTIONNAIRE
            );

            UserInfoDTO user = new UserInfoDTO();
            user.setId(gestionnaire.getId());
            user.setNom(gestionnaire.getNom());
            user.setPrenom(gestionnaire.getPrenom());
            user.setEmail(gestionnaire.getMail1());
            user.setRole(Role.GESTIONNAIRE);
            // Pas de coproprietes pour un gestionnaire

            return new LoginResponse(token, user);
        } catch (NoResultException e) {
            return null;
        }
    }

    /**
     * Tente d'authentifier comme Fournisseur
     */
    private LoginResponse tryAsFournisseur(CompteVision compte) {
        try {
            Fournisseur fournisseur = em.createQuery(
                    "SELECT f FROM Fournisseur f WHERE f.compteVision.id = :compteId",
                    Fournisseur.class)
                    .setParameter("compteId", compte.getId())
                    .getSingleResult();

            String token = jwtService.generateToken(
                    fournisseur.getId(),
                    compte.getLogin(),
                    Role.FOURNISSEUR
            );

            UserInfoDTO user = new UserInfoDTO();
            user.setId(fournisseur.getId());
            user.setNom(fournisseur.getRaisonSociale());
            user.setPrenom(null);
            user.setEmail(fournisseur.getMail1());
            user.setRole(Role.FOURNISSEUR);
            // Pas de coproprietes pour un fournisseur

            return new LoginResponse(token, user);
        } catch (NoResultException e) {
            return null;
        }
    }

    /**
     * Trouve les copropriétés d'un copropriétaire personne via ses lots
     */
    private List<CoproprieteCoproprietaireDTO> findCoproprietesPersonne(Long coproprietaireId, Long personneId) {
        List<Object[]> results = em.createQuery(
                "SELECT DISTINCT c.id, c.nom, c.trigramme, c.identifiantICS "
                + "FROM Lot l "
                + "JOIN l.coproprietaires cp "
                + "JOIN l.copropriete c "
                + "WHERE cp.id = :coproprietaireId "
                + "ORDER BY c.nom",
                Object[].class)
                .setParameter("coproprietaireId", coproprietaireId)
                .getResultList();

        List<CoproprieteCoproprietaireDTO> coproprietes = new ArrayList<>();

        for (Object[] row : results) {
            CoproprieteCoproprietaireDTO dto = new CoproprieteCoproprietaireDTO();
            dto.setId((Long) row[0]);
            dto.setNom((String) row[1]);
            dto.setTrigramme((String) row[2]);
            dto.setIdentifiantICS((String) row[3]);
            dto.setEstMembreConseilSyndical(
                    conseilSyndicalService.estAuConseilSyndical(personneId, (Long) row[0])
            );
            coproprietes.add(dto);
        }

        return coproprietes;
    }

    /**
     * Trouve les copropriétés d'un copropriétaire société via ses lots
     */
    private List<CoproprieteCoproprietaireDTO> findCoproprietesSociete(Long coproprietaireId, Long societeId) {
        List<Object[]> results = em.createQuery(
                "SELECT DISTINCT c.id, c.nom, c.trigramme, c.identifiantICS "
                + "FROM Lot l "
                + "JOIN l.coproprietaires cp "
                + "JOIN l.copropriete c "
                + "WHERE cp.id = :coproprietaireId "
                + "ORDER BY c.nom",
                Object[].class)
                .setParameter("coproprietaireId", coproprietaireId)
                .getResultList();

        List<CoproprieteCoproprietaireDTO> coproprietes = new ArrayList<>();

        for (Object[] row : results) {
            CoproprieteCoproprietaireDTO dto = new CoproprieteCoproprietaireDTO();
            dto.setId((Long) row[0]);
            dto.setNom((String) row[1]);
            dto.setTrigramme((String) row[2]);
            dto.setIdentifiantICS((String) row[3]);
            dto.setEstMembreConseilSyndical(
                    conseilSyndicalService.estAuConseilSyndicalSociete(societeId, (Long) row[0])
            );
            coproprietes.add(dto);
        }

        return coproprietes;
    }

    /**
     * Trouve un CompteVision par login
     */
    private CompteVision findCompteVisionByLogin(String login) {
        try {
            return em.createQuery(
                    "SELECT cv FROM CompteVision cv WHERE cv.login = :login",
                    CompteVision.class)
                    .setParameter("login", login)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    /**
     * Vérifie le mot de passe
     */
    private boolean verifyPassword(String plainPassword, String hashedPassword) {
        if (hashedPassword == null) {
            return false;
        }

        // Si les mots de passe sont déjà hashés avec BCrypt
        if (hashedPassword.startsWith("$2a$") || hashedPassword.startsWith("$2b$")) {
            return BCrypt.checkpw(plainPassword, hashedPassword);
        }

        // TEMPORAIRE : Si les mots de passe sont en clair dans votre DB
        return plainPassword.equals(hashedPassword);
    }

    /**
     * Hash un mot de passe avec BCrypt
     */
    public String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    /**
     * Crée la réponse de login pour une identité spécifique
     */
    private LoginResponse createLoginResponseForIdentity(CompteVision compte, Role role, Long userId) {
        UserInfoDTO user = new UserInfoDTO();
        user.setId(userId);
        user.setRole(role);

        if (role == Role.GESTIONNAIRE) {
            Gestionnaire g = em.find(Gestionnaire.class, userId);
            if (g == null) {
                return null;
            }
            user.setNom(g.getNom());
            user.setPrenom(g.getPrenom());
            user.setEmail(g.getMail1());

        } else if (role == Role.FOURNISSEUR) {
            Fournisseur f = em.find(Fournisseur.class, userId);
            if (f == null) {
                return null;
            }
            user.setNom(f.getRaisonSociale());
            user.setEmail(f.getMail1());

        } else if (role == Role.COPROPRIETAIRE) {
            // Essayer CoproprietairePersonne
            try {
                CoproprietairePersonne cp = em.find(CoproprietairePersonne.class, userId);
                if (cp != null && cp.getPersonne() != null) {
                    user.setNom(cp.getPersonne().getNom());
                    user.setPrenom(cp.getPersonne().getPrenom());
                    user.setEmail(cp.getPersonne().getMail1());
                    user.setCoproprietes(findCoproprietesPersonne(userId, cp.getPersonne().getId()));

                    String token = jwtService.generateToken(userId, compte.getLogin(), role);
                    return new LoginResponse(token, user);
                }
            } catch (Exception e) {
                // Pas un CoproprietairePersonne
            }

            // Essayer CoproprietaireSociete
            try {
                CoproprietaireSociete cs = em.find(CoproprietaireSociete.class, userId);
                if (cs != null && cs.getSociete() != null) {
                    user.setNom(cs.getSociete().getRaisonSociale());
                    user.setEmail(cs.getSociete().getMail1());
                    user.setCoproprietes(findCoproprietesSociete(userId, cs.getSociete().getId()));

                    String token = jwtService.generateToken(userId, compte.getLogin(), role);
                    return new LoginResponse(token, user);
                }
            } catch (Exception e) {
                return null;
            }
        }

        String token = jwtService.generateToken(userId, compte.getLogin(), role);
        return new LoginResponse(token, user);
    }
}
