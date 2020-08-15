package com.la.biblioteca.labibliotecadelplanoschooser.adapter;

import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;


public class PlanosAdapter {

    private final PlanosReader planosReader = new PlanosReader();

    public ElPlan[] getAllLosPlanos() {
        return this.planosReader.readLosPlanos();
    }
    
}