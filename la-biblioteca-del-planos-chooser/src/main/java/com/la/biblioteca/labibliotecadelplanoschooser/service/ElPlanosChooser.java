package com.la.biblioteca.labibliotecadelplanoschooser.service;

import java.util.Arrays;
import java.util.List;
import com.la.biblioteca.labibliotecadelplanoschooser.adapter.PlanosAdapter;
import com.la.biblioteca.labibliotecadelplanoschooser.model.CategoryCount;
import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;

import org.springframework.stereotype.Service;


@Service
public class ElPlanosChooser {

    private PlanosAdapter planosAdapter = new PlanosAdapter();

    public List<ElPlan> getAllPlanos() {
        return this.planosAdapter.getAllLosPlanos();
    }

    public List<CategoryCount> planosCategories() {
        return this.planosAdapter.getCategories();
    }

    public ElPlan chooseRandomPlanosFromCategory(String planosCategory) {
        ElPlan[] planosListForCategory = getPlanosListForCategory(planosCategory);
        ElPlan elChosenPlanos = chooseRandomPlanosFromPlanosList(planosListForCategory);
        return elChosenPlanos;
    }

    public ElPlan[] getPlanosListForCategory(String category) {
        return new ElPlan[] { new ElPlan(), new ElPlan() };
    }

    public ElPlan chooseRandomPlanosFromPlanosList(ElPlan[] planosList) {
        return planosList[0];
    }

    public List<String> categoryReader() {
        return Arrays.asList("Planos Uno", "Planos Dos");
    }
}