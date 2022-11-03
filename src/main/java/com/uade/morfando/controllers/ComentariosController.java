package com.uade.morfando.controllers;

import com.uade.morfando.entities.Comentario;
import com.uade.morfando.model.ResponseModel;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("morfando/v1/comments")
public class ComentariosController {

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
    public ResponseModel nuevoComentario(@RequestBody Comentario comentario) {
        return new ResponseModel(HttpStatus.OK.value(),comentario);
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
    public ResponseModel getComentario(@RequestBody Comentario comentario) {
        return new ResponseModel(HttpStatus.OK.value(),comentario);
    }
}
