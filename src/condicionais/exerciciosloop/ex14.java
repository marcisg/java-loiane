package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex14 {

    /*14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int contimpar = 0;
        int contpar = 0;

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Digite o "+ (i+1) + " número: ");
            numero = scan.nextInt();

            if (numero%2==0) {
                contpar++;
            } else {
                contimpar++;
            }
        }
        System.out.println("Dentre os números digitados temos "+ contpar+ " números pares e "+ contimpar+ " números ímpares.");
        scan.close();
    }
}

