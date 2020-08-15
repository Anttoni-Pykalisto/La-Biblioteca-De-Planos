package com.la.biblioteca.labibliotecadelplanoschooser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlanos;
import com.la.biblioteca.labibliotecadelplanoschooser.service.ElPlanosChooser;

@Controller
public class ElPlanosChooserApi {
    
    private ElPlanosChooser elPlanosChooser;

    @GetMapping("planos/chooser/{category}")
    public ElPlanos chooseRandomPlanos(@PathVariable("category") String category) {
        return elPlanosChooser.chooseRandomPlanosFromCategory(category);
    }
    
}