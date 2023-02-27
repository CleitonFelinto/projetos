package org.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;
import org.banco.model.Cliente;
import org.banco.model.ContaCorrente;
import org.banco.model.ContaPoupanca;
import org.banco.service.Conta;

public class Main {
    public static void main(String[] args) {
//        Cliente cleiton = new Cliente();
//        cleiton.setNome("Cleiton");
//
//        Conta cc = new ContaCorrente(cleiton);
//        Conta poupanca = new ContaPoupanca(cleiton);
//
//        cc.depositar(150);
//        cc.sacar(100);
//        cc.transferir(30, poupanca);
//
//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num);

        List<Integer> doub = new LinkedList<>();
        doub.addAll(num);
        Collections.shuffle(num);
        System.out.println(doub);
    }
}
