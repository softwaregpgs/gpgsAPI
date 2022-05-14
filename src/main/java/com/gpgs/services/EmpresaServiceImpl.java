package com.gpgs.services;

import com.gpgs.model.Empresa;
import com.gpgs.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpresaServiceImpl implements EmpresaService{

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getEmpresas() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa addEmpresas(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
