package condicionais.if_else;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        if ( idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }

    }
}
