package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex14 {



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

    }
}
