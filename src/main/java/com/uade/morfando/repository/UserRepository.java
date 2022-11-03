package com.uade.morfando.repository;

import com.uade.morfando.entities.Propietario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<Propietario, String> {
  Optional<Propietario> findByUsername(String username);

  Boolean existsByUsername(String username);

  Optional<Propietario> findById (String id);

//  Boolean existsByEmail(String email);
}
