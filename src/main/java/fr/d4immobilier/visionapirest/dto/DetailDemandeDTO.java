package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public class DetailDemandeDTO {

    private Long id;
    private String description;
    private String dateConstat;

    // Copropriété
    private CoproprieteRefDTO copropriete;

    // Personnes
    private PersonneRefDTO attributaire;
    private PersonneRefDTO emetteur;

    // Equipement + Bâtiment
    private EquipementRefDTO equipement;
    private BatimentRefDTO batiment;

    // Actions liées
    private List<ActionDemandeDTO> actions;

    // Historique (événements + fichiers fusionnés, triés desc)
    private List<ElementHistoriqueDTO> elementsHistorique;

    // Interventions (demandes d'intervention)
    private List<InterventionDemandeDTO> demandesIntervention;

    // Étiquettes
    private List<EtiquetteDTO> etiquettes;

    // Kanban
    private EtatKanbanDTO etatKanbanEnCours;
    private List<EtatKanbanDTO> etatsKanban;

    // Flags
    private int niveauConfidentialite;    // 0=copro, 1=CS, 2=privé
    private boolean urgent;
    private boolean suiviCS;
    private boolean aSurveiller;

    // Permissions (dépendent du user connecté)
    private boolean peutChangerConfidentialite;
    private boolean peutChangerUrgence;
    private boolean peutChangerSuiviCS;
    private boolean peutChangerASurveiller;

    // ---- Getters / Setters ----

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String d) { this.description = d; }
    public String getDateConstat() { return dateConstat; }
    public void setDateConstat(String d) { this.dateConstat = d; }
    public CoproprieteRefDTO getCopropriete() { return copropriete; }
    public void setCopropriete(CoproprieteRefDTO c) { this.copropriete = c; }
    public PersonneRefDTO getAttributaire() { return attributaire; }
    public void setAttributaire(PersonneRefDTO a) { this.attributaire = a; }
    public PersonneRefDTO getEmetteur() { return emetteur; }
    public void setEmetteur(PersonneRefDTO e) { this.emetteur = e; }
    public EquipementRefDTO getEquipement() { return equipement; }
    public void setEquipement(EquipementRefDTO e) { this.equipement = e; }
    public BatimentRefDTO getBatiment() { return batiment; }
    public void setBatiment(BatimentRefDTO b) { this.batiment = b; }
    public List<ActionDemandeDTO> getActions() { return actions; }
    public void setActions(List<ActionDemandeDTO> a) { this.actions = a; }
    public List<ElementHistoriqueDTO> getElementsHistorique() { return elementsHistorique; }
    public void setElementsHistorique(List<ElementHistoriqueDTO> e) { this.elementsHistorique = e; }
    public List<InterventionDemandeDTO> getDemandesIntervention() { return demandesIntervention; }
    public void setDemandesIntervention(List<InterventionDemandeDTO> d) { this.demandesIntervention = d; }
    public List<EtiquetteDTO> getEtiquettes() { return etiquettes; }
    public void setEtiquettes(List<EtiquetteDTO> e) { this.etiquettes = e; }
    public EtatKanbanDTO getEtatKanbanEnCours() { return etatKanbanEnCours; }
    public void setEtatKanbanEnCours(EtatKanbanDTO e) { this.etatKanbanEnCours = e; }
    public List<EtatKanbanDTO> getEtatsKanban() { return etatsKanban; }
    public void setEtatsKanban(List<EtatKanbanDTO> e) { this.etatsKanban = e; }
    public int getNiveauConfidentialite() { return niveauConfidentialite; }
    public void setNiveauConfidentialite(int n) { this.niveauConfidentialite = n; }
    public boolean isUrgent() { return urgent; }
    public void setUrgent(boolean u) { this.urgent = u; }
    public boolean isSuiviCS() { return suiviCS; }
    public void setSuiviCS(boolean s) { this.suiviCS = s; }
    public boolean isASurveiller() { return aSurveiller; }
    public void setASurveiller(boolean a) { this.aSurveiller = a; }
    public boolean isPeutChangerConfidentialite() { return peutChangerConfidentialite; }
    public void setPeutChangerConfidentialite(boolean p) { this.peutChangerConfidentialite = p; }
    public boolean isPeutChangerUrgence() { return peutChangerUrgence; }
    public void setPeutChangerUrgence(boolean p) { this.peutChangerUrgence = p; }
    public boolean isPeutChangerSuiviCS() { return peutChangerSuiviCS; }
    public void setPeutChangerSuiviCS(boolean p) { this.peutChangerSuiviCS = p; }
    public boolean isPeutChangerASurveiller() { return peutChangerASurveiller; }
    public void setPeutChangerASurveiller(boolean p) { this.peutChangerASurveiller = p; }

    // ===========================
    //  INNER DTOs
    // ===========================

    public static class CoproprieteRefDTO {
        private Long id;
        private String trigramme;
        private String nom;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getTrigramme() { return trigramme; }
        public void setTrigramme(String t) { this.trigramme = t; }
        public String getNom() { return nom; }
        public void setNom(String n) { this.nom = n; }
    }

    public static class PersonneRefDTO {
        private Long id;
        private String nom;
        private String prenom;
        private String mail;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNom() { return nom; }
        public void setNom(String n) { this.nom = n; }
        public String getPrenom() { return prenom; }
        public void setPrenom(String p) { this.prenom = p; }
        public String getMail() { return mail; }
        public void setMail(String m) { this.mail = m; }
    }

    public static class EquipementRefDTO {
        private Long id;
        private String libelle;
        private String typeEquipement;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
        public String getTypeEquipement() { return typeEquipement; }
        public void setTypeEquipement(String t) { this.typeEquipement = t; }
    }

    public static class BatimentRefDTO {
        private Long id;
        private String libelle;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
    }

    public static class ActionDemandeDTO {
        private Long id;
        private String libelle;
        private String dateCreation;
        private String dateRealisation;
        private String datePrevue;
        private String urgence;
        private String importance;
        private PersonneRefDTO emetteur;
        private PersonneRefDTO executeur;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
        public String getDateCreation() { return dateCreation; }
        public void setDateCreation(String d) { this.dateCreation = d; }
        public String getDateRealisation() { return dateRealisation; }
        public void setDateRealisation(String d) { this.dateRealisation = d; }
        public String getDatePrevue() { return datePrevue; }
        public void setDatePrevue(String d) { this.datePrevue = d; }
        public String getUrgence() { return urgence; }
        public void setUrgence(String u) { this.urgence = u; }
        public String getImportance() { return importance; }
        public void setImportance(String i) { this.importance = i; }
        public PersonneRefDTO getEmetteur() { return emetteur; }
        public void setEmetteur(PersonneRefDTO e) { this.emetteur = e; }
        public PersonneRefDTO getExecuteur() { return executeur; }
        public void setExecuteur(PersonneRefDTO e) { this.executeur = e; }
    }

    public static class ElementHistoriqueDTO {
        private Long id;
        private String date;
        private String texte;
        private int typePersonne;  // 0=gestionnaire, 1=emetteur, 2=autre
        private PersonneRefDTO auteur;
        private FichierDTO fichier;
        private Long idDI;         // lien vers InterventionDemande
        private Long idDDF;        // lien vers DemandeDevisFournisseur
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getDate() { return date; }
        public void setDate(String d) { this.date = d; }
        public String getTexte() { return texte; }
        public void setTexte(String t) { this.texte = t; }
        public int getTypePersonne() { return typePersonne; }
        public void setTypePersonne(int t) { this.typePersonne = t; }
        public PersonneRefDTO getAuteur() { return auteur; }
        public void setAuteur(PersonneRefDTO a) { this.auteur = a; }
        public FichierDTO getFichier() { return fichier; }
        public void setFichier(FichierDTO f) { this.fichier = f; }
        public Long getIdDI() { return idDI; }
        public void setIdDI(Long i) { this.idDI = i; }
        public Long getIdDDF() { return idDDF; }
        public void setIdDDF(Long i) { this.idDDF = i; }
    }

    public static class FichierDTO {
        private Long id;
        private String nomFichier;
        private String nomStockage;
        private String miniature;
        private String lien;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNomFichier() { return nomFichier; }
        public void setNomFichier(String n) { this.nomFichier = n; }
        public String getNomStockage() { return nomStockage; }
        public void setNomStockage(String n) { this.nomStockage = n; }
        public String getMiniature() { return miniature; }
        public void setMiniature(String m) { this.miniature = m; }
        public String getLien() { return lien; }
        public void setLien(String l) { this.lien = l; }
    }

    public static class InterventionDemandeDTO {
        private Long id;
        private String fournisseur;
        private String objet;
        private String reference;
        private String dateCreation;
        private String dateAnnulation;
        private String dateInterventionRealisee;
        private String datePriseEnCompte;
        private String plageInterventionPrevue;
        private String dateRappel;
        private FichierDTO fichierDemande;
        private FactureDTO facture;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getFournisseur() { return fournisseur; }
        public void setFournisseur(String f) { this.fournisseur = f; }
        public String getObjet() { return objet; }
        public void setObjet(String o) { this.objet = o; }
        public String getReference() { return reference; }
        public void setReference(String r) { this.reference = r; }
        public String getDateCreation() { return dateCreation; }
        public void setDateCreation(String d) { this.dateCreation = d; }
        public String getDateAnnulation() { return dateAnnulation; }
        public void setDateAnnulation(String d) { this.dateAnnulation = d; }
        public String getDateInterventionRealisee() { return dateInterventionRealisee; }
        public void setDateInterventionRealisee(String d) { this.dateInterventionRealisee = d; }
        public String getDatePriseEnCompte() { return datePriseEnCompte; }
        public void setDatePriseEnCompte(String d) { this.datePriseEnCompte = d; }
        public String getPlageInterventionPrevue() { return plageInterventionPrevue; }
        public void setPlageInterventionPrevue(String p) { this.plageInterventionPrevue = p; }
        public String getDateRappel() { return dateRappel; }
        public void setDateRappel(String d) { this.dateRappel = d; }
        public FichierDTO getFichierDemande() { return fichierDemande; }
        public void setFichierDemande(FichierDTO f) { this.fichierDemande = f; }
        public FactureDTO getFacture() { return facture; }
        public void setFacture(FactureDTO f) { this.facture = f; }
    }

    public static class FactureDTO {
        private Long id;
        private String reference;
        private String dateFacture;
        private Float montant;
        private String dateReception;
        private String fournisseur;
        private FichierDTO fichier;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getReference() { return reference; }
        public void setReference(String r) { this.reference = r; }
        public String getDateFacture() { return dateFacture; }
        public void setDateFacture(String d) { this.dateFacture = d; }
        public Float getMontant() { return montant; }
        public void setMontant(Float m) { this.montant = m; }
        public String getDateReception() { return dateReception; }
        public void setDateReception(String d) { this.dateReception = d; }
        public String getFournisseur() { return fournisseur; }
        public void setFournisseur(String f) { this.fournisseur = f; }
        public FichierDTO getFichier() { return fichier; }
        public void setFichier(FichierDTO f) { this.fichier = f; }
    }

    public static class EtiquetteDTO {
        private Long id;
        private String libelle;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
    }

    public static class EtatKanbanDTO {
        private Long id;
        private String libelle;
        private String dataField;
        private int numeroOrdre;
        private String couleur; // hex
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
        public String getDataField() { return dataField; }
        public void setDataField(String d) { this.dataField = d; }
        public int getNumeroOrdre() { return numeroOrdre; }
        public void setNumeroOrdre(int n) { this.numeroOrdre = n; }
        public String getCouleur() { return couleur; }
        public void setCouleur(String c) { this.couleur = c; }
    }
}
