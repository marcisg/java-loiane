package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex05 {

    /* 5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada pelo aluno e apresentar:
    a. A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    b. A mensagem "Reprovado", se a média for menor do que sete;
    c. A mensagem "Aprovado com Distinção", se a média for 10.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double resultado = (nota1 + nota2) / 2;

        if (resultado >= 7 && resultado < 10) {
            System.out.println("Aprovado");
        } else if (resultado < 7 && resultado >= 0) {
            System.out.println("Reprovado");
        } else {
            switch ((int) resultado) {
                case 10:
                    System.out.println("Aprovado com Distinção"); break;
                default:
                    System.out.println("Notas inválidas, revise e insira novamente.");
            }

        }
        scan.close();
    }
}