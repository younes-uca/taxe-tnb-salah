package com.mst.terrain.dao;

import com.mst.terrain.bean.TaxTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxTnbDao extends JpaRepository<TaxTnb, Long> {
    TaxTnb findByAnnee(int annee);
}
