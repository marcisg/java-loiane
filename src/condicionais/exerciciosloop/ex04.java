package condicionais.exerciciosloop;

public class ex04 {

    /*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
    com uma taxa de crescimento de 1,5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a
    população do país B, mantidas as taxas de crescimento.*/

    public static void main(String[] args) {

        int paisA = 80000;
        double taxapaisA = 3;
        int paisB = 200000;
        double taxapaisB = 1.5;
        double resultadoA = 0;
        double resultadoB = 0;
        int cont = 0;

        do {
            resultadoA = ((double) paisA /100) * taxapaisA;
            paisA = (int) (paisA + resultadoA);
            resultadoB = ((double) paisB /100) * taxapaisB;
            paisB = (int) (paisB + resultadoB);
            cont++;
        }
        while (paisA <= paisB);
            System.out.println("Depois de " + cont + " anos o País A vai passar o País B em população.");
        }
}
