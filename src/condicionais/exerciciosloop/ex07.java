package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex07 {

    /*7. Faça um programa que leia 5 números e informe o maior número.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite o primeiro número: ");
//        int num1 = scan.nextInt();
//        System.out.println("Digite o segundo número: ");
//        int num2 = scan.nextInt();
//        System.out.println("Digite o terceiro número: ");
//        int num3 = scan.nextInt();
//        System.out.println("Digite o quarto número: ");
//        int num4 = scan.nextInt();
//        System.out.println("Digite o quinto número: ");
//        int num5 = scan.nextInt();

//        while ((num1 > num2) && (num1 >num3) && (num1 > num4) && (num1 > num5)){
//            System.out.println("O " + num1 + " é o maior de todos.");
//        }
//        while ((num2 > num1) && (num2 >num3) && (num2 > num4) && (num2 > num5)){
//            System.out.println("O " + num2 + " é o maior de todos.");
//        }
//        while ((num3 > num1) && (num3 >num2) && (num3 > num4) && (num3 > num5)){
//            System.out.println("O " + num3 + " é o maior de todos.");
//        }
//        while ((num4 > num1) && (num4 >num2) && (num4 > num3) && (num4 > num5)){
//            System.out.println("O " + num4 + " é o maior de todos.");
//        }
//        while ((num5 > num1) && (num5 >num2) && (num5 > num3) && (num5 > num4)){
//            System.out.println("O " + num5 + " é o maior de todos.");
//        }


        int numeromaior = 0;
        int numeronovo = 0;

        for (int i = 0; i < 5; i++){ //o "i" é um contador, indica que a ação vai acontecer x vezes// segunda parte indica que enquanto o i (contador) com menor que 5, a ação vai acontecer// depois da ação ele aumenta o i (contador) em 1
            System.out.println("Digite o "+ (i+1) + " número: ");
            numeronovo = scan.nextInt();
            if (numeronovo > numeromaior){
                numeromaior = numeronovo;
            }
        }
        System.out.println("O número " + numeromaior + " é o maior de todos.");
        scan.close();

//        for (;num1 > num2 ;){
//            for (;num1 > num3;){
//                for (;num1 > num4;){
//                    for (;num1 > num5;){
//                        System.out.println("O " + num1 + " é o maior de todos.");
//                    }
//                }
//            }
//
//        }


    }
}
