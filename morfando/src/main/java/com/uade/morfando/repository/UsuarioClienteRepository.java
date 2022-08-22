package com.uade.morfando.repository;

import com.uade.morfando.entity.UsuarioCliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioClienteRepository extends MongoRepository<UsuarioCliente, String> {
    public UsuarioCliente findById (int id);
}
