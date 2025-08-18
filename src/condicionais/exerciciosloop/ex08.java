package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        double aux = 0;


        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Digite o "+ (i+1) + " número: ");
            numero = scan.nextInt();
            aux = numero + aux;
        }
        System.out.println("A soma de todos os números é: "+ aux);
        System.out.println("A média de todos os números é: "+ (aux/5));
        scan.close();
//        for (int i = 0 ; i < 5 ; i++){
//            System.out.println("Digite o "+ (i+1) + " número: ");
//            numero = scan.nextInt();
//            aux += numero;
//        }
//        System.out.println("A soma de todos os números é: "+ aux);
//        System.out.println("A média de todos os números é: "+ (aux/5));



    }
}
