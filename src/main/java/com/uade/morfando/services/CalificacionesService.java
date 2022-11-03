package com.uade.morfando.services;

import com.uade.morfando.entities.Menu;
import org.springframework.http.ResponseEntity;

public interface CalificacionesService {
    ResponseEntity obtenerCalificacionesByRestaurante (String idResto);
}
