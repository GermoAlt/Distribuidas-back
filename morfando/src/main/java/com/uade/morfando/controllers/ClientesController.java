package com.uade.morfando.controllers;

import com.uade.morfando.entity.Cliente;
import com.uade.morfando.model.ResponseModel;
import com.uade.morfando.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("morfando")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/login")
    public ResponseModel login(@RequestBody Cliente cliente) {
            return null;
    }
}
