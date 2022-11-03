package com.uade.morfando.services;

import com.uade.morfando.entities.Menu;
import com.uade.morfando.entities.Restaurante;
import org.springframework.http.ResponseEntity;

public interface MenusService {
    ResponseEntity newMenu (Menu menu);
    ResponseEntity obtenerMenuByRestaurante (String idResto);
    ResponseEntity editarMenu (Menu menu, String id);

}
