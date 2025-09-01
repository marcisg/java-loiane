package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex17{

    /* 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$80,00
    ou em galões de 3,6 litros, que custam R$25,00. Informe ao usuário as quantidades e os respectivos preços em 3 situações:
    a. comprar apenas latas de 18 litros;
    b. comprar apenas galões de 3,6;
    c. misturar latas e galões, de forma que o preço seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos metros quadrados de área a ser pintado?");
        double metrosquadrados = scan.nextDouble();
        double metrosporlitro = metrosquadrados/6;

        int latasde18 = (int)Math.ceil(metrosporlitro/18);
        double valorlatasde18 = (latasde18 * 80);

        int galoesde3e6 = (int)Math.ceil(metrosporlitro/3.6);
        double valorgaloesde3e6 = (galoesde3e6 * 25);

        double metroscomfolga = metrosporlitro * 1.10;
        int latasrestantes = (int)metroscomfolga/18;
        int litrosrestantes = (int)metroscomfolga - (latasrestantes * 18);
        int latasde3e6 = (int)Math.ceil(litrosrestantes/3.6) ;
        double valorfinal =  (latasde18 * 80) + (latasde3e6 * 25);


        System.out.println("===== APENAS LATAS DE 18L SEM FOLGA ===== ");
        System.out.println("Quantidade de latas: " + latasde18);
        System.out.println("Valor final: "+ valorlatasde18 );
        System.out.println();
        System.out.println("===== APENAS LATAS DE 3,6L SEM FOLGA ===== ");
        System.out.println("Quantidade de latas: " + galoesde3e6);
        System.out.println("Valor final: "+ valorgaloesde3e6);
        System.out.println();
        System.out.println("===== USANDO MISTURA DE DOIS TIPOS DE LATAS E COM FOLGA DE 10% ===== ");
        System.out.println("Quantidade de latas DE 18L: " + latasde18);
        System.out.println("Quantidade de latas DE 3,6L: " + latasde3e6);
        System.out.println("Valor final: "+ valorfinal);
        System.out.println();
        //System.out.println("Você precisa comprar " + latasde18 + " lata(s) de tinta de 18L com o valor de 80,00R$ e " + latasde3e6 + " lata(s) de 3,6L por 25,00R$, totalizando um valor final de " + valorfinal);





}
}
