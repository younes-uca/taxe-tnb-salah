package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Secteur;
import com.mst.terrain.dao.SecteurDao;
import com.mst.terrain.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
   @Autowired
   private SecteurDao secteurDao;

    @Override
    public void save(Secteur secteur) {
        secteurDao.save(secteur);
    }

    @Override
    public List<Secteur> findAll() {
        return secteurDao.findAll();
    }
}
