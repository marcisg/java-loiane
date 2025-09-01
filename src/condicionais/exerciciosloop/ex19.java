package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex19 {

    /*19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos números deseja somar: ");
        int n1 = scan.nextInt();
        int num = 0;
        int auxiliar = 0;

        for (int i = 0; i < n1; i++) {
            do {
                System.out.println("Digite o "+ (i+1) + " número: ");
                num = scan.nextInt();
                if (num < 0 || num > 1000){
                    System.out.println("Somente é aceito números entre 1 e 999");
                }
            } while (num <= 0 || num >= 1000);
            auxiliar = num + auxiliar;
        }
        System.out.println("A soma de todos os números é: "+ auxiliar);
        scan.close();
    }
}
