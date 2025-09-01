package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex12 {

    /* 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule o seu peso ideal, usando a seguinte fórmula: (72,7 * altura) - 58*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Diga sua altura: ");
        double altura = scan.nextDouble();
        double resultado = (72.2 * altura) - 58;
        System.out.println("Seu peso ideal é: " + resultado);

    }
}
