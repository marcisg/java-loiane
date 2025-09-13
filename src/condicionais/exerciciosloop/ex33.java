package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex33 {

    /*33- O Departamento Estadual de Meteorologia contratou você para desenvolver um programa que leia as um conjunto indeterminado de temperaturas,
    e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temperatura = 0;
        double menor = 0;
        double maior = 0;
        int count = 0;
        double soma = 0;
        double media = 0;

        do {
            System.out.println("Insira uma temperatura: ");
            temperatura = scan.nextDouble();

            if (temperatura != 0){
                soma+=temperatura;
                count++;

                if(menor == 0 && maior == 0){
                    menor = temperatura;
                    maior = temperatura;
                }
                if(menor > temperatura){
                    menor = temperatura;
                } else if (maior<temperatura) {
                    maior = temperatura;
                }
            }

        }while (temperatura != 0 );

        media=soma/count;

        System.out.printf("A maior temperatura é %.2f e a menor temperatura é %.2f e a média de todas as temperaturas é: %.2f", maior, menor, media);
    }
}
