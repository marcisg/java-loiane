package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado do triângulo: ");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo: ");
        double lado3 = scan.nextDouble();
        boolean isTriangulo = false;

        if ((lado1+lado2)>lado3) {
            System.out.println("É um triângulo");
            isTriangulo = true;
        } else if ((lado1+lado3)>lado2) {
            System.out.println("É um triângulo");
            isTriangulo = true;
        } else if ((lado2+lado3)>lado1) {
            System.out.println("É um triângulo");
            isTriangulo = true;
        }else {
            System.out.println("Não é um triângulo");
        }

        if (isTriangulo){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("É um triângulo equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Éum triângulo isósceles");
            } else if (lado1 != lado2 && lado2!= lado3) {
                System.out.println("Éum triângulo escaleno");
            }
        }


    }
}
