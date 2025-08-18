package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma letra");
        char letra = read.next().charAt(0);

        if (!Character.isLetter(letra)) {
            System.out.println("Entrada inválida, digite apenas letras.");
        } else {
            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vogal."); break;
                default:
                    System.out.println("Consoante.");
            }
        }
        read.close();



         //outra forma de fazer

        /*if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
            } */
    }
}


