package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int inteiro1 = scan.nextInt();
        System.out.println("Digite outro número inteiro:");
        int inteiro2 = scan.nextInt();
        System.out.println("Digite outro número com vírgula:");
        double numv = scan.nextDouble();

        int resultado1 = (inteiro1 * 2) % (inteiro2 / 2);
        System.out.println("Mostre o produto do dobro do primeiro com metade do segundo:" + resultado1);

        double resultado2 = (inteiro1 * 3) + numv;
        System.out.println("Mostre a soma do triplo do primeiro com o terceiro: " + resultado2);

        double resultado3 = Math.pow(numv, 3);
        System.out.println("Mostre o valor do terceiro elevado ao cubo " + resultado3);
    }
}
