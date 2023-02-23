package org.viacep.service;

import org.viacep.domain.ViaCep;
import org.viacep.domain.ViaCepResponse;
import org.viacep.enums.FreteEnum;
import org.viacep.utils.ViaCepUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public ViaCep buscarCep(String cepString){
        ViaCepUtils.validaCep(cepString);

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://viacep.com.br/ws/";

        ResponseEntity<String> response = restTemplate.getForEntity(url + cepString + "/json", String.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);

        ObjectMapper mapper = new ObjectMapper();
        try {
            ViaCepResponse retorno = mapper.readValue(response.getBody().replaceAll("\n",""), ViaCepResponse.class);
            ViaCep resposta = ViaCep.builder().cep(retorno.getCep())
                    .rua(retorno.getLogradouro())
                    .complemento(retorno.getComplemento())
                    .bairro(retorno.getBairro())
                    .cidade(retorno.getLocalidade())
                    .estado(retorno.getUf())
                    .frete(FreteEnum.getValorByUf(retorno.getUf())).build();
            return resposta;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Cep não localizado na base de dados do ViaCep");
        }
    }
}
