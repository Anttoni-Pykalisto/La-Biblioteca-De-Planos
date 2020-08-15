package com.la.biblioteca.labibliotecadelplanoschooser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlanos;
import com.la.biblioteca.labibliotecadelplanoschooser.service.ElPlanosChooser;

@RestController
@RequestMapping("/planos/chooser")
public class ElPlanosChooserApi {

    @Autowired
    private ElPlanosChooser elPlanosChooser;

    @GetMapping("/categories")
    public List<String> getAllPlanosCategories() {
        return elPlanosChooser.getAllCategories();
    }
 
    @GetMapping("/categories/{category}")
    public ElPlanos chooseRandomPlanos(@PathVariable("category") String category) {
        return elPlanosChooser.chooseRandomPlanosFromCategory(category);
    }
    
}