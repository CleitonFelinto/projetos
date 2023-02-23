package org.contador.Cases;

public class CaseThree {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String candidatos[] = {"FELIPE", "MARCIA", "JOAQUIM", "PEDRO", "MONICA", "RAFAELA", "BRUNA", "CLEITON"};
        System.out.println("Candidatos: ");
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de número: " + (i+1) + " é " + candidatos[i]);
        }

        for (String candidato : candidatos){
            System.out.println("O candidato é " + candidato);
        }
    }
}
