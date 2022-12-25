package com.mst.terrain.service.facade;

import com.mst.terrain.bean.Redevable;
import com.mst.terrain.bean.Secteur;

import java.util.List;

public interface SecteurService {

    public void save(Secteur secteur);
    public List<Secteur> findAll();
}
