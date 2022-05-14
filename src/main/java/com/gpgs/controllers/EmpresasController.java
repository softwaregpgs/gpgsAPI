package com.gpgs.controllers;

import com.gpgs.model.Empresa;
import com.gpgs.repositories.EmpresaRepository;
import com.gpgs.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas")
public class EmpresasController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<Empresa> getEmpresas(){

      return empresaService.getEmpresas();

    }

    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){

        return empresaService.addEmpresas(empresa);

    }

}
