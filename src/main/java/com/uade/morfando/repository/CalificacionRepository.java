package com.uade.morfando.repository;

import com.uade.morfando.entities.Calificacion;
import com.uade.morfando.entities.Menu;
import com.uade.morfando.entities.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CalificacionRepository extends MongoRepository<Calificacion, String> {
  List<Calificacion> findByIdResto (String idResto);

}
