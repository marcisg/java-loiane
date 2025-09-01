package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex02 {

    /*2. Façaa um Programa que peca um número e então mostre a mensagem "O número informado foi [número]".*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = scan.nextInt();

        System.out.println("O número infromado foi: " + valor);
    }
}
