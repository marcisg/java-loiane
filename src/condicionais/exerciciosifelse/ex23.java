package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex23 {

    /*23. Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número ");
        double num = scan.nextDouble();

        double numarredondado = Math.floor(num);

        if (num == numarredondado) {
            System.out.println("É um número inteiro.");
        } else {
            System.out.println("É um número decimal.");
        }
        scan.close();

        //Acima como o exercício pede, abaixo como eu tinha pensado.
        //if (num % 2 == 0 || num % 2 == 1){
        //    System.out.println("É um número inteiro.");
        //}else {
        //    System.out.println("É um número decimal.");
        // }

    }
}
