package com.la.biblioteca.labibliotecadelplanoschooser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.la.biblioteca.labibliotecadelplanoschooser.model.CategoryCount;
import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;
import com.la.biblioteca.labibliotecadelplanoschooser.service.ElPlanosChooser;

@RestController
@RequestMapping("/planos/chooser")
public class ElPlanosChooserApi {

    @Autowired
    private ElPlanosChooser elPlanosChooser;

    @GetMapping("/allPlanos")
    public ResponseEntity<List<ElPlan>> getAllPlanos() {
        return new ResponseEntity<List<ElPlan>>(elPlanosChooser.getAllPlanos(), HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryCount>> getPlanosCategories() {
        return new ResponseEntity<List<CategoryCount>>(elPlanosChooser.planosCategories(), HttpStatus.OK);
    }
 
    @GetMapping("/categories/{category}")
    public ElPlan chooseRandomPlanos(@PathVariable("category") String category) {
        return elPlanosChooser.chooseRandomPlanosFromCategory(category);
    }
}