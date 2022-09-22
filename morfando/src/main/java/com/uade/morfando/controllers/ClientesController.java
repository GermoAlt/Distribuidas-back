package com.uade.morfando.controllers;

import com.uade.morfando.entity.Cliente;
import com.uade.morfando.entity.Propietario;
import com.uade.morfando.entity.Restaurante;
import com.uade.morfando.model.ResponseModel;
import com.uade.morfando.model.SpringErrorPayload;
import com.uade.morfando.services.ClientesService;
import io.swagger.annotations.ApiOperation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("morfando/cliente")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/login")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel login(@RequestBody Cliente cliente) {
        return new ResponseModel(HttpStatus.OK.value(),cliente);
    }

    @PostMapping("/reset")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel resetPassword(@RequestBody Cliente cliente) {
        return new ResponseModel(HttpStatus.CREATED.value(),cliente);
    }

    @PostMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel nuevoCliente(@RequestBody Cliente cliente) {
        return new ResponseModel(HttpStatus.CREATED.value(),cliente);
    }

    @GetMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel getCliente(@RequestBody Cliente cliente) {
        return new ResponseModel(HttpStatus.CREATED.value(),cliente);
    }


    @PutMapping("/")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel updateCliente(@RequestBody Cliente cliente) {
        return new ResponseModel(HttpStatus.CREATED.value(),cliente);
    }

    @PatchMapping("/favoritos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel patchFavoritos (@RequestBody List<Integer> idRestaurantes) {
        return new ResponseModel(HttpStatus.CREATED.value(),idRestaurantes);
    }

    @GetMapping("/favoritos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel getFavoritos (@RequestParam int idRestaurante) {
        Restaurante restaurante = new Restaurante();
        return new ResponseModel(HttpStatus.CREATED.value(),restaurante);
    }


}
