package fr.d4immobilier.visionapirest.dto;

import java.math.BigDecimal;
import java.util.List;

public class FeuillePresenceDTO {
    
    private int totalCoproprietaires;
    private int totalTantiemes;
    private List<CoproprietairePresenceDTO> coproprietaires;
    
    // ---- Inner DTO : Copropriétaire ----
    public static class CoproprietairePresenceDTO {
        private Long id;
        private String nom;
        private String titre; // M., Mme, etc. (uniquement pour les personnes)
        private String type; // PERSONNE, SOCIETE, COPROPRIETE
        private AdressePresenceDTO adresse;
        private List<LotTantiemeDTO> lots;
        private int totalTantiemes;
        
        public CoproprietairePresenceDTO() {}
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }
        public String getTitre() { return titre; }
        public void setTitre(String titre) { this.titre = titre; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public AdressePresenceDTO getAdresse() { return adresse; }
        public void setAdresse(AdressePresenceDTO adresse) { this.adresse = adresse; }
        public List<LotTantiemeDTO> getLots() { return lots; }
        public void setLots(List<LotTantiemeDTO> lots) { this.lots = lots; }
        public int getTotalTantiemes() { return totalTantiemes; }
        public void setTotalTantiemes(int totalTantiemes) { this.totalTantiemes = totalTantiemes; }
    }
    
    // ---- Inner DTO : Adresse ----
    public static class AdressePresenceDTO {
        private String numeroDansLaVoie;
        private String typeDeVoie;
        private String voie;
        private String complementAdresse;
        private String codePostal;
        private String ville;
        
        public AdressePresenceDTO() {}
        
        public String getNumeroDansLaVoie() { return numeroDansLaVoie; }
        public void setNumeroDansLaVoie(String numeroDansLaVoie) { this.numeroDansLaVoie = numeroDansLaVoie; }
        public String getTypeDeVoie() { return typeDeVoie; }
        public void setTypeDeVoie(String typeDeVoie) { this.typeDeVoie = typeDeVoie; }
        public String getVoie() { return voie; }
        public void setVoie(String voie) { this.voie = voie; }
        public String getComplementAdresse() { return complementAdresse; }
        public void setComplementAdresse(String complementAdresse) { this.complementAdresse = complementAdresse; }
        public String getCodePostal() { return codePostal; }
        public void setCodePostal(String codePostal) { this.codePostal = codePostal; }
        public String getVille() { return ville; }
        public void setVille(String ville) { this.ville = ville; }
    }
    
    // ---- Inner DTO : Lot + Tantièmes ----
    public static class LotTantiemeDTO {
        private Long id;
        private String nature;
        private String numeroDeLot;
        private int tantiemesGeneraux;
        
        public LotTantiemeDTO() {}
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNature() { return nature; }
        public void setNature(String nature) { this.nature = nature; }
        public String getNumeroDeLot() { return numeroDeLot; }
        public void setNumeroDeLot(String numeroDeLot) { this.numeroDeLot = numeroDeLot; }
        public int getTantiemesGeneraux() { return tantiemesGeneraux; }
        public void setTantiemesGeneraux(int tantiemesGeneraux) { this.tantiemesGeneraux = tantiemesGeneraux; }
    }
    
    // Getters et Setters principaux
    public FeuillePresenceDTO() {}
    
    public int getTotalCoproprietaires() { return totalCoproprietaires; }
    public void setTotalCoproprietaires(int totalCoproprietaires) { this.totalCoproprietaires = totalCoproprietaires; }
    public int getTotalTantiemes() { return totalTantiemes; }
    public void setTotalTantiemes(int totalTantiemes) { this.totalTantiemes = totalTantiemes; }
    public List<CoproprietairePresenceDTO> getCoproprietaires() { return coproprietaires; }
    public void setCoproprietaires(List<CoproprietairePresenceDTO> coproprietaires) { this.coproprietaires = coproprietaires; }
}