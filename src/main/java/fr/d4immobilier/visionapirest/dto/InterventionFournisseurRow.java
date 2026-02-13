package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;
import java.time.LocalDateTime;

public class InterventionFournisseurRow {

    private final Long id;
    private final String objet;
    private final Long fournisseurId;
    private final String fournisseurRaisonSociale;
    private final Instant dateCreationDemande;

    public InterventionFournisseurRow(Long id, String objet, Long fournisseurId,
                                      String fournisseurRaisonSociale,
                                      Instant dateCreationDemande) {
        this.id = id;
        this.objet = objet;
        this.fournisseurId = fournisseurId;
        this.fournisseurRaisonSociale = fournisseurRaisonSociale;
        this.dateCreationDemande = dateCreationDemande;
    }

    public Long id() { return id; }
    public String objet() { return objet; }
    public Long fournisseurId() { return fournisseurId; }
    public String fournisseurRaisonSociale() { return fournisseurRaisonSociale; }
    public Instant dateCreationDemande() { return dateCreationDemande; }
}