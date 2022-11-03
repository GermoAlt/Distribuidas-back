package com.uade.morfando.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.uade.morfando.entities.Cliente;

public class ResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Cliente cliente;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;


        public ResponseModel(int code, Object obj) {
        this.code = code;
        this.data = obj;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
