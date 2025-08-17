package basico.Exercicios.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            DecimalFormat formatar = new DecimalFormat("0.00");

            System.out.println("Digite a temperatura em Celsius");
            double valorf = scan.nextDouble();
            double resultado = ((valorf * 1.8) + 32);
            System.out.println("Em graus Farenheit essa temperatura é " + formatar.format(resultado));

        }

}
