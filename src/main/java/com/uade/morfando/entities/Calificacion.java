package com.uade.morfando.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document ("ratings")
public class Calificacion {
    @Id
    private String id;
    private String idResto;
    private List<PuntosMejoras> puntosMejora;
    private int rating;
    private String comentario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdResto() {
        return idResto;
    }

    public void setIdResto(String idResto) {
        this.idResto = idResto;
    }

    public List<PuntosMejoras> getPuntosMejora() {
        return puntosMejora;
    }

    public void setPuntosMejora(List<PuntosMejoras> puntosMejora) {
        this.puntosMejora = puntosMejora;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
