package com.la.biblioteca.labibliotecadelplanoschooser.service;
import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlanos;

import sun.tools.tree.NewArrayExpression;

public class ElPlanosChooser {

    public ElPlanos chooseRandomPlanosFromCategory(String planosCategory) {
        ElPlanos[] planosListForCategory = getPlanosListForCategory(planosCategory);
        ElPlanos elChosenPlanos = chooseRandomPlanosFromPlanosList(planosListForCategory);
        return elChosenPlanos;
    }

    public ElPlanos[] getPlanosListForCategory(String category) {
        return new ElPlanos[] {new ElPlanos(), new ElPlanos()};
    }
    
    public ElPlanos chooseRandomPlanosFromPlanosList(ElPlanos[] planosList) {
        return planosList[0];
    }

    
}