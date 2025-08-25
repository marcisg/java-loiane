package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        boolean verificador = true;
        String divisores = "";

        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) { // da para usar o num/2, mas a rais quadrada é mais eficiente, precisando de menos validações.
                if (num % i == 0) {
                    verificador = false;
                    divisores += i + " e " + (num/i) + "; ";

                }
            }
        } else {
            verificador = false;
        }

        if (verificador) {
            System.out.printf("O número %d é primo.\n", num);
        } else {
            System.out.printf("O número %d não é primo pois ele não é divisível apenas por 1 e por ele mesmo.\n", num);
            System.out.printf("Esses são os divisores dele: %s", divisores);
        }
        scan.close();
    }

}

