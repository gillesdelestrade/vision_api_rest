/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum ActionEtapeDemande {
    
    GENERER_DECLARATION_SINISTRE,
    RECHERCHE_ORIGINE_SINISTRE,
    DEMANDE_DEVIS_REPARATION_SINISTRE,
    RECEPTION_DEVIS,
    TRANSMISSION_DEVIS_ASSUREUR,
    REPARATION_SINISTRE;
    
     @Override
    public String toString() {
        switch (this) {
            case GENERER_DECLARATION_SINISTRE -> {
                return "<a class=\"bouton\" style=\"cursor:pointer;\" onclick=\"genererDeclaration();\">G&eacute;n&eacute;rer D&eacute;claration<span>G&eacute;n&eacute;rer D&eacute;claration</span></a>";
            }
            case RECHERCHE_ORIGINE_SINISTRE -> {
                return "<a class=\"bouton\" href=\"demande_intervention.jsp?id=[id]\">Rechercher origine<span>Rechercher origine</span></a>";
            }
            case DEMANDE_DEVIS_REPARATION_SINISTRE -> {
                return "<a class=\"bouton\" href=\"demande_devis.jsp?id=[id]\">Demander Devis<span>Demander Devis</span></a>";
            }
            case RECEPTION_DEVIS -> {
                return "";
            }
            case TRANSMISSION_DEVIS_ASSUREUR -> {
                return "";
            }
            case REPARATION_SINISTRE -> {
                return "<a class=\"bouton\" href=\"demande_intervention.jsp?id=[id]\">D&eacute;clencher R&eacute;paration<span>D&eacute;clencher R&eacute;paration</span></a>";
            }
            

        }
        throw new RuntimeException("Invalid value for this");
    }
    
}
