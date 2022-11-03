package com.uade.morfando.repository;

import com.uade.morfando.entities.Propietario;
import com.uade.morfando.entities.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends MongoRepository<Restaurante, String> {
  Optional<Restaurante> findById(String id);

  Boolean existsByNombre(String nombre);

  List<Restaurante> findByIdPropietario (String idPropietario);


//  Boolean existsByEmail(String email);
}
