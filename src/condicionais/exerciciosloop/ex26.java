package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex26 {

    /*26. Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
    Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos eleitores vão votar? ");
        int eleitores = scan.nextInt();
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int voto = 0;

        for (int i = 0; i < eleitores; i++) {
            System.out.println("Qual seu voto? (1 , 2 ou 3)");
            voto = scan.nextInt();

            if (voto == 1 || voto == 2 || voto == 3){
                if (voto == 1){
                    candidato1++;
                } else if (voto == 2) {
                    candidato2++;
                } else {
                    candidato3++;
                }
            } else {
                System.out.println("Candidato inválido, tente novamente.");
            }

        }
        System.out.printf("\nCandidato 1 teve %d votos.\n", candidato1);
        System.out.printf("\nCandidato 2 teve %d votos.\n", candidato2);
        System.out.printf("\nCandidato 3 teve %d votos.\n", candidato3);
    }
}
