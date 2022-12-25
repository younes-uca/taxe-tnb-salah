package com.mst.terrain.seeders;

import com.mst.terrain.service.facade.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;
import com.mst.terrain.bean.Categorie;

@Configuration
public class Test {
    @Autowired
    private CategorieService categorieService;

    Faker faker = new Faker();

    public void seed() {
        Categorie categorie = new Categorie();
        categorie.setCode("cat1");
        categorie.setLabel("cat1");
        categorieService.save(categorie);
        System.out.println("L23"+categorie);
    }
}
