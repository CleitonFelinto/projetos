package br.com.viacep.enums;

import java.util.Arrays;
import java.util.Optional;

public enum FreteEnum {

    //Sul
    PR("PR",17.30),
    SC("SC",17.30),
    RS("RS",17.30),

    //Sudeste
    RJ("RJ",7.85),
    SP("SP",7.85),
    ES("ES",7.85),
    MG("MG",7.85),

    //Centro-Oeste
    GO("GO",12.50),
    MT("MT",12.50),
    MS("MS",12.50),
    DF("DF",12.50),

    //Nordeste
    CE("CE",15.98),
    AL("AL",15.98),
    BA("BA",15.98),
    MA("MA",15.98),
    PB("PB",15.98),
    PE("PE",15.98),
    PI("PI",15.98),
    RN("RN",15.98),
    SE("SE",15.98),

    //Norte
    AC("AC",20.83),
    AM("AM",20.83),
    AP("AP",20.83),
    TO("TO",20.83),
    PA("PA",20.83),
    RR("RR",20.83),
    RO("RO",20.83);

    private String uf;
    private Double valor;

    FreteEnum(String uf, Double valor) {
        this.uf = uf;
        this.valor = valor;
    }

    public static Double getValorByUf(String uf){
        Optional<FreteEnum> frete = Arrays.stream(values()).filter(f -> f.uf.equals(uf)).findFirst();
        return frete.isPresent() ? frete.get().valor : null;
    }
}
