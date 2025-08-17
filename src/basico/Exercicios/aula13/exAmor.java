package basico.Exercicios.aula13;

import java.util.Scanner;

public class exAmor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe um número: ");
        int A = scan.nextInt();
        System.out.println("Informe outro número: ");
        int B = scan.nextInt();
        System.out.println("Antes da troca o valor de A era " + A + " e o valor de B era " + B + ".");
        // C é uma variavel auxíliar
        int C = A;
        A = B;
        B = C;
        System.out.println("Depois da troca o valor de A passou a ser " + A + " e o valor de B " + B + ".");

//        System.out.println("Escreva uma fruta: ");
//        String fruta1 = scan.nextLine();//laranja
//        System.out.println("Escreva outra fruta: ");
//        String fruta2 = scan.nextLine();//limao
//        System.out.println("Fruta1: " + fruta1); //laranja
//        System.out.println("Fruta2: " + fruta2); // limão
//        String valorfruta = fruta1;//laranja
//        fruta1 = fruta2;// limão
//        fruta2 = valorfruta; // laranja
//        System.out.println("Fruta1: " + fruta1); //limão
//        System.out.println("Fruta2: " + fruta2); //laranja


    }
}
