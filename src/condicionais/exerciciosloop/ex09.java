package condicionais.exerciciosloop;

public class ex09 {

    /*9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.*/

    public static void main(String[] args) {



        for (int i = 0 ; i < 50 ; i++) {
            if (i%2 == 1) {
                System.out.println(" " + (i));
            }
        }
    }
}
