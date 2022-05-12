package com.gpgs.controllers;

import com.gpgs.model.Empresa;
import com.gpgs.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas")
public class EmpresasController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public List<Empresa> getEmpresas(){

      return empresaRepository.findAll();

    }

    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){

        return empresaRepository.save(empresa);

    }

}
