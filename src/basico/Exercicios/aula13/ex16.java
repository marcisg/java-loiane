package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex16{

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

