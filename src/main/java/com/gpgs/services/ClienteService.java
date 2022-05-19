package com.gpgs.services;

import com.gpgs.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    public List<Cliente> getClientes();
    public Cliente addClientes(Cliente cliente);
}
