package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex01 {

    /*1. Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja inválido e peça até que o usuário informe um valor válido.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor entre 0 e 10: ");
        double nota = scan.nextDouble();

        while (nota < 0 || nota > 10 ){
            System.out.println("Digite um valor entre 0 e 10: ");
            nota = scan.nextDouble();
        }
        System.out.println("A nota digitada foi: "+ nota);
        scan.close();
    }
}
