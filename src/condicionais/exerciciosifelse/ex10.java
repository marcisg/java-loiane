package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex10 {

    /* 10. Faça um Programa que pergunte em que turno você estuda.
    Peça para digitar M-matutino ou V-Vespertino ou N-Noturno.
    Imprima a mensagem "Bom Dia!", "Boa Tarde!", ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/

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
