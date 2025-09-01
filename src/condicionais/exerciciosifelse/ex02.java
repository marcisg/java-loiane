package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex02 {

    /*2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scan.nextInt();

        if (numero1 >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        scan.close();
    }
}
