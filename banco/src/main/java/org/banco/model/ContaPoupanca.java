package org.banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.banco.service.Conta;

@AllArgsConstructor
@Getter
@Setter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
