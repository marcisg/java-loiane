package basico.Exercicios.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Quanto você ganha por hora?");
        double valorhora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        double horatrab = scan.nextDouble();
        double resultado = valorhora * horatrab;

        System.out.println("Trabalhando " + horatrab + " horas por mês e ganhando " + formatar.format(valorhora) + "R$ por hora, no final do mês você vai ganhar " + formatar.format(resultado) + "R$");


    }


}
