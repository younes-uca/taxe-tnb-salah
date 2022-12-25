package com.mst.terrain.ws;

import com.mst.terrain.bean.Categorie;
import com.mst.terrain.service.facade.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/")
    public void save(@RequestBody Categorie newCategorie) {
        categorieService.save(newCategorie);
    }
    // @PostMapping("/")
    // public ResponseEntity<Categorie> save(@RequestBody Categorie newCategorie) {
    //     Categorie categorie = categorieService.save(newCategorie);
    //     // return new ResponseEntity<>(page, headers, HttpStatus.OK);
    //     if (categorie == null) {
    //         // throw new ServerException(null);
    //         return new ResponseEntity<>(categorie, HttpStatus.BAD_REQUEST);
    //     } else {
    //         return new ResponseEntity<>(categorie, HttpStatus.CREATED);
    //     }
    // }

    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @GetMapping("/code/{code}")
    public Categorie findByCode(@PathVariable String code) {
        return categorieService.findByCode(code);
    }
}
