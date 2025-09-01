package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de : ");
        int numero = scan.nextInt();
        System.out.print(""+ numero +"! = ");
        int soma = 1;

        for (int i = numero; i > 1; i--) {
            System.out.print(i + " * ");
            soma = soma * i;
        }
        System.out.print("1 = " + soma);

    }
}
