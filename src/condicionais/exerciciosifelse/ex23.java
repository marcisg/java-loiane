package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex23 {

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
