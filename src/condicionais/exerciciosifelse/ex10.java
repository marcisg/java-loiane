package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Que turno você estuda? (M- Matutino, V- Vespertino e N- Noturno) ");
        String turno = scan.next();
        boolean teste = turno == "J";

        if (turno.equalsIgnoreCase("M" )) {
            System.out.println("Bom dia");
        }else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde");
        }else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite");
        }else {
            System.out.println("Valor Inválido");
            System.out.println(turno);
        }
        scan.close();
    }
}
