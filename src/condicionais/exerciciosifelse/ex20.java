package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex20 {

    /* 20. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
    a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
    b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
    c. A mensagem "Aprovado com distinção" se média fo igual a 10.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;

        if (media == 10){
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7 && media <10) {
            System.out.println("Aprovado.");
        } else if (media < 7 && media >0 ) {
            System.out.println("Reprovado.");
        }else {
            System.out.println("Notas inválidas, tente novamente.");
        }
        scan.close();
    }
}
