package com.uade.morfando.repository;

import com.uade.morfando.entities.Cliente;
import com.uade.morfando.entities.Propietario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Propietario, String> {
//    Propietario findByEmail (String email);
}
