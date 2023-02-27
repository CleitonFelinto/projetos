package org.banco.service;

public interface ContaService {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaService contaDestino);

    void imprimirExtrato();
}
