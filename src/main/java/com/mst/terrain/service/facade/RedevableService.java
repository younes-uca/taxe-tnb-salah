package com.mst.terrain.service.facade;

import com.mst.terrain.bean.Redevable;

import java.util.List;

public interface RedevableService {

    public void save(Redevable redevable);

    public List<Redevable> findAll();

    public Redevable findByCin(String cin);

}
