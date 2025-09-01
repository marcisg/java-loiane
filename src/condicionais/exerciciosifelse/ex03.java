package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex03 {

    /* 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu sexo: (F ou M)");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Seu sexo é Feminino.");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Seu sexo é masculino.");
        } else {
            System.out.println("Sexo inválido.");
        }
        scan.close();
    }
}
