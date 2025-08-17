package condicionais.for_;

public class loopfor {

    public static void main(String[] args) {

        //FOR NORMAL

        for (int i = 0; i < 5; i++) { //as variáveis declaradas dentro desse bloco vai valer apenas dentro do mesmo
            System.out.println("i tem valor de: " + i);
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println("i tem valor de: " + i);
        }
//      for (int i = 1; i <= 5 ; i++ ){
//      System.out.println("i tem valor de: " + i);
//    }

        //FOR COM MAIS DE UMA VARIÁVEL

        for ( int i = 0, j = 10; i < j ; i++, j--){
            System.out.println("i= " + i + "; j= " + j);

        }

        //FOR COM PARTES AUSENTES (menos comum)

        int count = 0;
        for (;count < 5;){
            System.out.println("valor de count: "+ count);
            count += 2;
        }

        //mesma coisa mas com todas as partes caso seja necessário da para fazer das duas formas

        for (int cont = 0; cont <10; cont += 2){
            System.out.println("valor de count: "+ cont);
        }

        //LOOP INFINITO
        //for (;;);//

        //LOOP SEM CORPO (não recomendado)
        //não se utiliza chaves para Switch/Case também

        int soma = 0;

        for (int i =1; i <5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

        for (int i= 0; i <5; i++)
            System.out.println("i tem valor: " + i);

        //LOOP MELHORADO (ver melhor em Arrays)

    }


}
