package condicionais.exerciciosifelse;

import java.util.Objects;
import java.util.Scanner;

public class ex25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numerodesuspeitas = 0;
        System.out.println("RESPONDA COM SIM E NÃO!");
        System.out.println("Telefonou para a vitima?");
        String telefonou = scan.nextLine();
        System.out.println("Esteve no local do crime?");
        String local = scan.nextLine();
        System.out.println("Mora perto da vitima?");
        String mora = scan.nextLine();
        System.out.println("Devia para a vítima?");
        String devia = scan.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        String trabalho = scan.nextLine();


        if("sim".equalsIgnoreCase(telefonou)) {
            numerodesuspeitas++;
        }
        if ("sim".equalsIgnoreCase(local)) {
            numerodesuspeitas++;
        }
        if ("sim".equalsIgnoreCase(mora)) {
            numerodesuspeitas++;
        }
        if ("sim".equalsIgnoreCase(devia)){
            numerodesuspeitas++;
        }
        if ("sim".equalsIgnoreCase(trabalho)) {
            numerodesuspeitas++;
        }


        if (numerodesuspeitas ==2 ){
            System.out.println("O interrogado é um suspeito.");
        } else if (numerodesuspeitas >=3 && numerodesuspeitas <=4) {
            System.out.println("O interrogado é um cúmplice.");
        } else if (numerodesuspeitas == 5) {
            System.out.println("o interrogado é culpado.");
        }else {
            System.out.println("O interrogado é inocente");
        }


        scan.close();
    }

}
