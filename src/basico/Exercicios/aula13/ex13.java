package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex13 {

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
