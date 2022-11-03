package com.uade.morfando.controllers;

import com.uade.morfando.entities.Cliente;
import com.uade.morfando.entities.Propietario;
import com.uade.morfando.model.*;
import com.uade.morfando.services.PropietariosService;
import com.uade.morfando.services.UserDetailsImpl;
import com.uade.morfando.utils.JwtUtils;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("morfando/v1/owners")
public class PropietariosController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    private PropietariosService propietariosService;



    @PostMapping("/login")
    public ResponseEntity<?> autenticarUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        return ResponseEntity.ok().body(new InfoResponse(HttpStatus.OK.value(),userDetails, "Usuario correcto"));
    }

    @PostMapping("/")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return propietariosService.registrarPropietario(signUpRequest);
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<?> getPropietario (@PathVariable String idUser) {
        return propietariosService.obtenerPropietario(idUser);
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

    @PutMapping("/")
    public ResponseModel updatePropietario (@RequestBody Propietario propietario) {
        return new ResponseModel(HttpStatus.OK.value(),propietario);
    }
}
//alta usuario, alta dueño, alta resto, modificacion resto, baja logica resto