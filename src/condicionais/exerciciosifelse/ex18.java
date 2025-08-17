package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite um mês: ");
        int mes = scan.nextInt();
        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();
        int digitosano = Integer.toString(ano).length();


        if (dia >= 1 && dia <=31 && mes >=1 && mes <=12 && digitosano == 4) {
            System.out.printf("%d/%2d/%d", dia, mes, ano);
        }else {
            System.out.println("Opção inválida.");
        }

    }
}
