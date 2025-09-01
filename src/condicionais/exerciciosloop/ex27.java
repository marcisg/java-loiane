package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas turmas?");
        int qtdturmas = scan.nextInt();
        int totalunos = 0;

        for (int i = 1; i <= qtdturmas; i++) {
            System.out.println("Quantos alunos na turma "+ i +": ");
            int alunosportuma = scan.nextInt();

            if (alunosportuma > 0 && alunosportuma <= 40){
                totalunos = totalunos + alunosportuma;
            } else {
                System.out.println("Turmas não podem ter mais que 40 alunos. Reinicie o programa.");
            }
        }
        int media = totalunos / qtdturmas;
        System.out.println("O total de alunos em todas as turmas é "+totalunos+" e a média por turma é "+media+".");
    }
}
