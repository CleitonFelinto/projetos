package org.viacep.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ViaCepResponse {

     private String cep;
     private String logradouro;
     private String complemento;
     private String bairro;
     private String localidade;
     private String uf;
     private String ibge;
     private String gia;
     private String ddd;
     private String siafi;
}
