package fst.sir.tp1.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Compte {
    @Id
    private Long id;
    private String rib;
    private double solde;

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
