package com.example.ExamenSpringBoot.entity;

import com.example.ExamenSpringBoot.repository.Prestamo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private String nombre;
    private String dni;
    private String domicilio;
    private Prestamo prestamos;

    public void addPrestamo(Prestamo p){

    }

    public Cliente(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

}
