package org.banco.service;

import java.util.Queue;
import java.util.Stack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.banco.model.Cliente;
import org.banco.exception.SaldoException;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Conta implements ContaService {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo){
            throw new SaldoException("NÃO É POSSÌVEL REALIZAR OPERAÇÃO. SALDO EM CONTA MENOR QUE O VALOR SOLICITADO");
        }
        else
            saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaService contaDestino) {
        if (valor > this.saldo){
            throw new SaldoException("NÃO É POSSÌVEL REALIZAR OPERAÇÃO. SALDO EM CONTA MENOR QUE O VALOR SOLICITADO");
        }
        else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public abstract void imprimirExtrato();
}
