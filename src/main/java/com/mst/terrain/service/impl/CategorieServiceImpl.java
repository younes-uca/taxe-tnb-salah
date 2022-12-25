package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Categorie;
import com.mst.terrain.dao.CategorieDao;
import com.mst.terrain.service.facade.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceImpl implements CategorieService {
   @Autowired
   private CategorieDao categorieDao;

    @Override
    public void save(Categorie categorie) {
        categorieDao.save(categorie);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    @Override
    public Categorie findByCode(String code) {
        return categorieDao.findByCode(code);
    }
}
