package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CoproprieteDTO {

    private Long id;
    private String nom;
    private int tantiemes;
    private String typeCopropriete; // Enum converti en String
    private String trigramme;
    private String statutCopropriete; // Enum converti en String
    private String identifiantICS;
    private String numeroSiret;
    private String tantiemesLocauxHabitation;
    private LocalDate dateDebutMandat;
    private String numeroImmatriculation;
    private Boolean comptabiliteEnCoursDeSaisie;
    private Integer nombreDeVisitesVendues;
    private Integer nombreCSJourneeSurPlaceVendus;
    private Integer nombreCSSoireeSurPlaceVendus;
    private Integer nombreCSJourneeD4Vendus;
    private Integer nombreCSSoireeD4Vendus;
    private Integer nombreDeLotsVendus;
    private Boolean heureAGEnJournee;
    private Boolean lieuAGD4;
    private Integer dureeAGVendue;
    private Integer nombreCSJourneeSurPlaceReels;
    private Integer nombreCSSoireeSurPlaceReels;
    private Integer gerabilite;
    private Integer moisClotureExercice;
    private Long adresseId;
    private Long gestionnaireId;
    private Long gestionnaireSedentaireId;
    private Long comptableId;
    private Long conseilSyndicalId;
    private Long syndicId;

    private String gestionnaireInitiales;
    private String gestionnaireSedentaireInitiales;
    private String comptableInitiales;

    // Constructeur
    public CoproprieteDTO() {
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTantiemes() {
        return tantiemes;
    }

    public void setTantiemes(int tantiemes) {
        this.tantiemes = tantiemes;
    }

    public String getTypeCopropriete() {
        return typeCopropriete;
    }

    public void setTypeCopropriete(String typeCopropriete) {
        this.typeCopropriete = typeCopropriete;
    }

    public String getTrigramme() {
        return trigramme;
    }

    public void setTrigramme(String trigramme) {
        this.trigramme = trigramme;
    }

    public String getStatutCopropriete() {
        return statutCopropriete;
    }

    public void setStatutCopropriete(String statutCopropriete) {
        this.statutCopropriete = statutCopropriete;
    }

    public String getIdentifiantICS() {
        return identifiantICS;
    }

    public void setIdentifiantICS(String identifiantICS) {
        this.identifiantICS = identifiantICS;
    }

    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public String getTantiemesLocauxHabitation() {
        return tantiemesLocauxHabitation;
    }

    public void setTantiemesLocauxHabitation(String tantiemesLocauxHabitation) {
        this.tantiemesLocauxHabitation = tantiemesLocauxHabitation;
    }

    public LocalDate getDateDebutMandat() {
        return dateDebutMandat;
    }

    public void setDateDebutMandat(LocalDate dateDebutMandat) {
        this.dateDebutMandat = dateDebutMandat;
    }

    public String getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public Boolean getComptabiliteEnCoursDeSaisie() {
        return comptabiliteEnCoursDeSaisie;
    }

    public void setComptabiliteEnCoursDeSaisie(Boolean comptabiliteEnCoursDeSaisie) {
        this.comptabiliteEnCoursDeSaisie = comptabiliteEnCoursDeSaisie;
    }

    public Integer getNombreDeVisitesVendues() {
        return nombreDeVisitesVendues;
    }

    public void setNombreDeVisitesVendues(Integer nombreDeVisitesVendues) {
        this.nombreDeVisitesVendues = nombreDeVisitesVendues;
    }

    public Integer getNombreCSJourneeSurPlaceVendus() {
        return nombreCSJourneeSurPlaceVendus;
    }

    public void setNombreCSJourneeSurPlaceVendus(Integer nombreCSJourneeSurPlaceVendus) {
        this.nombreCSJourneeSurPlaceVendus = nombreCSJourneeSurPlaceVendus;
    }

    public Integer getNombreCSSoireeSurPlaceVendus() {
        return nombreCSSoireeSurPlaceVendus;
    }

    public void setNombreCSSoireeSurPlaceVendus(Integer nombreCSSoireeSurPlaceVendus) {
        this.nombreCSSoireeSurPlaceVendus = nombreCSSoireeSurPlaceVendus;
    }

    public Integer getNombreCSJourneeD4Vendus() {
        return nombreCSJourneeD4Vendus;
    }

    public void setNombreCSJourneeD4Vendus(Integer nombreCSJourneeD4Vendus) {
        this.nombreCSJourneeD4Vendus = nombreCSJourneeD4Vendus;
    }

    public Integer getNombreCSSoireeD4Vendus() {
        return nombreCSSoireeD4Vendus;
    }

    public void setNombreCSSoireeD4Vendus(Integer nombreCSSoireeD4Vendus) {
        this.nombreCSSoireeD4Vendus = nombreCSSoireeD4Vendus;
    }

    public Integer getNombreDeLotsVendus() {
        return nombreDeLotsVendus;
    }

    public void setNombreDeLotsVendus(Integer nombreDeLotsVendus) {
        this.nombreDeLotsVendus = nombreDeLotsVendus;
    }

    public Boolean getHeureAGEnJournee() {
        return heureAGEnJournee;
    }

    public void setHeureAGEnJournee(Boolean heureAGEnJournee) {
        this.heureAGEnJournee = heureAGEnJournee;
    }

    public Boolean getLieuAGD4() {
        return lieuAGD4;
    }

    public void setLieuAGD4(Boolean lieuAGD4) {
        this.lieuAGD4 = lieuAGD4;
    }

    public Integer getDureeAGVendue() {
        return dureeAGVendue;
    }

    public void setDureeAGVendue(Integer dureeAGVendue) {
        this.dureeAGVendue = dureeAGVendue;
    }

    public Integer getNombreCSJourneeSurPlaceReels() {
        return nombreCSJourneeSurPlaceReels;
    }

    public void setNombreCSJourneeSurPlaceReels(Integer nombreCSJourneeSurPlaceReels) {
        this.nombreCSJourneeSurPlaceReels = nombreCSJourneeSurPlaceReels;
    }

    public Integer getNombreCSSoireeSurPlaceReels() {
        return nombreCSSoireeSurPlaceReels;
    }

    public void setNombreCSSoireeSurPlaceReels(Integer nombreCSSoireeSurPlaceReels) {
        this.nombreCSSoireeSurPlaceReels = nombreCSSoireeSurPlaceReels;
    }

    public Integer getGerabilite() {
        return gerabilite;
    }

    public void setGerabilite(Integer gerabilite) {
        this.gerabilite = gerabilite;
    }

    public Integer getMoisClotureExercice() {
        return moisClotureExercice;
    }

    public void setMoisClotureExercice(Integer moisClotureExercice) {
        this.moisClotureExercice = moisClotureExercice;
    }

    public Long getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public Long getGestionnaireId() {
        return gestionnaireId;
    }

    public void setGestionnaireId(Long gestionnaireId) {
        this.gestionnaireId = gestionnaireId;
    }

    public Long getGestionnaireSedentaireId() {
        return gestionnaireSedentaireId;
    }

    public void setGestionnaireSedentaireId(Long gestionnaireSedentaireId) {
        this.gestionnaireSedentaireId = gestionnaireSedentaireId;
    }

    public Long getComptableId() {
        return comptableId;
    }

    public void setComptableId(Long comptableId) {
        this.comptableId = comptableId;
    }

    public Long getConseilSyndicalId() {
        return conseilSyndicalId;
    }

    public void setConseilSyndicalId(Long conseilSyndicalId) {
        this.conseilSyndicalId = conseilSyndicalId;
    }

    public Long getSyndicId() {
        return syndicId;
    }

    public void setSyndicId(Long syndicId) {
        this.syndicId = syndicId;
    }

    public String getGestionnaireInitiales() {
        return gestionnaireInitiales;
    }

    public void setGestionnaireInitiales(String gestionnaireInitiales) {
        this.gestionnaireInitiales = gestionnaireInitiales;
    }

    public String getGestionnaireSedentaireInitiales() {
        return gestionnaireSedentaireInitiales;
    }

    public void setGestionnaireSedentaireInitiales(String gestionnaireSedentaireInitiales) {
        this.gestionnaireSedentaireInitiales = gestionnaireSedentaireInitiales;
    }

    public String getComptableInitiales() {
        return comptableInitiales;
    }

    public void setComptableInitiales(String comptableInitiales) {
        this.comptableInitiales = comptableInitiales;
    }
}
