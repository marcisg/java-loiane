package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double primeironumero = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double segundonumero = scan.nextDouble();
        System.out.println("Digite um último número: ");
        double terceironumero = scan.nextDouble();

        if (primeironumero > segundonumero && primeironumero > terceironumero) {
            System.out.println("O maior número é " +primeironumero);
        } else if (segundonumero > primeironumero && segundonumero > terceironumero) {
            System.out.println("O maior número é " +segundonumero);
        } else if (terceironumero > primeironumero && terceironumero > segundonumero) {
            System.out.println("O maior número é " + terceironumero);
        } else {
            System.out.println("Os números devem ser diferentes!");
        }
        scan.close();
    }
}
