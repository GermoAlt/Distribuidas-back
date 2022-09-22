package com.uade.morfando.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Menu {
    @Id
    private int id;
    private String categoria;
    private List<Plato> plato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Plato> getPlato() {
        return plato;
    }

    public void setPlato(List<Plato> plato) {
        this.plato = plato;
    }
}
