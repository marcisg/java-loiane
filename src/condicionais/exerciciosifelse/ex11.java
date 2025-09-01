package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex11 {

    /*11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e contrataram você para desenvolver o programa que calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    a. salários até R$280,00 (incluindo) : aumento de 20%
    b. salários entre R$280,00 e R$700,00: aumento de 15%
    c. salários entre R$700,00 e R$1500,00: aumento de 10%
    d. salários de R$1500,00 em diante: aumento de 5%
    Após o aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    O novo salário, após o aumento. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu salário?");
        double salario = scan.nextDouble();
        double porcentagem = 0;
        double reajuste = 1;

        System.out.printf("Salário antes do reajuste: %.2fR$", salario);
        System.out.println(" ");

        if (salario <= 280.00){
            porcentagem = 20;

        }else if (salario > 280.00 && salario <= 700.00) {
            porcentagem = 15;

        } else if (salario > 700.00 && salario <= 1500.00 ) {
            porcentagem =10;

        } else if (salario > 1500.00){
            porcentagem = 5;

        }
        reajuste = salario * (porcentagem /100);
        System.out.printf("Percentual do aumento: %.2f%s", porcentagem, "%");
        System.out.println(" ");
        System.out.printf("Valor do aumento: %.2fR$", reajuste);
        System.out.println(" ");
        System.out.printf("Novo salário após o aumento: %.2fR$", (reajuste + salario));
        System.out.println(" ");
        scan.close();
    }


}
