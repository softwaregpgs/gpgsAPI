package com.gpgs.services;

import com.gpgs.model.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpresaService {

    public List<Empresa> getEmpresas();
    public Empresa addEmpresas(Empresa empresa);
}
