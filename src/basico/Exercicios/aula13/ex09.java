package basico.Exercicios.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Digite a temperatura em Farenheit");
        double valorf = scan.nextDouble();
        double resultado = (5*(valorf - 32)/9);
        System.out.println("Em graus Celsius essa temperatura é " + formatar.format(resultado) + "º.");

    }
}
