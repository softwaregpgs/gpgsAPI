package com.gpgs.services;

import com.gpgs.model.Cliente;
import com.gpgs.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
    
    @Override
    public Cliente findClienteByEmail() {
		return null;
    	
    	
    }

    @Override
    public Cliente addClientes(Cliente cliente) {
    	
        String encryptPassword = bCryptPasswordEncoder.encode(cliente.getPassword());
        
        cliente.setPassword(encryptPassword);
    	
        return clienteRepository.save(cliente);
    }
}
