package com.la.biblioteca.labibliotecadelplanoschooser.model;

import java.util.Date;

import lombok.Data;

@Data
public class ElPlanos {
    private String category;
    private String planos;
    private String description;
    private Status status;
    private Date statusUpdateDate;
}