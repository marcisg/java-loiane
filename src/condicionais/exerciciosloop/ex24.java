package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas você quer calcular?");
        int ndenotas = scan.nextInt();
        double media = 0;

        for (int i = 1; i <= ndenotas; i++) {
            System.out.println("Diga a nota número " + i);
            double nota = scan.nextDouble();
            media = media + nota;
        }

        media = media / ndenotas;

        System.out.println("A média aritmética das notas é: " + media);
        scan.close();
    }
}