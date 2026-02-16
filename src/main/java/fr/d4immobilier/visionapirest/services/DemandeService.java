// DemandeService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.CommentaireDemandeResponseDTO;
import fr.d4immobilier.visionapirest.dto.DemandeOptionsDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.EvenementDemande;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class DemandeService {

    @PersistenceContext
    private EntityManager em;

    public void updateOptions(Long demandeId, DemandeOptionsDTO options, Long auteurId) {
        Demande demande = em.find(Demande.class, demandeId);
        if (demande == null) {
            throw new jakarta.ws.rs.NotFoundException("Demande non trouvée: " + demandeId);
        }

        Personne auteur = em.find(Personne.class, auteurId);

        List<String> changements = new ArrayList<>();

        if (options.epingle() != null && !options.epingle().equals(demande.getEpingle())) {
            changements.add(options.epingle() ? "Épinglée" : "Désépinglée");
            demande.setEpingle(options.epingle());
        }

        if (options.suiviCS() != null && !options.suiviCS().equals(demande.getSuiviCS())) {
            changements.add(options.suiviCS() ? "Suivi CS activé" : "Suivi CS désactivé");
            demande.setSuiviCS(options.suiviCS());
        }

        if (options.dossierPermanent() != null && !options.dossierPermanent().equals(demande.getDossierPermanent())) {
            changements.add(options.dossierPermanent() ? "Marquée comme dossier permanent" : "Retirée des dossiers permanents");
            demande.setDossierPermanent(options.dossierPermanent());
        }

        if (options.direct() != null && !options.direct().equals(demande.getDirect())) {
            changements.add(options.direct() ? "Marquée comme directe" : "Retirée des demandes directes");
            demande.setDirect(options.direct());
        }

        if (options.ag() != null && !options.ag().equals(demande.getAg())) {
            changements.add(options.ag() ? "Rattachée à l'AG" : "Détachée de l'AG");
            demande.setAg(options.ag());
        }

        for (String texte : changements) {
            EvenementDemande evt = new EvenementDemande();
            evt.setDemande(demande);
            evt.setDateEvenement(Instant.now());
            evt.setAuteur(auteur);
            evt.setTexte(texte);
            em.persist(evt);
        }
    }

    public CommentaireDemandeResponseDTO ajouterCommentaire(Long demandeId, String texte, Long auteurId) {
        Demande demande = em.find(Demande.class, demandeId);
        if (demande == null) {
            throw new jakarta.ws.rs.NotFoundException("Demande non trouvée: " + demandeId);
        }

        Personne auteur = em.find(Personne.class, auteurId);

        EvenementDemande evt = new EvenementDemande();
        evt.setDemande(demande);
        evt.setDateEvenement(Instant.now());
        evt.setAuteur(auteur);
        evt.setTexte(texte);
        em.persist(evt);
        em.flush();

        String nomAuteur = null;
        if (auteur != null) {
            nomAuteur = ((auteur.getPrenom() != null ? auteur.getPrenom() : "") + " "
                    + (auteur.getNom() != null ? auteur.getNom() : "")).trim();
        }

        return new CommentaireDemandeResponseDTO(evt.getId(), evt.getDateEvenement(), nomAuteur, texte);
    }
}
