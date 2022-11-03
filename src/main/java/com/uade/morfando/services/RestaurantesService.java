package com.uade.morfando.services;

import com.uade.morfando.entities.Cliente;
import com.uade.morfando.entities.Restaurante;
import com.uade.morfando.model.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface RestaurantesService {
    ResponseEntity newRestaurant (Restaurante restaurante);
    ResponseEntity obtenerRestaurant (String id);
    ResponseEntity obtenerByIdUser (String idUser);
    ResponseEntity editarRestaurant (Restaurante restaurante, String id);

}
