package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex21 {

    /*21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        boolean verificador = true;


        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    verificador = false;
                    break;
                }
            }
        } else {
            verificador = false;
        }

        if (verificador) {
            System.out.printf("O número %d é primo.\n", num);
        } else {
            System.out.printf("O número %d não é primo.", num);
        }
    }
}
