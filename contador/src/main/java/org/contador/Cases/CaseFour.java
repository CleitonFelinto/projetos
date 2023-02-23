package org.contador.Cases;

import java.util.Random;

public class CaseFour {
    public static void main(String[] args) {
        String candidatos[] = {"FELIPE", "MARCIA", "JOAQUIM", "PEDRO", "MONICA", "RAFAELA", "BRUNA", "CLEITON"};
        for(String candidato : candidatos){
            tentarContato(candidato);
        }
    }

    private static void tentarContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativas <3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativas + " TENTATIVA REALIZADA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ". " + tentativas + " TENTATIVAS REALIZADAS");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
