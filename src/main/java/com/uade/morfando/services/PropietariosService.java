package com.uade.morfando.services;

import com.uade.morfando.entities.Cliente;
import com.uade.morfando.entities.Propietario;
import com.uade.morfando.model.SignupRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public interface PropietariosService {
    ResponseEntity registrarPropietario (SignupRequest signUpRequest);
    ResponseEntity obtenerPropietario (String id);
}
