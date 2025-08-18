package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex24 {

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double numero2 = scan.nextDouble();
        System.out.println("Digite operação quer fazer: ");
        System.out.println("1- Adição (+) ");
        System.out.println("2- Subtração (-)");
        System.out.println("3- Multiplicação (*)");
        System.out.println("4- Divisão (/)");
        int op = scan.nextInt();
        double valorfinal = 0;


        if (op == 1){
            valorfinal = (numero1+numero2);
        } else if (op == 2) {
            valorfinal = (numero1-numero2);
        } else if (op == 3) {
            valorfinal = (numero1*numero2);
        } else if (op == 4) {
            valorfinal = (numero1/numero2);
        }else {
            System.out.println("Entradas inválidas");
        }

            System.out.println("O resultado da operação é "+ valorfinal);


        if (valorfinal >= 0) {
           System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

            if (valorfinal % 2 == 0){
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
            if (valorfinal % 2 == 0 || valorfinal % 2 == 1){
                System.out.println("É um número inteiro.");
            }else {
                System.out.println("É um número decimal.");
            }
            scan.close();
    }
}

