package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex03 {

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
