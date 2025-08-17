package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número (1 a 10) do qual deseja ver a tabuada");
        int multi = scan.nextInt();
        int resultado = 0;


        while (multi<0 || multi>10) {
            System.out.println("Entrada inválida.");
            System.out.println("Digite o número (1 a 10) do qual deseja ver a tabuada");
            multi = scan.nextInt();
        }


        for (int i = 0; i <= 10; i++) {
            resultado = multi * i;
            System.out.println(" " + multi + " x " + i + " = " + resultado);
        }

    }



}


