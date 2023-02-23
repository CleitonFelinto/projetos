package org.viacep.utils;

import java.util.Objects;

public class ViaCepUtils {

    public static void validaCep(String cep){
        if (Objects.isNull(cep) || cep.isEmpty() || cep.isBlank()) throw new IllegalArgumentException("O cep informado não pode ser nulo ou vazio");
        if (cep.length() > 8) throw new IllegalArgumentException("CEP fora do formato, caso esteja com hifen, use o metodo de formatacao");
        if (cep.length() < 8) throw new IllegalArgumentException("CEP faltando numeros");
    }
}
