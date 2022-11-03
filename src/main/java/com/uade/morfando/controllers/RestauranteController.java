package com.uade.morfando.controllers;

import com.uade.morfando.entities.Restaurante;
import com.uade.morfando.model.ResponseModel;
import com.uade.morfando.services.RestaurantesService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("morfando/v1/restaurants")
public class RestauranteController {

    @Autowired
    private RestaurantesService restauranteService;

    @PostMapping("/")
    public ResponseEntity<?> newRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.newRestaurant(restaurante);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerRestaurant (@PathVariable String id) {
        return restauranteService.obtenerRestaurant(id);
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<?> updateRestaurante(@RequestBody Restaurante restaurante, @PathVariable String id) {
        return restauranteService.editarRestaurant(restaurante,id);
    }

    @DeleteMapping("/")
    public ResponseEntity<?> obtenerByIdUser (@PathVariable String idUser) {
        return restauranteService.obtenerByIdUser(idUser);
    }


}
