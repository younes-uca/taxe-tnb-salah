package com.mst.terrain.dao;

import com.mst.terrain.bean.Redevable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableDao extends JpaRepository<Redevable, Long> {
    Redevable findByCin(String cin);
}
