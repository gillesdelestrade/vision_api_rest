package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.BudgetDepensesDTO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BudgetDepensesService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Récupère les données budget/dépenses pour une copropriété
     */
    public List<BudgetDepensesDTO> getBudgetDepenses(Long coproprieteId) {

        // 1. Récupérer le dernier budget
        Object[] budget = findDernierBudget(coproprieteId);
        if (budget == null) {
            return new ArrayList<>();
        }

        LocalDate dateDebut = (LocalDate) budget[0];
        LocalDate dateFin = (LocalDate) budget[1];
        Double budgetFonctionnementAnnuel = toDouble(budget[2]);
        Double budgetTravauxAnnuel = toDouble(budget[3]);

        // Calculer le nombre de mois de l'exercice
        int nbMois = calculerNombreDeMois(dateDebut, dateFin);
        if (nbMois <= 0) {
            nbMois = 12;
        }

        // Budget mensuel
        Double budgetFonctionnementMensuel = (budgetFonctionnementAnnuel / nbMois);

        Double budgetTravauxMensuel = (budgetTravauxAnnuel / nbMois);

        // 2. Récupérer le montant mensuel des contrats (pour les mois futurs)
        Double montantContratsMensuel = findMontantContratsMensuel(coproprieteId);

        // 3. Construire les données mois par mois
        LocalDate aujourdhui = LocalDate.now();
        YearMonth moisCourant = YearMonth.from(aujourdhui);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");

        List<BudgetDepensesDTO> resultats = new ArrayList<>();

        // Parcourir chaque mois de l'exercice
        YearMonth mois = YearMonth.from(dateDebut);
        YearMonth moisFin = YearMonth.from(dateFin);

        while (!mois.isAfter(moisFin)) {
            BudgetDepensesDTO dto = new BudgetDepensesDTO();
            dto.setMois(mois.format(formatter));
            dto.setBudgetFonctionnement(budgetFonctionnementMensuel);
            dto.setBudgetTravaux(budgetTravauxMensuel);

            boolean estPasse = mois.isBefore(moisCourant) || mois.equals(moisCourant);
            dto.setEstPasse(estPasse);

            if (estPasse) {
                // Mois passé ou courant : dépenses réelles
                Double depensesReelles = findDepensesMois(coproprieteId, mois);
                dto.setDepenses(depensesReelles);
            } else {
                // Mois futur : estimation basée sur les contrats
                //dto.setDepenses(montantContratsMensuel);
                dto.setDepenses(findMontantFacturesFutures(coproprieteId, montantContratsMensuel, mois));
            }

            resultats.add(dto);
            mois = mois.plusMonths(1);
        }

        return resultats;
    }

    /**
     * Récupère le dernier budget de la copropriété et adapte les dates pour que
     * la période encadre la date courante
     */
    private Object[] findDernierBudget(Long coproprieteId) {
        Object[] budget;

        try {
            budget = em.createQuery(
                    "SELECT b.dateDebut, b.dateFin, b.budgetFonctionnement, b.budgetTravaux "
                    + "FROM Budget b "
                    + "WHERE b.copropriete.id = :coproprieteId "
                    + "ORDER BY b.dateFin DESC",
                    Object[].class)
                    .setParameter("coproprieteId", coproprieteId)
                    .setMaxResults(1)
                    .getSingleResult();
        } catch (NoResultException e) {
            // Aucun budget trouvé : budget par défaut sur l'année civile
            int annee = LocalDate.now().getYear();
            return new Object[]{
                LocalDate.of(annee, 1, 1),
                LocalDate.of(annee, 12, 31),
                0d,
                0d
            };
        }

        LocalDate dateDebut = (LocalDate) budget[0];
        LocalDate dateFin = (LocalDate) budget[1];
        LocalDate aujourdhui = LocalDate.now();

        // Adapter les années pour que la période encadre aujourd'hui
        LocalDate[] periodeAdaptee = adapterPeriodeBudget(dateDebut, dateFin, aujourdhui);

        budget[0] = periodeAdaptee[0];
        budget[1] = periodeAdaptee[1];

        return budget;
    }

    /**
     * Adapte les dates du budget pour que la période encadre la date courante.
     * Conserve les mois/jours, ajuste uniquement les années.
     */
    private LocalDate[] adapterPeriodeBudget(LocalDate dateDebut, LocalDate dateFin, LocalDate aujourdhui) {
        // Calculer le décalage en mois de la période
        long dureeMois = java.time.temporal.ChronoUnit.MONTHS.between(
                YearMonth.from(dateDebut), YearMonth.from(dateFin));

        // Tester plusieurs décalages d'années
        for (int offset = -2; offset <= 2; offset++) {
            int annee = aujourdhui.getYear() + offset;

            LocalDate debutCandidat = dateDebut.withYear(annee);
            LocalDate finCandidat = debutCandidat.plusMonths(dureeMois)
                    .withDayOfMonth(dateFin.getDayOfMonth());

            // Vérifier si aujourd'hui est dans cette période
            if (!aujourdhui.isBefore(debutCandidat) && !aujourdhui.isAfter(finCandidat)) {
                return new LocalDate[]{debutCandidat, finCandidat};
            }
        }

        // Fallback : placer le début juste avant aujourd'hui
        LocalDate fallbackDebut = dateDebut.withYear(aujourdhui.getYear());
        if (fallbackDebut.isAfter(aujourdhui)) {
            fallbackDebut = fallbackDebut.minusYears(1);
        }
        LocalDate fallbackFin = fallbackDebut.plusMonths(dureeMois)
                .withDayOfMonth(dateFin.getDayOfMonth());

        return new LocalDate[]{fallbackDebut, fallbackFin};
    }

    /**
     * Récupère les dépenses réelles d'un mois donné
     */
    private Double findDepensesMois(Long coproprieteId, YearMonth mois) {
        LocalDate premierJour = mois.atDay(1);
        LocalDate dernierJour = mois.atEndOfMonth();

        try {
            Object result = em.createQuery(
                    "SELECT COALESCE(SUM(f.montant), 0) "
                    + "FROM FactureFournisseur f "
                    + "WHERE f.copropriete.id = :coproprieteId "
                    + "AND f.dateDeMiseAuPaiement >= :debut "
                    + "AND f.dateDeMiseAuPaiement <= :fin")
                    .setParameter("coproprieteId", coproprieteId)
                    .setParameter("debut", premierJour)
                    .setParameter("fin", dernierJour)
                    .getSingleResult();

            return toDouble(result);
        } catch (Exception e) {
            return 0d;
        }
    }

    /**
     * Récupère le montant mensuel des contrats en cours
     */
    private Double findMontantContratsMensuel(Long coproprieteId) {
        try {
            Object result = em.createQuery(
                    "SELECT COALESCE(SUM(c.montantForfait), 0) / 12 "
                    + "FROM ContratFournisseur c "
                    + "WHERE c.copropriete.id = :coproprieteId "
                    + "AND c.dateFin IS NULL")
                    .setParameter("coproprieteId", coproprieteId)
                    .getSingleResult();

            return toDouble(result);
        } catch (Exception e) {
            return 0d;
        }
    }

    /**
     * Calcule le nombre de mois entre deux dates
     */
    private int calculerNombreDeMois(LocalDate debut, LocalDate fin) {
        return (int) java.time.temporal.ChronoUnit.MONTHS.between(
                YearMonth.from(debut), YearMonth.from(fin)) + 1;
    }

    /**
     * Convertit un résultat de requête en BigDecimal
     */
    private Double toDouble(Object value) {
        if (value == null) {
            return 0d;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Long) {
            return Double.valueOf((Long) value);
        }
        if (value instanceof Integer) {
            return Double.valueOf((Integer) value);
        }
        return 0d;
    }

    private Double findMontantFacturesFutures(Long idCopropriete, Double montantContratsMensuel, YearMonth mois) {
        LocalDate premierJour = mois.atDay(1).minusYears(1);
        LocalDate dernierJour = mois.atEndOfMonth().minusYears(1);
        String sql = "select sum(montant) from FACTUREFOURNISSEUR inner join SOCIETE on FACTUREFOURNISSEUR.FOURNISSEUR_ID=SOCIETE.ID where COPROPRIETE_ID=" + idCopropriete + " and DATEDEMISEAUPAIEMENT>='" + premierJour.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "' and DATEDEMISEAUPAIEMENT<='" + dernierJour.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "'  and (LOWER(RAISONSOCIALE) like '%eaux%marseille%' or LOWER(RAISONSOCIALE) like '%edf%') group by EXTRACT(YEAR FROM DATEDEMISEAUPAIEMENT),EXTRACT(MONTH FROM DATEDEMISEAUPAIEMENT)";
        try {
            Object result = em.createNativeQuery(sql).getSingleResult();
            return toDouble(result) + montantContratsMensuel;
        } catch (NoResultException noResultException) {
            return montantContratsMensuel;
        }
    }
}
