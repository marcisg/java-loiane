package condicionais.exerciciosloop;

public class ex06 {

    /*6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro. */

    public static void main(String[] args) {

        for (int count = 1; count <=20 ; count++){
            System.out.println(count);
        }

        for (int count = 1; count <=20 ; count++){
            String.valueOf(count);
            System.out.printf(" "+ count);
        }
    }
}
