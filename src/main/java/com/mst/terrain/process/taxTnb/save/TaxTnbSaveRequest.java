package com.mst.terrain.process.taxTnb.save;

public class TaxTnbSaveRequest {
    public String redevableCin;
    public  String terrainRef;
    public  int annee;
    
    public String getRedevableCin() {
        return redevableCin;
    }
    public void setRedevableCin(String redevableCin) {
        this.redevableCin = redevableCin;
    }
    public String getTerrainRef() {
        return terrainRef;
    }
    public void setTerrainRef(String terrainRef) {
        this.terrainRef = terrainRef;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
}