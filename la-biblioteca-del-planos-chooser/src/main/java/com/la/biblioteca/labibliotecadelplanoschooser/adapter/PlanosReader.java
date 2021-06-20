package com.la.biblioteca.labibliotecadelplanoschooser.adapter;

import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.la.biblioteca.labibliotecadelplanoschooser.model.ElPlan;

public class PlanosReader {

    public ElPlan[] readLosPlanos() {
        ElPlan[] losPlanos = null;

        try {
            JsonReader reader = new JsonReader(new FileReader("src/main/java/com/la/biblioteca/labibliotecadelplanoschooser/data/planos.json"));
            losPlanos = new Gson().fromJson(reader, ElPlan[].class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return losPlanos;
    }
}