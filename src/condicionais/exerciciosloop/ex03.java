package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex03 {

    /*3. Faça um programa que leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: 'f' ou 'm';
    e. Estado Civil: 's', 'c', 'v', 'd';*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        while (nome.length() < 3) {
            System.out.println("Nome inválido.");
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
        }
        System.out.println("Nome válido.");
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida.");
            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Idade válida.");
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();
        while (salario < 0) {
            System.out.println("Salário inválido.");
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
        }
        System.out.println("Salário válido.");
        System.out.println("Digite seu sexo: (F ou M)");
        String sexo = scan.next();

        while (!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo)) {
            System.out.println("Sexo inválido.");
            System.out.println("Digite seu sexo: (F ou M");
            sexo = scan.next();
        }
        System.out.println("Sexo válido.");
        System.out.println("Digite seu estado civil: ( S, C, V ou D.");
        String civil = scan.next();

        while (!"s".equalsIgnoreCase(civil)  && !"c".equalsIgnoreCase(civil) &&
                !"v".equalsIgnoreCase(civil)  && !"d".equalsIgnoreCase(civil) ) {
            System.out.println("Estado civil inválido.");
            System.out.println("Digite seu estado civil: ( S, C, V ou D.");
            civil = scan.next();
        }


        if ("s".equalsIgnoreCase(civil)) {
                civil = "Solteir";
            } else if ("c".equalsIgnoreCase(civil)) {
                civil = "Casad";
            } else if ("v".equalsIgnoreCase(civil)) {
                civil = "Viúv";
            } else if ("d".equalsIgnoreCase(civil)) {
                civil = "Divorciad";
            }

        if ("f".equalsIgnoreCase(sexo)) {
            sexo = "Feminino.";
            civil = civil + "a.";
//            if ("s".equalsIgnoreCase(civil)) {
//                civil = "Solteira.";
//            } else if ("c".equalsIgnoreCase(civil)) {
//                civil = "Casada.";
//            } else if ("v".equalsIgnoreCase(civil)) {
//                civil = "Viúva.";
//            } else if ("d".equalsIgnoreCase(civil)) {
//                civil = "Divorciada.";
//            }
        } else if ("m".equalsIgnoreCase(sexo)) {
            sexo = "Masculino.";
            civil = civil + "o.";
//            if ("s".equalsIgnoreCase(civil)) {
//                civil = "Solteiro.";
//            } else if ("c".equalsIgnoreCase(civil)) {
//                civil = "Casado.";
//            } else if ("v".equalsIgnoreCase(civil)) {
//                civil = "Viúvo.";
//            } else if ("d".equalsIgnoreCase(civil)) {
//                civil = "Divorciado.";
//            }
        }

        System.out.println("Estado civil válido.");
        System.out.println("Dados cadastrados com sucesso");
        System.out.println("Nome: " + nome + ".");
        System.out.println("Idade: " + idade + " anos.");
        System.out.printf("Salário: %.2fR$", salario);
        System.out.println(" ");
        System.out.println("Sexo: " + sexo);
        System.out.println("EStado civil: " + civil);
        scan.close();
    }
}
