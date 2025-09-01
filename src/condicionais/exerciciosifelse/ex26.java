package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex26 {

    /*26. Um posto vende combustíveis com a seguinte tabela de descontos:
    Álcool:
    a. até 20 litros, desconto de 3% por litro;
    b. acima de 20 litros, desconto de 5% por litro.
    Gasolina:
    c. até 20 litros, desconto de 4% por litro;
    d. acima de 20 litros, desconto de 6% por litro.
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor
    a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$2,50 o preço do litro do álcool é R$1,90.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double alcoolvalor = 1.90;
        double alcooldesconto = 0;
        double gasolinavalor = 2.50;
        double gasolinadesconto = 0;
        System.out.println("Qual combustível vai querer? A ou G ");
        String combustivel = scan.nextLine();
        System.out.println("Quantos litros de combustível?");
        double litros = scan.nextDouble();

        if ("A".equalsIgnoreCase(combustivel)){
            if (litros<=20){
                alcooldesconto = (double) 3/100;
                alcooldesconto = alcooldesconto * alcoolvalor;
                alcoolvalor = alcoolvalor - alcooldesconto;
                alcoolvalor = alcoolvalor * litros;
                alcoolvalor = (alcoolvalor - alcooldesconto);
                System.out.printf("O valor a ser pago é: %.2f ", alcoolvalor);
            }else if (litros>20){
                alcooldesconto = (double) 5/100;
                alcooldesconto = alcooldesconto * alcoolvalor;
                alcoolvalor = alcoolvalor - alcooldesconto;
                alcoolvalor = alcoolvalor * litros;
                alcoolvalor = (alcoolvalor - alcooldesconto);
                System.out.printf("O valor a ser pago é: %.2f ", alcoolvalor);
            }
        }else if ("G".equalsIgnoreCase(combustivel)){
            if (litros<=20){
                gasolinadesconto = (double) 4/100;
                gasolinadesconto = gasolinadesconto * gasolinavalor;
                gasolinavalor = gasolinavalor - gasolinadesconto;
                gasolinavalor = gasolinavalor * litros;
                gasolinavalor = (gasolinavalor - gasolinadesconto);
                System.out.printf("O valor a ser pago é: %.2f ", gasolinavalor);
            }else if (litros>20){
                gasolinadesconto = (double) 6/100;
                gasolinadesconto = gasolinadesconto * gasolinavalor;
                gasolinavalor = gasolinavalor - gasolinadesconto;
                gasolinavalor = gasolinavalor * litros;
                gasolinavalor = (gasolinavalor - gasolinadesconto);
                System.out.printf("O valor a ser pago é: %.2f ", gasolinavalor);
            }
        }

        scan.close();

    }
}

