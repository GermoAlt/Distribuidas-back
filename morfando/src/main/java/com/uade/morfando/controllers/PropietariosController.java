package com.uade.morfando.controllers;

import com.uade.morfando.entity.Cliente;
import com.uade.morfando.entity.Propietario;
import com.uade.morfando.model.ResponseModel;
import com.uade.morfando.services.PropietariosService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("morfando/propietario")
public class PropietariosController {

    @Autowired
    private PropietariosService propietariosService;

    @PostMapping("/login")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel login(@RequestBody Propietario propietario) {
        return null;
    }

    @PostMapping("/reset")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel resetPassword(@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.CREATED.value(),propietario);
    }

    @PostMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public Propietario newPropietario (@RequestBody Propietario propietario) {
            return new Propietario();
    }

    @GetMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public Propietario getPropietario (@RequestParam String idUser) {
        return new Propietario();
    }

    @PutMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public Propietario updatePropietario (@RequestBody Propietario propietario) {
        return new Propietario();
    }
}
//alta usuario, alta dueño, alta resto, modificacion resto, baja logica resto