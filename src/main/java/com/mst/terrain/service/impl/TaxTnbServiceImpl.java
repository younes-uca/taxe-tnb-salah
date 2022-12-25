package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Redevable;
import com.mst.terrain.bean.TauxTnb;
import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.bean.Terrain;
import com.mst.terrain.dao.TaxTnbDao;
import com.mst.terrain.service.facade.RedevableService;
import com.mst.terrain.service.facade.TauxTnbService;
import com.mst.terrain.service.facade.TaxTnbService;
import com.mst.terrain.service.facade.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxTnbServiceImpl implements TaxTnbService {
    @Autowired
    private TaxTnbDao taxTnbDao;

    @Autowired
    private RedevableService redevableService;

    @Autowired
    private TerrainService terrainService;

    @Autowired
    private TauxTnbService tauxTnbService;



    @Override
    public void save(TaxTnb taxTnb) {
        taxTnbDao.save(taxTnb);
    }

    @Override
    public List<TaxTnb> findAll() {
        return taxTnbDao.findAll();
    }

    @Override
    public TaxTnb findByAnnee(int annee) {
        return taxTnbDao.findByAnnee(annee);
    }
}
