package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex14 {

    /* 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário do seu trabalho.
    Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
    deve pagar uma multa de R$4,00 por kg excedente. João precisa que você faça um programa que leia a variável (peso de peixes) e verifique se há excesso.
    Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

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
