package condicionais.if_else;

import java.util.Scanner;

public class varios_if_else {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do item: ");
        double valor = scan.nextDouble();

        //valor <= 10 : comprar
        //valor > 10 e valor < 15 : desconto
        //valor >= 15 e valor < 17 : pesquisar
        //valor >= 17 : muito caro

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto.");
        } else if (valor >=15 && valor < 17) {
            System.out.println("Pode pesquisar mais.");
        } else {
            System.out.println("Muito caro.");
        }

    }
}
