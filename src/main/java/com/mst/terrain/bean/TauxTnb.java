package com.mst.terrain.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class TauxTnb {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private Categorie categorie;
    private BigDecimal surfaceMin;
    private BigDecimal surfaceMax;
    private double mtParMetre;

    public TauxTnb() {
    }


    public TauxTnb(Long id, Categorie categorie, BigDecimal surfaceMin, BigDecimal surfaceMax, double mtParMetre) {
        this.id = id;
        this.categorie = categorie;
        this.surfaceMin = surfaceMin;
        this.surfaceMax = surfaceMax;
        this.mtParMetre = mtParMetre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public BigDecimal getSurfaceMin() {
        return surfaceMin;
    }

    public void setSurfaceMin(BigDecimal surfaceMin) {
        this.surfaceMin = surfaceMin;
    }

    public BigDecimal getSurfaceMax() {
        return surfaceMax;
    }

    public void setSurfaceMax(BigDecimal surfaceMax) {
        this.surfaceMax = surfaceMax;
    }

    public double getMtParMetre() {
        return mtParMetre;
    }

    public void setMtParMetre(double mtParMetre) {
        this.mtParMetre = mtParMetre;
    }
    
}
