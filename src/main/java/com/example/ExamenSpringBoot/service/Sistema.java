package com.example.ExamenSpringBoot.service;

import com.example.ExamenSpringBoot.config.ItemPrestamo;
import com.example.ExamenSpringBoot.controller.HtmlControllerClientes;
import com.example.ExamenSpringBoot.entity.Cliente;
import com.example.ExamenSpringBoot.repository.Prestamo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class Sistema {
    private Prestamo prestamos;
    private Cliente clientes;
    private ItemPrestamo item;

    public void crearLibro(){

    }

    public void crearCD(){

    }

    public void buscarItem(){

    }


}
