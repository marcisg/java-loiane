package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");
        String nome = scan.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scan.nextLine();

        while (senha.equalsIgnoreCase(nome) ){
            System.out.println("ERRO DE LOGIN, DIGITE NOVAMENTE.");
            System.out.println("Digite o nome de usuário: ");
            nome = scan.nextLine();
            System.out.println("Digite a senha: ");
            senha = scan.nextLine();
        }
        System.out.println("Login efetuado com sucesso");
    }
}
