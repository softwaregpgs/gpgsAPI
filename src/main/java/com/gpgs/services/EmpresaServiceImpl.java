package com.gpgs.services;

import com.gpgs.model.Empresa;
import com.gpgs.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getEmpresas() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa addEmpresas(Empresa empresa) {
    	
        String encryptPassword = bCryptPasswordEncoder.encode(empresa.getPassword());
        
        empresa.setPassword(encryptPassword);
    	
        return empresaRepository.save(empresa);
    }
}
