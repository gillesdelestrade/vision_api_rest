/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroDansLaVoie;
    private TypeDeVoie typeDeVoie;
    private String voie;
    private String complementAdresse;
    private String batiment;
    private String etage;
    private String codePostal;
    private String ville;
    @OneToOne(mappedBy = "adresse", fetch = FetchType.LAZY)
    private Copropriete copropriete;
    private Double latitude;
    private Double longitude;

    public Adresse() {
    }

    public Adresse(String numeroDansLaVoie, TypeDeVoie typeDeVoie, String voie, String complementAdresse, String codePostal, String ville) {
        this.numeroDansLaVoie = numeroDansLaVoie;
        this.typeDeVoie = typeDeVoie;
        this.voie = voie;
        this.complementAdresse = complementAdresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adresse)) {
            return false;
        }
        Adresse other = (Adresse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String string = "";
        if (copropriete != null) {
            if (getPremiereLigneAdresse().replaceAll(" ", "").replaceAll(",", "").equalsIgnoreCase(copropriete.getNom().replaceAll("bd", "boulevard").replaceAll("av ", "avenue ").replaceAll(" ", "").replaceAll(",", "")) == false) {
                string = getPremiereLigneAdresse();
                if ((getComplementAdresse() != null) && (getComplementAdresse().isEmpty() == false)) {
                    string = string + "\n" + getComplementAdresse();
                } else {
                    string = string + "\n";
                }
                if (getBatiment() != null && getBatiment().isEmpty() == false) {
                    string = string + " Bat " + getBatiment();
                }
                if (getEtage() != null && getEtage().isEmpty() == false) {
                    string = string + " Etage " + getEtage();
                }
            }
        } else {

            string = getPremiereLigneAdresse();
            if ((getComplementAdresse() != null) && (getComplementAdresse().isEmpty() == false)) {
                string = string + "\n" + getComplementAdresse() + " ";
            } else {
                string = string + "\n";
            }
            if (getBatiment() != null && getBatiment().isEmpty() == false) {
                string = string + " Bat " + getBatiment();
            }
            if (getEtage() != null && getEtage().isEmpty() == false) {
                string = string + " Etage " +  getEtage();
            }

        }

        string = string + "\n" + getCodePostal() + " " + getVille();

        return string;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setVoie(String voie) {
        this.voie = voie;
    }

    /**
     * @return the complementAdresse
     */
    public String getComplementAdresse() {
        return complementAdresse;
    }

    /**
     * @param complementAdresse the complementAdresse to set
     */
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the numeroDansLaVoie
     */
    public String getNumeroDansLaVoie() {
        return numeroDansLaVoie;
    }

    /**
     * @param numeroDansLaVoie the numeroDansLaVoie to set
     */
    public void setNumeroDansLaVoie(String numeroDansLaVoie) {
        this.numeroDansLaVoie = numeroDansLaVoie;
    }

    /**
     * @return the typeDeVoie
     */
    public TypeDeVoie getTypeDeVoie() {
        return typeDeVoie;
    }

    /**
     * @param typeDeVoie the typeDeVoie to set
     */
    public void setTypeDeVoie(TypeDeVoie typeDeVoie) {
        this.typeDeVoie = typeDeVoie;
    }

    /**
     * @return the voie
     */
    public String getVoie() {
        return voie;
    }

    /**
     * @return the batiment
     */
    public String getBatiment() {
        return batiment;
    }

    /**
     * @param batiment the batiment to set
     */
    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    /**
     * @return the etage
     */
    public String getEtage() {
        return etage;
    }

    /**
     * @param etage the etage to set
     */
    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String typeVoieToString() {
        String s = "";
        if (getTypeDeVoie() != null) {
            if (getTypeDeVoie().equals(TypeDeVoie.allee)) {
                s = "Allée ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.avenue)) {
                s = "Avenue ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.boulevard)) {
                s = "Boulevard ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.chemin)) {
                s = "Chemin ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.impasse)) {
                s = "Impasse ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.rue)) {
                s = "Rue ";
            }
            if (getTypeDeVoie().equals(TypeDeVoie.traverse)) {
                s = "Traverse ";
            }

            // Quoiqu'il arrive
            s = getTypeDeVoie().toString() + " ";
        }
        return s;
    }

    public String getPremiereLigneAdresse() {
        String premiereLigne = "";
        if ((getNumeroDansLaVoie() != null) && (getNumeroDansLaVoie().isEmpty() == false)) {
            premiereLigne = premiereLigne + getNumeroDansLaVoie() + ", " + typeVoieToString() + getVoie();
        } else if (getVoie() != null) {
            premiereLigne = typeVoieToString() + getVoie();
        }

        if ((getBatiment() != null) && (getBatiment().isEmpty() == false)) {
            if (getBatiment().toLowerCase().contains("villa")) {
                premiereLigne = premiereLigne + " " + getBatiment();
            } else {
                premiereLigne = premiereLigne + " Bâtiment " + getBatiment();
            }
        }
        return premiereLigne;
    }

    /**
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
