package com.mastertech.cadastropj.service;

import com.mastertech.cadastropj.model.Empresa;
import com.mastertech.cadastropj.producer.EmpresaProducer;
import com.mastertech.cadastropj.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository repository;
    @Autowired
    EmpresaProducer producer;

    public Empresa cadastrarEmpresa(Empresa empresa){
        producer.enviarAoKafka(empresa);
        return repository.save(empresa);
    }
}
