package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex23 {

    /*23. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
    O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
    Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        int totdiv = 0;

        System.out.printf("Números primos entre 1 e %d: \n", num);

        for (int i = 2; i <= num; i++) {
            boolean verificador = true;

            for (int n = 2; n <= Math.sqrt(i); n++) {
                totdiv++;
                if (i % n == 0) {
                    verificador = false;
                    break;
                }
            }

            if (verificador){
                System.out.print(i + " ");
            }
        }

        System.out.printf("\nNúmero total de divisões executadas: %d", totdiv);
        scan.close();
    }
}

