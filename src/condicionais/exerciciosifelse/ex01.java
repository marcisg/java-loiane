package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1);
        } else {
            System.out.println("O maior número é " + numero2);
        }
        scan.close();
    }
}
