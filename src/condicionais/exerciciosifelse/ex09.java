package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex09 {

    /*9. Faça um Programa que leia três números o mostre-os em ordem decrescente.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeironum = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundonum = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double terceironum = scan.nextDouble();

        if (primeironum <= segundonum && primeironum <= terceironum && segundonum <= terceironum) {
            System.out.println("A ordem decrescente dos números é " + terceironum + " -> " + segundonum + " -> " + primeironum);
        } else if (primeironum <= segundonum && primeironum <= terceironum && terceironum <= segundonum) {
            System.out.println("A ordem decrescente dos números é " + segundonum + " -> " + terceironum + " -> " + primeironum);
        } else if (segundonum <= primeironum && segundonum <= terceironum && primeironum <= terceironum) {
            System.out.println("A ordem decrescente dos números é " + terceironum + " -> " + primeironum + " -> " + segundonum);
        } else if (segundonum <= primeironum && segundonum <= terceironum && primeironum <= terceironum) {
            System.out.println("A ordem decrescente dos números é " + terceironum + " -> " + primeironum + " -> " + segundonum);
        } else if (segundonum <= primeironum && segundonum <= terceironum && terceironum <= primeironum) {
            System.out.println("A ordem decrescente dos números é " + primeironum + " -> " + terceironum + " -> " + segundonum);
        } else if (terceironum <= primeironum && terceironum <= segundonum && primeironum <= segundonum) {
            System.out.println("A ordem decrescente dos números é " + segundonum + " -> " + primeironum + " -> " + terceironum);
        } else if (terceironum <= primeironum && terceironum <= segundonum && segundonum <= primeironum){
            System.out.println("A ordem decrescente dos números é " + primeironum + " -> " + segundonum + " -> " + terceironum);
        }
        scan.close();
    }
}