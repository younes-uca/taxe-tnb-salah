package com.mst.terrain.ws;

import com.mst.terrain.bean.Redevable;
import com.mst.terrain.service.facade.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/redevable")
public class RedevableController {
    @Autowired
    private RedevableService redevableService;

    @PostMapping("/")
    public void save(@RequestBody Redevable redevable) {
        redevableService.save(redevable);
    }


    @GetMapping("/")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }
}
