package com.mst.terrain.service.facade;

import com.mst.terrain.bean.TaxTnb;

import java.util.List;

public interface TaxTnbService {

    public void save(TaxTnb taxTnb);

    public List<TaxTnb> findAll();

    public TaxTnb findByAnnee(int annee);
}
