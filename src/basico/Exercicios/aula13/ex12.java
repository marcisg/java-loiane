package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Diga sua altura: ");
        double altura = scan.nextDouble();
        double resultado = (72.2 * altura) - 58;
        System.out.println("Seu peso ideal é: " + resultado);

    }
}
