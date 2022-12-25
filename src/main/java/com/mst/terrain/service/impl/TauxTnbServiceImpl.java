package com.mst.terrain.service.impl;

import com.mst.terrain.bean.TauxTnb;
import com.mst.terrain.dao.TauxTnbDao;
import com.mst.terrain.service.facade.TauxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TauxTnbServiceImpl implements TauxTnbService {
   @Autowired
   private TauxTnbDao tauxTnbDao;

    @Override
    public void save(TauxTnb tauxTnb) {
        tauxTnbDao.save(tauxTnb);
    }

    @Override
    public List<TauxTnb> findAll() {
        return tauxTnbDao.findAll();
    }

    @Override
    public TauxTnb findByCategorieId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
