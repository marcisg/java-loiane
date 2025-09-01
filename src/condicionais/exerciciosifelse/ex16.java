package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex16 {

    /* 16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
    O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
    a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
    b. Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;
    c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    d. Se o delta for positivo, a ed informe-as ao usuário; Recognize in*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = scan.nextDouble();
        double delta = 0;
        double b = 0;
        double c = 0;


        if (a == 0){
            System.out.println("O número digitado é inválido, reinicie o programa com outros valores");
        }else  {
            System.out.println("Digite o valor de B: ");
            b = scan.nextDouble();
            System.out.println("Digite o valor de C: ");
            c = scan.nextDouble();

            delta = (b * b) - (4 * a * c);

        }if (delta <= 0 ){
            System.out.println("Delta negativo, reinicie o programa com outros valores");
        } else {

            System.out.printf("Delta: %.2f", delta);
            System.out.println(" ");

            double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

            System.out.printf("x1= %.2f", x1);
            System.out.println(" ");
            System.out.printf("x2= %.2f", x2);
        }

        scan.close();

    }
}
