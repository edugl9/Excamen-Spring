package com.example.ExamenSpringBoot.controller;

import com.example.ExamenSpringBoot.entity.Cliente;
import com.example.ExamenSpringBoot.service.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@Getter @Setter
public class HtmlControllerClientes {
    @Autowired
    private Sistema sistema;
    private Cliente cliente;

    @GetMapping("/{name}")
    public String clientes(Model model){
        Model model1 = model.addAttribute("nomcliente", "eduardo");
        return "home";
    }

    private ArrayList<Cliente> listaClientes= new ArrayList<>();

    @PostMapping
    public void crearCliente(Cliente cliente){
        cliente.setNombre(cliente.getNombre());
        cliente.setDni(cliente.getDni());
        cliente.setDomicilio(cliente.getDomicilio());
    }

    public Optional<Cliente> buscarCliente(String nombre){
        return listaClientes.stream().filter(c -> c.getNombre().equals(nombre)).findFirst();
    }

    @DeleteMapping
    public void eliminarCliente(String cliente){
        Optional<Cliente> optionalCliente= buscarCliente(cliente);
        optionalCliente.ifPresent(value -> getListaClientes().remove(value));
    }

    @PutMapping
    public void modificarCliente(Cliente cliente){
        eliminarCliente(cliente.getNombre());
        getListaClientes().add(cliente);
    }
}
