package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex12 {

    /*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a
    tabuada. A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50*/

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
        scan.close();

    }



}


