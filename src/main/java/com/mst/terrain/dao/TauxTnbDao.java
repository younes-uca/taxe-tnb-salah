package com.mst.terrain.dao;

import com.mst.terrain.bean.TauxTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTnbDao extends JpaRepository<TauxTnb, Long> {
    TauxTnb findByCategorieId(Long id);
}
