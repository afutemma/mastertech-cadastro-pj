package com.mastertech.cadastropj.controller;

import com.mastertech.cadastropj.model.Empresa;
import com.mastertech.cadastropj.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService service;

    @PostMapping("/empresa")
    public Empresa postEmpresa(@RequestBody Empresa empresa){
        return service.cadastrarEmpresa(empresa);
    }
}
