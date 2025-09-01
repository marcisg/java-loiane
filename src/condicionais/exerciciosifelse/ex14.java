package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex14 {

    /* 14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média.
    A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento      Conceito
        Entre 9 e 10                    A
        Entre 7,5 e 9                   B
        Entre 6 e 7,5                   C
        Entre 4 e 6                     D
        Entre 4 e 0                     E
    O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem
    “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota parcial: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota parcial: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;
        char conceito = '0';
        String situacao = "AP";


        if (media>=9 && media<=10){
            conceito = 'A';

        } else if (media>=7.5 && media<9) {
            conceito = 'B';

        } else if (media>=6 && media<7.5) {
            conceito = 'C';

        } else if (media>=4 && media<6) {
            conceito = 'D';

        } else if (media<4 && media>=0) {
            conceito = 'E';

        }
        switch (conceito){
            case 'A','B','C':
                situacao = "APROVADO";
                break;
            case 'D','E':
                situacao = "REPROVADO";
                break;
        }

        System.out.printf("A primeira nota foi %.2f e a segunda nota %.2f sendo a média %.2f.", nota1, nota2, media);
        System.out.println(" ");
        System.out.printf("O aluno foi %s com conceito %c.",situacao, conceito);
        scan.close();
    }
}
