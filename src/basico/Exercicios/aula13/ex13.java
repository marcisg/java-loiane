package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex13 {

    /* 13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule o seu peso ideal, utilizando as seguintes fórmulas:
    a. Para homens: (72,7*h) - 58
    b. Para mulheres: (62,1*h) - 44,7 (h = altura)
    Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.*/

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Você é homem ou mulher?");
        String sexo = scan.next();

        double homem = (72.7 * altura) - 58;
        double mulher = (62.1 * altura) - 44.7;

        System.out.println("Se você for homem seu peso ideal é: " + homem);
        System.out.println("Se você for mulher seu peso ideal é: " + mulher);









    }
}
