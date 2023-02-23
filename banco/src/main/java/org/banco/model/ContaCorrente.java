package org.banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.banco.service.Conta;

@AllArgsConstructor
@Getter
@Setter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
