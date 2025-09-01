package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex18 {

    /*18. Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.*/

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Digite quantos números deseja somar: ");
        int n1 = scan.nextInt();
        int num = 0;
        int auxiliar = 0;

        for (int i = 0; i < n1; i++) {
            System.out.println("Digite o "+ (i+1) + " número: ");
            num = scan.nextInt();
            auxiliar = num + auxiliar;
        }
        System.out.println("A soma de todos os números é: "+ auxiliar);
        scan.close();
    }


}
