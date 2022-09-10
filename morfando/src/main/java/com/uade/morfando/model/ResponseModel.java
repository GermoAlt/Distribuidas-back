package com.uade.morfando.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.uade.morfando.entity.Cliente;

public class ResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Cliente cliente;

    public ResponseModel(int code, Cliente cliente) {
        this.code = code;
        this.cliente = cliente;
    }

}
