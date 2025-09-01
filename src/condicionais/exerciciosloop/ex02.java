package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex02 {

    /*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro
    e voltando a pedir as informações.*/

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
        scan.close();
    }
}
