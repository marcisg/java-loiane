package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double precofileduplo = 0;
        double precoalcatra = 0;
        double precopicanha = 0;
        System.out.println("O pagamento será no cartão Tabajara? (sim ou não)");
        String pagamento = scan.nextLine();
        System.out.println("Qual carne você deseja você deseja?");
        String tipodecarne = scan.nextLine();
        System.out.println("Quantos quilos de carne você deseja?");
        double kgdecarne = scan.nextDouble();


        double valortotal = 0;
        double totalalcatra= 0;
        double totalpicanha = 0;

        double valordescontado = 0;
        double diferencadevalor = 0;


        if ("Filé Duplo".equalsIgnoreCase(tipodecarne)){
            if (kgdecarne<=5){
                precofileduplo = 4.90;
                valortotal = kgdecarne * precofileduplo;

            }else {
                precofileduplo = 5.80;
                valortotal = kgdecarne * precofileduplo;
            }
        }
        if ("Alcatra".equalsIgnoreCase(tipodecarne)){
            if (kgdecarne<=5){
                precoalcatra = 5.90;
                valortotal = kgdecarne * precoalcatra;
            }else {
                precoalcatra = 6.80;
                valortotal = kgdecarne * precoalcatra;
            }
        }
        if ("Picanha".equalsIgnoreCase(tipodecarne)){
            if (kgdecarne<=5){
                precopicanha = 4.90;
                valortotal = kgdecarne * precopicanha;
            }else {
                precopicanha = 5.80;
                valortotal = kgdecarne * precopicanha;
            }
        }

        if ("sim".equalsIgnoreCase(pagamento)){
            double desconto = 10;

            valordescontado = (valortotal / 100) * desconto;
        }

        diferencadevalor = valortotal - valordescontado;

        System.out.printf("%s.....................%.2fkg", tipodecarne, kgdecarne );
        System.out.println(" ");
        System.out.printf("....................TOTAL %.2f R$ ", valortotal);
        System.out.println(" ");
        System.out.printf("Cartão Tabajara? %s ", pagamento);
        System.out.println(" ");
        System.out.printf("Valor do desconto..........%.2f R$", valordescontado);
        System.out.println(" ");
        System.out.printf("..............VALOR FINAL %.2f R$ ", diferencadevalor);


    }

}
