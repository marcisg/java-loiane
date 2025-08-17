package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o raio do círculo? ");
        double raio = scan.nextDouble();
        double resultado = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é %.2f", resultado);

    }
}
