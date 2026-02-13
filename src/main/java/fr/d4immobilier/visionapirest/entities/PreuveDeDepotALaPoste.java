/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PreuveDeDepotALaPoste implements Serializable {
    @OneToMany(mappedBy = "preuveDeDepotALaPoste", fetch = FetchType.LAZY)
    private List<Courrier> courriers;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDepot;

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
        if (!(object instanceof PreuveDeDepotALaPoste)) {
            return false;
        }
        PreuveDeDepotALaPoste other = (PreuveDeDepotALaPoste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getDateDepot() == null) {
            return getId().toString();
        } else {
            return "(" +  getDateDepot().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")" + getId();
        }

    }

    /**
     * @return the dateDepot
     */
    public LocalDate getDateDepot() {
        return dateDepot;
    }

    /**
     * @param dateDepot the dateDepot to set
     */
    public void setDateDepot(LocalDate dateDepot) {
        this.dateDepot = dateDepot;
    }

    /**
     * @return the courriers
     */
    public List<Courrier> getCourriers() {
        return courriers;
    }

    /**
     * @param courriers the courriers to set
     */
    public void setCourriers(List<Courrier> courriers) {
        this.courriers = courriers;
    }



}
