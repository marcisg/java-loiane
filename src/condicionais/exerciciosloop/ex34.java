package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex34 {

    /*34- Os números primos possuem várias aplicações dentro da Computação, por exemplo, na Criptografia.
    Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0;
        boolean verificador = true;

        do{
            System.out.println("Insira um número: ");
            num = scan.nextInt();

            if (num > 1){

                for(int i = 2; i <= num/2;i++){
                    if (num % i == 0) {
                        verificador = false;
                        break;
                    }
                }
            }

            if (verificador){
                System.out.printf("%d é um número primo.", num);
                System.out.println(" ");
            } else {
                System.out.printf("%d não é um número primo.", num);
                System.out.println(" ");
            }
            verificador = true;
        }while (num > 1);
    }
}
