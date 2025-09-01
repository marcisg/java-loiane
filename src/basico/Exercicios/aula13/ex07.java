package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex07 {

    /* 7. Faça um Programa que calcule a área de um quadrado, e em seguida mostre o dobro desta área para o usuário.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor de um dos lado do quadrado? ");
        double lado = scan.nextDouble();
        double resultado = (Math.pow(lado, 2)) * 2;
        System.out.println("O dobro da área do quadrado é " + (int)resultado);


    }
}
