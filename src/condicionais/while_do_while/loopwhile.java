package condicionais.while_do_while;

public class loopwhile {

    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max){ //primeiro analisa se é verdadeira a afirmação e depois executa
            System.out.println("O valor de i: "+ i);
            i++; //i= i + 1; ou i + = 1;
        }
        System.out.println(i);

        do { //primeiro executa o bloco de código e depois analisa se a afirmação é verdadeira
            i++;
            System.out.println("Valor de i = " +i );
        } while (i <15);
        System.out.println(i);

    }

}
