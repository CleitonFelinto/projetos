package br.com.contador.Cases;

import java.util.concurrent.ThreadLocalRandom;

public class CaseTwo {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String candidatos[] = {"FELIPE", "MARCIA", "JOAQUIM", "PEDRO", "MONICA", "RAFAELA", "BRUNA", "CLEITON"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatoAtual <= candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioDesejado = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este salário: " + salarioDesejado);
            if(salarioBase >= salarioDesejado){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
                candidatoAtual++;
            }
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
