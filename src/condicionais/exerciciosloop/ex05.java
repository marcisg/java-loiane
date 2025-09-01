package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex05 {

    /*5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double resultadoA = 0;
        double resultadoB = 0;
        int cont = 0;
        double paisA = 0;
        double paisB = 0;

        System.out.println("Entre com o número de habitantes do primeiro País: ");
        paisA = scan.nextDouble();

        while ((paisA <= 0) || (paisA >= 1000000000)){
            System.out.println("Entrada inválida. Digite novamente");
            System.out.println("Entre com o número de habitantes do primeiro País: ");
            paisA = scan.nextDouble();

        }
        System.out.println("Número de habitantes valido.");
        System.out.println("Entre com o número da taxa de crescimento primeiro País: ");
        double taxapaisA = scan.nextDouble();

        while (taxapaisA <= 0  || taxapaisA >= 100){
            System.out.println("Entrada inválida. Digite novamente");
            System.out.println("Entre com o número da taxa de crescimento primeiro País: ");
            taxapaisA = scan.nextDouble();
        }

        System.out.println("Número da taxa valido.");
        System.out.println("Entre com o número de habitantes do segundo País: ");
        paisB = scan.nextDouble();

        while ((paisB <= paisA) || (paisB >= 1000000000)){
            System.out.println("Entrada inválida. Digite novamente");
            System.out.println("Entre com o número de habitantes do segundo País: ");
            paisB = scan.nextDouble();
        }

        System.out.println("Número de habitantes valido.");
        System.out.println("Entre com o número da taxa de crescimento segundo País: ");
        double taxapaisB = scan.nextDouble();

        while (taxapaisB <= 0  || taxapaisB >= 100){
            System.out.println("Entrada inválida. Digite novamente");
            System.out.println("Entre com o número da taxa de crescimento primeiro País: ");
            taxapaisB = scan.nextDouble();
        }
        do {
            resultadoA = ((double) paisA /100) * taxapaisA;
            paisA = (paisA + resultadoA);
            resultadoB = ((double) paisB /100) * taxapaisB;
            paisB = (paisB + resultadoB);
            cont++;
        }
        while (paisA <= paisB);
        System.out.println("Depois de " + cont + " anos o primeiro País vai passar o  segundo País em população.");
        scan.close();
    }


}
