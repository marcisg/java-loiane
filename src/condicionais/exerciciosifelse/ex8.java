package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double primeirovalor = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundovalor = scan.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double terceirovalor = scan.nextDouble();

        if (primeirovalor <= segundovalor && primeirovalor <= terceirovalor) {
            System.out.println("O valor mais barato é " + primeirovalor);
        } else if (segundovalor <= primeirovalor && segundovalor <= terceirovalor) {
            System.out.println("O valor mais barato é " + segundovalor);
        } else if (terceirovalor <= primeirovalor && terceirovalor <= segundovalor) {
            System.out.println("O valor mais barato é " + terceirovalor);
        }
        scan.close();
    }
}

