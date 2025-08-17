package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex26 {

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







        }
}

