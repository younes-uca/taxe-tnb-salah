package com.mst.terrain.process.taxTnb;

import com.mst.terrain.process.taxTnb.save.TaxTnbSaveProcess;
import com.mst.terrain.process.taxTnb.save.TaxTnbSaveProcessImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mst.terrain.service.facade.RedevableService;
import com.mst.terrain.service.facade.TauxTnbService;
import com.mst.terrain.service.facade.TaxTnbService;
import com.mst.terrain.service.facade.TerrainService;


@Configuration
public class TaxTnbInjector { //DDD :: Domain Driven Design :: process (frameword + conception metier plutot que conception BD/OO)
    @Bean
    public TaxTnbSaveProcess taxTnbSaveProcess(RedevableService redevableService, TaxTnbService taxTnbService, TerrainService terrainService, TauxTnbService tauxTnbService) {
        return new TaxTnbSaveProcessImpl(redevableService, taxTnbService, terrainService,  tauxTnbService);
    }
}