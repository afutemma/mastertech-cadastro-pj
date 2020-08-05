package com.mastertech.cadastropj.producer;

import com.mastertech.cadastropj.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpresaProducer {

    @Autowired
    private KafkaTemplate<String, Empresa> producer;

    public void enviarAoKafka(Empresa empresa) {
        producer.send("spec3-amanda-futemma-2", empresa);
    }
}
