package br.com.contador.Cases;

public class CaseOne {

    public static void main(String[] args) {
        analisarCandidato(2700);
        analisarCandidato(2000);
        analisarCandidato(1900);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }

    }
}
