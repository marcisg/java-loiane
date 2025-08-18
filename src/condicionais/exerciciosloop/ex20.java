package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Digite um número para calcular o fatorial dele:");
            int num = scan.nextInt();
            int a;
            int somatorio = num;
            for (int i = 1; i < num; i++) {
                somatorio = i * somatorio;
            }
            System.out.println(" " + somatorio);

            scan.close();
        }
    }
}