package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex16{

    /*16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$80,00.
    Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos metros quadrados de área a ser pintado?");
        double metrosquadrados = scan.nextFloat();
        double latadetinta = Math.ceil(metrosquadrados/54);
        double precofinal = latadetinta * 80;

        System.out.println("Quantidade de latas: " + (int)latadetinta);
        System.out.println("Preço total: R$ " + precofinal);

    }

    }

