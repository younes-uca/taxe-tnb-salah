package com.mst.terrain.dao;

import com.mst.terrain.bean.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartierDao extends JpaRepository<Quartier, Long> {
}
