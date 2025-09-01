package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex25 {

    /*25. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e
    maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas idades você quer calcular?");
        int ndeidades = scan.nextInt();
        double mediadasidades = 0;

        for (int i = 1; i <= ndeidades; i++) {
            System.out.println("Diga a idade número " + i);
            double idade = scan.nextDouble();
            mediadasidades = mediadasidades + idade;
        }
        mediadasidades = mediadasidades / ndeidades;

        if (mediadasidades >= 0 && mediadasidades <= 25){
            System.out.println("A média das idades é " + Math.round(mediadasidades) + " fazendo com que a turma seja considerada jovem.");
        } else if (mediadasidades >= 26 && mediadasidades <= 60){
            System.out.println("A média das idades é " + Math.round(mediadasidades) + " fazendo com que a turma seja considerada adulta.");
        } else if (mediadasidades > 60 && mediadasidades <999){
            System.out.println("A média das idades é " + Math.round(mediadasidades) + " fazendo com que a turma seja considerada idosa.");
        } else {
            System.out.println("Números inválidos, reinicie o programa.");
        }
        scan.close();

    }
}
