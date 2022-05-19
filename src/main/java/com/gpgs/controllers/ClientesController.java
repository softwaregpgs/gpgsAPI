package com.gpgs.controllers;

import com.gpgs.model.Cliente;
import com.gpgs.repositories.ClienteRepository;
import com.gpgs.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getClientes(){

      return clienteService.getClientes();

    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente){

        return clienteService.addClientes(cliente);

    }

}