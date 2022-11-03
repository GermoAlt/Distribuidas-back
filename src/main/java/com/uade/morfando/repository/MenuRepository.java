package com.uade.morfando.repository;

import com.uade.morfando.entities.Menu;
import com.uade.morfando.entities.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends MongoRepository<Menu, String> {
  Optional<Menu> findById(String id);
  List<Restaurante> findByIdRestaurante (String idResto);

}
