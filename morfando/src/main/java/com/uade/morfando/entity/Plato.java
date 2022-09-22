package com.uade.morfando.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Plato {
    @Id
    private int id;
    private String nombrePlato;
    private int precio;
    private String imagenplato;
    private List<String> ingredients;
    private Boolean esCeliaco;
    private Boolean esVegano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getImagenplato() {
        return imagenplato;
    }

    public void setImagenplato(String imagenplato) {
        this.imagenplato = imagenplato;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Boolean getEsCeliaco() {
        return esCeliaco;
    }

    public void setEsCeliaco(Boolean esCeliaco) {
        this.esCeliaco = esCeliaco;
    }

    public Boolean getEsVegano() {
        return esVegano;
    }

    public void setEsVegano(Boolean esVegano) {
        this.esVegano = esVegano;
    }
}
