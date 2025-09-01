package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex10 {

    /*10. Faça um programa que receba dois números inteiros e gere os números inteiros no intervalo compreendido por eles.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();
        int aux = 0;

        if (num2<num1){
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        num1 = num1 + 1;

        for(; num1 < num2; num1++){
            System.out.println(" "+ num1);
        }
        scan.close();

//        for (int i = num1; i <= num2 ; i++) {
//            System.out.println(" "+ i);
//        }


    }
}
