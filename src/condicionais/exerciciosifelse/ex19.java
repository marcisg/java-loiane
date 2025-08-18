package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 1000");
        int numero = scan.nextInt();
        String cento = "0";
        int cent = 0;
        int dez = 0;
        String deze = "0";
        String unitexto = "0";


        if (numero > 0 && numero < 1000) {
            System.out.print(numero + "= ");

            if (numero / 100 > 0) {
                cent = numero / 100;
                cento = (cent == 1) ? "centena" : "centenas";
                System.out.printf("%d %s,", cent, cento);
                numero = numero % 100;
            }
            if (numero / 10 > 0) {
                dez = numero / 10;
                deze = (dez == 1) ? "dezena" : "dezenas";
                numero = numero % 10;
                System.out.printf(" %d %s e ", dez, deze);
            }

            unitexto = (numero == 1) ? "unidade" : "unidades";
            System.out.printf("%d %s. ", numero, unitexto);
        }
        scan.close();
    }
}

