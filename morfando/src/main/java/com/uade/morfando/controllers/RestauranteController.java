package com.uade.morfando.controllers;

import com.uade.morfando.entity.Restaurante;
import com.uade.morfando.model.ResponseModel;
import com.uade.morfando.services.RestaurantesService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("morfando/restaurante")
public class RestauranteController {

    @Autowired
    private RestaurantesService restauranteService;

    @PostMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class)))
    })
    public Restaurante newRestaurante(@RequestBody Restaurante restaurante) {
        return new Restaurante();
    }


    @GetMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class)))
    })
    public Restaurante getRestaurante(@RequestParam int r) {
        return new Restaurante();
    }

    @PutMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class)))
    })
    public Restaurante updateRestaurante(@RequestBody Restaurante restaurante) {
        return new Restaurante();
    }

    @DeleteMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Restaurante.class)))
    })
    public Restaurante deleteRestaurante(@RequestBody Restaurante restaurante) {
        return new Restaurante();
    }

//    @GetMapping("/")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
//                    schema = @Schema(implementation = Restaurante.class))),
//            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
//                    schema = @Schema(implementation = Restaurante.class))),
//            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
//                    schema = @Schema(implementation = Restaurante.class)))
//    })
//    public Restaurante getRestaurante(@RequestParam int r) {
//        return new Restaurante();
//    }

}
