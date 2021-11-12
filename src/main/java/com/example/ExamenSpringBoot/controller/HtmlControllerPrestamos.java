package com.example.ExamenSpringBoot.controller;

import com.example.ExamenSpringBoot.config.ItemPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlControllerPrestamos {
    @Autowired
    private ItemPrestamo iprestamo;

    @GetMapping("/prestamos")
    public String prestamos(Model model){
        model.addAttribute("nomcliente", "eduardo");
        return "prestamos";
    }

    @PostMapping
    public void crearPrestamo(ItemPrestamo iprestamo){
        iprestamo.setCodigo(iprestamo.getCodigo());
        iprestamo.setNombre(iprestamo.getNombre());
    }

}
