package basico.Exercicios.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex15 {

    /*15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
    sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    a. Salário bruto.
    b. Quanto pagou ao INSS.
    c. Quanto pagou ao sindicato.
    d. O salário líquido.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Quanto você ganha por hora?");
        double valorhora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        int horatrab = scan.nextInt();
        double resultado = valorhora * horatrab;
        double valorinss8 = (0.08 * resultado);
        double valorsind5 = (0.05 * resultado);
        double valorsimp11 = (0.11 * resultado);
        double salarioL = resultado - (valorinss8 + valorsind5 + valorsimp11);



        System.out.println("Trabalhando " + horatrab + " horas por mês e ganhando " + formatar.format(valorhora) + "R$ por hora, no final do mês você vai ganhar " + formatar.format(resultado) + "R$.");
        System.out.println("Sabendo que se paga 8% ao INSS, referente à esse salário será pago " + formatar.format(valorinss8) + "R$.");
        System.out.println("Ao sindicato foi pago " + formatar.format(valorsind5) + "R$.");
        System.out.println("O salário líquido somando os descontos citados  mais o imposto de " + valorsimp11 + " é " + formatar.format(salarioL) + "R$.");


    }
}
