package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex12 {

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




    }
}
