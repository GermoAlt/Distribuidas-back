package com.uade.morfando.controllers;

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
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "403", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseModel.class)))
    })
    public ResponseModel login(@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.OK.value(),propietario);
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
    public ResponseModel resetPassword(@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.CREATED.value(),propietario);
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
    public ResponseModel newPropietario (@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.OK.value(),propietario);
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
    public ResponseModel getPropietario (@RequestParam String idUser) {
        Propietario propietario = new Propietario();
        return new ResponseModel(HttpStatus.OK.value(),propietario);
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
    public ResponseModel updatePropietario (@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.OK.value(),propietario);
    }
}
//alta usuario, alta dueño, alta resto, modificacion resto, baja logica resto