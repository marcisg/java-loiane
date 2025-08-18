package basico.Exercicios.aula13;

import java.util.Scanner;

public class ex18{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo? (Em MB)");
        double arquivo = scan.nextDouble();
        System.out.println("Qual a velocidade da internet? (Em Mb/ps)");
        double internet = scan.nextDouble();

        double taxadedownload = internet/8;
        double tempodedowload = arquivo/taxadedownload;
        double minutos = tempodedowload/60;
        double horas = minutos/60;

        System.out.println("Seu arquivo tem: " + arquivo + "MBs.");
        System.out.println("A velocicade da sua internet é de: " + internet + "Mbps.");
        System.out.println("A taxa de download é de: " + taxadedownload + "Mbps");
        System.out.println("Seu arquivo vai ser baixado em " + tempodedowload + " segundos.");

    }

    }
