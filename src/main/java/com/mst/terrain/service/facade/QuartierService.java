package com.mst.terrain.service.facade;

import com.mst.terrain.bean.Categorie;
import com.mst.terrain.bean.Quartier;

import java.util.List;

public interface QuartierService {

    public void save(Quartier quartier);
    public List<Quartier> findAll();
}
