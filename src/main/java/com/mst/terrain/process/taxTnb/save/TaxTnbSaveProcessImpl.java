package com.mst.terrain.process.taxTnb.save;

import com.mst.terrain.bean.Redevable;
import com.mst.terrain.bean.TauxTnb;
import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.bean.Terrain;
import com.mst.terrain.service.facade.RedevableService;
import com.mst.terrain.service.facade.TauxTnbService;
import com.mst.terrain.service.facade.TaxTnbService;
import com.mst.terrain.service.facade.TerrainService;


public class TaxTnbSaveProcessImpl implements TaxTnbSaveProcess {
    @Override
    public int handel(TaxTnbSaveRequest taxTnbSaveRequest) {
        TaxTnb taxTnb = init(taxTnbSaveRequest.getRedevableCin(), taxTnbSaveRequest.getTerrainRef());
        taxTnb.setAnnee(taxTnbSaveRequest.getAnnee());
        int res = validate(taxTnb);
        if (res > 0) {
            TauxTnb tauxTnb = tauxTnbService.findByCategorieId(taxTnb.getTerrain().getCategorie().getId());
            taxTnb.setTauxTnb(tauxTnb);
            if (tauxTnb == null) {
                res = -4;
            } else {
                execute(taxTnb);
                res = 1;
            }
        }
        return res;
    }

    public TaxTnb init(String redevableCin, String terrainRef) {
        TaxTnb taxTnb = new TaxTnb();
        Redevable redevable = redevableService.findByCin(redevableCin);
        taxTnb.setRedevable(redevable);
        Terrain terrain = terrainService.findByRef(terrainRef);
        taxTnb.setTerrain(terrain);
        return taxTnb;
    }

    public void execute(TaxTnb taxTnb) {
        Terrain terrain = taxTnb.getTerrain();
        Double surface = terrain.getSurface();
        double pourcentage = taxTnb.getTauxTnb().getMtParMetre();
        double mtTotal = surface * pourcentage;
        taxTnb.setAnnee(taxTnb.getAnnee());
        taxTnb.setTauxTnb(taxTnb.getTauxTnb());
        taxTnb.setMtTotal(mtTotal);
        taxTnbService.save(taxTnb);
        if (taxTnb.getAnnee() > terrain.getAnneeTaxTnb()) {
            terrain.setAnneeTaxTnb(taxTnb.getAnnee());
            terrainService.save(terrain);
        }
    }

    public int validate(TaxTnb taxTnb) {
        if (taxTnb.getRedevable() == null) {
            return -1;
        } else if (taxTnb.getTerrain() == null) {
            return -2;
        } else if (taxTnb.getTerrain().getCategorie() == null) {
            return -3;
        } else if (taxTnbService.findByAnnee(taxTnb.getAnnee()) != null) {
            return -4;
        } else {
            return 1;
        }
    }


    public TaxTnbSaveProcessImpl(RedevableService redevableService, TaxTnbService taxTnbService,
                                 TerrainService terrainService, TauxTnbService tauxTnbService) {
        this.redevableService = redevableService;
        this.taxTnbService = taxTnbService;
        this.terrainService = terrainService;
        this.tauxTnbService = tauxTnbService;
    }

    private RedevableService redevableService;

    private TaxTnbService taxTnbService;

    private TerrainService terrainService;

    private TauxTnbService tauxTnbService;


}
