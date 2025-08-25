package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex23 {

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

