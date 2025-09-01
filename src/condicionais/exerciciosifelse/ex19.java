package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex19 {

    /* 19. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
    Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
    326 = 3 centenas, 2 dezenas e 6 unidades;
    12 = 1 dezena e 2 unidades;
    Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10,21, 11, 1,7 e 16.*/

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

