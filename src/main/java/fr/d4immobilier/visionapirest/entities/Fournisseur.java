/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Fournisseur.NQ_GET_ALL_FOURNISSEURS, query = "select f from Fournisseur f order by f.raisonSociale asc"),
    @NamedQuery(name = Fournisseur.NQ_GET_FOURNISSEURS_BY_FRAGMENTNOM, query = "select f from Fournisseur f where lower(f.raisonSociale) like :fragmentNom order by f.raisonSociale asc")
})

public class Fournisseur extends Societe implements Serializable {
    @OneToMany(mappedBy = "avocat", fetch = FetchType.LAZY)
    private List<ComplementProcedure> complementsProcedures;
    @ManyToMany(mappedBy = "fournisseursConsultesEnAttente", fetch = FetchType.LAZY)
    private List<Resolution> resolutions;

    @OneToMany(mappedBy = "fournisseurProvenance", fetch = FetchType.LAZY)
    private List<CourrierEntrant> courriersEntrants;
    @OneToMany(mappedBy = "fournisseur", fetch = FetchType.LAZY)
    private List<DemandeDevisFournisseur> demandeDevisFournisseurs;
    @OneToMany(mappedBy = "fournisseur", fetch = FetchType.LAZY)
    private List<PanierDemandesIntervention> paniersDemandesInterventions;
    @OneToMany(mappedBy = "fournisseur", fetch = FetchType.LAZY)
    private List<ContratFournisseur> contratsFournisseur;
    @OneToMany(mappedBy = "fournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FactureFournisseur> facturesFournisseurs;
    @OneToOne(mappedBy = "fournisseur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CompteEnBanqueFournisseur compteEnBanqueFournisseur;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Metier> metiers;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Copropriete> coproprietesSurLesquellesReferencees;
    @OneToMany(mappedBy = "fournisseur", fetch = FetchType.LAZY)
    private List<InterventionDemande> interventionDemandes;
    public static final transient String NQ_GET_ALL_FOURNISSEURS = "getAllFournisseurs";
    public static final transient String NQ_GET_FOURNISSEURS_BY_FRAGMENTNOM = "getFournisseursByFragmentNom";
    private transient int mode = 0;
    public static transient final int MODE_RAISON_SOCIALE = 0;
    public static transient final int MODE_RAISON_SOCIALE_NUM_TEL = 1;
    private String identifiantICS;
    
    private String permalink;

    /**
     * @return the metiers
     */
    public List<Metier> getMetiers() {
        return metiers;
    }

    /**
     * @param metiers the metiers to set
     */
    public void setMetiers(List<Metier> metiers) {
        this.metiers = metiers;
    }

    /**
     * @return the coproprietesSurLesquellesReferencees
     */
    public List<Copropriete> getCoproprietesSurLesquellesReferencees() {
        return coproprietesSurLesquellesReferencees;
    }

    /**
     * @param coproprietesSurLesquellesReferencees the
     * coproprietesSurLesquellesReferencees to set
     */
    public void setCoproprietesSurLesquellesReferencees(List<Copropriete> coproprietesSurLesquellesReferencees) {
        this.coproprietesSurLesquellesReferencees = coproprietesSurLesquellesReferencees;
    }

    /**
     * @return the compteEnBanqueFournisseur
     */
    public CompteEnBanqueFournisseur getCompteEnBanqueFournisseur() {
        return compteEnBanqueFournisseur;
    }

    /**
     * @param compteEnBanqueFournisseur the compteEnBanqueFournisseur to set
     */
    public void setCompteEnBanqueFournisseur(CompteEnBanqueFournisseur compteEnBanqueFournisseur) {
        this.compteEnBanqueFournisseur = compteEnBanqueFournisseur;
    }

    /**
     * @return the interventionDemandes
     */
    public List<InterventionDemande> getInterventionDemandes() {
        return interventionDemandes;
    }

    /**
     * @param interventionDemandes the interventionDemandes to set
     */
    public void setInterventionDemandes(List<InterventionDemande> interventionDemandes) {
        this.interventionDemandes = interventionDemandes;
    }

    /**
     * @return the facturesFournisseurs
     */
    public List<FactureFournisseur> getFacturesFournisseurs() {
        return facturesFournisseurs;
    }

    /**
     * @param facturesFournisseurs the facturesFournisseurs to set
     */
    public void setFacturesFournisseurs(List<FactureFournisseur> facturesFournisseurs) {
        this.facturesFournisseurs = facturesFournisseurs;
    }

    /**
     * @return the contratsFournisseur
     */
    public List<ContratFournisseur> getContratsFournisseur() {
        return contratsFournisseur;
    }

    /**
     * @param contratsFournisseur the contratsFournisseur to set
     */
    public void setContratsFournisseur(List<ContratFournisseur> contratsFournisseur) {
        this.contratsFournisseur = contratsFournisseur;
    }

    @Override
    public String toString() {
        if (getMode() == MODE_RAISON_SOCIALE) {
            return getRaisonSociale();
        } else if (getMode() == MODE_RAISON_SOCIALE_NUM_TEL) {
            return getRaisonSociale() + " " + getTelFixe();
        } else {
            return getRaisonSociale();
        }
    }

    /**
     * @return the demandeDevisFournisseurs
     */
    public List<DemandeDevisFournisseur> getDemandeDevisFournisseurs() {
        return demandeDevisFournisseurs;
    }

    /**
     * @param demandeDevisFournisseurs the demandeDevisFournisseurs to set
     */
    public void setDemandeDevisFournisseurs(List<DemandeDevisFournisseur> demandeDevisFournisseurs) {
        this.demandeDevisFournisseurs = demandeDevisFournisseurs;
    }

    /**
     * @return the mode
     */
    public int getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(int mode) {
        this.mode = mode;
    }

//    @Override
//    public int compareTo(Fournisseur t) {
//        return this.getRaisonSociale().compareTo(t.getRaisonSociale());
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (getId() != null ? getId().hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Societe)) {
//            return false;
//        }
//        Societe other = (Societe) object;
//        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
//            return false;
//        }
//        return true;
//    }

    /**
     * @return the identifiantICS
     */
    public String getIdentifiantICS() {
        return identifiantICS;
    }

    /**
     * @param identifiantICS the identifiantICS to set
     */
    public void setIdentifiantICS(String identifiantICS) {
        this.identifiantICS = identifiantICS;
    }

    /**
     * @return the permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * @param permalink the permalink to set
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }
    
    
    public void initPermalink() {
        String prmlink = toReadable(hasher("Fourn_" + this.getId().toString(), "SHA-256"));
        this.permalink = prmlink;
    }
    
    public static byte[] hasher(String toHash, String algorythm) {
        byte[] hash = null;

        try {
            hash = MessageDigest.getInstance(algorythm).digest(toHash.getBytes());
        } catch (NoSuchAlgorithmException ex) {

        }

        return hash;
    }

    public static String toReadable(byte[] hash) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte byt : hash) {
            String hex = Integer.toHexString(byt);
            if (hex.length() == 1) {
                stringBuilder.append(0);
                stringBuilder.append(hex.charAt(hex.length() - 1));
            } else {
                stringBuilder.append(hex.substring(hex.length() - 2));
            }
        }
        return stringBuilder.toString();
    }

}
