package com.uade.morfando.controllers;

import com.uade.morfando.entities.Menu;
import com.uade.morfando.services.CalificacionesService;
import com.uade.morfando.services.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("morfando/v1/ratings")
public class CalificacionController {

    @Autowired
    private CalificacionesService calificacionesService;

    @GetMapping("/{idResto}")
    public ResponseEntity<?> obtenerCalificacionesByRestaurante (@PathVariable String idResto) {
        return calificacionesService.obtenerCalificacionesByRestaurante(idResto);
    }

}
