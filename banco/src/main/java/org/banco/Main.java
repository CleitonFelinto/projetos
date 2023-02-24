package org.banco;

import org.banco.model.Cliente;
import org.banco.model.ContaCorrente;
import org.banco.model.ContaPoupanca;
import org.banco.service.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cleiton = new Cliente();
        cleiton.setNome("Cleiton");

        Conta cc = new ContaCorrente(cleiton);
        Conta poupanca = new ContaPoupanca(cleiton);

        cc.depositar(150);
        cc.sacar(100);
        cc.transferir(30, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
