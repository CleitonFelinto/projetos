package org.viacep.controller;

import org.viacep.domain.ViaCep;
import org.viacep.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/consulta-endereco")
public class CepController {
    @Autowired
    ViaCepService service;

    @PostMapping()
    public ViaCep buscarCep(@RequestBody ViaCep cep){
        return service.buscarCep(cep.getCep());
    }
}
