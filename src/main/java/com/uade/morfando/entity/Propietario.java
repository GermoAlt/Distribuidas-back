package com.uade.morfando.entity;

import org.springframework.data.annotation.Id;

public class Propietario {
    @Id
    private int Id;
    private String email;
    private String password;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
