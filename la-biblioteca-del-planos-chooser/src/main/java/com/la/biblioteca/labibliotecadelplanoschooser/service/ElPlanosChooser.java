package com.la.biblioteca.labibliotecadelplanoschooser.service;
import java.util.Arrays;
import java.util.List;

import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlanos;

import org.springframework.stereotype.Service;

@Service
public class ElPlanosChooser {

    public List<String> getAllCategories() {
        return categoryReader();
    }

    public ElPlanos chooseRandomPlanosFromCategory(String planosCategory) {
        ElPlanos[] planosListForCategory = getPlanosListForCategory(planosCategory);
        ElPlanos elChosenPlanos = chooseRandomPlanosFromPlanosList(planosListForCategory);
        return elChosenPlanos;
    }

    public ElPlanos[] getPlanosListForCategory(String category) {
        return new ElPlanos[] { new ElPlanos(), new ElPlanos() };
    }

    public ElPlanos chooseRandomPlanosFromPlanosList(ElPlanos[] planosList) {
        return planosList[0];
    }

    public List<String> categoryReader() {
        return Arrays.asList("Planos Uno", "Planos Dos");
    }

    
}