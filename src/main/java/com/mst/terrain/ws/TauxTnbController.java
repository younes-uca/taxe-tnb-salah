package com.mst.terrain.ws;

import com.mst.terrain.bean.TauxTnb;
import com.mst.terrain.service.facade.TauxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tauxTnb")
public class TauxTnbController {
    @Autowired
    private TauxTnbService tauxTnbService;
    @PostMapping("/")
    public void save(@RequestBody TauxTnb tauxTnb) {
        tauxTnbService.save(tauxTnb);
    }
    @GetMapping("/")
    public List<TauxTnb> findAll() {
        return tauxTnbService.findAll();
    }
}
