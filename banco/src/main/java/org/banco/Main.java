package org.banco;

import org.banco.model.Cliente;
import org.banco.service.Conta;
import org.banco.model.ContaCorrente;
import org.banco.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cleiton = new Cliente();
        cleiton.setNome("Cleiton");

        Conta cc = new ContaCorrente(cleiton);
        Conta poupanca = new ContaPoupanca(cleiton);

        cc.depositar(150, cc);
        cc.sacar(160);
        cc.transferir(230, poupanca);

//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();
    }
}
