package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex20 {

    /*20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números
    inteiros positivos e menores que 16.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número (Entre 1 e 16) para calcular o fatorial dele: ");
        int num = scan.nextInt();


        while (num > 0 && num <= 16){
            int somatorio = num;
            for (int i = 1; i < num; i++) {
                somatorio = i * somatorio;
                System.out.println(" " + somatorio);
            }
            System.out.println("Digite um número (Entre 1 e 16) para calcular o fatorial dele: ");
            num = scan.nextInt();
        }
        System.out.printf("Você inseriu um número inválido: %d", num);
        scan.close();
    }

}