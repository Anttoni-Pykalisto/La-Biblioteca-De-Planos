package com.la.biblioteca.labibliotecadelplanoschooser.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;


public class PlanosAdapter {

    private final PlanosReader planosReader = new PlanosReader();

    public List<ElPlan> getAllLosPlanos() {
        return Arrays.stream(this.planosReader.readLosPlanos()).collect(Collectors.toList());
    }

    public List<String> getCategories() {
        return this.getAllLosPlanos().stream().map(ElPlan::getCategory).collect(Collectors.toList());
    }
     
}