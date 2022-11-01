package com.uade.morfando.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Restaurante {
    @Id
    private int id;
    private String nombre;
    private String calle;
    private int  numero;
    private String barrio;
    private String localidad;
    private String provincia;
    private String pais;
    private List<Long> geolocalizacion;
    private String horarioApertura;
    private String horarioCierre;
    private Boolean activo;
    private List <String> fotosRestaurante;
    private List <String> tipoComida;
    private String rangoPrecio;
    private int cantidadEstrellas;
    private List <Comentario> comentarios;
    private Menu menu;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Long> getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(List<Long> geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<String> getFotosRestaurante() {
        return fotosRestaurante;
    }

    public void setFotosRestaurante(List<String> fotosRestaurante) {
        this.fotosRestaurante = fotosRestaurante;
    }

    public List<String> getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(List<String> tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
