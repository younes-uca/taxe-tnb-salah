package com.mst.terrain.dao;

import com.mst.terrain.bean.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainDao extends JpaRepository<Terrain, Long> {

    Terrain findByRef(String ref);
    List<Terrain> findByAnneeTaxTnbLessThan(int annee);
}
