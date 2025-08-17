package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double precomorango = 0;
        double precomaca = 0;
        System.out.println("Quantos quilos de morango você deseja?");
        double kgmorango = scan.nextDouble();
        System.out.println("Quantos quilos de maçã você deseja?");
        double kgmaca = scan.nextDouble();
        double totalmorango = 0;
        double totalmaca= 0;



        if (kgmorango<=5){
            precomorango = 2.50;
            totalmorango = kgmorango * precomorango;
        }else if (kgmorango>5){
            precomorango = 2.20;
            totalmorango = kgmorango * precomorango;
        }if (kgmaca<=5){
            precomaca = 1.80;
            totalmaca = kgmaca * precomaca;
        } else if (kgmaca>5) {
            precomaca = 1.50;
            totalmaca = kgmaca * precomaca;
        }

        double totalfrutaspreco = totalmaca + totalmorango;
        double totalkgdefruta = kgmaca + kgmorango;
        if (totalkgdefruta>8 || totalfrutaspreco>25){
            double desconto = ((double) 10 /100);
            desconto = totalfrutaspreco * desconto;
            totalfrutaspreco = totalfrutaspreco - desconto;
        }
        System.out.printf("O valor a ser pago é: %.2f ", totalfrutaspreco);

        }

    }
