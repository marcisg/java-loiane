package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor1 = scan.nextInt();
        System.out.println("digite outro número: ");
        int valor2 = scan.nextInt();
        int resultado = valor1 +valor2;
        System.out.println("O resultado da soma de " + valor1 +" com " + valor2 + " é: " + resultado);
    }
}
