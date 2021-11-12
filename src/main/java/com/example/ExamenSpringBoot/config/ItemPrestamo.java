package com.example.ExamenSpringBoot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class ItemPrestamo {
    private int codigo;
    private String nombre;

    public void getDiasDevolucion() {

    }

}
