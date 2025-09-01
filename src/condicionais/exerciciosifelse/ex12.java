package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex12 {

    /*12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
    e 3% para o Sindicato e o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
    O Salário Líquido corresponde ao Salário Bruto menos os descontos.
    O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
    Desconto do IR:
    Salário Bruto até 900 (inclusive) - isento
    Salário Bruto até 1500 (inclusive) - desconto de 5%
    Salário Bruto até 2500 (inclusive) - desconto de 10%
    Salário Bruto acima de 2500 - desconto de 20%
    Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
    Salário Bruto: (5 * 220) : R$1100,00
    (-) IR (5%): R$55,00
    (-) INSS ( 10%): R$110,00
    FGTS (11%): R$121,00
    Total de descontos: R$165,00
    Salário Líquido: R$935,00*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Valor da hora trabalhada: ");
        double horatrab = scan.nextDouble();
        System.out.println("Horas trabalhadas por mês: ");
        double horasmes = scan.nextDouble();
        double salariobruto = horasmes * horatrab;
        double desconto = 0;
        double impostoderenda = 0;
        double inss = 10;
        double descontoinss = 0;
        double FGTS = 11;
        double FGTSfinal = 0;
        double totaldescontos = 0;
        double salarioliquido = 0;

        if (salariobruto<=900){
            desconto = 0;

        }else if (salariobruto>900 && salariobruto<=1500){
            desconto = 5;

        }else if (salariobruto>1500 && salariobruto<=2500){
            desconto = 10;

        }else if (salariobruto>2500){
            desconto = 20;

        }

        impostoderenda = (salariobruto * (desconto/100));
        descontoinss = (salariobruto * (inss/100));
        FGTSfinal = (salariobruto * (FGTS/100));
        totaldescontos = impostoderenda + descontoinss;
        salarioliquido = salariobruto - totaldescontos;
        

        System.out.printf("Salário bruto: (%.2f * %.2f) : R$ %.2f", horatrab, horasmes, salariobruto);
        System.out.println(" ");
        System.out.printf("(-) IR (%.2f%s): R$ %.2f", desconto, "%", impostoderenda);
        System.out.println(" ");
        System.out.printf("(-) INSS (%.2f%s): R$ %.2f ", inss, "%", descontoinss);
        System.out.println(" ");
        System.out.printf("FGTS (%.2f%s): R$ %.2f", FGTS, "%", FGTSfinal);
        System.out.println(" ");
        System.out.printf("Total de descontos: R$ %.2f ", totaldescontos);
        System.out.println(" ");
        System.out.printf("Salário Líquido: R$ %.2f ", salarioliquido);
        scan.close();



    }
}
