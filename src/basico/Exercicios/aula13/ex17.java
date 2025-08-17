package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex17{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos metros quadrados de área a ser pintado?");
        double area = scan.nextDouble();
        double litrostot = area / 6.0;

        double latas18 = Math.ceil(litrostot / 18.0);
        double precoLatas18 = latas18 * 80.0;

        double galoes36 = Math.ceil(litrostot / 3.6);
        double precoGaloes36 = galoes36 * 25.0;

        int latasMix = (int)(litrostot / 18);
        double restanteLitros = litrostot - (latasMix * 18);
        int galoesMix = (int)Math.ceil(restanteLitros / 3.6);
        double precoMix = (latasMix * 80.0) + (galoesMix * 25.0);


        System.out.println("\n=== Apenas latas de 18 litros ===");
        System.out.println("Quantidade de latas: " + (int)latas18);
        System.out.println("Preço: R$ " + precoLatas18);

        System.out.println("\n=== Apenas galões de 3,6 litros ===");
        System.out.println("Quantidade de galões: " + (int)galoes36);
        System.out.println("Preço: R$ " + precoGaloes36);

        System.out.println("\n=== Mistura de latas e galões (preço menor) ===");
        System.out.println("Latas: " + latasMix);
        System.out.println("Galões: " + galoesMix);
        System.out.println("Preço: R$ " + precoMix);
}
}
