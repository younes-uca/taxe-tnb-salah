package com.mst.terrain.service.facade;

import com.mst.terrain.bean.Categorie;

import java.util.List;

public interface CategorieService {

    public void save(Categorie categorie);
    public List<Categorie> findAll();
    public Categorie findByCode(String code);

}
