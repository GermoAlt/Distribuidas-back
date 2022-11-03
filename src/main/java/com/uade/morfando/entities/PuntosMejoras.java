package com.uade.morfando.entities;

public class PuntosMejoras {
    private boolean puntualidad;
    private boolean variedad;
    private boolean calidad;
    private boolean disponibilidad;

    public boolean isPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(boolean puntualidad) {
        this.puntualidad = puntualidad;
    }

    public boolean isVariedad() {
        return variedad;
    }

    public void setVariedad(boolean variedad) {
        this.variedad = variedad;
    }

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
