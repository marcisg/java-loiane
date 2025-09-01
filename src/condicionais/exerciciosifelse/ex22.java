package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex22 {

    /*22. Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar. Dica: utilize o operador módulo (resto da divisão).*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.printf("%d é par.", num);
            System.out.println(" ");
        } else {
            System.out.printf("%d é ímpar.", num);
            System.out.println(" ");
        }
        scan.close();
    }
}
