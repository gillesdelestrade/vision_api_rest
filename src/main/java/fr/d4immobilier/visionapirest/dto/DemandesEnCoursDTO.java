package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public class DemandesEnCoursDTO {

    private List<GroupeDemandesDTO> groupesDemandes;

    public DemandesEnCoursDTO() {}
    public List<GroupeDemandesDTO> getGroupesDemandes() { return groupesDemandes; }
    public void setGroupesDemandes(List<GroupeDemandesDTO> g) { this.groupesDemandes = g; }

    // ---- Groupe (famille) : Demandes Courantes / Urgentes / Dossiers Permanents ----
    public static class GroupeDemandesDTO {
        private int id;
        private String libelle;
        private List<PeriodeDTO> periodes;

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String libelle) { this.libelle = libelle; }
        public List<PeriodeDTO> getPeriodes() { return periodes; }
        public void setPeriodes(List<PeriodeDTO> periodes) { this.periodes = periodes; }
    }

    // ---- Période : "Mois en cours", "janvier 2026", etc. ----
    public static class PeriodeDTO {
        private String titre;
        private List<ActionDTO> actions;   // uniquement pour Demandes Courantes
        private List<DemandeDTO> demandes;

        public String getTitre() { return titre; }
        public void setTitre(String titre) { this.titre = titre; }
        public List<ActionDTO> getActions() { return actions; }
        public void setActions(List<ActionDTO> actions) { this.actions = actions; }
        public List<DemandeDTO> getDemandes() { return demandes; }
        public void setDemandes(List<DemandeDTO> demandes) { this.demandes = demandes; }
    }

    // ---- Action ----
    public static class ActionDTO {
        private Long id;
        private String copropriete;
        private String executeurInitiales;
        private Long executeurId;
        private String libelle;
        private boolean pvAG;
        private Long demandeId;
        private boolean directementImplique;
        private NotBeforeDTO notBefore;
        private boolean signaleTermineParCoproprietaire;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getCopropriete() { return copropriete; }
        public void setCopropriete(String c) { this.copropriete = c; }
        public String getExecuteurInitiales() { return executeurInitiales; }
        public void setExecuteurInitiales(String e) { this.executeurInitiales = e; }
        public Long getExecuteurId() { return executeurId; }
        public void setExecuteurId(Long e) { this.executeurId = e; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
        public boolean isPvAG() { return pvAG; }
        public void setPvAG(boolean p) { this.pvAG = p; }
        public Long getDemandeId() { return demandeId; }
        public void setDemandeId(Long d) { this.demandeId = d; }
        public boolean isDirectementImplique() { return directementImplique; }
        public void setDirectementImplique(boolean d) { this.directementImplique = d; }
        public NotBeforeDTO getNotBefore() { return notBefore; }
        public void setNotBefore(NotBeforeDTO n) { this.notBefore = n; }
        public boolean isSignaleTermineParCoproprietaire() { return signaleTermineParCoproprietaire; }
        public void setSignaleTermineParCoproprietaire(boolean s) { this.signaleTermineParCoproprietaire = s; }
    }

    // ---- Demande ----
    public static class DemandeDTO {
        private Long id;
        private String description;
        private String dateConstat;
        private String equipement;
        private Long equipementId;
        private Long attributaireId;
        private String attributaireInitiales;
        private String trigramme;
        private String etatDemande;
        private NotBeforeDTO notBefore;
        private boolean epingle;
        private EmetteurDTO emetteur;
        private BatimentDTO batiment;
        private boolean demandeClotureCoproprietaire;
        private String dansUnKanban;       // couleur hex ou "0"
        private boolean dernierCommPasD4;
        private boolean sinistre;
        private String numero;
        private boolean urgence;
        private boolean suiviCS;
        private boolean ag;
        private boolean procedure;
        private int visibilite;            // 0=coproprietaires, 1=CS, 2=privé

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getDescription() { return description; }
        public void setDescription(String d) { this.description = d; }
        public String getDateConstat() { return dateConstat; }
        public void setDateConstat(String d) { this.dateConstat = d; }
        public String getEquipement() { return equipement; }
        public void setEquipement(String e) { this.equipement = e; }
        public Long getEquipementId() { return equipementId; }
        public void setEquipementId(Long e) { this.equipementId = e; }
        public Long getAttributaireId() { return attributaireId; }
        public void setAttributaireId(Long a) { this.attributaireId = a; }
        public String getAttributaireInitiales() { return attributaireInitiales; }
        public void setAttributaireInitiales(String a) { this.attributaireInitiales = a; }
        public String getTrigramme() { return trigramme; }
        public void setTrigramme(String t) { this.trigramme = t; }
        public String getEtatDemande() { return etatDemande; }
        public void setEtatDemande(String e) { this.etatDemande = e; }
        public NotBeforeDTO getNotBefore() { return notBefore; }
        public void setNotBefore(NotBeforeDTO n) { this.notBefore = n; }
        public boolean isEpingle() { return epingle; }
        public void setEpingle(boolean e) { this.epingle = e; }
        public EmetteurDTO getEmetteur() { return emetteur; }
        public void setEmetteur(EmetteurDTO e) { this.emetteur = e; }
        public BatimentDTO getBatiment() { return batiment; }
        public void setBatiment(BatimentDTO b) { this.batiment = b; }
        public boolean isDemandeClotureCoproprietaire() { return demandeClotureCoproprietaire; }
        public void setDemandeClotureCoproprietaire(boolean d) { this.demandeClotureCoproprietaire = d; }
        public String getDansUnKanban() { return dansUnKanban; }
        public void setDansUnKanban(String d) { this.dansUnKanban = d; }
        public boolean isDernierCommPasD4() { return dernierCommPasD4; }
        public void setDernierCommPasD4(boolean d) { this.dernierCommPasD4 = d; }
        public boolean isSinistre() { return sinistre; }
        public void setSinistre(boolean s) { this.sinistre = s; }
        public String getNumero() { return numero; }
        public void setNumero(String n) { this.numero = n; }
        public boolean isUrgence() { return urgence; }
        public void setUrgence(boolean u) { this.urgence = u; }
        public boolean isSuiviCS() { return suiviCS; }
        public void setSuiviCS(boolean s) { this.suiviCS = s; }
        public boolean isAg() { return ag; }
        public void setAg(boolean a) { this.ag = a; }
        public boolean isProcedure() { return procedure; }
        public void setProcedure(boolean p) { this.procedure = p; }
        public int getVisibilite() { return visibilite; }
        public void setVisibilite(int v) { this.visibilite = v; }
    }

    // ---- NotBefore ----
    public static class NotBeforeDTO {
        private boolean aVenir;
        private String date;
        public boolean isAVenir() { return aVenir; }
        public void setAVenir(boolean a) { this.aVenir = a; }
        public String getDate() { return date; }
        public void setDate(String d) { this.date = d; }
    }

    // ---- Emetteur ----
    public static class EmetteurDTO {
        private Long id;
        private String nom;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }
    }

    // ---- Batiment ----
    public static class BatimentDTO {
        private Long id;
        private String libelle;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getLibelle() { return libelle; }
        public void setLibelle(String l) { this.libelle = l; }
    }
}
