package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex32 {


    /*32- Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1 = 120. A saída deve ser conforme o exemplo abaixo:
    Fatorial de: 5
    5! = 5 . 4 . 3 . 2 . 1 = 120
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de : ");
        int numero = scan.nextInt();
        System.out.print(""+ numero +"! = ");
        int soma = 1;

        for (int i = numero; i > 1; i--) {
            System.out.print(i + " * ");
            soma = soma * i;
        }
        System.out.print("1 = " + soma);
        System.out.println("\n");

    }
}
