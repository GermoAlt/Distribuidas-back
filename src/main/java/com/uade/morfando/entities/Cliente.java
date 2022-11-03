package com.uade.morfando.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cliente extends User{
    @Id
    private int Id;
    private String username;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private List<Restaurante> restaurantesFavoritos;

    public List<Restaurante> getRestaurantesFavoritos() {
        return restaurantesFavoritos;
    }

    public void setRestaurantesFavoritos(List<Restaurante> restaurantesFavoritos) {
        this.restaurantesFavoritos = restaurantesFavoritos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
