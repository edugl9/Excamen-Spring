package com.example.ExamenSpringBoot.repository;

import com.example.ExamenSpringBoot.config.ItemPrestamo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Prestamo {
    private String fecha;
    private ItemPrestamo item;
    private String fechaDevolucion;
    private String estado;

    public Prestamo(String fecha, ItemPrestamo item, String fechaDevolucion, String estado) {
        this.fecha = fecha;
        this.item = item;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }
}
