package condicionais.exerciciosloop;

public class ex4 {

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
