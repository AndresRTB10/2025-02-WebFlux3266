package com.example.taller_sinjpa.dto;

public class UserDTO {
    private String nombre;
    private String apellido;

    public UserDTO(String nombre, String apellido) {
        this.nombre = nombre.toUpperCase();
        this.apellido = apellido.toUpperCase();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
}

