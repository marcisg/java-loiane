package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma base: ");
        double base = scan.nextDouble();
        double resultado = base;
        double resultfinal = base;
        int resultadofinalmesmo = 0;


        while (base <= 0 ){
            System.out.println("Base inválida.");
            System.out.println("Digite uma base: ");
            base = scan.nextDouble();
        }

        System.out.println("Digite um expoente: ");
        double expoente = scan.nextDouble();

        while (expoente <= 0 ){
            System.out.println("Expoente inválido.");
            System.out.println("Digite um expoente: ");
            expoente = scan.nextDouble();
        }

        for (int i = 1; i < expoente; i++) {
           resultado = resultado * resultfinal;
           resultfinal = base;
           resultadofinalmesmo = (int) resultado;

        }
        System.out.println(" "+ resultadofinalmesmo);
        scan.close();
    }
}
