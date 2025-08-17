package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex14 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos quilos de peixe foram trazidos hoje: ");
        double quilospeixe = scan.nextDouble();
        int excesso = (int) ( quilospeixe - 50 ) ;
        double multa = 4* excesso;

        multa = Math.max(multa, 0);
        excesso = Math.max(excesso, 0);

        System.out.printf("O excesso de quilos de peixe foi de: %d ocasionando uma multa de: %.2fR$ \n",excesso, multa );

    }

}
