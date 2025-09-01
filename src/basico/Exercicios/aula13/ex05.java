package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex05 {

    /*5. Faça um Programa que converta metros para centímetros.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Total em metros: ");
        double metro = scan.nextDouble();
        double resultado = metro * 100;
        System.out.println("Em " + metro + "m" + " temos " + (int)resultado + " cm.");

    }
}
