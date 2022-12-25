package com.mst.terrain.ws;

import com.mst.terrain.bean.Secteur;
import com.mst.terrain.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secteur")
public class SecteurController {
    @Autowired
    private SecteurService secteurService;
    @PostMapping("/")
    public void save(@RequestBody Secteur secteur) {
        secteurService.save(secteur);
    }
    @GetMapping("/")
    public List<Secteur> findAll() {
        return secteurService.findAll();
    }
}
