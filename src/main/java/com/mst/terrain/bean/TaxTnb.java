package com.mst.terrain.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TaxTnb {

    @Id  @GeneratedValue
    private long id;

    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Terrain terrain;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private TauxTnb tauxTnb;
    private double mtTotal;
    private int annee;

    public TaxTnb(Categorie categorie, Terrain terrain, Redevable redevable, TauxTnb tauxTnb, double mtTotal, int annee) {
        this.categorie = categorie;
        this.terrain = terrain;
        this.redevable = redevable;
        this.tauxTnb = tauxTnb;
        this.mtTotal = mtTotal;
        this.annee = annee;
    }

    public TaxTnb() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public TauxTnb getTauxTnb() {
        return tauxTnb;
    }

    public void setTauxTnb(TauxTnb tauxTnb) {
        this.tauxTnb = tauxTnb;
    }

    public double getMtTotal() {
        return mtTotal;
    }

    public void setMtTotal(double mtTotal) {
        this.mtTotal = mtTotal;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
