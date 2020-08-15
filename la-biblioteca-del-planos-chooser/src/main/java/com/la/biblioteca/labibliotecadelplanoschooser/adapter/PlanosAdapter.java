package com.la.biblioteca.labibliotecadelplanoschooser.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.la.biblioteca.labibliotecadelplanoschooser.model.CategoryCount;
import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;


public class PlanosAdapter {

    private final PlanosReader planosReader = new PlanosReader();

    public List<ElPlan> getAllLosPlanos() {
        return Arrays.stream(this.planosReader.readLosPlanos()).collect(Collectors.toList());
    }

    public List<CategoryCount> getCategories() {
        List<CategoryCount> categoryCountList = new ArrayList<CategoryCount>();
        List<String> allCategories = this.getAllLosPlanos().stream().map(ElPlan::getCategory).collect(Collectors.toList());
        List<String> uniqueCategories = new ArrayList<String>();
        uniqueCategories.addAll(new HashSet<String>(allCategories));
        uniqueCategories.forEach( category -> {
            categoryCountList.add(new CategoryCount(category, Collections.frequency(allCategories, category)));
        });
        return categoryCountList;
    }

    public List<ElPlan> getPlanosFromCategory(String planosCategory) {
        System.out.println("Category :: " + planosCategory);
        List<ElPlan> planosList = this.getAllLosPlanos();
        System.out.println(planosList);
        return planosList.stream().filter(
            planos -> planos.getCategory().equalsIgnoreCase(planosCategory)
            ).collect(Collectors.toList());
    }
}