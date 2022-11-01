package com.uade.morfando.repository;

import com.uade.morfando.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioClienteRepository extends MongoRepository<Cliente, String> {
    public Cliente findById (int id);
}
