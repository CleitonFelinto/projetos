package org.banco.service;

public interface ContaInterface {

    void sacar(double valor);

    void depositar(double valor, ContaInterface contaDestino);

    void transferir(double valor, ContaInterface contaDestino);

    void imprimirExtrato();
}
