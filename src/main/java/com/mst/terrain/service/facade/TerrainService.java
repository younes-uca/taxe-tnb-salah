package com.mst.terrain.service.facade;

import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.bean.Terrain;

import java.util.List;

public interface TerrainService {

    public void save(Terrain terrain);
    public List<Terrain> findAll();
    public Terrain findByRef(String ref);
}
